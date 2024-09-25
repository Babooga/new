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
public class satpam extends pegawai {
    public int gajiPokok;
    public int jamLembur;
    public int totalGaji;
    
    public satpam() {
        super(" ", " ", " ", 0);
        this.gajiPokok = 0;
        this.jamLembur = 0;
        System.out.println("konstruktor satpam dijalankan");
    }
    
    public void setSatpam(String nama, String NIP, String alamat, int tahunMasukKerja, int gajiPokok, int jamLembur) {
        this.nama = nama;
        this.NIP = NIP;
        this.alamat = alamat;
        this.tahunMasukKerja = tahunMasukKerja;
        this.gajiPokok = gajiPokok;
        this.jamLembur = jamLembur;
    }
    
    public int hitungTotalGaji() {
        totalGaji = gajiPokok + (jamLembur * 10000);
        return totalGaji;
    }
    
    public void cetakSatpam(){
        super.cetakpegawai();
        System.out.println("Gaji Pokok : " + gajiPokok);
        System.out.println("Jam Lembur : "+ jamLembur);
        System.out.println("Gaji Akhir : "+ hitungTotalGaji());
    }
}
