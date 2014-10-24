
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author roy
 */
public class createNewProfile {
    static public void create(String name) throws IOException
    {
        File newDir = new File(vars.datd+vars.profilesd+name);
        newDir.mkdir();
        File newFile = new File(vars.datd+vars.profilesd+name+"/"+vars.trnsFile);
        newFile.createNewFile();
        BufferedWriter pcreate = new BufferedWriter(new FileWriter(vars.datd+vars.profileFile,true));
        pcreate.write("\n"+name);
        pcreate.close();
    }
}
