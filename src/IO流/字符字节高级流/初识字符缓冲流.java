package IO流.字符字节高级流;

import java.io.*;

public class 初识字符缓冲流 {
    public static void main(String[] args) throws IOException {

        BufferedReader br=new BufferedReader(new FileReader("F:\\java代码\\UI\\src\\a.txt"));
        BufferedWriter bw=new BufferedWriter(new FileWriter("F:\\java代码\\UI\\src\\c.txt"));

        String str;
        while ((str=br.readLine())!=null){
            System.out.println(str);
        }
        bw.write("落霞与孤鹜(wù)齐飞，秋水共长天一色。");
        bw.newLine();
        bw.write("关山难越，谁悲失路之人；萍水相逢，尽是他乡之客。");

        br.close();
        bw.close();
    }
}
