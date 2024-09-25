/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectSpeaks;

/**
 *
 * @author ramadhan 
 */
class Owl extends Mammal {

    public void speak() {
        System.out.println("Whoo! Whoo!");
    }

    @Override
    public void sleep() {
        System.out.println(" "); // Owl makes no noise when sleeping
    }
}
