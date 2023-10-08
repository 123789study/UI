package 趣味题目;

public class 异常谜题 {
    //  try finally 两个语句同时满足,会finally会正常结束
    public static void main(String[] args) {

    }
    static boolean decision(){
        try {
            return true;
        }finally {
            return false;
        }
    }
    static void over(){
        try {
            System.out.println("执行try里面的");
            System.exit(0);
        }finally {
            System.out.println("执行finally里面的");
        }
    }

}
