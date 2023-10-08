package IO流.综合练习;

import java.io.*;

public class 计算程序打开次数 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new FileReader("F:\\java代码\\UI\\src\\NUM.txt"));
        int count = Integer.parseInt(br.readLine());
        br.close();

        count++;
        if(count<=3){
            System.out.println("欢迎使用本软件"+",还剩下"+(3-count)+"次免费使用的机会");
        }else{
            System.out.println("亲,请您充钱");
        }

        BufferedWriter bw=new BufferedWriter(new FileWriter("F:\\java代码\\UI\\src\\NUM.txt"));
        bw.write(count+"");
        bw.close();
    }
}
