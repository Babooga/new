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
public class Main {
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee = new SalariedEmployee("Otong", "123", 1000);
        CommissionEmployee commissionEmployee = new CommissionEmployee("Ucup", "456", 500, 0.1, 2000);
        ProjectPlanner projectPlanner = new ProjectPlanner("Mawl", "789", 800, 0.05, 3000);

        Employee[] employees = {salariedEmployee, commissionEmployee, projectPlanner};

        for (Employee employee : employees) {
            employee.displayInfo();
            System.out.println();
        }
    }
}