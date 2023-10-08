package IO流.字符字节基本流;

import java.io.FileWriter;
import java.io.IOException;

public class 字符流练习 {
    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("F:\\java代码\\UI\\src\\a.txt");
        fw.write("你好");
        fw.write("abcdefg");
        fw.flush();

        fw.write("还有呐");
        fw.write("你看不到我");
        fw.close();
    }
}
