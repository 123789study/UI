package IO流.练习题目;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class 修改文件数据 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("F:\\java代码\\UI\\src\\a.txt");
        StringBuilder sb = new StringBuilder();
        int b;
        while ((b = fr.read()) != -1) {
            sb.append((char) b);
        }

       /* List<String> collect = Arrays.stream(sb.toString().split(",")).sorted().collect(Collectors.toList());
        System.out.println(collect);


        for (int i = 0; i < collect.size(); i++) {
            if(i==collect.size()-1){
                fw.write(collect.get(i)+" ");
            }else{
                fw.write(collect.get(i)+",");
            }
        }*/
        Integer[] array = Arrays
                .stream(sb.toString().split(","))
                .map(s->Integer.parseInt(s.trim()))
                .sorted()
                .toArray(Integer[]::new);
        String s=Arrays.toString(array);
        String result=s.substring(1,s.length()-1);

        FileWriter fw = new FileWriter("F:\\java代码\\UI\\src\\a.txt");
        fw.write(result);

        fr.close();
        fw.close();
    }
}
