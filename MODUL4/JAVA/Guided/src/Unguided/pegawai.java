/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unguided;

/**
 *
 * @author ramadhan wijaya
 * 2211102208
 */
public class pegawai {
    public String NIP;
    public String nama;
    public String alamat;
    public int tahunMasukKerja;
    
    protected String w,x,y;
    protected int z;
    
    public pegawai(String a, String b, String c, int d) {
        System.out.println("Konstruktor Point dijalankan ");
        w = a;
        x = b;
        y = c;
        z = d;
    }
     
    public void cetakpegawai() {
        System.out.println("Nama: " + nama);
        System.out.println("NIP: " + NIP);
        System.out.println("Alamat: " + alamat);
        System.out.println("Tahun Masuk: " + tahunMasukKerja);
    }
}
