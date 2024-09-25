/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unguided;

/**
 *
 * @author ramadhan wijaya
 * 2211102208
 * if-10m
 */
public class main {
    public static void main(String args[]) {
        MiniBus minibus = new MiniBus("wagon",100, 200,"smart lock","kursi sutra",2000,"M21 2211102208 MK","TOYOTA",4000);
        Sedan sedan = new Sedan("kunci gembok","kursi lapis emas",1500, "B 3432STR MYI","MITSUBISHI",2000);
        Bus bus = new Bus(70,200,"P 7471 VW","GRAND MAX",1000);
        Mobil mobil = new Mobil("R 554 JX","AVANZA",1000000);
        
       
        System.out.println("\n\n\n==DISPLAY DATA MOBIL MINIBUS==");
        minibus.tampilInfo();
  
        System.out.println("\n\n\n==DISPLAY DATA MOBIL SEDAN==");
        sedan.tampilInfo();
        
        System.out.println("\n\n\n==DISPLAY DATA MOBIL BUS==");
        bus.tampilInfo();
        
        System.out.println("\n\n\n==DISPLAY DATA MOBIL==");
        mobil.tampilInfo();
        
       
    }
}
