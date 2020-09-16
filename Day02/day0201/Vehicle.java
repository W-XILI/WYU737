package Day02.day0201;

public class Vehicle {
    private double speed ;
    private double size ;
    public Vehicle(double speed, double size){
        this.speed = speed;
        this.size = size;
    }
    public void speedUp(){
        System.out.println("加速");
    }
    public void speedDown(){
        System.out.println("减速");
    }


    @Override
    public String toString() {
        return "速度:"+speed+"km/s,体积"+size+"m²";
    }
}
