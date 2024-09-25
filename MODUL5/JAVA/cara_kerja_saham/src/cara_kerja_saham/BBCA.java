/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cara_kerja_saham;

/**
 *
 * @author rama
 */
public class BBCA {
    private static final int tahunBerdiri = 1965;
    public static int hargaPerLot = 1000;
    public static int jumlahLotYangTersedia = 400;
    public float marketCap = hargaPerLot*jumlahLotYangTersedia;
    public static int laba = 2000;
    public static int aset = 2402300;
    public float ROA = ((float)aset/laba)*100;
    
    public void PBV(){
        System.out.println("okee");
    }
    
    public void cetak(){
        System.out.println("Kerterangan Bursa BBCA");
        System.out.println("===========================");
        System.out.println("\nberdiri sejak : "+tahunBerdiri);
        System.out.println("  jumlah lot yang tersedia : "+jumlahLotYangTersedia);
        System.out.println("  harga per lotnya : "+hargaPerLot);
        System.out.println("  kapitalisasi pasarnya : "+marketCap);
        System.out.println("  Return of asetnya : "+String.format("%.3f",ROA)+ " %");
    }
}



