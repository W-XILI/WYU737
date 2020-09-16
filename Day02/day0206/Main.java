package Day02.day0206;
//要求：
//1)	创建一个名称为Vehicle的接口，在接口中添加两个方法start()和stop()。
//2)	创建Bike和Bus的类并且实现Vehicle接口。
//3)	编写测试类Main,在main()方法中创建Bike和Bus对象 并分访问start()和stop()方法,输出信息。
public class Main {
    public static void main(String[] args) {
        Bike bike = new Bike();
        System.out.println(bike.start()+bike.stop());
        Bus bus = new Bus();
        System.out.println(bus.start()+bus.stop());
    }

}
