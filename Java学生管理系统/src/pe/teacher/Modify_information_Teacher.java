package pe.teacher;

import pe.databases.DBHelp;
import pe.entity.Teacher;
import pe.function.LoginHelp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Modify_information_Teacher extends JFrame{

    private Font font = new Font("����", Font.BOLD, 18);
    private JPanel big_panel = new JPanel();
    private JPanel left_panel = new JPanel();
    private JPanel right_panel = new JPanel();

    // �����������
    private JPanel left_p1 = new JPanel();
    private JPanel left_p2 = new JPanel();
    private JPanel left_p3 = new JPanel();
    private JPanel left_p4 = new JPanel();
    private JPanel left_p5 = new JPanel();
    private JPanel left_p6 = new JPanel();
    private JPanel left_p7 = new JPanel();
    private JPanel left_p8 = new JPanel();
    private JPanel left_p9 = new JPanel();
    private JPanel left_p10 = new JPanel();

    private JLabel in_tip = new JLabel("����д���Ļ�������(������Ŀ����Ϊ��)");
    private JLabel name = new JLabel("��ʵ������");
    private JTextField txt_name = new JTextField(25);

    private JLabel sex = new JLabel("�Ա�");
    private JTextField txt_sex = new JTextField(25);

    private JLabel tele = new JLabel("��ϵ��ʽ��");
    private JTextField txt_tele = new JTextField(25);

    // �ײ����
    private JPanel last_panel = new JPanel();
    private JButton save_btn = new JButton("����");
    private JButton reset_btn = new JButton("����");

    public Modify_information_Teacher(){
        super("�޸���Ϣ");

        // �������������
        super.setVisible(true);
        super.setResizable(false);
        super.setBounds(350, 170, 1000, 500);
        super.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        // �����������
        save_btn.setFont(font);
        reset_btn.setFont(font);
        in_tip.setFont(font);
        name.setFont(font);
        txt_name.setFont(font);
        sex.setFont(font);
        txt_sex.setFont(font);

        tele.setFont(font);
        txt_tele.setFont(font);

        // �²㰴ť
        last_panel.setLayout(new FlowLayout(FlowLayout.CENTER));
        last_panel.setOpaque(false);
        last_panel.add(save_btn);
        last_panel.add(reset_btn);

        // ���ô�ֱ��ʽ���ֹ�����(�����²�������һ��)
        Box box = Box.createVerticalBox();
        box.setOpaque(false);
        box.add(left_panel);
        box.add(last_panel);
        super.add(box);

        // �ϲ�����е��������
        left_panel.setLayout(new GridLayout(5, 1));
        left_panel.setOpaque(false);

        /*
         *
         * �������
         */

        // ��һ��  ����
        left_p1.setLayout(new FlowLayout(FlowLayout.LEFT));
        left_p1.setOpaque(false);
        left_p1.add(in_tip);
        left_panel.add(left_p1);

        // �ڶ���  ��ʵ����
        left_p2.setLayout(new FlowLayout(FlowLayout.LEFT));
        left_p2.setOpaque(false);
        left_p2.add(name);
        left_p2.add(txt_name);
        left_panel.add(left_p2);

        // ������  �Ա�
        left_p3.setLayout(new FlowLayout(FlowLayout.LEFT));
        left_p3.setOpaque(false);
        left_p3.add(sex);
        left_p3.add(txt_sex);
        left_panel.add(left_p3);

        // ������  ��ϵ��ʽ
        left_p4.setLayout(new FlowLayout(FlowLayout.LEFT));
        left_p4.setOpaque(false);
        left_p4.add(tele);
        left_p4.add(txt_tele);
        left_panel.add(left_p4);

        save_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String realName = txt_name.getText();
                String sex1 = txt_sex.getText();
                String text = txt_tele.getText();


                //�޸����ݿ��ж�Ӧ��ʶ������
                DBHelp.modifyInformation(Teacher.getUsername(),realName,sex1,text);
//                System.out.println(Student.getUsername());
                JOptionPane.showMessageDialog(null, "�޸ĳɹ�", "����", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        reset_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LoginHelp.Loginclear(txt_name,txt_sex,txt_tele);
            }
        });

    }

}
