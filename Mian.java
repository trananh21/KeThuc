/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

/**
 *
 * @author 84346
 */
public class Mian {
    public static void main(String[] args) {
        Dog d = new Dog("Dog");
        d.eat();
        d.MakeSound();
        d.seep();
        
        Cat c = new Cat("Cat");
        c.MakeSound();
        c.eat();
    }
}
