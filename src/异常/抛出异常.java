package 异常;

public class 抛出异常 {
    public static void main(String[] args) {
        int[]arr=new int[]{};
        System.out.println(getMax(arr));
    }
    public static int getMax(int[]arr){
        if(arr==null){
            throw new NullPointerException();
        }
        if(arr.length==0){
            throw new IndexOutOfBoundsException();
        }

        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
