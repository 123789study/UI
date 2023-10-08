package IO流.字符字节基本流;

import java.io.FileNotFoundException;

public class try_catch捕获异常 {
    public static void main(String[] args) throws FileNotFoundException {
        long l = System.currentTimeMillis();
        // 复杂的try catch方法
       /* FileInputStream fis=null;
        FileOutputStream fos=null;

      try {
            fis=new FileInputStream("G:\\图片合集\\原神\\妮露.webp");
            fos=new FileOutputStream("..\\UI\\妮露.png");
            //拷贝
            byte[]bytes=new byte[1024*1024*5];
            int len;
            while ((len=fis.read(bytes))!=-1){
                fos.write(bytes,0,len);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            if (fos!=null){
                try {
                    fos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (fis!=null){
                try {
                    fis.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

        }*/

        //  JDK7中的简化方法,调用autocloseable,但是阅读性变差了
       /* try(FileInputStream fis=new FileInputStream("G:\\图片合集\\原神\\应急食品.webp");
            FileOutputStream fos=new FileOutputStream("..\\UI\\派蒙.jpg");) {
        }catch (IOException e){
            e.printStackTrace();
        }*/

        //  JDK9又改进了一下,增强阅读性质
       /*  FileInputStream fis=new FileInputStream("G:\\图片合集\\原神\\应急食品.webp");
        FileOutputStream fos=new FileOutputStream("..\\UI\\派蒙.jpg");
        try(fis;fos) {
        }catch (IOException e){
            e.printStackTrace();
        }*/

        System.out.println(System.currentTimeMillis()-l);
    }
}
