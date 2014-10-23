
import java.awt.Color;

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
    
    //grandtotal
    static double gTotal = 0;
    
    //foreground colors
    static Color[] fColors = {new Color(255,255,255)};
    
    //settings window active tab
    static int activeTab = 1;
    
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
}
