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
public class sales extends pegawai{
    public int gajiPokok;
    public int jumlahPelangganYangBerhasilDirekrut;
    public int totalGaji;
    
    public sales(){
        super(" ", " ", " ", 0);
        gajiPokok = 0;
        jumlahPelangganYangBerhasilDirekrut = 0;
        System.out.println("Konstruktor sales dijalankan ");
    }
    
    public void setSales(String nama, String NIP, String alamat, int tahunMasukKerja, int gajiPokok, int jumlahPelangganYangBerhasilDirekrut) {
        this.nama = nama;
        this.NIP = NIP;
        this.alamat = alamat;
        this.tahunMasukKerja = tahunMasukKerja;
        this.gajiPokok = gajiPokok;
        this.jumlahPelangganYangBerhasilDirekrut = jumlahPelangganYangBerhasilDirekrut;
    }
    
    public int hitungTotalGaji() {
        totalGaji = gajiPokok + ( jumlahPelangganYangBerhasilDirekrut * 50000);
        return totalGaji;
    }
    
    public void cetakSales(){
        super.cetakpegawai();
        System.out.println("Gaji Pokok : " + gajiPokok);
        System.out.println("Jam Lembur : "+ jumlahPelangganYangBerhasilDirekrut);
        System.out.println("Gaji Akhir : "+ hitungTotalGaji());
    }
}
