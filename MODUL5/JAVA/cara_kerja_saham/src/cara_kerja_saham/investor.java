/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cara_kerja_saham;

/**
 *
 * @author rama
 */
public class investor extends BBCA implements interfaceBursa {
    
    public String nama;
    public int tahunMenabung;
    public int jumlahLotYangDimiliki;
    public float tambahanDividen;
    
    //konstruktor
    public investor(String nama, int tahunMenabung, int jumlahLotYangDimiliki){
        this.nama = nama;
        this.tahunMenabung = tahunMenabung;
        this.jumlahLotYangDimiliki = jumlahLotYangDimiliki;
    }
    
    //destruktor
    public void destruktor(){
        System.out.println("\n=========memori sudah dibersihkan========");
    }
    
    //getter
    public String getNama(){
        return this.nama;
    }
    
    //setter
    public void setNama(String a){
        this.nama = a;
    }
    
    @Override
    public float dividen() {
           if(tahunSaatIni - tahunMenabung >= 5 && tahunSaatIni - tahunMenabung <=9){
               tambahanDividen = jumlahLotYangDimiliki * 70;
           }
           else if(tahunSaatIni - tahunMenabung >= 10){
               tambahanDividen = jumlahLotYangDimiliki * 140;
           }
        return tambahanDividen;
           
    }
    
    @Override
    public void cetak(){
        System.out.println("======= portofolion BBCA Sdr."+nama+ " =======");
        System.out.println("\nmenabung sejak : "+tahunMenabung);
        System.out.println("  jumlah lot yang dimiliki : "+jumlahLotYangDimiliki);
        System.out.println("  total tabungan : "+jumlahLotYangDimiliki*hargaPerLot);
        System.out.println("  keuntungan dividen : "+ dividen());
        System.out.println("  keuntungan total : "+(jumlahLotYangDimiliki*hargaPerLot+dividen()));
    }


    
}
