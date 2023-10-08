package 集合进阶.方法引用;

import com.sun.jdi.Value;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.IntFunction;

public class 数组引用 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3, 4);


        Integer[] array0 = list.stream().toArray(new IntFunction<Integer[]>() {
            @Override
            public Integer[] apply(int value) {
                return new Integer[value];
            }
        });

        Integer[] array1 = list.stream().toArray(value -> new Integer[value]);

        Integer[] array2 = list.stream().toArray(Integer[]::new);

        System.out.println(Arrays.toString(array0));
        System.out.println(Arrays.toString(array2));

    }
}
