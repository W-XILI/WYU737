package Day02.day0203.test;
//要求：
//1)	定义一个手机Phone类（放在com.homework包下）,类中有如下私有属性，屏幕尺寸（screenSzie），配牌（brand），处理器(cpu)，内存（memory），并提供所有成员的getXXX()和setXXX()方法。
//2)	编写测试类Main（放在com.test包下）,在main方法创建Phone类的实例，为所有成员变量赋值，并且控制台输出所有值。
import Day02.day0203.homework.Phone;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.setBrand("苹果");
        phone.setCpu("A100");
        phone.setMemory(32);
        phone.setScreenSize(20);
        System.out.println("配牌"+phone.getBrand()+"  CPU "+phone.getCpu()+" 内存"+phone.getMemory()+"G  尺寸"+phone.getScreenSize());
    }
}
