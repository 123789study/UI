package test;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class 鼠标监听 extends JFrame implements KeyListener{

    JButton jbt1=new JButton("fuckme");
    JButton jbt2=new JButton("damn");
    JButton jbt3=new JButton("请您疯狂点击我");

    public 鼠标监听(){
        JFrame jf=new JFrame("鼠标监听");
        jf.setSize(680,680);
        jf.setAlwaysOnTop(true);
        jf.setLocationRelativeTo(null);
        jf.setLayout(null);
        jf.setDefaultCloseOperation(3);


        jbt1.setBounds(0,0,100,100);
        jbt2.setBounds(100,100,100,100);
        jbt3.setBounds(300,500,100,100);

       /* jf.getContentPane().add(jbt1);
        jf.getContentPane().add(jbt2);
        jf.getContentPane().add(jbt3);*/

        //jbt1.addMouseListener(this);
        jf.addKeyListener(this);


        jf.setVisible(true);
    }

    /*@Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("点击");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("摁下不松");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("松开");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("鼠标划入");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("鼠标划出");
    }*/

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        int CODE = e.getKeyCode();
        System.out.println(CODE);
        System.out.println("您所摁到的按键为"+(char)CODE);
    }
}
class test1{
    public static void main(String[] args) {
        new 鼠标监听();
    }
}