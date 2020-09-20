package Day05;
//实现一个按学生成绩排序(升序降序都可以，成绩一样的可再按名字，学号等排序)的功能。
// 提示：最好用Tree Set集合。
import java.util.TreeSet;

public class SortGrade implements Comparable<SortGrade>{

    private int grade;
    private String name;
    private  int ID ;

    public SortGrade(int grade, String name , int ID){
        super();
        this.grade = grade;
        this.name = name;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public int compareTo(SortGrade sortGrade) {
        //成绩由高到低、相同比较姓名由长度少到长、相同比较学号由低到高
        int i = sortGrade.grade - this.grade;
        int num = i == 0 ? this.name.compareTo(sortGrade.name) : i;
        return num == 0 ? sortGrade.ID - this.ID : num;
    }

    @Override
    public String toString() {
        return "成绩："+grade+" 姓名："+name+" 学号："+ID+"\n";
    }

    public static void main(String[] args) {
        TreeSet<SortGrade> comparableGrades = new TreeSet<>();
        //成绩由高到低，同成绩
        comparableGrades.add(new SortGrade(88, "小红", 666));
        comparableGrades.add(new SortGrade(77, "小白", 777));
        comparableGrades.add(new SortGrade(77, "小蓝", 19));
        comparableGrades.add(new SortGrade(66, "小粉粉", 20));
        comparableGrades.add(new SortGrade(66, "小粉", 199));
        System.out.println(comparableGrades.toString());
    }
}
