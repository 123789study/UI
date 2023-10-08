package IO流.练习题目;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class 用对象流读写多个对象 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList<student> list = new ArrayList<>();

        student s1 = new student("张三", 24, "下北泽");
        student s2 = new student("李四", 25, "林檎");
        student s3 = new student("王五", 26, "114514");

        Collections.addAll(list, s1, s2, s3);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("F:\\java代码\\UI\\src\\informations.txt"));
        oos.writeObject(list);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("F:\\java代码\\UI\\src\\informations.txt"));
        System.out.println(ois.readObject());
        ois.close();

    }
}

class student implements Serializable {

    private static final long serialVersionUID = -1555608751334563966L;

    private String name;
    private int age;
    private String address;

    public student() {
    }

    public student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
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

    /**
     * 获取
     *
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置
     *
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    public String toString() {
        return "student{name = " + name + ", age = " + age + ", address = " + address + "}";
    }
}
