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
class Bus extends Mobil {
    int kapasitasBagasi,kapasitasPenumpang;
    
    public Bus(int kapasitasPenumpang, int kapasitasBagasi,String noPlat, String merk, int pajak) {
        super(noPlat, merk, pajak);
        this.kapasitasPenumpang = kapasitasPenumpang;
        this.kapasitasBagasi = kapasitasBagasi;
    }
    
    public void infoBus(){
        System.out.println("\n kapasitas penumpang adalah "+kapasitasPenumpang+" orang");
        System.out.println("\n kapasitas Bagasi adalah "+kapasitasBagasi+" KG");
    }
    
    public float hitungPajak(){
        float besarPajak = (float) (pajak + (pajak *
        kapasitasPenumpang * kapasitasBagasi *0.00005));
        return besarPajak;
    }
    
    public void tampilInfo(){
        System.out.println("\n plat mobil : " + noPlat);
        System.out.println("\n merk : " + merk);
        System.out.println("\n pajak : Rp. " +  hitungPajak());
        infoBus();
    }
    
    
    
    
}
