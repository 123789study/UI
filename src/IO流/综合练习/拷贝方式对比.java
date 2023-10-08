package IO流.综合练习;

import java.io.*;

public class 拷贝方式对比 {
    public static void main(String[] args) throws IOException {
        method1();
        method2();
        method3();
        method4();
    }

    private static void method4() throws IOException {
        FileWriter fw=new FileWriter("F:\\java代码\\UI\\src\\a.txt");
        FileReader fr=new FileReader("F:\\java代码\\UI\\src\\c.txt");
        long l = System.currentTimeMillis();
        int b;
        char[] bytes=new char[1024*1024*4];
        while ((b=fr.read(bytes))!=-1){
            fw.write(bytes,0,b);
        }
        System.out.println(System.currentTimeMillis()-l);
        fw.close();
        fr.close();
    }

    private static void method3() throws IOException {
        FileWriter fw=new FileWriter("F:\\java代码\\UI\\src\\a.txt");
        FileReader fr=new FileReader("F:\\java代码\\UI\\src\\c.txt");
        long l = System.currentTimeMillis();
        int b;
        while ((b=fr.read())!=-1){
            fw.write(b);
        }
        System.out.println(System.currentTimeMillis()-l);
        fw.close();
        fr.close();
    }

    private static void method2() throws IOException {
        FileInputStream dis=new FileInputStream("F:\\java代码\\UI\\src\\a.txt");
        FileOutputStream fos=new FileOutputStream("F:\\java代码\\UI\\src\\c.txt");
        long l = System.currentTimeMillis();
        byte[] bytes=new byte[1024*1024*8];
        int len;
        while ((len=dis.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }
        System.out.println(System.currentTimeMillis()-l);
        dis.close();
        fos.close();

    }

    private static void method1() throws IOException {
        FileInputStream dis=new FileInputStream("F:\\java代码\\UI\\src\\a.txt");
        FileOutputStream fos=new FileOutputStream("F:\\java代码\\UI\\src\\c.txt");
        long l = System.currentTimeMillis();
        int b;
        while ((b=dis.read())!=-1){
            fos.write(b);
        }
        System.out.println(System.currentTimeMillis()-l);
        dis.close();
        fos.close();

    }


}
