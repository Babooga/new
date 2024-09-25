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
public class main {
   public static void main(String[] args) {
        CPU cpu = new CPU("Snapdragon 8 Gen 1", 4);
        RAM ram = new RAM(12);

        HP hp = new HP(cpu, ram);
        hp.getInfo();
        
        System.out.println("\n\n2211102208");
   }
}