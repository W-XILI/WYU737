package Day03;
//创建Emp类
//定义私有属性:
//String name，int age，String gender ，int salary， Date hiredate;//入职时间
// 	定义构造方法，以及属性get,set方法.
// 	定义toString方法，格式如:
//     	姓名:张三,年龄:25,性别:男,薪资:5000,入职时间:2020-01-11
// 	定义equals方法，要求名字，年龄，性别，薪资都相同，则认为内容一致。
// 	实现序列化接口，并定义版本号。
import java.io.Serializable;
import java.util.Date;

public class Emp implements Serializable {
    private String name;
    private int age;
    private String gender;
    private int salary;
    private Date hiredate;
    public final String version="1.0.0";

    public Emp(String name,int age,String gender,int salary,Date hiredate){
        this.age = age;
        this.gender = gender;
        this.hiredate = hiredate;
        this.name = name;
        this.salary = salary;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "姓名："+name+",年龄:"+age+",性别:"+gender+",薪资:"+salary+",入职时间："+hiredate;
    }

    @Override
    public boolean equals(Object obj) {
        Emp emp = (Emp) obj;
        if(name == emp.name
                && age == emp.age
                && gender == emp.gender
                && salary == emp.salary
                ){
            return false;
        }
        return true;
    }
}
