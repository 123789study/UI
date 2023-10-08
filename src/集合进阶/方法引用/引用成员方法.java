package 集合进阶.方法引用;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;

public class 引用成员方法 {
    public void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,"张无忌","周芷若","赵敏","张强","张三丰");


        System.out.println("------------匿名内部类----------");
        list.stream()
                .filter(s -> s.startsWith("张")&&s.length()==3)
                .forEach(s -> System.out.println(s));


        System.out.println("------------filter过滤----------");
        list.stream()
                .filter(new Predicate<String>() {
                    @Override
                    public boolean test(String s) {
                        return s.startsWith("张")&&s.length()==3;
                    }
                })
                .forEach(s -> System.out.println(s));



        System.out.println("-----------方法引用,其他类------------");
        list.stream()
                .filter(new StringOperation()::StringJudge1)
                .forEach(s -> System.out.println(s));

        System.out.println("-----------方法引用,本类------------");
        list.stream()
                .filter(new 引用成员方法()::StringJudge2)
                .forEach(s -> System.out.println(s));
    }

    public boolean StringJudge2(String s){
        return s.startsWith("张")&&s.length()==3;
    }


}

class StringOperation {
    public boolean StringJudge1(String s) {
        return s.startsWith("张") && s.length() == 3;
    }
}


