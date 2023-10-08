package 趣味题目;


import java.math.BigDecimal;
import java.util.ArrayList;

import static java.lang.Math.*;

public class 表达式谜题 {
    public static void main(String[] args) {
        /**判断奇偶性,数学上余数始终是正数,但是编程不是
         * 在你判断负数奇偶性会出问题,也许是詹姆斯.高斯林数学不好?
         * 取模操作永远满足            a%b==a-(a/b)*b  这个等式
         * 判断奇偶性不止可以取模       n&1==0为奇数0/
         * */
        // TODO 奇数性
        /*System.out.println("3%2"+"=="+3%2+"       两正数求模    "+"4%2"+"=="+4%2);
        System.out.println("-3%2"+"=="+(-3%2)+"     一正一负求模   "+"-4%2"+"=="+(-4%2));
        System.out.println("-3%-2"+"=="+(-3%-2)+"    两负数求模     "+"-4%-2"+"=="+(-4%-2));
        System.out.println(floorMod(-3,2));
        System.out.println(floorMod(-3,-2));*/


        /**小数精度问题,电脑上无法准确的表达0.9这个二进制,所以就会产生误差
         *若对精度要求非常苛刻,建议使用BigDecimal(String),一定要是String,而不是Double
         * 传参一定一定要带双引号"",否则还是不精确.
         * */
        // TODO 小数带来的误差
        /*System.out.println(2-1.1);
        System.out.println(new BigDecimal(.1));   //结果还是不精确
        System.out.println(new BigDecimal(".1")); //结果精确
        BigDecimal bd1=new BigDecimal("2");
        BigDecimal bd2=new BigDecimal("1.1");
        System.out.println(bd1.subtract(bd2));*/


        /**float注意事项,一定要在数据后面加上L或者l否则还是以强传为int型处理
         * float不加F不会带来很大的错误,因为不带F会被认为是double类型的
         * */
        // TODO   long类型不加L带来的错误,尤其是数据溢出
        /*long a=24*60*60*1000*1000;
        long b=24*60*60*1000*1000L;
        int c=24*60*60*1000*1000;
        // 以a为例子,24,60,60,1000,1000均为int型数据,会先计算乘法,最后强转为long类型
        // 但是计算乘法的时候就已经数据溢出了,long类型转换也已经晚了
        System.out.println(0x7fffffffffffffffL);
        System.out.println("long类型的a="+a+"\n"+"int类型的c="+c+"\n"+"long类型的b="+b);*/


        /**l和1长的太像了,所有不是脑子有病就不要用小写的l
         * 不要以为你能很快的辨别l和1,等你出错或者让别人误解,你就不装了
         * */
        // TODO 低级错误l和1
       /* ArrayList<Integer> l=new ArrayList<>();
        l.add(1);
        System.out.println(l);
        System.out.println(12345+5432l);
        System.out.println(12345+5432L);*/


        /**基本数据类型的强制转换
         * 强转都是对补码进行转化的
         * ①:最初数字有符号,那么就要执行符号的扩展
         * ②:如果是强制转换为char类型的,都会执行0扩展
         * char比较特殊,它是无符号数,占两字节,也就是16个比特位
         * 你想让char类型的数据c不进行符号位扩展转化为int:   int i=(short)c
         * 你不让char类型的数据c不进行符号位扩展转化为int:   int i=c&0xffff
         * */
        // TODO 强转
        /*System.out.println((byte)-1+" "+(int)(char)-1+" "+(int)(char)(byte)-1);
        System.out.println();*/


        /**逻辑运算符先后顺序
         *
         * */
        // TODO 逻辑运算符顺序
        /*
        //交换两个数据而不去产生第三方变量
        int x = 1970;
        int y = 2023;
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println(x+" "+y);
        System.out.println(x ^ y ^ x);
        System.out.println(x ^ y ^ y);
        x ^= y ^= x ^= y;  //异或和赋值同时进行了,所以会很乱
        System.out.println(x + "     " + y);*/


        /**三目运算算符的细节
         * 混合运算会导致各种各样的意想不到不到的错误
         * 如果返回值1和返回值2都是同种类型，那么三目最终的返回类型就是这种类型
         * 如果返回值1和返回值2不是同种类型，那么三目最终的返回类型是这两种类型的相同最小父类
         * （最接近的父类，如果没有则返回Object，例如Integer和String最终返回的将是Object）。
         * 对于基本数据类型，有点特殊。如果一个返回值类型为T（T为byte，char或short），另一个为int的常数，
         * 那么如果这个常数值在T的取值范围内，则三目最终的返回类型为T，
         * 如果常数值不在T的取值范围内，则返回发生自动类型转换
         * */
        // TODO 三目运算符
       /*char x='X';
        int i=0;
        String str="你好";
        short s1=-10;
        short s2=0x7fff;
        System.out.println(true?x:0);
        System.out.println(false?i:x);

        System.out.println(false?0:x);
        System.out.println(false?str:x);
        System.out.println(false?s2:i);
        System.out.println(false?i:s2);*/


        /**半斤八两
         * op 都有+=,-=,*=,/=,%=,<<=,>>=,>>>=,&=,^=,|=
         * E1=(T)((E1)op(E2))
         * 1<<33 == 1<<1 == 2   对于int形数据,左移或右移的数据进行取模操作,模32,long类型模64
         * */
        // TODO 操作运算符的细节
        /*int i = 1;
        double d = 0.5;
        System.out.println(i + d + " " + (i += d));
        System.out.println(-1 >> 1);
        System.out.println(-1 << 33 == (-1 << 1));
        System.out.println(Integer.MAX_VALUE);
        System.out.println(-1 >>> 1);*/
    }
}
