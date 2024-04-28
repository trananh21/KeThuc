/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

/**
 *
 * @author 84346
 */
public class HocSinh extends ConNguoi {

    private String tenLop;
    private String tenTruong;

    public HocSinh(String hovaten, int namSinh, String tenLop, String tenTruong) {
        super(hovaten, namSinh);
        this.tenLop = tenLop;
        this.tenTruong = tenTruong;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public String getTenTruong() {
        return tenTruong;
    }

    public void setTenTruong(String tenTruong) {
        this.tenTruong = tenTruong;
    }
    
    public void lamBaitTap(){
        System.out.println("Da lam bai tap");
    
    }
    
}
