package test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class 监听的学习啊 extends JFrame implements ActionListener {

    JButton jbt1=new JButton("点我呀");
    JButton jbt=new JButton("fuck me");
    public 监听的学习啊() {
        JFrame jFrame=new JFrame("学习监听");
        jFrame.setSize(680,680);
        jFrame.setAlwaysOnTop(true);
        jFrame.setDefaultCloseOperation(3);
        jFrame.setLocationRelativeTo(null);
        jFrame.setLayout(null);


        jbt.setBounds(0,0,100,100);
        jbt.addActionListener(this);
        jbt.addActionListener(e -> System.out.println("dont touch me there"));


        jbt1.setBounds(100,100,100,100);
        jbt1.addActionListener(this);


        jFrame.getContentPane().add(jbt1);
        jFrame.getContentPane().add(jbt);
        jFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object soure=e.getSource();
        if(soure== jbt1){
            jbt1.setSize(200,200);
        }if(soure==jbt){
            Random r=new Random();
            jbt.setBounds(r.nextInt(500),r.nextInt(600),100,100);
        }
    }
}
class test{
    public static void main(String[] args) {
        new 监听的学习啊();
    }
}