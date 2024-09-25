/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UNGUIDED;

/**
 *
 * @author 2211102208
 */
public class BankBeraksi {
    public static void main(String[] args) {
        // Membuat objek Bank dengan saldo awal Rp. 100000
        BANK bankABC = new BANK(100000);

        // Menampilkan pesan selamat datang dan saldo awal
        System.out.println("Selamat Datang di Bank ABC");
        System.out.println("Saldo saat ini: Rp. " + bankABC.getSaldo());

        // Menyimpan uang Rp. 500000
        bankABC.simpanUang(500000);
        System.out.println("Simpan uang: Rp. 500000");
        System.out.println("Saldo saat ini: Rp. " + bankABC.getSaldo());

        // Mengambil uang Rp. 150000
        bankABC.ambilUang(150000);
        System.out.println("Ambil uang: Rp. 150000");
        System.out.println("Saldo saat ini: Rp. " + bankABC.getSaldo());
    }
}
