/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guided2;

/**
 *
 * @author rama
 * 2211102208
 */
// Class Pegawai
class Pegawai {

    private String nama;
    private String NIP;

    public Pegawai() {
        System.out.println("Konstruktor pegawai dijalankan...");
}
public Pegawai(String NIP, String nama) {
        this.NIP = NIP;
        this.nama = nama;
        System.out.println("Konstruktor pegawai dijalankan...");
}
public void tampilPeg() {
        System.out.println("NIP : " + NIP + " ,Nama : " + nama);
    }
}
