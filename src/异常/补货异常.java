package 异常;

public class 补货异常 {
    public static void main(String[] args) {
        int[]arr=new int[]{1,1,4,5,1,4};

        try{
            System.out.println(arr[10]);

            System.out.println(1/0);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("索引越界");
        }catch (ArithmeticException e){
            System.out.println("算数异常");
        }

        System.out.println("我tm有没有执行");
    }
}
