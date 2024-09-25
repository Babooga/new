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
public class ProjectPlanner extends Employee {
    private double baseSalary;
    private double commissionRate;
    private double totalProjectResult;

    public ProjectPlanner(String name, String nip, double baseSalary, double commissionRate, double totalProjectResult) {
        super(name, nip);
        this.baseSalary = baseSalary;
        this.commissionRate = commissionRate;
        this.totalProjectResult = totalProjectResult;
    }

    @Override
    public double calculateSalary() {
        double tax = 0.05 * baseSalary;
        return baseSalary + (commissionRate * totalProjectResult) - tax;
    }

    @Override
    public void displayInfo() {
        System.out.println("Project Planner");
        super.displayInfo();
        System.out.println("Gaji Pokok: " + baseSalary);
        System.out.println("Komisi: " + commissionRate);
        System.out.println("Total Hasil Proyek: " + totalProjectResult);
    }
}
