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

public class main {
    public static void main(String[] args) {
        dosen dsnTtP = new dosenTetap("06001", "Adi", "S1IF", 1000000, 100000);
        dosen dsnTdkTtp = new dosenTidakTetap("06002", "Ani", "S1IF", 500000, 8);

        dsnTtP.tampilData();
        System.out.println();
        dsnTdkTtp.tampilData();
        
        System.out.println("\n\n2211102208");
    }
}
