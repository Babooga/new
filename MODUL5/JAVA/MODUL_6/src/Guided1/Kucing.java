/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Guided1;

/**
 *
 * @author rama
 * 2211102208
 */
public class Kucing extends Binatang {

    Kucing(String nama) {
        super("Kucing");
        this.nama = nama;
    }

    @Override
    public void suara() {
        System.out.println("mengeong");
    }

    @Override
    public String toString() {
        return super.toString() + " " + nama;
    }
    private final String nama;
}
