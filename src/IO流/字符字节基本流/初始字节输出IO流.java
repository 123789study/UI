package IO流.字符字节基本流;

import java.io.FileOutputStream;
import java.io.IOException;

public class 初始字节输出IO流 {
    public static void main(String[] args) throws IOException {

        //name也可以写File对象
        // 这个name路径可以不存在,系统会帮你创建,但是要保证父级路径存在
        // 这个name如果已经存在,那么会清空,但是可以开启续写,就是那个boolean append
        FileOutputStream fos=new FileOutputStream("F:\\java代码\\UI\\src\\a.txt",false );

        //写的是ascill上对应的字符97---->a
        String str="Genshin_Impact 原神 1970-1-1 00:00:00";
        byte[] bytes1= str.getBytes();
        fos.write(bytes1,0,bytes1.length);
        //输入操作符合,比如换行符等
       /* String str0="\r\n你好世界";
        byte[] bytes2=str0.getBytes();
        fos.write(bytes2);*/

        //释放资源,如果你不释放,那么java会一直占用这个文件,其他人就不能再操作这个文件
        fos.close();
    }
}
