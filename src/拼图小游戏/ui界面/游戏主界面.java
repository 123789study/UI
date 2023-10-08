package 拼图小游戏.ui界面;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.*;
import java.util.Random;

public class 游戏主界面 extends JFrame implements ActionListener,KeyListener {
    int[][] newArr = new int[4][4];
    int[][] winArr=new int[][]{
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            { 13, 14, 15, 0}
    };
    int step=0;
    int x=0;
    int y=0;
    Random r=new Random();
    String path="..\\UI\\image\\animal\\animal6\\";
    JMenuItem 重新开始 = new JMenuItem("重新开始");
    JMenuItem 登录 = new JMenuItem("登录");
    JMenuItem 退出游戏 = new JMenuItem("退出游戏");
    JMenuItem 动物 = new JMenuItem("动物");
    JMenuItem 美女 = new JMenuItem("美女");
    JMenuItem 运动 = new JMenuItem("运动");
    JMenuItem 公众号 = new JMenuItem("公众号");
    JMenuItem 氪金入口 = new JMenuItem("氪金入口");

    public 游戏主界面() {

        界面基础设置();
        菜单的设置();
        打乱顺序();
        图片导入();

        setVisible(true);

    }

    private void 打乱顺序() {

        int[] arr = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};


        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            int index = r.nextInt(arr.length);
            arr[i] = arr[index];
            arr[index] = temp;
        }
        int count = 0;
        /*for (int i = 0; i < newArr.length; i++) {
            for (int j = 0; j < newArr[i].length; j++) {
                newArr[i][j]=arr[count];
                System.out.print(newArr[i][j]+" ");
                count++;
            }
        }*/
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0){
                x=i/4;
                y=i%4;
            }
            newArr[i / 4][i % 4] = arr[i];
        }
    }

    private void 图片导入() {

        getContentPane().removeAll();

        // TODO首先判断一下你是否已经获胜了
       if(判断胜利()){
           getContentPane().removeAll();
           JLabel j=new JLabel(new ImageIcon("..\\UI\\image\\win.png"));
           j.setBounds(40,40,508,560);
           getContentPane().add(j);
           getContentPane().repaint();
       }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                JLabel jl = new JLabel(new ImageIcon(path + newArr[i][j] + ".jpg"));
                jl.setBounds(105 * j+83, 105 * i+134, 105, 105);
                jl.setBorder(new BevelBorder(1));
                getContentPane().add(jl);
            }
        }


        JLabel j0=new JLabel(new ImageIcon("..\\UI\\image\\background.png"));
        j0.setBounds(40,40,508,560);
        getContentPane().add(j0);

        JLabel count=new JLabel("计步器:"+step);
        count.setBounds(25,10,100,100);
        getContentPane().add(count);

        getContentPane().repaint();
    }

    private boolean 判断胜利(){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if(newArr[i][j]!=winArr[i][j]){
                    return false;
                }
            }
        }
        return true;
    }

    private void 菜单的设置() {
        //  TODO 首先是创建属性,并添加到界面最上面,不要用add,用set
        JMenuBar 小功能容器 = new JMenuBar();
        setJMenuBar(小功能容器);

        JMenu 功能 = new JMenu("功能");
        JMenu 关于我们 = new JMenu("关于我们");
        JMenu 更多图片 = new JMenu("更多图片");
        小功能容器.add(功能);
        小功能容器.add(关于我们);

        功能.add(更多图片);
        功能.add(重新开始);
        功能.add(登录);
        功能.add(退出游戏);

        更多图片.add(动物);
        更多图片.add(美女);
        更多图片.add(运动);


        关于我们.add(公众号);
        关于我们.add(氪金入口);


        // TODO  添加监听事件
        运动.addActionListener(this);
        美女.addActionListener(this);
        动物.addActionListener(this);
        重新开始.addActionListener(this);
        登录.addActionListener(this);
        退出游戏.addActionListener(this);
        公众号.addActionListener(this);
        氪金入口.addActionListener(this);



    }

    private void 界面基础设置() {
        //  TODO 游戏框架的最基本设置:标题,大小,是否居中,置顶……(一共七个需要你的牢记)
        setTitle("游戏主界面");
        setSize(603, 680);
        setAlwaysOnTop(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);  //布局设置为null,取消添加到该界面的图片默认居中

        addKeyListener(this);
    }

    // TODO 配置键盘监听
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        if (code==65){
            getContentPane().removeAll();
            JLabel all=new JLabel(new ImageIcon(path+"all.jpg"));
            all.setBounds(83,134,420,420);
            getContentPane().add(all);

        }

        JLabel j0=new JLabel(new ImageIcon("..\\UI\\image\\background.png"));
        j0.setBounds(40,40,508,560);
        getContentPane().add(j0);

        getContentPane().repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if(判断胜利()){
            return;
        }
        int code = e.getKeyCode();
        if(code==37){

            if(y==3) return;

            newArr[x][y]=newArr[x][y+1];
            newArr[x][y+1]=0;
            图片导入();
            y++;
            step++;
        }
        else if(code==38){

            if(x==3) return;

            newArr[x][y]=newArr[x+1][y];
            newArr[x+1][y]=0;
            图片导入();
            x++;
            step++;
        }
        else if(code==39){
            if(y==0) return;

            newArr[x][y]=newArr[x][y-1];
            newArr[x][y-1]=0;
            图片导入();
            y--;
            step++;
        }
        else if(code==40){

            if(x==0) return;

            newArr[x][y]=newArr[x-1][y];
            newArr[x-1][y]=0;
            图片导入();
            x--;
            step++;
        }
        else if(code=='A'){
            图片导入();
        }
        else if(code=='W'){
            newArr= new int[][]{
                    {1, 2, 3,4},
                    {5, 6, 7,8},
                    {9, 10, 11,12},
                    { 13, 14, 15,0}
            };
            图片导入();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if(source==退出游戏){
            System.exit(0);
        }
        else if(source==重新开始){
            打乱顺序();

            step=0;

            图片导入();

        }
        else if(source==登录){
            setVisible(false);
            new 登录界面();
        }
        else if(source==氪金入口){

            //定义一个弹窗

            JDialog jDialog=new JDialog();
            jDialog.setTitle("禁止氪金");
            JLabel j=new JLabel(new ImageIcon("..\\UI\\image\\damie.jpg"));
            j.setBounds(0,0,258,258);

            jDialog.getContentPane().add(j);
            jDialog.setSize(344,344);

            jDialog.setAlwaysOnTop(true);
            jDialog.setLocationRelativeTo(null);
            jDialog.setModal(true);
            jDialog.setVisible(true);
        }
        else if(source==公众号){

            //定义一个弹窗

            JDialog jDialog=new JDialog();
            jDialog.setTitle("这个是黑马程序员公众号");
            JLabel j=new JLabel(new ImageIcon("..\\UI\\image\\about.png"));
            j.setBounds(0,0,258,258);

            jDialog.getContentPane().add(j);
            jDialog.setSize(344,344);

            jDialog.setAlwaysOnTop(true);
            jDialog.setLocationRelativeTo(null);
            jDialog.setModal(true);
            jDialog.setVisible(true);
        }
        else if(source==美女){
            path="..\\UI\\image\\girl\\girl"+(r.nextInt(13)+1)+"\\";
            打乱顺序();
            图片导入();
        }
        else if(source==运动){
            path="..\\UI\\image\\sport\\sport"+(r.nextInt(10)+1)+"\\";
            打乱顺序();
            图片导入();
        }
        else if(source==动物){
            path="..\\UI\\image\\animal\\animal"+(r.nextInt(8)+1)+"\\";
            打乱顺序();
            图片导入();
        }
    }
}
