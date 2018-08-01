import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args){
        List<String> list1 = new ArrayList<String>();
        list1.add("A");
        list1.add("B");
        list1.add("C");
        list1.add("D");
        list1.add("E");
        System.out.println(list1);
        for(int i = 0;i<list1.size();i++){
            System.out.println(list1.get(i));
        }
        list1.remove(0);
        for(int i = 0 ;i<list1.size();i++){
            System.out.println(list1.get(i));
        }

        System.out.println("集合是否为空:"+list1.isEmpty());
        System.out.println(list1.get(1)+"的索引："+list1.indexOf(list1.get(1)));
    }
}
