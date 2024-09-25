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
public class RAM {
    private String type;
    private int capacity;

    public RAM(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "RAM{" +"type : '" + type + '\'' +", capacity : " + capacity +'}';
    }
}
