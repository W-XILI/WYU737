package Day02.day0204;

public class Trunk extends Vehicles{
    private float load;
    public Trunk(String brand,String color,float load){
        super(brand,color);
        this.load = load;
    }
    public String showTrunk(){
        return "载重"+load;
    }
}
