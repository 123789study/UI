package file学习;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

public class 获取遍历 {
    public static void main(String[] args) {
        File file=new File("C:\\Users\\电脑小白\\Desktop\\学习");
        //获取遍历文件夹,而不是文件,包含隐藏文件夹
        // 如果你获取的路径根本不存在或者这个路径下是文件,则返回null
        // 如果文件夹里面啥也没有,那么久返回长度为0的数组
        File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.println(file1);
        }
        System.out.println("==================================");

        //获取盘符名称是File中的静态方法,所以直接File去点上listRoots()
        File[] files1 = File.listRoots();
        System.out.println(Arrays.toString(files1));
        System.out.println("==================================");

        //获取该路径下的所有内容的名称,返回值为String也就是不包含盘符:list()
        File file1=new File("C:\\Users\\电脑小白\\Desktop\\学习");
        String[] list1 = file1.list();
        Arrays.stream(list1).forEach(s -> System.out.println(s));
        System.out.println("==================================");

        //用文件名过滤器获取当前路径下所有的内容,返回值为String[]:list(FilenameFilter filter)
        //比如我想获取"C:\Users\电脑小白\Desktop\学习"中所有的txt文件
        File file2=new File("C:\\Users\\电脑小白\\Desktop\\学习");
        String[] list2 = file2.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                File f=new File(dir,name);
                return f.isFile()&&name.endsWith(".txt");
            }
        });
        Arrays.stream(list2).forEach(s -> System.out.println(s));
        System.out.println("==================================");

        //用文件名过滤器获取当前路径下所有的内容,返回值为String[]:listFiles(FileFilter filter)
        File file3=new File("C:\\Users\\电脑小白\\Desktop\\学习");
        File[] list3 = file3.listFiles(pathname-> true);
        Arrays.stream(list3).forEach(s -> System.out.println(s));
        System.out.println("==================================");


    }
}
