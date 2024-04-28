/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

/**
 *
 * @author 84346
 */
public class Dog extends Animal{
    
    public Dog(String name) {
        super(name);   
    }

    @Override
    public void seep() {
        System.out.println("Toi an xuong");
    }

    @Override
    public void MakeSound() {
        System.out.println("Gau gau");
    }

    

}
