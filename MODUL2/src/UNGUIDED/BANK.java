/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UNGUIDED;

/**
 *
 * @author 2211102208
 */
class BANK {
    private int saldo;

    // Konstruktor class Bank dengan parameter saldo
    public BANK(int saldo) {
        this.saldo = saldo;
    }

    // Method untuk menyimpan uang ke saldo
    public void simpanUang(int jumlah) {
        saldo += jumlah;
    }

    // Method untuk mengambil uang dari saldo
    public void ambilUang(int jumlah) {
        if (jumlah <= saldo) {
            saldo -= jumlah;
        } else {
            System.out.println("Maaf, saldo tidak mencukupi.");
        }
    }

    // Method untuk mendapatkan saldo
    public int getSaldo() {
        return saldo;
    }
}

