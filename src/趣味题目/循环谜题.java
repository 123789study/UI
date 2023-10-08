package 趣味题目;

import com.sun.jdi.Value;

public class 循环谜题 {
    public static void main(String[] args) {
        // TODO 循环判断条件的出错
        数据不在取值范围:/*
        for(Byte b=Byte.MIN_VALUE;b<Byte.MAX_VALUE;b++){
           System.out.println((b&0xff)+" "+b);
        }*/

        // TODO 自增运算符的迷惑
        /*int j=0;
        for (int i = 0; i < 100; i++) {
            j=j++;
            System.out.println(j);
        }*/

        // TODO 永远不会 "进行" 或者 "结束" 的循环
        精度不够:/*
        for (float i = 2000000000; i < 2000000050; i++) {
            System.out.println("我执行了吗");
        }*/; //float只能精确表示整数部分前8位后面的都会被忽略
        数据溢出:/*
        for (byte i = Byte.MIN_VALUE; i <= Byte.MAX_VALUE; i++) {
            System.out.println("我在执行"+i);
        }*/; //MAX_VALUE + 1 == MIN_VALUE,最大值再加一就会变成最小值
        左移细节:/* int count = 0;
        var a = -1;
        for (a = -1; a != 0; a <<= 1) {
            count++;
            System.out.println(a);
        }
        System.out.println(count);*/;

        // TODO 循环扩展,如何赋值使得看似不成立的东西成立
        让只有两次的if循环变成无数次循环:
        /*
        int start=Integer.MAX_VALUE-1;
        for (int i=start;i<=start+1;i++){
            System.out.println("无限循环");
        }
        */;  //利用数据溢出后会从最大值变成最小值实现
        让看似无法进行的while循环变成死循环:
        /*
        double i=Double.NEGATIVE_INFINITY;
        double other1=Double.POSITIVE_INFINITY;
        double other2=1.0/0.0;
        while (i==i+1){
            System.out.println("无限循环");
        }*/  //i==i+1      :    其实设置一个非常大的数据就可以满足要求了
        /*
        double i=Double.NaN;
        while (i!=i){
            System.out.println("无限循环");
        }*/  //i!=i        :    利用double一个奇特数字NaN(0.0/0.0),甚至NaN减去NaN都不是0
        /* double other=Double.NaN;
        String i="";
        while (i!=(i+0)){
            System.out.println("死循环");
        }*/  //i!=(i+0)    :    利用NaN也行,利用字符串也行,定义i为字符串也能满足要求
        /*short i=-1;
        while (i!=0){
           i>>>=1;
            System.out.println(i);
        }*/  //i!=0并且<<< :    利用隐藏特性,比较难
        /* Integer i=128;
        Integer j=128;
        while (i<=j && j<=i && j!=i){
            System.out.println("死循环");
        }*/  //i<=j && j<=i && j!=i :定义Integer,相同的装箱内容
        /*int i=Integer.MIN_VALUE;
        while (i!=0 && i==-i){
            System.out.println("死循环");
        }*/;  //i!=0 && i==-i  :也是利用数据溢出  i=-2147483648  ==> -i=2147483648,数据溢出,次数-i,就是il
    }
}
