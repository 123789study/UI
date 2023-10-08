package 异常;

import java.util.Scanner;

public class 训练 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        GirlFriend 女友=new GirlFriend();

        while (true) {
            try {
                System.out.println("请输入你的女朋友的姓名");
                String name=sc.next();
                女友.setName(name);

                System.out.println("请输入你的女朋友的年龄");
                int age=sc.nextInt();
                女友.setAge(age);

                break;
            }
            catch (NameFormatException e) {
                e.printStackTrace();
            }
            catch (AgeOutBoundsException e){
                e.printStackTrace();
            }
        }

        System.out.println(女友);
    }
}

class GirlFriend{
    private String name;
    private int age;

    public GirlFriend() {
    }

    public GirlFriend(String name, int age) {
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
    public void setName(String name){
        if(name.length()<2||name.length()>10){
            throw new NameFormatException();
        }
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
            throw new AgeOutBoundsException();
        }
        this.age = age;
    }

    public String toString() {
        return "GirlFriend{name = " + name + ", age = " + age + "}";
    }
}

class NameFormatException extends RuntimeException{
    public NameFormatException() {
    }

    public NameFormatException(String message) {
        super(message);
    }
}

class AgeOutBoundsException extends RuntimeException{

    public AgeOutBoundsException() {
    }

    public AgeOutBoundsException(String message) {
        super(message);
    }
}
