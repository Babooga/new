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

class dosenTetap extends dosen {
    public double tunjangan;

    public dosenTetap(String NIDN, String nama, String prodi, double gj, double tjg) {
        super(NIDN, nama, prodi, gj);
        this.tunjangan = tjg;
    }



    @Override
    public double hitungTotalGaji() {
        return (gaji - hitungPajak()) + tunjangan;
    }

    
    @Override
    public double hitungPajak() {
        return gaji * 0.05;
    }
    
    @Override
    public void tampilData() {
        DecimalFormat df = new DecimalFormat("#,###.00");
        System.out.println("====Data Dosen Tetap====");
        super.tampilData();
        System.out.println("Tunjangan: " + df.format(tunjangan));
        System.out.println("Total Gaji: " + df.format(hitungTotalGaji()));
    }
}
