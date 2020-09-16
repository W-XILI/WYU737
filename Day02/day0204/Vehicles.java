package Day02.day0204;

public class Vehicles {
    private String brand;
    private String color;

    public Vehicles() {
    }

    public void run(){
        System.out.println("我已经开动");
    }
    public Vehicles(String brand, String color){
        this.brand = brand;
        this.color = color;
    }

    public String showInfo(){
        return "商标:"+brand+"    颜色:"+color;
    }
}
