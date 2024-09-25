/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dosen;

/**
 *
 * @author ramadhan wijaya
 * 2211102208
 */
import java.text.DecimalFormat;
abstract class dosen {
    public String nidn;
    public String nama;
    public String prodi;
    public double gaji;

    public dosen(String NIDN, String nama, String prodi, double gj) {
        this.prodi = prodi;
        this.nidn = NIDN;
        this.gaji = gj;
        this.nama = nama;
        
    }
    
    public void tampilData() {
        DecimalFormat df = new DecimalFormat("#,###.00");
        System.out.println("NIDN: " + nidn);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
        System.out.println("Gaji: " + df.format(gaji));
    }
    
    //sebagai method abstract yang bisa di gunakan di class child childnya
    public abstract double hitungTotalGaji();
    public abstract double hitungPajak();

}
