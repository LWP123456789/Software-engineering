package pe.admin;
/*
* ϵͳ����Ա������
* */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SystemMain extends JFrame {

    private static final String IMAGE_ICON_PATH = "D:\\image\\��\\yahoo.png";

    public SystemMain(){

        super("ϵͳ����Ա");
        super.setVisible(true);
        super.setBounds(300, 170, 500, 350);
        super.setResizable(false);

        ImageIcon ig = new ImageIcon(IMAGE_ICON_PATH);
        Image im = ig.getImage();
        setIconImage(im);

        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JButton b1 = new JButton("�û�����");
        JButton b2 = new JButton("�γ̹���");
        JButton b3 = new JButton("ѧ������");
        JButton b4 = new JButton("��ʦ����");


        b1.setFont(new Font("����", Font.BOLD, 18));
        b1.setContentAreaFilled(false);
        b1.setFocusPainted(false);


        b2.setFont(new Font("����", Font.BOLD, 18));
        b2.setContentAreaFilled(false);
        b2.setFocusPainted(false);

        b3.setFont(new Font("����", Font.BOLD, 18));
        b3.setContentAreaFilled(false);
        b3.setFocusPainted(false);

        b4.setFont(new Font("����", Font.BOLD, 18));
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

        //��ת���û��������
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new SystemPanel();
            }
        });
        //��ת���γ̹������
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new SystemCourse();
            }
        });
        //��ת��ѧ���������
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new StudentPanel();
            }
        });
        //��ת����ʦ�������
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new TeacherManagement();
            }
        });

    }

}
