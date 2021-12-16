package pe.student;
/*
*
* ѧ�����޸ĸ�����Ϣ
*
* */
import pe.databases.DBHelp;
import pe.entity.Student;
import pe.function.LoginHelp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Modify_information extends JFrame {

    private Font font = new Font("����", Font.BOLD, 18);
    private JPanel left_panel = new JPanel();

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
    private JLabel courseNumber = new JLabel("�γ�����");
    private JTextField txt_courseNumber = new JTextField(25);

    private JLabel department = new JLabel("ϵ��");
    private JTextField txt_department = new JTextField(25);

    private JLabel stu_class = new JLabel("�༶��");
    private JTextField txt_class = new JTextField(25);

    private JLabel tele = new JLabel("��ϵ��ʽ��");
    private JTextField txt_tele = new JTextField(25);

    private JLabel nation = new JLabel("���壺");
    private JTextField txt_nation = new JTextField(25);

    private JLabel address = new JLabel("סַ��");
    private JTextField txt_address = new JTextField(25);

    private JLabel polity = new JLabel("������ò��");
    private JTextField txt_polity = new JTextField(25);

    // �ײ����
    private JPanel last_panel = new JPanel();
    private JButton save_btn = new JButton("����");
    private JButton reset_btn = new JButton("����");

    public Modify_information(){
        super("�޸���Ϣ");

        // �������������
        super.setVisible(true);
        super.setResizable(false);
        super.setBounds(350, 170, 1254, 734);
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
//		set_tip.setFont(font);
        sex.setFont(font);
        txt_sex.setFont(font);
        courseNumber.setFont(font);
        txt_courseNumber.setFont(font);

        department.setFont(font);
        txt_department.setFont(font);
        stu_class.setFont(font);
        txt_class.setFont(font);
        tele.setFont(font);
        txt_tele.setFont(font);
        nation.setFont(font);
        txt_nation.setFont(font);
        address.setFont(font);
        txt_address.setFont(font);
        polity.setFont(font);
        txt_polity.setFont(font);

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
        left_panel.setLayout(new GridLayout(10, 1));
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

        // ������  �γ���
         left_p4.setLayout(new FlowLayout(FlowLayout.LEFT));
         left_p4.setOpaque(false);
         left_p4.add(courseNumber);
         left_p4.add(txt_courseNumber);
         left_panel.add(left_p4);

        // ������  ϵ��
        left_p5.setLayout(new FlowLayout(FlowLayout.LEFT));
        left_p5.setOpaque(false);
        left_p5.add(department);
        left_p5.add(txt_department);
        left_panel.add(left_p5);

        // ������  �༶
        left_p6.setLayout(new FlowLayout(FlowLayout.LEFT));
        left_p6.setOpaque(false);
        left_p6.add(stu_class);
        left_p6.add(txt_class);
        left_panel.add(left_p6);

        // ������  ��ϵ��ʽ
        left_p7.setLayout(new FlowLayout(FlowLayout.LEFT));
        left_p7.setOpaque(false);
        left_p7.add(tele);
        left_p7.add(txt_tele);
        left_panel.add(left_p7);

        // �ڰ���  ����
        left_p8.setLayout(new FlowLayout(FlowLayout.LEFT));
        left_p8.setOpaque(false);
        left_p8.add(nation);
        left_p8.add(txt_nation);
        left_panel.add(left_p8);

        // �ھ���  סַ
        left_p9.setLayout(new FlowLayout(FlowLayout.LEFT));
        left_p9.setOpaque(false);
        left_p9.add(address);
        left_p9.add(txt_address);
        left_panel.add(left_p9);

        // �ھ���  ������ò
        left_p10.setLayout(new FlowLayout(FlowLayout.LEFT));
        left_p10.setOpaque(false);
        left_p10.add(polity);
        left_p10.add(txt_polity);
        left_panel.add(left_p10);

        save_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String realName = txt_name.getText();
                String sex1 = txt_sex.getText();
                String text = txt_courseNumber.getText();
                String text1 = txt_department.getText();
                String text2 = txt_class.getText();
                String text3 = txt_nation.getText();
                String text4 = txt_tele.getText();
                String text5 = txt_address.getText();
                String text6 = txt_polity.getText();

                //�޸����ݿ��ж�Ӧ��ʶ������
                DBHelp.modifyInformation(Student.getUsername(),realName,sex1,text,text1,text2,text3,text4,text5,text6);
//                System.out.println(Student.getUsername());
                JOptionPane.showMessageDialog(null, "�޸ĳɹ�", "����", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        reset_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LoginHelp.Loginclear(txt_name,txt_sex,txt_courseNumber,txt_department,txt_class,txt_nation,txt_tele,txt_address,txt_polity);
            }
        });

    }
}
