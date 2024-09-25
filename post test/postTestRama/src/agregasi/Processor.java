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
public class Processor {
    private String name;
    private int cores;
    private double speed;

    public Processor(String name, int cores, double speed) {
        this.name = name;
        this.cores = cores;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public int getCores() {
        return cores;
    }

    public double getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "name : '" + name + '\'' +",cores : " + cores +",speed : " + speed +'}';
    }
}
