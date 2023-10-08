package 趣味题目;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class 字符谜题 {
    public static void main(String[] args) throws UnsupportedEncodingException {

        /**字符与字符串的加减
         * char和String的差别
         * */
        // TODO 最后的笑声
        /*System.out.println('a'+'B');
        System.out.println("a"+'B');*/


        /**对于数组名称的直接打印
         *除了char[]直接打印为里面的参数,因为print里面重载了print(char[])
         *其余的均调用了toString()方法,若不重载toString,那么就会调用Object里面的
         *在Object里面的toString()方法就是
         * return getClass().getName() + "@" + Integer.toHexString(hashCode())
         * */
        // TODO ABC
        /*char[] arr=new char[]{'1','2','3'};
        System.out.println(""+arr);
        System.out.println(arr.toString());
        System.out.println(String.valueOf(arr));*/

        // TODO 字符连接
        /*final String str1="length: 10";
        final String str2="length: "+str1.length();
        System.out.println("str1和str2 are equal: "+str1==str2);
        System.out.println(str1.equals(str2));*/

        /**转义字符在注释里面都会产生影响
         * 不能简简单单的就认为双斜杠\\后面的一行都是注释
         * Unicode在注释里面也会生效.比如遇到\u0022就会变成双引号",
         * 除非必要,要不然不要使用Unicode转意字符,它使得代码阅读性质大大降低
         * */
        // TODO 转义字符\
        /*System.out.println("a\u0022.length()+\u0022b".length());*/

        // TODO 字符集
       /* byte[] bytes = new byte[256];
        for (int i = 0; i < 256; i++)
            bytes[i] = (byte) i;
        String str = new String(bytes,"ISO-8859-1");
        for (int i = 0; i < str.length(); i++) {
               System.out.print( str.charAt(i)+" ");
        }
        byte[] bytes1="杈句紞鎻愭睙".getBytes("GBK");
        String str1=new String(bytes1,"UTF-8");
        System.out.println(str1);
        */

        /**正则表达式 . \d \w 等字符无法直接匹配,因为有别的意思,所有要用\进行转义
         * 那有些字符我不知道有别的意思该咋办?不要担心,正则表达式可以调用Pattern.quote()就可以避免
         * 而替换部分可以调用Matcher.quoteReplacement()
         * */
        // TODO 正则表达式中匹配
        /*String str = 字符谜题.class.getName();
        System.out.println(str.replaceAll("\\.", "-->") + ".class");
        System.out.println(str.replaceAll(Pattern.quote("."), "-->") + ".class");
        System.out.println(str.replaceAll("\\.", Matcher.quoteReplacement(File.separator)) + ".class");*/

        /** Java隐藏的特性
         * 注释的另外一个方式
         * ()://();   在括号里面写上你的注释
         * 而且不能放在最后,这个是标号的注释,意义不大
         * */
        // TODO URL的愚弄
       /* System.out.print("iexplore:");
        你看我是啥://www.google.com;
        System.out.println(":maximize");*/
    }
}
