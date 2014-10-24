
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.FileNotFoundException;
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
 * this class contains all variables required by the program.
 */
public class vars {
    
    //last index of the array transaction.trns
    static int lastIndex=0;
    //index and name of slected profile name in profile_window
    static int selectedProfileIndex;
    static String selectedProfileName;
    //common transaction file name
    static String trnsFile = "trans";
    //common profiles directory
    static String profilesd = "profiles.d/";
    //common profile list file
    static String profileFile = "profiles";
    //data direcotry
    static String datd = "dat/";
    //categories file
    static String catFile = "categories";
    //settings file
    static String setFile = "settings";
    
    //grandtotal
    static double gTotal = 0;
    
    //foreground colors
    static Color[] fColors = {new Color(255,255,255)};
    
    //settings window active tab
    static int activeTab = 1;
    
    //date format
    static String dateFormat = "dd-MM-yyyy";
    
    //csv delimiter string
    static String csvDelimiter = ",";
    
    //reminders
    static boolean reminders = true;
    static int remPercent = 85;
    
    //scrren width and hieght
    static Dimension dm = Toolkit.getDefaultToolkit().getScreenSize();
    static int sW = dm.width;
    static int sH = dm.height;

    //current week
    static int week;
    
    static public void updatelastIndex()
    {
        lastIndex = transaction.trns.length-1;
        System.out.println("vars.lastIndex="+lastIndex);
    }
    
    static public void setSelectedProfile(int i,String prof)
    {
        selectedProfileIndex = i;
        selectedProfileName = prof;
    }
    
    static public void setActiveTab(int i)
    {
        activeTab = i;
    }
    
    static public void setdateFormat(String d)
    {
        dateFormat = d;
    }
    
    static public void setCurWeek(int i)
    {
        week = i;
    }
    
    static public void init() throws FileNotFoundException, IOException
    {
        datd=iniparser.iniread(vars.datd+vars.setFile,"directories","dataDir");
        profilesd=iniparser.iniread(vars.datd+vars.setFile,"directories","profilesDir");
        trnsFile=iniparser.iniread(vars.datd+vars.setFile,"files","transactionFile");
        catFile=iniparser.iniread(vars.datd+vars.setFile,"files","categoriesFile");
        dateFormat=iniparser.iniread(vars.datd+vars.setFile,"data","dateFormat");
        csvDelimiter=iniparser.iniread(vars.datd+vars.setFile,"data","csvDelimiter");
        reminders=Boolean.parseBoolean(iniparser.iniread(vars.datd+vars.setFile,"directories","dataDir"));
        remPercent=Integer.parseInt(iniparser.iniread(vars.datd+vars.setFile, "reminders", "remindAtPercent"));
    }
}
