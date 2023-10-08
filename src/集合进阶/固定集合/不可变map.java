package 集合进阶.固定集合;

import java.util.Map;
import java.util.Set;

public class 不可变map {
    public static void main(String[] args) {
        Map<String, String> map = Map.of("你好","世界","Hello","World");

        Set<String> keys=map.keySet();
        for (String key : keys) {
            System.out.println(key+","+map.get(key));
        }

        System.out.println("------------------------------");

        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
