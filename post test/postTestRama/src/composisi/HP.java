/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composisi;

/**
 *
 * @author ramadhan wijaya
 * 2211102208
 */
public class HP {
    private CPU cpu;
    private RAM ram;
   

    public HP(CPU cpu, RAM ram) {
        this.cpu = cpu;
        this.ram = ram;
       
    }

    public void getInfo() {
        System.out.println("Informasi HP:");
        System.out.println("CPU: " + cpu.getNama() + " (" + cpu.getKecepatan() + " GHz)");
        System.out.println("RAM: " + ram.getKapasitas() + " GB");
    }
}

