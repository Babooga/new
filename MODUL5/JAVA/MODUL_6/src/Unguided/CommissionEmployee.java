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
public class CommissionEmployee extends Employee {
    private double baseSalary;
    private double commissionRate;
    private double totalSales;

    public CommissionEmployee(String name, String nip, double baseSalary, double commissionRate, double totalSales) {
        super(name, nip);
        this.baseSalary = baseSalary;
        this.commissionRate = commissionRate;
        this.totalSales = totalSales;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + (commissionRate * totalSales);
    }

    @Override
    public void displayInfo() {
        System.out.println("Commission Employee");
        super.displayInfo();
        System.out.println("Gaji Pokok: " + baseSalary);
        System.out.println("Komisi: " + commissionRate);
        System.out.println("Total Penjualan: " + totalSales);
    }
}