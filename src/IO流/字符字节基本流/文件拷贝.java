package IO流.字符字节基本流;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class 文件拷贝 {
    public static void main(String[] args) throws IOException {

        //  TODO 小文件文件拷贝,其实就是读一个写一个
       /* long l = System.currentTimeMillis();
        FileInputStream fis=new FileInputStream("G:\\图片合集\\java知识点\\ascll表.png");
        FileOutputStream fos=new FileOutputStream("..\\UI\\Ascll.png");

        //拷贝
        int b;
        while ((b=fis.read())!=-1){
            fos.write(b);
        }

        System.out.println(System.currentTimeMillis()-l);
        fos.close();
        fis.close();*/
        // TODO 大文件文件拷贝,一次多度好几个,但是最后一次读取容易发生多读取
        long l = System.currentTimeMillis();
        FileInputStream fis=new FileInputStream("G:\\图片合集\\java知识点\\ascll表.png");
        FileOutputStream fos=new FileOutputStream("..\\UI\\Ascll.png");

        //拷贝
        byte[]bytes=new byte[1024*1024*5];
        int len;
        while ((len=fis.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }

        System.out.println(System.currentTimeMillis()-l);
        fos.close();
        fis.close();
    }
}
