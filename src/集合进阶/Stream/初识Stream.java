package 集合进阶.Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;
import java.util.stream.Stream;

public class 初识Stream {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张三", "张小三", "张三", "张三", "张翠花"
                , "张无忌", "张三丰", "刘备", "关羽", "张飞", "诸葛亮");

        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1, "张三-24", "张小三-32", "张三-25", "张三-97", "张翠花-9"
                , "张无忌-60", "张三丰-30", "刘备-40", "关羽-35", "张飞-32", "诸葛亮-24");
        list.forEach(s -> System.out.print(s + " "));

        System.out.println();

        list.stream().filter(s -> s.startsWith("张")).filter(s -> s.length() == 3).forEach(s -> System.out.print(s + " "));
        System.out.println();


        Stream<String> 你好 = list.stream();
        你好.limit(3).forEach(s -> System.out.print(s + " "));//去限制
        System.out.println();


        list.stream().distinct().forEach(s -> System.out.print(s + " "));    //去重
        System.out.println();


        list.stream().skip(3).forEach(s -> System.out.print(s + " "));
        System.out.println();


        //连接连个流
        Stream.concat(list.stream(), list.stream()).forEach(s -> System.out.print(s + " "));
        System.out.println();

        list1.stream().map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                String[] arr = s.split("-");
                String ageString = arr[1];
                int age = Integer.parseInt(ageString);
                return age;
            }
        }).forEach(s -> System.out.print(s + " "));

        list1.stream()
                .map(s ->Integer.parseInt(s.split("-")[1]))
                .forEach(s -> System.out.print(s + " "));
    }
}
