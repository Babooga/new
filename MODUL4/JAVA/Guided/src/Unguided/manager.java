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
public class manager extends pegawai {
    public int gajiPokok;
    public String divisi;
    public int tunjangan;
    
    public manager() {
        super(" ", " ", " ", 0);
        this.gajiPokok = 0;
        this.divisi = " ";
        System.out.println("konstruktor manager dijalankan");
    }
    
    public void setManager(String nama, String NIP, String alamat, int tahunMasukKerja, int gajiPokok, String divisi) {
        this.nama = nama;
        this.NIP = NIP;
        this.alamat = alamat;
        this.tahunMasukKerja = tahunMasukKerja;
        this.gajiPokok = gajiPokok;
        this.divisi = divisi;
    }
    
    public int hitungGajiAkhir() {
        tunjangan = 0;
        int tahunKerja = 2015 - tahunMasukKerja;
        if (tahunKerja >= 5) {
            tunjangan = (int) (0.10 * gajiPokok); // 10% dari gaji pokok
        } else if (tahunKerja >= 3) {
            tunjangan = (int) (0.05 * gajiPokok); // 5% dari gaji pokok
        }
        return gajiPokok + tunjangan;
    }
    
    public void cetakManajer() {
        super.cetakpegawai();
        System.out.println("Gaji Pokok: " + gajiPokok);
        System.out.println("Divisi: " + divisi);
        System.out.println("Gaji Akhir: " + hitungGajiAkhir());
    }
    
}
