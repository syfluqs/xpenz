
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author roy
 * 
 * This class reads transaction values from {profile}/trans and populates transaction.trns
 * the file contains csv of transactions in the order -> index,date,type,amount,category,number,notes
 * index always starts from 1
 */
public class trnsFile {
    
    
    public static void read() throws FileNotFoundException, IOException
    {
        int i=1;
        String l;
        String profile = vars.selectedProfileName;
        BufferedReader trnRead = new BufferedReader(new FileReader("dat/profiles.d/"+profile+"/trans"));
        while((l=trnRead.readLine())!=null)
        {
            //parsing csv
            String[] tmp = l.split(",");
            //checking if each line has seven comma seperated values
            if (tmp.length!=7)
                throw new IOException("The transaction storage file has corrupt values on line "+i);
            //making new transaction objects for each line
            transaction.add(new transaction(Integer.parseInt(tmp[0]),(String)tmp[1],(String)tmp[2],Double.parseDouble(tmp[3]),(String)tmp[4],Long.parseLong(tmp[5]),(String)tmp[6]));
            //incrementing line number
            i++;
        }
        transaction.dump();
    }
    
    public static void write()
    {
        
    }
    
}
