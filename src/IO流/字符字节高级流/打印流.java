package IO流.字符字节高级流;

import java.io.*;

public class 打印流 {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        PrintStream ps=new PrintStream(new FileOutputStream("F:\\java代码\\UI\\src\\c.txt"),true,"UTF-8");
        ps.print(97);
        ps.println(98);
        ps.close();

        PrintWriter pw=new PrintWriter(new FileOutputStream("F:\\java代码\\UI\\src\\c.txt"),true);
        pw.println("你tmd是不是林檎");
        pw.close();


    }
}
