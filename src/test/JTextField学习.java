package test;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class JTextField学习 {
    public static void main(String[] args) {
        new 初始化();
    }

}

class 初始化 extends JFrame implements MouseListener {
    public 初始化() {
        JFrame j = new JFrame("JTextField学习");
        j.setSize(1048, 951);
        j.setAlwaysOnTop(true);
        j.setDefaultCloseOperation(EXIT_ON_CLOSE);
        j.setLayout(null);
        j.setLocationRelativeTo(null);
        j.setVisible(true);

        JLabel jLabel = new JLabel();
        jLabel.setText("你好");
        jLabel.setBounds(100, 100, 100, 100);
        jLabel.addMouseListener(this);
        j.getContentPane().add(jLabel);


        JTextField jtext = new JTextField();
        jtext.setBounds(400, 100, 350, 40);
        jtext.addMouseListener(this);
        j.getContentPane().add(jtext);
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("点击了文本框");
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
