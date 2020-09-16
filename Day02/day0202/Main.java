package Day02.day0202;
//要求：
//编写Java程序用于显示人的姓名和年龄。
//1）定义一个Person类，该类中应该有两个私有属性，姓名(name)和年龄(age)，以及性别(gender)。
//2）定义不同参数列表的构造方法并初始化，控制台打印输出。
//4)编写测试类Main,在main方法中根据不同重载的构造方法，分别创建Person类的实例
public class Main {
    public static void main(String[] args) {

        Person person = new Person("小明",18);
        Person person1 = new Person("小红",18,"女");
        Person person2 = new Person("小小");
        System.out.println(person.toString());
        System.out.println(person1.toString());
        System.out.println(person2.toString());
    }

}
