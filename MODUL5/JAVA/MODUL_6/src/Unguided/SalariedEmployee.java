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
public class SalariedEmployee extends Employee {
    private double weeklySalary;

    public SalariedEmployee(String name, String nip, double weeklySalary) {
        super(name, nip);
        this.weeklySalary = weeklySalary;
    }

    @Override
    public double calculateSalary() {
        return weeklySalary;
    }

    @Override
    public void displayInfo() {
        System.out.println("Salaried Employee");
        super.displayInfo();
        System.out.println("Gaji Perminggu: " + weeklySalary);
    }
}
