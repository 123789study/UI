package IO流.综合练习;

import cn.hutool.core.util.ReUtil;
import cn.hutool.http.HttpUtil;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class 利用糊涂包实现爬取 {
    public static void main(String[] args) throws IOException {
        String sAll = HttpUtil.get("https://hanyu.baidu.com/s?wd=%E7%99%BE%E5%AE%B6%E5%A7%93&from=poem");
        String sBoy = HttpUtil.get("http://www.haoming8.cn/baobao/10881.html");
        String sGirl = HttpUtil.get("http://www.haoming8.cn/baobao/7641.html");

        List<String> all = ReUtil.findAll("(.{4})(，|。)", sAll, 1);
        List<String> list1=ReUtil.findAll("([\u4E00-\u9FA5]{2})(?=、|。)",sBoy,1);
        List<String> list2=ReUtil.findAll("(.. ){4}..",sGirl,1);

       /* System.out.println(all);
        System.out.println(list1);
        System.out.println(list2);*/

        //获取单独的姓氏,复姓无法显示,反正毕竟也是假的姓名
        ArrayList<Character> familyName=new ArrayList<>();
        for (String s : all) {
            // s 形如:赵钱孙李  每四个为一组
            for (int i = 0; i < s.length(); i++) {
                familyName.add(s.charAt(i));
            }
        }
        Collections.shuffle(familyName);   //打乱一下姓氏的顺序

        //获取Boy的名字,Oh~~~MyBoy!yeah
        ArrayList<String> BoyName=new ArrayList<>();
        for (String s : list1) {
           if(!BoyName.contains(s)){
               BoyName.add(s);
           }
        }

        //获取Girl的名字
        ArrayList<String> GrilName=new ArrayList<>();
        for (String s : list2) {
            GrilName.add(s.trim());
        }

        // 生成数据,姓名-性别-年龄
        ArrayList<String> FinalList= getFinalList(familyName,BoyName,GrilName,5,5);
        System.out.println(FinalList);

        BufferedWriter bw=new BufferedWriter(new FileWriter("F:\\java代码\\UI\\src\\b.txt"));
        for (String s : FinalList) {
            bw.write(s);
            bw.newLine();
        }
        bw.close();

    }

    private static ArrayList<String> getFinalList(ArrayList<Character> familyName, ArrayList<String> BoyName, ArrayList<String> GrilName, int NumOfBoy, int NumOfGirl) {
        HashSet<String> BoyHS=new HashSet<>();
        while (true){
            if (BoyHS.size()==NumOfBoy){
                break;
            }
            Collections.shuffle(familyName);
            Collections.shuffle(BoyName);
            BoyHS.add(familyName.get(0)+BoyName.get(0));
        }

        HashSet<String> GirlHS=new HashSet<>();
        while (true){
            if (GirlHS.size()==NumOfGirl){
                break;
            }
            Collections.shuffle(familyName);
            Collections.shuffle(GrilName);
            GirlHS.add(familyName.get(0)+GrilName.get(0));
        }

        ArrayList lastList=new ArrayList();
        Random r=new Random();

        for (String boyH : BoyHS) {
            int age=r.nextInt(10)+18;
            lastList.add(boyH+"-男-"+age);
        }

        for (String GirlH : GirlHS) {
            int age=r.nextInt(10)+16;
            lastList.add(GirlH+"-女-"+age);
        }

        Collections.shuffle(lastList);
        return lastList;
    };

}
