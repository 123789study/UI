package 趣味题目;

import java.util.Arrays;
import java.util.List;

public class 高级谜题 {
    public static void main(String[] args) {
        /*int a=-(2147483647+1);
        int b=(2147483647+1);*/
        /*System.out.print(" \"==\" 不满足自反性,特例:Double.NaN==Double.NaN  ==>");
        System.out.println(Double.NaN==Double.NaN);
        System.out.println(" \"==\" 满足对称性");
        System.out.println(" \"==\" 不满足传递性,主要是精度问题  ==>");

        int num1=Integer.MAX_VALUE;
        float num2=(float) Integer.MAX_VALUE;
        int num3=Integer.MAX_VALUE-63;
        System.out.println((num1==num2)+" "+(num1==num3)+" "+(num2==num3));
        System.out.println(num1+" "+num2+" "+num3);*/
        Pair p=new Pair<Object>(23,"skidoo");
        System.out.println(p.first()+" "+p.second());
        for (Object o : p.stringList()) {
            System.out.println(o+" ");
        }
    }
}
class Pair<T>{
    private final T first;
    private final T second;

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T first() {
        return first;
    }

    public T second() {
        return second;
    }

    public List<String> stringList(){
        return Arrays.asList(String.valueOf(first),String.valueOf(second));
    }
}
