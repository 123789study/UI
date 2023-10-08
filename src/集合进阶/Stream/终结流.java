package 集合进阶.Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.IntFunction;

public class 终结流 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,"你好","世界","hello","world");



        //TODO 流的结束语句打印,统计和记录
        //list.stream().forEach(s-> System.out.print(s+" "));    //打印
        //System.out.println(list.stream().count());             //统计

        String[]arr=list.stream().toArray(new IntFunction<String[]>() {
            @Override
            public String[] apply(int value) {
                return new String[value];
            }
        });
    }
}
