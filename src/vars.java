
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

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
    //newTrans mode
    static boolean newTrnsEditMode = false;
    //index to edit
    static int indexToEdit = -1;
    //index to delete
    static int indexToDelete = -1;
    
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

    //current date variables
    static int week;
    static int date;
    static int month;
    static int year;
    
    //items in weekOverview, expenseOverview, incomeOverview
    static ArrayList wOi = new ArrayList();
    static ArrayList eOi = new ArrayList();
    static ArrayList iOi = new ArrayList();
    
    //report
    static int report = 0;
    static String reportFrom = "";
    static String reportTo = "";
    
    static public void updatelastIndex()
    {
        lastIndex = transaction.trns.length-1;
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
    
    static public void setCurDateVars(int d,int m,int y,int w)
    {
        week = w;
        date = d;
        month = m;
        year = y;
    }
    
    static public void setEditMode(boolean b)
    {
        newTrnsEditMode = b;
    }
    
    static public void setIndexToEdit(int n)
    {
        indexToEdit = n;
    }
    
    static public void setIndexToDelete(int n)
    {
        indexToDelete = n;
    }
    
    static public void addeOi(int n)
    {
        eOi.add(n);
    }
    
    static public void addiOi(int n)
    {
        iOi.add(n);
    }
    
    static public void addwOi(int n)
    {
        wOi.add(n);
    }
    
    static public void reseteOi()
    {
        eOi = new ArrayList();
    }
    
    static public void resetiOi()
    {
        iOi = new ArrayList();
    }
    
    static public void resetwOi()
    {
        wOi = new ArrayList();
    }
    
    static public void setReportDate(String from,String to)
    {
        reportTo = to;
        reportFrom = from;
    }
    
    static public void setReportType(int i)
    {
        report = i;
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
