package 异常;

public class 异常常见方法 {
    public static void main(String[] args) {
        int[]arr=new int[]{1,2,3,4,5};

        try {
            System.out.println(arr[10]);
        } catch (IndexOutOfBoundsException e) {
            /*System.out.println(e.getMessage());
            System.out.println(e.toString());*/
            e.printStackTrace();
        }

        System.out.println("我执行了吗");

    }
}
