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
class Sedan extends Mobil {
    
    String fasilitasKeamanan,fasilitasKenyamanan;
    int kapasitasCC;
    public Sedan(String fasilitasKeamanan,String fasilitasKenyamanan,int kapasitasCC, String noPlat, String merk, int pajak) {
        super(noPlat, merk, pajak);
        this.fasilitasKeamanan = fasilitasKeamanan;
        this.fasilitasKenyamanan = fasilitasKenyamanan;
        this.kapasitasCC = kapasitasCC;
    }
    
    public void infoSedan(){
        System.out.println("\n Fasilitas Keamanan adalah "+fasilitasKeamanan);
        System.out.println("\n Fasilitas Kenyamanan adalah "+fasilitasKenyamanan);
        System.out.println("\n Tenaga : "+kapasitasCC+ "cc");
    }
    
    public float hitungPajak(){
        float besarPajak = (float) (pajak + (pajak *kapasitasCC *0.00005));
        return besarPajak;
    }
    
    public void tampilInfo(){
        System.out.println("\n plat mobil : " + noPlat);
        System.out.println("\n merk : " + merk);
        System.out.println("\n pajak : Rp. " + this.hitungPajak());
        infoSedan();
    }

}
