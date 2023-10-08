package IO流.字符字节高级流;

import java.io.*;

public class 初识字节缓冲流 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream("F:\\java代码\\UI\\src\\a.txt"));
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("F:\\java代码\\UI\\src\\b.txt"));

        byte[] bytes=new byte[1024];
        int b;
        while ((b=bis.read(bytes))!=-1){
           bos.write(bytes,0,b);
        }

        bis.close();
        bos.close();
    }
}
