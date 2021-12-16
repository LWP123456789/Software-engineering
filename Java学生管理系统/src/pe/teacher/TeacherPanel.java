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
    private static final String IMAGE_ICON_PATH = "D:\\image\\软工\\yahoo.png";

    public TeacherPanel() {
        super("学生选课管理系统");

        // 图标设置
        ImageIcon ig = new ImageIcon(IMAGE_ICON_PATH);
        im = ig.getImage();
        setIconImage(im);

        Container con = getContentPane();
        title = new JPanel();
        title.setPreferredSize(new Dimension(1366, 70));
        title.setLayout(new FlowLayout(FlowLayout.CENTER));
        title_lbl = new JLabel(
                "<html><body><p align=\"center\">学生选课管理系统(教师端)<br> </p></body></html>");
        title.add(title_lbl);
        title_lbl.setFont(new Font("宋体", Font.BOLD, 35));
        con.setLayout(new BorderLayout());
        con.add(title, BorderLayout.NORTH);
        bigPanel = new JPanel();
        bigPanel.setLayout(new BorderLayout());
        con.add(bigPanel);
        con.add(daohang.left, BorderLayout.WEST);// 导航栏
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setExtendedState(JFrame.MAXIMIZED_BOTH);
        super.setVisible(true);

        /*
         * 首页的类
         */
        Home_Page_teacher home_Page = new Home_Page_teacher();
        panel = home_Page.view();
        bigPanel.add(panel);
        // validate();
        // repaint();

//		 首页
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

        //您的课程
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

        //课程管理
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

        //教学安排
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

        //学校风采
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

        //个人信息
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
