import java.util.List;
import java.util.Vector;

public class ListDemo2 {
    public static void main(String[] args){
        List<String> list2 = new Vector<String>();
        list2.add("A");
        list2.add("B");
        System.out.println(list2.indexOf("B"));
        list2.add(1, "c");
        for(int i=0;i<list2.size();i++){
            System.out.println(list2.get(i));
        }
        System.out.println(list2.indexOf("B"));
    }
}
