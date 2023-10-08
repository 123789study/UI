package 集合进阶.固定集合;

import java.util.Set;

public class 不可变set {
    public static void main(String[] args) {
        Set<String> 不可变set = Set.of("甲乙丙丁", "戊己庚辛", "壬癸");
        for (String s : 不可变set) {
            System.out.println(s);
        }

    }
}
