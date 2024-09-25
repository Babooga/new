/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pegawai;

/**
 *
 * @author ramadhan wijaya
 * @2211102208
 * @IF-10-M
 */
public class Pegawai {
    // Atribut data pegawai
    private String NIP;
    private String nama;
    private String alamat;
    private int jumlahHariLembur;
    private double gajiPokok;
    private double totalGaji;

    // Constructor
    public Pegawai(String NIP, String nama, String alamat, int jumlahHariLembur, double gajiPokok) {
        this.NIP = NIP;
        this.nama = nama;
        this.alamat = alamat;
        this.jumlahHariLembur = jumlahHariLembur;
        this.gajiPokok = gajiPokok;
    }

    // Destructor
    protected void finalize() throws Throwable {
        System.out.println("Objek Pegawai dengan NIP " + this.NIP + " dihapus.");
        super.finalize();
    }

    // Fungsi accessor
    public String getNIP() {
        return NIP;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public int getJumlahHariLembur() {
        return jumlahHariLembur;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public double getTotalGaji() {
        return totalGaji;
    }

    // Fungsi mutator
    public void setJumlahHariLembur(int jumlahHariLembur) {
        this.jumlahHariLembur = jumlahHariLembur;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    // Method overloading untuk perhitungan total gaji
    public void hitungTotalGaji() {
        totalGaji = gajiPokok + (gajiPokok * jumlahHariLembur * 0.01);
    }

    public void hitungTotalGaji(double lemburRate) {
        totalGaji = gajiPokok + (gajiPokok * jumlahHariLembur * lemburRate);
    }

    // Method untuk menampilkan data pegawai
    public void tampilkanData() {
        System.out.println("NIP: " + NIP);
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Jumlah Hari Lembur: " + jumlahHariLembur);
        System.out.println("Gaji Pokok: " + gajiPokok);
        System.out.println("Total Gaji: " + totalGaji);
    }

    public static void main(String[] args) {
        // Membuat objek pegawai
        Pegawai pegawai0 = new Pegawai("123456", "Mc. gregor", "Jl. bagor", 5, 5000000);
        Pegawai pegawai1 = new Pegawai("543210", "Yuiji", "Jl. pangrango no.42", 3, 3000000);
        
        // Menghitung total gaji
        pegawai0.hitungTotalGaji();
        pegawai1.hitungTotalGaji();
        
        // Menampilkan data pegawai
        pegawai0.tampilkanData();
        System.out.print("\n"); // Karakter tabulasi
        
        pegawai1.tampilkanData();
        System.out.print("\n"); // Karakter tabulasi
    }
}

