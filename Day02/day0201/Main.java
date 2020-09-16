package Day02.day0201;
//要求：
//1）定义一个交通工具Vehicle类，类中包含：
//属性：速度(speed)、体积(size)
//方法：加速speedUp(), 减速speedDown()，方法中控制台输出字符串“加速”/“减速”即可
//2）编写测试类Main, main方法中实例化Vehicle对象，为所有属性赋值并输出，最后调用加速，减速方法。
public class Main {


    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(400.0,20.0);
        System.out.println(vehicle.toString());
        vehicle.speedUp();
        vehicle.speedDown();
    }
}
