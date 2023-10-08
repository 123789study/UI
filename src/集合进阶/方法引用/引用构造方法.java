package 集合进阶.方法引用;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

public class 引用构造方法 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "蔡坤坤,24", "叶齁咸,23", "刘不甜,23", "吴签,24", "谷嘉,30",
                "肖梁梁,27", "赵小颖,35", "杨颖,36", "高元元,43", "张天天,31", "刘诗,35", "杨小幂,33");

        list.stream()
                .map(new Function<String, student>() {
                    @Override
                    public student apply(String s) {
                        return new student(s.split(",")[0],Integer.parseInt(s.split(",")[1]));
                    }
                }).
                forEach(student -> System.out.println(student.getName() + "的年龄" + student.getAge()));


        list.stream()
                .map(student::new).
                forEach(student -> System.out.println(student.getName() + "的年龄" + student.getAge()));
    }
}

class student {
    private String name;
    private int age;

    public student() {
    }

    public student(String s){
        String[] arr=s.split(",");
        this.name=arr[0];
        this.age=Integer.parseInt(arr[1]);
    }

    public student(String name, int age) {
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
        return "student{name = " + name + ", age = " + age + "}";
    }
}
