package Day02.day0204;
//1)	定义一个交通工具Vehicles类，该类中应包含
//  a.	String类型的成员属性商标(brand)和颜色(color),
//  b.	添加成员方法驾驶run，在控制台显示“我已经开动”
//  c.	编写构造方法初始化所有成员属性
//  d.	添加成员方法显示所有信息showInfo，在控制台显示商标和颜色。
//2)	编写Car小汽车类继承于Vehicles类
//  a.	增加int型成员属性座位(seats )
//  b.	编写构造方法初始化所有成员属性，显示调用父类构造方法
//  c.	增加成员方法showCar,在控制台显示小汽车的信息
//3)	编写Truck卡车类继承于Vehicles类
//  a.	增加float型成员属性载重(load)
//  b.	编写构造方法初始化所有成员属性，显示调用父类构造方法
//  c.	增加成员方法showTruck，在控制台显示卡车的信息
//4)    编写测试类Main,在main方法中实例化各类。
public class Main {
    public static void main(String[] args) {
        Car car = new Car("BMW","black",4);
        System.out.println(car.showInfo()+car.showCar());
        Trunk trunk = new Trunk("","",1);
        System.out.println(trunk.showInfo()+trunk.showTrunk());
    }

}
