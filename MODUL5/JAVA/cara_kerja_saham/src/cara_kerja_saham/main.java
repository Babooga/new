/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cara_kerja_saham;

/**
 *
 * @author rama
 */
public class main {
    public static void main(String args[]){
        
        BBCA bankBCA = new BBCA();
        bankBCA.cetak();

        investor rama = new investor("RAMADHAN WIJAYA", 2014, 25);
        rama.cetak();
        rama.destruktor();
    }
}
