package IO流.练习题目;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class 登录注册功能 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("F:\\java代码\\UI\\src\\NUM.txt"));
        String str = br.readLine();
        br.close();

        String[] split = str.split("&");
        String[] split1 = split[0].split("=");
        String[] split2 = split[1].split("=");
        String[] split3 = split[2].split("=");

        String username = split1[1];
        String password = split2[1];
        int count = Integer.parseInt(split3[1]);


        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入用户名");
            String name = sc.nextLine();
            System.out.println("请输入密码");
            String word = sc.nextLine();

            if (name.equals(username) && word.equals(password)&&count<3) {
                System.out.println("登录成功");
            } else {
                count++;
                if (count<3){
                    System.out.println("登录失败,还剩下"+(3-count)+"次机会登录");
                }else {
                    System.out.println("账号锁定");
                    break;
                }
                BufferedWriter bw = new BufferedWriter(new FileWriter("F:\\java代码\\UI\\src\\NUM.txt"));
                bw.write("usernam=zhangsan&password=123&count="+count);
                bw.close();
            }
        }
    }
}
