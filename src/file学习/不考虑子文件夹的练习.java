package file学习;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class 不考虑子文件夹的练习 {
    public static void main(String[] args) throws IOException {
        File file=new File("C:\\Users\\电脑小白\\Desktop\\学习\\aaa");
        file.mkdirs();
        File file1=new File(file,"a.txt");
        file1.createNewFile();

        System.out.println("=============================================");
        File FILE=new File("C:\\Users\\电脑小白\\Desktop\\学习");
        File[] files = FILE.listFiles((dir,name)->name.endsWith(".txt"));
        Arrays.stream(files).forEach(s-> System.out.println(s));

        System.out.println("=============================================");
        File f=new File("C:\\Users\\电脑小白\\Desktop\\学习");
        File[] name = FILE.listFiles(path->true);
        Arrays.stream(name).forEach(s-> System.out.println(s));
    }
}
