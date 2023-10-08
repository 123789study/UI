package 集合进阶.方法引用;

import com.sun.jdi.Value;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;
import java.util.function.IntFunction;

public class 练习题目 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,"蔡坤坤,24", "叶齁咸,23", "刘不甜,23", "吴签,24", "谷嘉,30",
                "肖梁梁,27", "赵小颖,35", "杨颖,36", "高元元,43", "张天天,31", "刘诗,35", "杨小幂,33");

        Student[] students = list.stream()
                .map(s -> new Student(s.split(",")[0], Integer.parseInt(s.split(",")[1])))
                .toArray(value -> new Student[value]);

        Student[] array = list.stream().map(Student::new).toArray(Student[]::new);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
class Student{
    private String name;
    private int age;

    public Student() {
    }

    public Student(String s){
        this.name=s.split(",")[0];
        this.age=Integer.parseInt(s.split(",")[1]);
    }
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + "}";
    }
}
