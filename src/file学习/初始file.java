package file学习;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class 初始file {
    public static void main(String[] args) {


        String str="C:\\Users\\电脑小白\\Desktop\\学习\\helloworld.txt";

        File f1=new File(str);

        System.out.println(f1.isDirectory());
        System.out.println(f1.isFile());
        System.out.println(f1.exists());
        System.out.println("=================================");

        System.out.println(f1.length());
        System.out.println(f1.getAbsolutePath());
        System.out.println(f1.lastModified());

        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date date=new Date(f1.lastModified());
        System.out.println(sdf.format(date));
    }
}
