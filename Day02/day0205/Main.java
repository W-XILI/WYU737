package Day02.day0205;
//要求：
//1)	创建一个Vehicle类并将它声明为抽象类，声明一个identifyNumberOfWheels方法。
//2)	创建两个类Car和Motorbike继承Vehicle类，在这两个类中实现identifyNumberOfWheels方法。
//3)	在Car类中控制台显示“四轮车”信息。
//4)	在Motorbike类中控制台显示“双轮车”信息。
//5)	编写测试类Main，在main方法中创建Car和Motorbike的实例。
public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.toString());
        Motorbike motorbike = new Motorbike();
        System.out.println(motorbike.toString());
    }
}
