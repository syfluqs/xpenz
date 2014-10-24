import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


/**
 *
 * @author Subham Roy <subhamroy1995@gmail.com>
 */


public class transaction {
    
    public int i;
    public int index;
    public String date;
    public String type;
    public double amount;
    public String category;
    public long number;
    public String notes;
    
    static public transaction[] trns = {new transaction(0,"99-99-9999","abc",999.99,"abc",999999,"abc")}; //defining a sample transaction. use transaction index from 1 only.
    
    public transaction(int index,String date, String type, double amount, String category, long number, String notes)
    {
        this.index=index;
        this.date=date; //using deprecated java.util.Date to save hassles
        this.type=type;
        this.amount=amount;
        this.category=category;
        this.number=number;
        this.notes=notes;
    }
   
    
    static public void add(transaction t)
    {
        int s = trns.length;
        transaction[] tmp = new transaction[s+1];
        for (int i=0;i<s;i++)
        {
            tmp[i]=trns[i];
        }
        tmp[s]=t;
        trns = new transaction[s+1];
        trns=tmp;
        vars.updatelastIndex();
    }
    
    static public void edit(int a,transaction t)
    {
        int s = trns.length;
        transaction[] tmp = new transaction[s];
        for (int i=0;i<a;i++)
        {
            tmp[i]=trns[i];
        }
        tmp[a]=t;
        for (int i=a+1;i<s;i++)
        {
            tmp[i]=trns[i];
        }
        trns = new transaction[s];
        trns=tmp;
        vars.updatelastIndex();
    }
    
    static public void delete(int a)
    {
        System.out.println(a);
        int s = trns.length;
        transaction[] tmp = new transaction[s-1];
        for (int i=0;i<a;i++)
        {
            tmp[i]=trns[i];
        }
        for (int i=a;i<s-1;i++)
        {
            tmp[i]=trns[i];
        }
        trns = new transaction[s-1];
        trns=tmp;
        vars.updatelastIndex();
        System.out.println(tmp.toString());
    }
    
    static public void dump()
    {
        //method to dump all transactions data to system out. just for debuggin purposes
        for (int i=0;i<trns.length;i++)
        {
            System.out.println("i="+i+" -> "+trns[i].amount+" "+trns[i].category+" "+trns[i].date.toString()+" "+trns[i].type+" "+trns[i].number+" "+trns[i].notes);
        }
    }
    
    static public void gTotal(char c,double amt,String type,int i) throws IOException
    {
        if (c=='c')
        {
            if (type.equals("Deposit"))
                vars.gTotal+=amt;
            else if (type.equals("Withdrawal"))
                vars.gTotal-=amt;
            else
                throw new IOException("Invalid type in trnsFile line "+i);
        }
        else
        {
            vars.gTotal=0;
        }
    }
    
    static public void write() throws IOException
    {
    BufferedWriter trnsWriter = new BufferedWriter(new FileWriter(vars.datd+vars.profilesd+vars.selectedProfileName+"/"+vars.trnsFile));
    for (int i=1;i<=vars.lastIndex;i++)
    {
        String notes;
        if (trns[i].notes.equals(""))
            notes = " ";
        else
            notes = trns[i].notes;
        trnsWriter.write(""+i+vars.csvDelimiter+trns[i].date+vars.csvDelimiter+trns[i].type+vars.csvDelimiter+trns[i].amount+vars.csvDelimiter+trns[i].category+vars.csvDelimiter+trns[i].number+vars.csvDelimiter+notes+"\n");
    }
    trnsWriter.close();
    }

}
