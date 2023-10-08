package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class 查询插入时间的比较 {
    public static void main(String[] args) {

        int count=10000;
        Integer[] arr1 = new Integer[count];
        Integer[] arr2 = new Integer[count];
        Integer[] arr3 = new Integer[count];

        Arrays.sort(arr2);
        Arrays.sort(arr3, (o1, o2) -> o2 - o1);


        ArrayList<Integer> list = new ArrayList<>();

        // 最初的数组的插入和查询时间
        long before1 = System.currentTimeMillis();
        for (int i = 0; i < arr1.length; i++) {
            list.add(arr1[i]);
        }
        long now1 = System.currentTimeMillis();

        long before4 = System.currentTimeMillis();
        for (int i = 0; i < arr1.length; i++) {
            list.get(i);
        }
        long now4 = System.currentTimeMillis();
        list.clear();

        // 升序的数组的插入和查询时间
        long before2 = System.currentTimeMillis();
        for (int i = 0; i < arr1.length; i++) {
            list.add(arr2[i]);
        }
        long now2 = System.currentTimeMillis();

        long before5 = System.currentTimeMillis();
        for (int i = 0; i < arr2.length; i++) {
            list.get(i);
        }
        long now5 = System.currentTimeMillis();
        list.clear();

        // 降序的数组的插入和查询时间
        long before3 = System.currentTimeMillis();
        for (int i = 0; i < arr3.length; i++) {
            list.add(arr1[i]);
        }
        long now3 = System.currentTimeMillis();

        long before6 = System.currentTimeMillis();
        for (int i = 0; i < arr3.length; i++) {
            list.get(i);
        }
        long now6 = System.currentTimeMillis();

        list.clear();
    }
}
