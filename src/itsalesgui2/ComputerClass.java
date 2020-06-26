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
public class ComputerClass {
    
    String sComputerID;
    double dProcessorSpeed;
    int RAM;
    int Harddisk;
    double dPrice;
    
    public ComputerClass(){
        this.sComputerID = "";
        this.dProcessorSpeed = 0.0;
        this.RAM = 0;
        this.Harddisk = 0;
        this.dPrice = 0.0;
    }
    
    public void DisplayComputerInfo(){
        System.out.println("Computer ID: " +this.sComputerID);
        System.out.println("Processor Speed: " +this.dProcessorSpeed + "GHz");
        System.out.println("RAM: " +this.RAM +"MB");
        System.out.println("Harddisk: " +this.Harddisk +"GB");
    }
    
   public String getComputerInfo(){
       String sInfo = "";
       sInfo = sInfo + "\nComputer ID: " +this.sComputerID +"\n";
       sInfo = sInfo + "Processor Speed: " +this.dProcessorSpeed +"GHz" +"\n";
       sInfo = sInfo + "RAM: " +this.RAM +"MB" +"\n";
       sInfo = sInfo + "Harddisk: " +this.Harddisk +"GB" + "\n";
       sInfo = sInfo + String.format("Price of this Computer: $%.2f", this.dPrice) +"\n\n";
    
       return sInfo;
   }
   
   public void DisplayComputerPrice(){
       System.out.printf("Price of this Computer: $%.2f", this.dPrice);
       System.out.println();
   }
}
