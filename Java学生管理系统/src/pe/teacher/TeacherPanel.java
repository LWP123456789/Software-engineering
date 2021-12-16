package pe.teacher;

import pe.guiset.*;
import pe.student.School_style;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TeacherPanel extends JFrame {

    JPanel panel, bigPanel;
    private JPanel title;
    private JLabel title_lbl;
    private Image im;
    private Background_Navigation_tree_teacher daohang = new Background_Navigation_tree_teacher();
    private static final String IMAGE_ICON_PATH = "D:\\image\\��\\yahoo.png";

    public TeacherPanel() {
        super("ѧ��ѡ�ι���ϵͳ");

        // ͼ������
        ImageIcon ig = new ImageIcon(IMAGE_ICON_PATH);
        im = ig.getImage();
        setIconImage(im);

        Container con = getContentPane();
        title = new JPanel();
        title.setPreferredSize(new Dimension(1366, 70));
        title.setLayout(new FlowLayout(FlowLayout.CENTER));
        title_lbl = new JLabel(
                "<html><body><p align=\"center\">ѧ��ѡ�ι���ϵͳ(��ʦ��)<br> </p></body></html>");
        title.add(title_lbl);
        title_lbl.setFont(new Font("����", Font.BOLD, 35));
        con.setLayout(new BorderLayout());
        con.add(title, BorderLayout.NORTH);
        bigPanel = new JPanel();
        bigPanel.setLayout(new BorderLayout());
        con.add(bigPanel);
        con.add(daohang.left, BorderLayout.WEST);// ������
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setExtendedState(JFrame.MAXIMIZED_BOTH);
        super.setVisible(true);

        /*
         * ��ҳ����
         */
        Home_Page_teacher home_Page = new Home_Page_teacher();
        panel = home_Page.view();
        bigPanel.add(panel);
        // validate();
        // repaint();

//		 ��ҳ
        daohang.item1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                bigPanel.remove(panel);
                Home_Page_teacher home_Page1 = new Home_Page_teacher();
                panel = home_Page1.view();
                bigPanel.add(panel, BorderLayout.CENTER);
                validate();
                repaint();
            }
        });

        //���Ŀγ�
        daohang.item2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                bigPanel.remove(panel);
                SeeCourse seeCourse = new SeeCourse();
                panel = seeCourse.view();
                bigPanel.add(panel, BorderLayout.CENTER);
                validate();
                repaint();
            }
        });

        //�γ̹���
        daohang.item3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                bigPanel.remove(panel);
                CourseManagement courseManagement = new CourseManagement();
                panel = courseManagement.view();
                bigPanel.add(panel, BorderLayout.CENTER);
                validate();
                repaint();
            }
        });

        //��ѧ����
        daohang.item4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                bigPanel.remove(panel);
                Teach_arrangement teach_arrangement = new Teach_arrangement();
                panel = teach_arrangement.view();
                bigPanel.add(panel, BorderLayout.CENTER);
                validate();
                repaint();
                System.out.println("123");
            }
        });

        //ѧУ���
        daohang.item5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                bigPanel.remove(panel);
                School_style comments_management = new School_style();
                panel = comments_management.view();
                bigPanel.add(panel, BorderLayout.CENTER);
                validate();
                repaint();
                System.out.println("123");
            }
        });

        //������Ϣ
        daohang.item6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                bigPanel.remove(panel);
                Teacher_information teacher_infomation = new Teacher_information();
                panel = teacher_infomation.view();
                bigPanel.add(panel, BorderLayout.CENTER);
                validate();
                repaint();
            }
        });
    }
}
