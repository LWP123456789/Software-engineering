package pe.teacher;

import pe.databases.DBHelp;
import pe.entity.Teacher;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class Teacher_information extends JPanel {

    private static final long serialVersionUID = 1L;

    //�ϲ����
    private final JLabel title=new JLabel("������Ϣ",JLabel.CENTER);
    private final JPanel p1 = new JPanel();
    private final JPanel p2 = new JPanel();
    private final JPanel p3 = new JPanel();
    private final JPanel p4 = new JPanel();
    private final JPanel p5 = new JPanel();
    private final JPanel p6 = new JPanel();
    private final JButton btn = new JButton("�޸���Ϣ");

    public Teacher_information(){



        //���ò��ֹ���
        title.setFont(new Font("����",Font.BOLD,50));
        title.setBackground(Color.white);

        String teacher_name = Teacher.getUsername();
        List<Teacher> l1 = DBHelp.getTeacherInfo(teacher_name);
        //��ȡ��ʦ��Ϣ
        String id = l1.get(0).getId();
        String name = l1.get(0).getName();
        String sex = l1.get(0).getSex();
        String tele = l1.get(0).getTele();

        System.out.println(id);

        JTextArea teacherId= new JTextArea();
        JTextArea teacherName= new JTextArea();
        JTextArea teacherSex= new JTextArea();
        JTextArea teacherTele= new JTextArea();

        teacherId.setText("��ʦ��� :" + id + "    ");
        teacherName.setText("��ʦ���� :" + name + "    ");
        teacherSex.setText("�Ա� :" + sex + "    ");
        teacherTele.setText("��ϵ��ʽ :" + tele + "    ");

        teacherId.setFont(new Font("����",Font.BOLD,25));
        teacherName.setFont(new Font("����",Font.BOLD,25));
        teacherSex.setFont(new Font("����",Font.BOLD,25));
        teacherTele.setFont(new Font("����",Font.BOLD,25));

        this.setVisible(true);
        this.setBackground(Color.white);
        this.setLayout(new GridLayout(5,1));

        p1.setBackground(Color.white);
        p2.setBackground(Color.white);
        p3.setBackground(Color.white);
        p4.setBackground(Color.white);
        p5.setBackground(Color.white);
        p6.setBackground(Color.white);

        p2.setLayout(new GridLayout(1,2));
        p3.setLayout(new GridLayout(1,2));
        p4.setLayout(new GridLayout(1,1));
        p5.setLayout(new GridLayout(1,1));
        p6.setLayout(new GridLayout(1,1));

        btn.setFont(new Font("����",Font.BOLD,18));

        //��һ�� ����
        p1.add(title);
        this.add(p1);
        //��ʦ��� ��ʦ��
        p2.add(teacherId);
        p2.add(teacherName);
        this.add(p2);
        //�Ա� ��ϵ��ʽ
        p3.add(teacherSex);
        p3.add(teacherTele);
        this.add(p3);


        p4.add(btn);
        this.add(p6);
        this.add(p4);

        // ���á��޸���Ϣ����ť����
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Modify_information_Teacher();
            }
        });

    }

    public JPanel view(){
        return this;
    }

}
