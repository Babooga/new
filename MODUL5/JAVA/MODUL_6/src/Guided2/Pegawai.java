/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Guided2;

/**
 *
 * @author rama
 * 2211102208
 */
public abstract class Pegawai {

    private final String  namaPeg;
//konstruktor

    public Pegawai(String nama) {
        namaPeg = nama;
    } 
//method (get) untuk mengembalikan nama pegawai

    public String namaPegawai() {
        return namaPeg;
    }
//Method abstrak ini diwariskan ke semua kelas yang diturunkan dari kelas abstrak ini

    public abstract double income();
}
