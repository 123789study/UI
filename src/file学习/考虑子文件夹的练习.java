package file学习;

import java.io.File;

public class 考虑子文件夹的练习 {
    public static void main(String[] args) {
        //遍历所有盘
       /* File[] files = File.listRoots();
        for (File file : files) {
            遍历(file);
        }*/

        //删除多级文件夹
        File file1 = new File("C:\\Users\\电脑小白\\Desktop\\创建多级文件夹");
        删除(file1);

    }

    public static void 遍历(File src) {
        File[] files = src.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    if (file.toString().contains("原神")) {
                        System.out.println(file);
                    }
                } else {
                    遍历(file);
                }
            }
        }
    }

    public static void 删除(File src) {
        File[] files = src.listFiles();
        for (File file : files) {
            if (file.isFile()) {
                file.delete();
            } else {
                删除(file);
            }
        }
        src.delete();
    }
}
