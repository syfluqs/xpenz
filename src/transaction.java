import java.util.ArrayList;
import java.util.List;


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
        this.date=date;
        this.type=type;
        this.amount=amount;
        this.category=category;
        this.number=number;
        this.notes=notes;
    }
   
    
    static public void add(transaction t)
    {
        int s = trns.length;
        System.out.println("trns.length="+s);
        transaction[] tmp = new transaction[s+1];
        for (int i=0;i<s;i++)
        {
            tmp[i]=trns[i];
            System.out.println(tmp[i].amount);
        }
        tmp[s]=t;
        System.out.println(t.amount);
        trns = new transaction[s+1];
        trns=tmp;
        vars.updatelastIndex();
    }
    
    static public void dump()
    {
        //method to dump all transactions data to system out. just for debuggin purposes
        for (int i=0;i<trns.length;i++)
        {
            System.out.println("i="+i+" -> "+trns[i].amount+" "+trns[i].category+" "+trns[i].date+" "+trns[i].type+" "+trns[i].number+" "+trns[i].notes+"\n--------------------");
        }
    }

}
