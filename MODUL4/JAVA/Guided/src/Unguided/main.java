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
public class main {

    public static void main(String[] args) {
        satpam S = new satpam();
        sales T = new sales();
        manager M = new manager();
        
        S.setSatpam("Rendra", "0042", "Jl. Itik 15", 2000, 300000, 5);
        T.setSales("Wibisana", "0185", "Jl. Ayam 78", 2006, 500000, 10);
        M.setManager("Adi", "0005", "Jl. Angsa 56", 1999, 1500000, "Keuangan");
        System.out.println("\n\n==DISPLAY DATA KARYAWAN==");
        
        S.cetakSatpam();
        System.out.println(" ");
        
        T.cetakSales();
        System.out.println(" ");
        
        M.cetakManajer();
    }
}
