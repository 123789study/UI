package 力扣题目;

import java.util.Arrays;

public class 两数相加 {
    public static void main(String[] args) {
        System.out.println(addTwoNumbers(new int[]{9,9,9,9,9,9,9}, new int[]{9,9,9,9}));
    }

    static String addTwoNumbers(int[] arr1, int[] arr2) {
        StringBuilder result = new StringBuilder(String.valueOf(getString(arr1) + getString(arr2)));
        char[] finish = new char[result.length()];
        String str= result.reverse().toString();
        for (int i = 0; i < str.length(); i++) {
            finish[i]=str.charAt(i);
        }
        return Arrays.toString(finish);
    }
    static Integer getString(int[] arr) {
        StringBuilder str = new StringBuilder();
        for (int i : arr) {
            str.append(i);
        }
        return Integer.parseInt(str.reverse().toString());
    }
}
