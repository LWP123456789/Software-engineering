package pe.admin;
/*
* 系统管理员主界面
* */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SystemMain extends JFrame {

    private static final String IMAGE_ICON_PATH = "D:\\image\\软工\\yahoo.png";

    public SystemMain(){

        super("系统管理员");
        super.setVisible(true);
        super.setBounds(300, 170, 500, 350);
        super.setResizable(false);

        ImageIcon ig = new ImageIcon(IMAGE_ICON_PATH);
        Image im = ig.getImage();
        setIconImage(im);

        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JButton b1 = new JButton("用户管理");
        JButton b2 = new JButton("课程管理");
        JButton b3 = new JButton("学生管理");
        JButton b4 = new JButton("教师管理");


        b1.setFont(new Font("宋体", Font.BOLD, 18));
        b1.setContentAreaFilled(false);
        b1.setFocusPainted(false);


        b2.setFont(new Font("宋体", Font.BOLD, 18));
        b2.setContentAreaFilled(false);
        b2.setFocusPainted(false);

        b3.setFont(new Font("宋体", Font.BOLD, 18));
        b3.setContentAreaFilled(false);
        b3.setFocusPainted(false);

        b4.setFont(new Font("宋体", Font.BOLD, 18));
        b4.setContentAreaFilled(false);
        b4.setFocusPainted(false);

        p1.add(b1);
        p1.add(b2);
        p2.add(b3);
        p2.add(b4);

        this.setBackground(Color.white);
        this.setLayout(new GridLayout(2,1));
        this.add(p1);
        this.add(p2);

        //跳转至用户管理界面
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new SystemPanel();
            }
        });
        //跳转至课程管理界面
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new SystemCourse();
            }
        });
        //跳转至学生管理界面
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new StudentPanel();
            }
        });
        //跳转至教师管理界面
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new TeacherManagement();
            }
        });

    }

}
