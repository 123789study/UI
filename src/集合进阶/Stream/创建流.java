package 集合进阶.Stream;

import java.util.*;
import java.util.stream.Stream;

public class 创建流 {
    public static void main(String[] args) {
        // TODO       list单列集合类
        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,"张三","李四","王五","赵六");
        list.stream().forEach(s -> System.out.print(s+" "));
        System.out.println();

        // TODO       map双列集合类
        HashMap<Integer,String> hm=new HashMap<>();
        hm.put(0,"张三");
        hm.put(1,"李四");
        hm.put(2,"王五");
        hm.put(3,"赵六");
        //hm.keySet().stream().forEach(s-> System.out.print(s+" "));

        hm.entrySet().stream().forEach(s-> System.out.println(s+" "));

        // TODO       arr数组类
        int[] arr=new int[]{1,2,3,4,5,6};
        String[]str=new String[]{"1","2","3","4","5","6"};
        Arrays.stream(arr).forEach(s-> System.out.print(s+" "));
        System.out.println();
        Arrays.stream(str).forEach(s -> System.out.print(s+" "));
        System.out.println();


        // TODO       零散数据
        Stream.of(9,8,7,6,5,4,3,2,1).forEach(s-> System.out.print(s+" "));



    }
}
