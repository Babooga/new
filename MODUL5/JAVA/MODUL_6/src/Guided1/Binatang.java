/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Guided1;

/**
 *
 * @author rama
 * 2211102208
 */
public abstract class Binatang {
    private final String jenis;
    Binatang(String jenis){
        this.jenis = jenis;
    }
    protected abstract void suara();
    

    public String toString(){
        return "seekor "+ jenis;
    }
}

