package pe.admin;
/*
* ��ӿγ���Ϣ
* */
import pe.databases.DBHelp;
import pe.function.LoginHelp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AddCourse extends JFrame {

    private Font font = new Font("����", Font.BOLD, 18);

    private JPanel left_panel = new JPanel();

    // �����������
    private JPanel left_p1 = new JPanel();
    private JPanel left_p2 = new JPanel();
    private JPanel left_p3 = new JPanel();
    private JPanel left_p4 = new JPanel();
    private JPanel left_p5 = new JPanel();
    private JPanel left_p6 = new JPanel();

    private JLabel in_tip = new JLabel("����дҪ��ӵĿγ̵���Ϣ(������Ŀ����Ϊ��)");
    private JLabel courseId = new JLabel("�γ̱��:");
    private JTextField txt_courseId = new JTextField(25);
    private JLabel courseName = new JLabel("�γ��� ��");
    private JTextField txt_courseName = new JTextField(25);
    private JLabel teacher = new JLabel("�ν���ʦ��");
    private JTextField txt_teacher = new JTextField(25);
    private JLabel credit = new JLabel("ѧ �� ��");
    private JTextField txt_credit = new JTextField(25);
    private JLabel time = new JLabel("�γ�ʱ�䣺");
    private JTextField txt_time = new JTextField(25);

    // �ײ����
    private JPanel last_panel = new JPanel();
    private JButton save_btn = new JButton("����");
    private JButton reset_btn = new JButton("����");

    public AddCourse(){
        super("��ӿγ���Ϣ");

        // �������������
        super.setVisible(true);
        super.setResizable(false);
        super.setBounds(350, 170, 600, 500);
        super.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        // �����������
        save_btn.setFont(font);
        reset_btn.setFont(font);
        in_tip.setFont(font);
        courseId.setFont(font);
        txt_courseId.setFont(font);
        courseName.setFont(font);
        txt_courseName.setFont(font);
        teacher.setFont(font);
        txt_teacher.setFont(font);
        credit.setFont(font);
        txt_credit.setFont(font);
        time.setFont(font);
        txt_time.setFont(font);

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
        left_panel.setLayout(new GridLayout(6, 1));
        left_panel.setOpaque(false);

        // ��һ��  ����
        left_p1.setLayout(new FlowLayout(FlowLayout.LEFT));
        left_p1.setOpaque(false);
        left_p1.add(in_tip);
        left_panel.add(left_p1);

        // �ڶ���  �γ̱��
        left_p2.setLayout(new FlowLayout(FlowLayout.LEFT));
        left_p2.setOpaque(false);
        left_p2.add(courseId);
        left_p2.add(txt_courseId);
        left_panel.add(left_p2);

        // ������  �γ���
        left_p3.setLayout(new FlowLayout(FlowLayout.LEFT));
        left_p3.setOpaque(false);
        left_p3.add(courseName);
        left_p3.add(txt_courseName);
        left_panel.add(left_p3);

        // ������  �ον�ʦ
        left_p4.setLayout(new FlowLayout(FlowLayout.LEFT));
        left_p4.setOpaque(false);
        left_p4.add(teacher);
        left_p4.add(txt_teacher);
        left_panel.add(left_p4);

        // ������  ѧ��
        left_p5.setLayout(new FlowLayout(FlowLayout.LEFT));
        left_p5.setOpaque(false);
        left_p5.add(credit);
        left_p5.add(txt_credit);
        left_panel.add(left_p5);

        // ������  �γ�ʱ��
        left_p6.setLayout(new FlowLayout(FlowLayout.LEFT));
        left_p6.setOpaque(false);
        left_p6.add(time);
        left_p6.add(txt_time);
        left_panel.add(left_p6);


        save_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String course_id = txt_courseId.getText();
                String course_name = txt_courseName.getText();
                String course_teacher = txt_teacher.getText();
                String course_credit = txt_credit.getText();
                String course_time = txt_time.getText();

                //��ӿγ���Ϣ
                DBHelp.addCourse(course_id,course_name,course_teacher,course_credit,course_time);

            }
        });

        reset_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LoginHelp.Loginclear(txt_courseId,txt_courseName, txt_teacher, txt_credit, txt_time);
            }
        });

    }

}
