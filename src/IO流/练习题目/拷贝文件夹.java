package IO流.练习题目;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class 拷贝文件夹 {
    public static void main(String[] args) throws IOException {
        File oldFile = new File("C:\\Users\\电脑小白\\Desktop\\学习");
        File newFile = new File("G:\\文件拷贝图片合集");
        CopyRightNow(oldFile, newFile);
    }

    private static void CopyRightNow(File oldFile, File newFile) throws IOException {
        newFile.mkdirs();
        File[] files = oldFile.listFiles();
        for (File file : files) {
            if (file.isFile()) {
                FileInputStream fis = new FileInputStream(file);
                FileOutputStream fos = new FileOutputStream(new File(newFile,file.getName()));

                byte[] bytes=new byte[1024*1024*1024];
                int len;
                while ((len=fis.read())!=-1){
                    fos.write(bytes,0,len);
                }
                fos.close();
                fis.close();
            } else {
                CopyRightNow(file,new File(newFile,file.getName()));
            }
        }
    }
}
