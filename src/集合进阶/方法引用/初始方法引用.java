package 集合进阶.方法引用;

import java.util.Arrays;
import java.util.Comparator;

public class 初始方法引用 {
    public static void main(String[] args) {
        Integer[] arr = {3, 5, 4, 1, 2, 6};

        Arrays.sort(arr, 初始方法引用::sort);
        

        System.out.println(Arrays.toString(arr));
    }


    public static int sort(int n1,int n2){
        return n2-n1;
    }
}
