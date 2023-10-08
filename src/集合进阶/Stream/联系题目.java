package 集合进阶.Stream;

import com.sun.jdi.Value;

import javax.naming.Name;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class 联系题目 {
    public static void main(String[] args) {
        //过滤数据
         /*ArrayList<Integer> list=new ArrayList<>();
        Collections.addAll(list,1,2,3,4,5,6,7,8,9);

        Integer[] newlist=list.stream().filter(s->s%2==0).toArray(value ->new Integer[value]);

        for (Object integer : newlist) {
            System.out.print(integer+" ");
        }*/


       /* ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,"zhangsan,23","lisi,24","wangwu,25");

        Map<String, Integer> collect = list.stream()
                .filter(s -> Integer.parseInt(s.split(",")[1]) >= 24)
                .collect(Collectors.toMap(s -> s.split(",")[0], s -> Integer.parseInt(s.split(",")[1])));


        Set<Map.Entry<String, Integer>> entries = collect.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey()+"的年龄为"+entry.getValue());
        }*/


        ArrayList<String> men = new ArrayList<>();
        ArrayList<String> women = new ArrayList<>();

        Collections.addAll(men, "蔡坤坤,24", "叶齁咸,23", "刘不甜,23", "吴签,24", "谷嘉,30", "肖梁梁,27");
        Collections.addAll(women, "赵小颖,35", "杨颖,36", "高元元,43", "张天天,31", "刘诗,35", "杨小幂,33");


        Stream<String> 男演员 = men.stream().filter(s -> s.split(",")[0].length() == 3).limit(2);
        Stream<String> 女演员 = women.stream().filter(s -> s.split(",")[0].startsWith("杨")).skip(1);

        List<Vctor> list = Stream.concat(男演员, 女演员).
                map(s -> new Vctor(s.split(",")[0], Integer.parseInt(s.split(",")[1]))).
                collect(Collectors.toList());


        list.forEach(s-> System.out.println(s.getAge()+ s.getName()));

    }
}


class Vctor {
    private String name;
    private int age;

    public Vctor() {
    }

    public Vctor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Vctor{name = " + name + ", age = " + age + "}";
    }
}
