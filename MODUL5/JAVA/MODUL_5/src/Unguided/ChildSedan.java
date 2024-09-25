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
class ChildSedan extends Sedan implements InterfaceSedan {
    
    public ChildSedan(String fasilitasKeamanan, String fasilitasKenyamanan,int kapasitasCC, String noPlat, String merk, int pajak) {
        super(fasilitasKeamanan,fasilitasKenyamanan,kapasitasCC,noPlat, merk, pajak);
    }
}
