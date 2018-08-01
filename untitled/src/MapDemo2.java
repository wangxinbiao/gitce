import java.util.*;

public class MapDemo2 {
    public static void main(String[] args) {
        Map<String,String> map = new Hashtable<String,String>();
        map.put("key1","a");
        map.put("key2","b");
        map.put("key3","c");
        map.put("key4","d");
        map.put("key5","e");
        map.put("key6","f");
        System.out.println(map);
        if(map.containsKey("key1")){
            System.out.println("key1存在");
            String str1 = map.get("key1");
            System.out.println(str1);
        }else{
            System.out.println("key1不存在");
        }
        //获取key值
        Set<String> s1 = map.keySet();
        Iterator it1 = s1.iterator();
        while(it1.hasNext()){
            Object next = it1.next();
            String str3 = map.get(next);
            System.out.println(next +" "+ str3);
        }
        //获取value值
        Collection<String> c = map.values();
        Iterator it2 = c.iterator();
        while(it2.hasNext()){
            System.out.println(it2.next());
        }

        //遍历
        for(Map.Entry<String,String> m : map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

        Iterator it3 = map.entrySet().iterator();
        while(it3.hasNext()){
            Map.Entry<String,String> enter = (Map.Entry<String, String>) it3.next();
            System.out.println(enter.getKey()+" "+enter.getValue());
        }
    }
}
