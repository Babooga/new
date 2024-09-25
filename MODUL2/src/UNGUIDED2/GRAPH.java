/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UNGUIDED2;

/**
 *
 * @author 2211102208
 */
import java.util.Scanner;

class GRAPH {

    private int x;
    private int y;

    public GRAPH() {
        this.x = 0;
        this.y = 0;
    }

    public void inisialisasiTitik(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void tampilTitik() {
        System.out.println("Titik: (" + x + ", " + y + ")");
    }

    public void perkalianSkalar(int skalar) {
        this.x *= skalar;
        this.y *= skalar;
    }

    public void pencerminanSumbuX() {
        this.y = -this.y;
    }

    public void pencerminanSumbuY() {
        this.x = -this.x;
    }

    public double jarak(GRAPH t2) {
        int dx = t2.x - this.x;
        int dy = t2.y - this.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GRAPH titik1 = new GRAPH();
        GRAPH titik2 = new GRAPH();

        int choice;
        do {
            System.out.println("\nMENU OPERASI TITIK");
            System.out.println("1. INISIALISASI TITIK");
            System.out.println("2. TAMPIL TITIK");
            System.out.println("3. PERKALIAN SKALAR TITIK");
            System.out.println("4. PENCERMINAN TERHADAP SUMBU X");
            System.out.println("5. PENCERMINAN TERHADAP SUMBU Y");
            System.out.println("6. JARAK ANTARA DUA TITIK");
            System.out.println("0. KELUAR");
            System.out.print("MASUKAN PILIHAN : ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("\nMasukkan koordinat x titik 1: ");
                    int x1 = scanner.nextInt();
                    System.out.print("Masukkan koordinat y titik 1: ");
                    int y1 = scanner.nextInt();
                    titik1.inisialisasiTitik(x1, y1);

                    System.out.print("\nMasukkan koordinat x titik 2: ");
                    int x2 = scanner.nextInt();
                    System.out.print("Masukkan koordinat y titik 2: ");
                    int y2 = scanner.nextInt();
                    titik2.inisialisasiTitik(x2, y2);
                    break;
                case 2:
                    System.out.println("\nTitik 1:");
                    titik1.tampilTitik();
                    System.out.println("Titik 2:");
                    titik2.tampilTitik();
                    break;
                case 3:
                    System.out.print("\nMasukkan nilai skalar: ");
                    int skalar = scanner.nextInt();
                    titik1.perkalianSkalar(skalar);
                    titik2.perkalianSkalar(skalar);
                    System.out.println("\nTitik 1 setelah perkalian skalar:");
                    titik1.tampilTitik();
                    System.out.println("Titik 2 setelah perkalian skalar:");
                    titik2.tampilTitik();
                    break;
                case 4:
                    titik1.pencerminanSumbuX();
                    titik2.pencerminanSumbuX();
                    System.out.println("\nTitik 1 setelah pencerminan sumbu X:");
                    titik1.tampilTitik();
                    System.out.println("Titik 2 setelah pencerminan sumbu X:");
                    titik2.tampilTitik();
                    break;
                case 5:
                    titik1.pencerminanSumbuY();
                    titik2.pencerminanSumbuY();
                    System.out.println("\nTitik 1 setelah pencerminan sumbu Y:");
                    titik1.tampilTitik();
                    System.out.println("Titik 2 setelah pencerminan sumbu Y:");
                    titik2.tampilTitik();
                    break;
                case 6:
                    System.out.println("\nJarak antara titik 1 dan titik 2: " + titik1.jarak(titik2));
                    break;
                case 0:
                    System.out.println("\nTerima kasih!");
                    break;
                default:
                    System.out.println("\nPilihan tidak valid!");
            }
        } while (choice != 0);

        scanner.close();
    }
}
