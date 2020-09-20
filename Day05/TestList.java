package Day05;
//.用普通 for 循环,增强 for 循环,迭代器循环这三种循环,去遍历输出集合的内容,
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestList {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add("小白");
        list.add("小红");
        list.add("小粉");
        list.add("小蓝");
        //for遍历
        for (int i = 0;i < list.size() ; i++){
            String temp = (String)list.get(i);
            System.out.print(temp);
        }
        System.out.println();
        //for-each遍历
        for(Object o : list){
            System.out.print(o);
        }
        System.out.println();
        //iterator遍历
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            String temp = (String) iterator.next();
            System.out.print(temp);
        }

    }
}
