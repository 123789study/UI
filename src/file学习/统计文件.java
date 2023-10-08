package file学习;

import java.io.File;

public class 统计文件 {
    public static void main(String[] args) {
        File f=new File("C:\\Users\\电脑小白\\Desktop\\学习");
        System.out.println(内存(f));
    }

    public static long 内存(File src){
        long len=0;
        File[] files = src.listFiles();
        for (File file : files) {
            if(file.isFile()){
                len=len+file.length();
            }else {
                len=len+内存(file);
            }
        }
        return len;
    }
}
