package IO流.字符字节高级流;

import java.io.*;

public class 序列化流 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        player play1 = new player("张三", 24,"下北泽");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("F:\\java代码\\UI\\src\\informations.txt"));
        oos.writeObject(play1);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("F:\\java代码\\UI\\src\\informations.txt"));
        System.out.println(ois.readObject());
        ois.close();
    }

}

class player implements Serializable {//Serializable序列化通行证
    @Serial
    private static final long serialVersionUID = -6680815461893473756L;  //设置固定版本号,否则javabean在修改时可能会报错

    private String name;
    private int age;
    private transient String address;    //transient瞬态关键字,不会把当前的属性进行序列化


    public player() {
    }

    public player(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    public String toString() {
        return "player{name = " + name + ", age = " + age + ", address = " + address + "}";
    }
}
