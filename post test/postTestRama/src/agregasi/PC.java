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
public class PC {
    private Processor processor;
    private RAM ram;
    private Storage storage;

    public PC(Processor processor, RAM ram) {
        this.processor = processor;
        this.ram = ram;
    
    }

    public Processor getProcessor() {
        return processor;
    }

    public RAM getRAM() {
        return ram;
    }

    public Storage getStorage() {
        return storage;
    }

    @Override
    public String toString() {
        return "PC{" +"processor= " + processor +",\nram= " + ram +'}';
    }
}
