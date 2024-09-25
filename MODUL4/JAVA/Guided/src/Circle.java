/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * @author ramadhan wijaya
 * @2211102208
 * @IF-10M
 */
/* Kelas Anak */
public class Circle extends Point {
    private float radius;
// Konstruktor kelas Anak memanggil konstruktor kelas Induk
    public Circle(float r, float a, float b) {
        super(a, b);
        radius = r;
        System.out.println("Konstruktor Circle dijalankan ");
    }
    
// Method yang memanggil method Induk dari kelas induknya dengan menggunakan keyword super
public void cetakPoint() // redefinisi fungsi kelas induk
    {
        super.cetakPoint();
        System.out.println("Radius: " + radius);
    }
    
/**Main Method*/
    public static void main(String args[]) {
    // Membuat instans dari kelas anak dan memanggil method yang dimilikinya 
                Circle circle1 = new Circle(6.5f, 8.2f, 1.9f);
                circle1.cetakPoint();
                System.out.println(" ");
                Circle circle2 = new Circle(10, 5, 5);
                circle2.cetakPoint();
            }
}

