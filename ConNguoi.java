
package OOP;

//Ke thuc
public class ConNguoi {
    private String hovaten;
    private int namSinh;
    
    public ConNguoi(String hovaten,int namSinh){
        this.hovaten = hovaten;
        this.namSinh = namSinh;
    
    }

    public String getHovaten() {
        return hovaten;
    }

    public void setHovaten(String hovaten) {
        this.hovaten = hovaten;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }
    public void an(){
        System.out.println("Mam man");
    
    }
    public void uong(){
        System.out.println("uc uc ");
    }
    public void ngu(){
        System.out.println("Kho kho");
    
    }
    

}
