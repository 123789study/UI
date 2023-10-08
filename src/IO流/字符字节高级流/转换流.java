package IO流.字符字节高级流;

import java.io.*;
import java.nio.charset.Charset;

public class 转换流 {
    public static void main(String[] args) throws IOException {
        // 旧版的转换流,按照制定编码输出文本
        /*InputStreamReader isr=new InputStreamReader(new FileInputStream("F:\\java代码\\UI\\src\\演员.txt"),"GBK");
        int ch;
        while((ch=isr.read())!=-1){
            System.out.print((char) ch);
        }
        isr.close();*/
        //旧版本,按照指定编码写入文本
       /* OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("F:\\java代码\\UI\\src\\演员.txt"),"GBK");
        osw.write("这首歌是薛之谦的《演员》");
        osw.close();*/
        //新版本的转换流,按照指定编码读取文本
     /* FileReader fr=new FileReader("F:\\java代码\\UI\\src\\演员.txt", Charset.forName("GBK"));
        int ch;
        while((ch=fr.read())!=-1){
            System.out.print((char) ch);
        }
        fr.close();*/
        //新版本的转换流,按照指定编码写入文本
       FileWriter fw=new FileWriter("F:\\java代码\\UI\\src\\演员.txt",Charset.forName("UTF-8"));
        fw.write("����С��");
        fw.close();
        //读取字节流,每一次读取一整行,而且不要有乱码
       /* FileReader fr=new FileReader("F:\\java代码\\UI\\src\\演员.txt",Charset.forName("GBK"));
        BufferedReader br=new BufferedReader(fr);
        String str;
        while ((str=br.readLine())!=null){
            System.out.println(str);
        }

        br.close();
        fr.close();*/
    }
}
