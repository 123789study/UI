package 集合进阶.方法引用;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class 引用静态方法 {
    public static void main(String[] args) {
        ArrayList<String> list =new ArrayList<>();
        Collections.addAll(list,"1","2","3","4","5");

        //引用静态方法
        list.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList())
                .forEach(s-> System.out.println(s+1));


    }
}
