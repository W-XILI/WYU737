package Day02.day0202;

public class Person {
    private String name;
    private int age;
    private String gender;

    public Person(String name){
        this.name = name;
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, String gender){
        this.age = age;
        this.gender = gender;
        this.name = name;
    }

    @Override
    public String toString() {
        return "姓名:"+name+" 年龄："+age+" 性别："+gender;
    }
}
