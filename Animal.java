/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

/**
 *
 * Ghi de phuong thuc overriding trong java overriding hieu don gian la dc dung
 * trong TH lop con ke thua tu lop cha va muon dinh nghia lai mot phuong thuc da
 * co mat o lop cha
 *
 */
public class Animal {

    protected String name;

    public Animal(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void eat(){
        System.out.println("Toi dang an....");
    }
    public void MakeSound(){
        System.out.println("..........");
    }
    public void seep(){
        System.out.println("zzzzzzzzzzzz");
    }
}
