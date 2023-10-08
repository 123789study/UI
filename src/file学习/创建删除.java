package file学习;

import javax.swing.*;
import java.io.File;
import java.io.IOException;

public class 创建删除 {
    public static void main(String[] args) throws IOException {

        //  创建文件
        File f1=new File("C:\\Users\\电脑小白\\Desktop\\学习\\你好.txt");
        File f2=new File("C:\\Users\\电脑小白\\Desktop\\学习\\你看我是个啥");
        f2.createNewFile();
        boolean newFile = f1.createNewFile();
        System.out.println(newFile);

        //创建文件夹    mkdir只能创建单级文件夹,mkdirs可以创建多级
        File f3=new File("C:\\Users\\电脑小白\\Desktop\\学习");
        File f4=new File("C:\\Users\\电脑小白\\Desktop\\创建多级文件夹\\多级\\文件夹");
        boolean mkdir = f3.mkdir();
        boolean mkdirs = f4.mkdirs();
        System.out.println(mkdir);
        System.out.println(mkdirs);

        //删除文件夹,不走回收站,并且不能删除多级文件夹
        //f1.delete();

    }
}
