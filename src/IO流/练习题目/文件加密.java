package IO流.练习题目;

import java.io.*;

public class 文件加密 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("F:\\java代码\\UI\\好看的.png");
        FileOutputStream fos=new FileOutputStream("F:\\java代码\\UI\\妮露.png");
        int b=0;
        while ((b=fis.read())!=-1){
            fos.write(b^1);
        }
        fos.close();
        fis.close();
    }
}
