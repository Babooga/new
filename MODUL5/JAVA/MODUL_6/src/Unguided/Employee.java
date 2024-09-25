/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unguided;

/**
 *
 * @author rama
 * 2211102208
 */
public abstract class Employee {
    private String name;
    private String nip;

    public Employee(String name, String nip) {
        this.name = name;
        this.nip = nip;
    }

    public abstract double calculateSalary();

    public void displayInfo() {
        System.out.println("Nama: " + name);
        System.out.println("NIP: " + nip);
        System.out.println("Gaji: " + calculateSalary());
    }
}