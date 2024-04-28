/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

/**
 *
 * @author 84346
 */
public class Main {
       public static void main(String[] args) {     
        ConNguoi cn = new ConNguoi("Pham Tran anh",2023);
        
        cn.an();
        cn.ngu();
        cn.uong();
        HocSinh hs = new HocSinh("Pham Tran anh",2023,"9c","Truong viet nam 3 lan");
        hs.an();
        hs.ngu();
        hs.uong();
        hs.lamBaitTap();
       }
}
