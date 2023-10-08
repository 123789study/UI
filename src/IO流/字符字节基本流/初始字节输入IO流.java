package IO流.字符字节基本流;

import java.io.FileInputStream;
import java.io.IOException;

public class 初始字节输入IO流 {
    public static void main(String[] args) throws IOException {
        // name路径不存在会直接报错,java不会给你创建一个什么数据都没有的东西进行输入
        FileInputStream fis=new FileInputStream("F:\\java代码\\UI\\src\\a.txt");

        //read()读取的是ascll里面的数字
        //依次读取,类似于迭代器,每调用一次都会更换到下一个数据
        //读不到就返回-1


        //System.out.println((char) fis.read());
        int b=0;
        while ((b=fis.read())!=-1){
            System.out.print((char) b);
        }

        //释放资源
        fis.close();
    }

}
