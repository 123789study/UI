package IO流.字符字节基本流;

import java.io.*;

public class 初始字符流 {
    public static void main(String[] args) throws IOException {
      /* FileOutputStream fos=new FileOutputStream("F:\\java代码\\UI\\src\\a.txt",false);
        String str="Genshin_Impact 原神 1970-1-1 00:00:00";
        // 两种方式编码,utf-8(系统默认编码)或者GBK
        byte[] bytes1=str.getBytes();
        System.out.println(Arrays.toString(bytes1));
        System.out.println(bytes1.length);

        byte[] bytes2=str.getBytes("GBK");
        System.out.println(Arrays.toString(bytes2));
        System.out.println(bytes2.length);

        fos.write(bytes2);

        //解码
        String str1=new String(bytes1,"GBK");
        System.out.println(str1);

        String str2=new String(bytes2,"UTF-8");
        System.out.println(str2);

       FileInputStream fis=new FileInputStream("F:\\java代码\\UI\\src\\a.txt");
        int b;
        while ((b=fis.read())!=-1){
            System.out.print((char) b);
        }


        fis.close();
        fos.close();*/
       /* FileOutputStream fileOutputStream=new FileOutputStream("F:\\java代码\\UI\\src\\a.txt");
        String str="Genshin_Impact 1970 原神";
        byte[]bytes=str.getBytes();
        fileOutputStream.write(bytes);*/
       FileOutputStream fos = new FileOutputStream("F:\\java代码\\UI\\src\\a.txt");
        fos.write("你TMD是不是林檎".getBytes());

        FileWriter fw = new FileWriter("F:\\java代码\\UI\\src\\a.txt",true);
        String str=new String("你是".getBytes(),"UTF-8");
        fw.write("你好强啊??"+str);


        fw.close();
        fos.close();
    }
}
