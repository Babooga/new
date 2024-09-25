/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unguided;

/**
* @author ramadhan wijaya
 * 2211102208
 * if-10m
 */
public class Mobil {
    String noPlat,merk;
    float pajak;
    
    public Mobil(String noPlat, String merk, int pajak){
        this.noPlat = noPlat;
        this.merk = merk;
        this.pajak = pajak;
    }
    
    public void tampilInfo(){
    System.out.println("\n plat mobil  : " + noPlat);
    System.out.println("\n merk mobil  : " + merk);
    System.out.println("\n pajak mobil : " + pajak);
    }
    
}
