/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itsalesgui2;

/**
 *
 * @author Samantha
 */
public class DesktopClass extends ComputerClass{
    String Monitor;
    
    public DesktopClass(){
        super();
        this.Monitor = "";
    }
    
    public void DisplayComputerInfo(){
        super.DisplayComputerInfo();
        
        System.out.println("Monitor Type: " +this.Monitor);
    }
    
    public String getComputerInfo(){
        String sInfo = super.getComputerInfo();
        
        sInfo = sInfo + "Monitor Type: " + this.Monitor + "\n";
        
        return sInfo;
    }
}
