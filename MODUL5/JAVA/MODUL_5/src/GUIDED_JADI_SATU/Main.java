/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUIDED_JADI_SATU;

/**
 *
 * @author rama
 */
class Buku {

    String judul, pengarang;
    long hargaBuku;

    public Buku(String judul, String pengarang, long hargaBuku) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.hargaBuku = hargaBuku;
    }

    public void cetakBuku() {
        System.out.println("\nJudul : " + judul);
        System.out.println("Pengarang : " + pengarang);
        System.out.println("Harga Buku: Rp " + hargaBuku);
        System.out.println();
    }
}

class CD {

    String ukuran;
    long hargaCD;

    public CD(String ukuran, long hargaCD) {
        this.ukuran = ukuran;
        this.hargaCD = hargaCD;
    }

    public long getHargaCD() {
        return hargaCD;
    }

    public void cetakCD() {
        System.out.println("Ukuran CD : " + ukuran);
        System.out.println("Harga CD : Rp " + hargaCD);
        System.out.println();
    }
}

class ChildCD extends CD implements InterfaceCD {

    public ChildCD(String ukuran, long hargaCD) {
        super(ukuran, hargaCD);
    }
}

class Paket extends Buku implements InterfaceCD {

    long hargaPaket;
    InterfaceCD interfaceCD;

    public Paket(String judul, String pengarang, long hargaBuku, String ukuran, long hargaCD) {
        super(judul, pengarang, hargaBuku);
        interfaceCD = new ChildCD(ukuran, hargaCD);
    }

    public long getHargaBuku() {
        return super.hargaBuku;
    }

    public void hitungHargaPaket() {
        hargaPaket = getHargaBuku() + getHargaCD();
    }

    public void cetakCD() {
        interfaceCD.cetakCD();
    }

    public long getHargaCD() {
        return (interfaceCD.getHargaCD());
    }

    public void cetakPaket() {
        super.cetakBuku();
        cetakCD();
        System.out.println("Harga paket Buku dan CD: Rp " + hargaPaket
                + "\n");
    }
}

public class Main {

    public static void main(String args[]) {
    Paket a = new Paket("Pemrograman Berorientasi Objek",
            "Benyamin Langgu Sinaga", 60000, "700 MB", 50000);
    a.hitungHargaPaket(); // Hitung harga paket sebelum mencetak
    a.cetakPaket();
}

}
