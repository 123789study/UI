package IO流.综合练习;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static cn.hutool.core.map.MapUtil.getDate;

public class 综合练习1网络爬取姓氏 {
    public static void main(String[] args) throws IOException {
    /*
    制造假数据:
    获取姓氏: https://hanyu.baidu.com/s?wd=%E7%99%BE%E5%AE%B6%E5%A7%93&from=poem
    获取男生名字: http://www.haoming8.cn/baobao/10881.html
    获取女生名字: http://www.haoming8.cn/baobao/7641.html
    */
        String FamilyNameNet="https://hanyu.baidu.com/s?wd=%E7%99%BE%E5%AE%B6%E5%A7%93&from=poem";
        String BoyName="http://www.haoming8.cn/baobao/10881.html";
        String GirlName="http://www.haoming8.cn/baobao/7641.html";
        String name = getName(FamilyNameNet);
        String boyname = getName(BoyName);
        String girlname = getName(GirlName);
        ArrayList<String> list=getDate(name,"(.{4})(?=，|。)");
        ArrayList<String> list1=getDate(boyname,"([\u4E00-\u9FA5]{2})(?=、|。)");
        ArrayList<String> list2=getDate(girlname,"(.. ){4}..");

        //System.out.println(list2);
        //System.out.println(list1);
        System.out.println(list);

        for (String s : list) {
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                System.out.println(c);
            }
        }

    }

    private static ArrayList<String> getDate(String familyNameNet, String regex) {
        ArrayList<String> list=new ArrayList<>();
        Matcher matcher=Pattern.compile(regex).matcher(familyNameNet);
        while(matcher.find()){
            String group = matcher.group();
            list.add(group);
        }
        return  list;
    }

    public static String getName(String net) throws IOException {
        StringBuilder sb=new StringBuilder();
        URL url=new URL(net);
        URLConnection uonn = url.openConnection();
        InputStreamReader isr=new InputStreamReader(uonn.getInputStream());
        int ch;
        while((ch=isr.read())!=-1){
            sb.append((char) ch);
        }
        isr.close();
        return sb.toString();
    }
}
