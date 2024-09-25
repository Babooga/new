/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agregasi;

/**
 *
 * @author ramadhan wijaya
 * 2211102208
 */
public class Main {
    public static void main(String[] args) {
        Processor processor = new Processor("Intel Core i5-12600K", 10, 3.7);
        RAM ram = new RAM("DDR4", 16);
        Storage storage = new Storage("SSD", 512);

        PC pc = new PC(processor, ram);

        System.out.println("Spesifikasi PC : ");
        System.out.println(pc);
        
        System.out.println("\n\n2211102208");
    }
}
