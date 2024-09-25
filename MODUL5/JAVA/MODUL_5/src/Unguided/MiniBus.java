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
class MiniBus implements InterfaceBus,InterfaceSedan {
    float besarPajak;
    String tipe, noPlat, merk;
    InterfaceBus interfacebus;
    InterfaceSedan interfacesedan;
    
    public MiniBus(String tipe,int kapasitasPenumpang, int kapasitasBagasi,String fasilitasKeamanan,String fasilitasKenyamanan, int kapasitasCC, String noPlat, String merk, int pajak){
        this.tipe = tipe;
        this.noPlat = noPlat;
        this.merk = merk;
      
        interfacebus = new ChildBus(kapasitasPenumpang,kapasitasBagasi,noPlat,merk,pajak);
        interfacesedan = new ChildSedan(fasilitasKeamanan,fasilitasKenyamanan,kapasitasCC,noPlat,merk,pajak);
    }
    
    public void infoMiniBus() {
        System.out.println("\n plat mobil : " + this.noPlat);
        System.out.println("\n merk : " + this.merk);
        
        
        if (tipe.equalsIgnoreCase("Pribadi")) {
            System.out.println("\n Tipe MiniBus : Pribadi, digunakan sebagai kendaraan pribadi");
        } else if (tipe.equalsIgnoreCase("Wagon")) {
            System.out.println("\n Tipe MiniBus : Wagon, digunakan sebagai kendaraan angkut/travel");
        } else {
            System.out.println("\n Tipe MiniBus tidak valid");
        }
    }    
        

    @Override
    public void infoBus(){
        interfacebus.infoBus();
    }
    
    @Override
    public void infoSedan() {
        interfacesedan.infoSedan();
    }

    @Override
    public void tampilInfo(){
        
        infoMiniBus();
        infoSedan();
        infoBus();
        this.hitungPajak();

    }

    @Override
    public float hitungPajak() {
       if (tipe.equalsIgnoreCase("Pribadi")) {
            besarPajak = interfacesedan.hitungPajak() * 0.05f + interfacebus.hitungPajak() * 0.03f;
            System.out.println("\n pajak dari kendaraan ini : "+besarPajak+" Rp");
        } else if (tipe.equalsIgnoreCase("Wagon")) {
            besarPajak = interfacesedan.hitungPajak() * 0.03f + interfacebus.hitungPajak() * 0.05f;
            System.out.println("\n pajak dari kendaraan ini : "+besarPajak+" Rp");
        } else {
            System.out.println(" Tipe MiniBus tidak valid");
        }
        return besarPajak;
    }
    
}
