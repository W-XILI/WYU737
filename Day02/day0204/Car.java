package Day02.day0204;

public class Car extends Vehicles {
    private int seats;
    public Car(String brand, String color, int seats){
        super(brand,color);
        this.seats = seats;
    }
    public String showCar(){
        return "座位： "+seats;
    }
}
