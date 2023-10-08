package 集合进阶.Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.function.IntFunction;
import java.util.stream.Collectors;

public class 流的终结之收集 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,
                "张小三-男-32","张三-男-24", "张小三-男-32", "张三-女-25",
                "张三-男-97", "张翠花-女-9", "张无忌-男-60", "张三丰-男-30", "刘备-男-40",
                "关羽-男-35", "张飞-男-32", "诸葛亮-男-24");

        // 收集到list集合里面

        List<String> newlist1=list.stream()
                .filter(s -> "男".equals(s.split("-")[1])&&s.split("-")[0].length()==3)
                .collect(Collectors.toList());
        System.out.println(newlist1);


        //收集到set集合里面

        Set<String> newset1=list.stream()
                .filter(s -> "男".equals(s.split("-")[1])&&s.split("-")[0].length()==3)
                .collect(Collectors.toSet());
        System.out.println(newset1);

    }
}
