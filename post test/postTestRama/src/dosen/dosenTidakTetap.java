/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dosen;

/**
 *
 * @author ramadhan wijaya
 * 2211102208
 */
import java.text.DecimalFormat;
class dosenTidakTetap extends dosen {
    private int jumlahTatapMuka;

    public dosenTidakTetap(String NIDN, String nama, String prodi, double gj, int jmlTatapMuka) {
        super(NIDN, nama, prodi, gj);
        this.jumlahTatapMuka = jmlTatapMuka;
    }

    
    @Override
    public double hitungTotalGaji() {
        return (gaji - hitungPajak()) + (jumlahTatapMuka * 25000);
    }

    @Override
    public double hitungPajak() {
        return gaji * 0.05;
    }

    
    @Override
    public void tampilData() {
        DecimalFormat df = new DecimalFormat("#,###.00");
        System.out.println("====Data Dosen Tidak Tetap====");
        super.tampilData();
        System.out.println("Jumlah Tatap Muka: " + jumlahTatapMuka);
        System.out.println("Total Gaji: " + df.format(hitungTotalGaji()));
    }
}
