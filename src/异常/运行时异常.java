package 异常;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class 运行时异常 {
    public static void main(String[] args) throws ParseException {

        /*String time="2023年4月2日";
        SimpleDateFormat sdf=new SimpleDateFormat("dddd年MM月dd日");
        Date date=sdf.parse(time);
        System.out.println(date);*/
        Student[]  students=new Student[3];

        Student s1=new Student();
        s1.setAge(50);


    }
}
class Student{
    private String name;
    private int age;

    public Student() {
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
        if(age<18||age>40){
            throw new RuntimeException("参数有误");
        }else{
            this.age=age;
        }
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + "}";
    }
}
