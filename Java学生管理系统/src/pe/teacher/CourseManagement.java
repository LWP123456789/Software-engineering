package pe.teacher;

import pe.databases.DBHelp;
import pe.entity.Course;
import pe.entity.Teacher;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class CourseManagement extends JPanel{

    private static final long serialVersionUID = 1L;

    public CourseManagement(){

        this.setLayout(new FlowLayout());

        //����ͷ
        String []titles= {"�γ̺�","�γ���","�ον�ʦ","ѧ��","�γ�ʱ��"};

        //��ñ�ʶ
        String username = Teacher.getUsername();
        //���ݱ�ʶ��ý�ʦ����
        String name = DBHelp.getRealName(username);

        //��ȡ���пγ���Ϣ
        List<Course> allCourse = DBHelp.getTeacherCourse(name);

        //����һ����ά���飬���ڴ�ſγ���Ϣ
        String[][] courses = new String[allCourse.size()][5];
        for (int i = 0; i < allCourse.size(); i++){
            courses[i][0] = allCourse.get(i).getId();
            courses[i][1] = allCourse.get(i).getName();
            courses[i][2] = allCourse.get(i).getTeacher();
            courses[i][3] = allCourse.get(i).getCredit();
            courses[i][4] = allCourse.get(i).getTime();
        }

        this.setVisible(true);
        this.setBackground(Color.white);

        JTable table = new JTable(courses, titles);
        JScrollPane scrollPane = new JScrollPane(table);//��ű��
        scrollPane.setPreferredSize(new Dimension(1400, 850));

        JLabel text = new JLabel("���Ŀγ�");
        text.setFont(new Font("����",Font.BOLD,18));

        JButton b1 = new JButton("������ӿγ�");
        JButton b2 = new JButton("����ɾ���γ�");
        JButton b3 = new JButton("�鿴�γ���Ϣ");
        b1.setFont(new Font("����",Font.BOLD,18));
        b2.setFont(new Font("����",Font.BOLD,18));
        b3.setFont(new Font("����",Font.BOLD,18));

        JPanel panel = new JPanel();
        panel.add(text);
        panel.add(scrollPane);
        JPanel p = new JPanel();

        p.add(b1);
        p.add(b2);
        p.add(b3);

        this.add(panel);
        this.add(p);

        int selectedRow = table.getSelectedRow();

        // ������ӿγ�
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (selectedRow == -1){
                    JOptionPane.showMessageDialog(null, "��δѡ��γ���Ϣ", "����", JOptionPane.ERROR_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "�����ѷ��ͣ��ȴ�ϵͳ����Ա����", "success", JOptionPane.INFORMATION_MESSAGE);
                }

            }
        });

        // ����ɾ���γ�
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (selectedRow == -1){
                    JOptionPane.showMessageDialog(null, "��δѡ��γ���Ϣ", "����", JOptionPane.ERROR_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "�����ѷ��ͣ��ȴ�ϵͳ����Ա����", "success", JOptionPane.INFORMATION_MESSAGE);
                }

            }
        });

        // �鿴�γ���Ϣ
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //��ȡѡ���е����� ����������γ̺�-1
                int selectedRow = table.getSelectedRow();

                //������ �����û��Ƿ�ȷ�����
                if (selectedRow==-1){

                    JOptionPane.showMessageDialog(null, "��δѡ��γ���Ϣ", "����", JOptionPane.ERROR_MESSAGE);

                } else {

                    //��ÿγ̺�
                    Object courseId = table.getValueAt(selectedRow, 0);
                    //��ÿγ���
                    Object courseName = table.getValueAt(selectedRow, 1);

                    //�鿴�ÿγ��µ�����ѧ����Ϣ
                    new CourseAllStudent(courseName,courseId);
                }
            }
        });



    }

    public JPanel view(){
        return this;
    }

}
