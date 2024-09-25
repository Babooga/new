/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Guided;

/**
 *
 * @author ramadhan wijaya 2211102208 if-10m
 */
class Paket extends Buku implements InterfaceCD {

    long hargaPaket;
    InterfaceCD interfaceCD;

    public Paket(String judul, String pengarang, long hargaBuku, String ukuran, long hargaCD) {
        super(judul, pengarang, hargaBuku);
        interfaceCD = new ChildCD(ukuran, hargaCD);
    }

    public void hitungHargaPaket() {
        hargaPaket = super.hargaBuku + getHargaCD();
    }

    @Override
    public void cetakCD() {
        interfaceCD.cetakCD();
    }

    @Override
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
