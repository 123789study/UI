package 集合进阶.固定集合;

import java.util.Iterator;
import java.util.List;

public class 不可变list {
    public static void main(String[] args) {
        List<String> 不可变集合 = List.of("甲乙丙丁", "戊己庚辛", "壬癸","壬癸");
        不可变集合.forEach(s->System.out.print(s+" "));
        System.out.println();

        for (String s : 不可变集合) {
            System.out.print(s+" ");
        }
        System.out.println();

        Iterator iterator=不可变集合.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.println();

        for (int i = 0; i < 不可变集合.size(); i++) {
            System.out.print(不可变集合.get(i)+" ");
        }

    }
}
