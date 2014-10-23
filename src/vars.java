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
    public static int lastIndex=0;
    //index and name of slected profile name in profile_window
    public static int selectedProfileIndex;
    public static String selectedProfileName;
    
    static public void updatelastIndex()
    {
        lastIndex = transaction.trns.length-1;
    }
    
    static public void setSelectedProfile(int i,String prof)
    {
        selectedProfileIndex = i;
        selectedProfileName = prof;
    }
}
