import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo1 {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<String>();
        set1.add("A1");
        set1.add("B2");
        set1.add("F3");
        set1.add("C4");
        set1.add("D5");
        set1.add("E6");
        System.out.println(set1);
        Set<String> set2 = new TreeSet<String>();
        set2.add("a");
        set2.add("c");
        set2.add("d");
        set2.add("b");
        set2.add("e");
        System.out.println(set2);
    }
}
