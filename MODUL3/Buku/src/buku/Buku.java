/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buku;

/**
 * @author ramadhan wijaya
 * @2211102208
 * @IF-10-M
 */
//Prinsip-Prinsip Perancangan Kelas /* Mendeklarasikan Kelas */
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Buku {
    private String pengarang;
    private String judul;
    private int jmlh_Halaman;
    private float diskon;
    private double harga;

    public Buku() { // constructor
        System.out.println("Konstruktor buku dijalankan...");
    }

    public void setPengarang(String Pengarang) {
        pengarang = Pengarang;
    }

    public void setJudul(String Judul) {
        judul = Judul;
    }

    public void setJmlhHalaman(int JmlhHalaman) {
        jmlh_Halaman = JmlhHalaman;
    }

    public String getPengarang() {
        return pengarang;
    }

    public String getJudul() {
        return judul;
    }

    public int getJmlhHalaman() {
        return jmlh_Halaman;
    }

    public void setInfo(float dskn, double HargaBuku) {
        diskon = dskn;
        harga = HargaBuku - (HargaBuku * diskon);
    }

    public void setInfo(double HargaBuku) {
        diskon = 0.1F;
        harga = HargaBuku - (HargaBuku * diskon);
    }

    public void cetak() {
        System.out.println("Judul Buku : " + getJudul());
        System.out.println("Pengarang Buku : " + getPengarang());
        System.out.println("Jumlah halaman Buku : " + getJmlhHalaman() + " halaman");
        System.out.println("Diskon Buku : " + diskon);
        System.out.println("Harga Buku : " + harga);
        System.out.println();
    }

    public static void main(String[] args) {
        Buku novel, fiksi;
        novel = new Buku();
        fiksi = new Buku();
        System.out.println();
        //BufferedReader adalah sebuah materi yang di import dari java.io.BufferedReader;
        //fungsi dari br/BufferedRead adalah untuk membaca teks dari input stream sehingga bisa menginpukan sebuah nilai
        //mirip dengan cin di c++
        
        //Fungsi br.readLine() mengembalikan sebuah string yang dibaca dari input stream. 
        //Namun, jika Anda ingin menggunakan nilai tersebut sebagai integer (angka bulat), 
        //Anda perlu mengonversinya dari tipe data string menjadi tipe data integer. Itulah 
        //fungsi dari Integer.parseInt().Jadi ketika di eksekusi, Integer.parseInt(br.readLine()) 
        //membaca sebuah baris teks dari input stream yang diberikan oleh BufferedReader (br), 
        //kemudian mengonversi nilai teks tersebut menjadi tipe data integer. Hasil dari operasi 
        //tersebut adalah nilai integer yang dapat digunakan dalam program. Dalam konteks ini, 
        //nilai tersebut kemudian digunakan untuk mengatur jumlah halaman dari objek fiksi 
        //menggunakan metode setJmlhHalaman()
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Masukkan Judul Buku: ");
            novel.setJudul(br.readLine());
            System.out.print("Masukkan Pengarang: ");
            novel.setPengarang(br.readLine());
            novel.setInfo(0.2f, 45000);
            System.out.print("Masukkan Jumlah Halaman: ");
            novel.setJmlhHalaman(Integer.parseInt(br.readLine()));
            novel.cetak();
            System.out.println();
            System.out.print("Masukkan Judul Buku: ");
            fiksi.setJudul(br.readLine());
            System.out.print("Masukkan Pengarang: ");
            fiksi.setPengarang(br.readLine());
            fiksi.setInfo(79000);
            System.out.print("Masukkan Jumlah Halaman: ");
            fiksi.setJmlhHalaman(Integer.parseInt(br.readLine()));
            fiksi.cetak();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
