package IO流.综合练习;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class 带权重的练习 {
    public static void main(String[] args) throws IOException {
        ArrayList<Student> list=new ArrayList<>();
        BufferedReader br=new BufferedReader(new FileReader("F:\\java代码\\UI\\src\\b.txt"));
        String s;
        while ((s=br.readLine())!=null){
            String[] InformationOfStudent=s.split("-");
            Student student=new Student(
                    InformationOfStudent[0],
                    InformationOfStudent[1].charAt(0),
                    Integer.parseInt(InformationOfStudent[2]),
                    Double.parseDouble(InformationOfStudent[3])
            );
            list.add(student);
        }
        //list.stream().forEach(str-> System.out.println(str));
        br.close();

        double SumOfWeight = 0;
        for (Student student : list) {
            SumOfWeight+=student.getWeight();
        }
        //System.out.println(SumOfWeight);  //总权重


        // 计算每一个人的权重
        double[] arr=new double[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i]=list.get(0).getWeight()/SumOfWeight;
        }

        //显示出权重的范围
        for (int i = 1; i < arr.length; i++) {
            arr[i]+=arr[i-1];
        }
        System.out.println(Arrays.toString(arr));

        // 随机抽取
        double random = Math.random();
        random-=(1-arr[arr.length-1]);
        System.out.println(random); //打印随机抽取的结果

        int index=-Arrays.binarySearch(arr, random)-1; //获取随机到的学生下标
        System.out.println(index);

        list.get(index).setWeight(list.get(index).getWeight() / 2);//将获取到的下标进行修改
        System.out.println(list.get(index));

        BufferedWriter bw=new BufferedWriter(new FileWriter("F:\\java代码\\UI\\src\\b.txt"));
        for (Student student : list) {
            bw.write(student.toString());
            bw.newLine();
        }
        bw.close();
    }
}
class Student{
    private String name;
    private char gender;
    private int age;
    private double weight;

    public Student() {
    }

    public Student(String name, char gender, int age, double weight) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.weight = weight;
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
     * @return gender
     */
    public char getGender() {
        return gender;
    }

    /**
     * 设置
     * @param gender
     */
    public void setGender(char gender) {
        this.gender = gender;
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

    /**
     * 获取
     * @return weight
     */
    public double getWeight() {
        return weight;
    }

    /**
     * 设置
     * @param weight
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String toString() {
        return name+"-"+gender+"-"+age+"-"+weight;
    }
}
