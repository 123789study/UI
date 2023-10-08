package IO流.综合练习;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class 修改文本内容 {
    public static void main(String[] args) throws IOException {
        BufferedReader fr = new BufferedReader(new FileReader("F:\\java代码\\UI\\src\\b.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("F:\\java代码\\UI\\src\\c.txt"));
       /* String str;
        ArrayList<String> list = new ArrayList<>();
        while ((str = fr.readLine()) != null) {
            list.add(str);
        }
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int NUM1 = Integer.parseInt(o1.split("\\.")[0]);
                int NUM2 = Integer.parseInt(o2.split("\\.")[0]);
                return NUM1-NUM2;

            }
        });

        for (String s : list) {
            bw.write(s);
            bw.newLine();
        }*/
        String str;
        TreeMap<Integer,String> tm=new TreeMap<>();
        while ((str=fr.readLine())!=null){
            tm.put(Integer.parseInt(str.split("\\.")[0]),str);
        }

        Set<Map.Entry<Integer, String>> entries = tm.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            String value = entry.getValue();
            bw.write(value);
            bw.newLine();
        }

        bw.close();
        fr.close();
    }
}
