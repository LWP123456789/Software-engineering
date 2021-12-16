package pe.admin;
/*
* 添加课程信息
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

    private Font font = new Font("宋体", Font.BOLD, 18);

    private JPanel left_panel = new JPanel();

    // 正文左侧的组件
    private JPanel left_p1 = new JPanel();
    private JPanel left_p2 = new JPanel();
    private JPanel left_p3 = new JPanel();
    private JPanel left_p4 = new JPanel();
    private JPanel left_p5 = new JPanel();
    private JPanel left_p6 = new JPanel();

    private JLabel in_tip = new JLabel("请填写要添加的课程的信息(以下项目不能为空)");
    private JLabel courseId = new JLabel("课程编号:");
    private JTextField txt_courseId = new JTextField(25);
    private JLabel courseName = new JLabel("课程名 ：");
    private JTextField txt_courseName = new JTextField(25);
    private JLabel teacher = new JLabel("任教老师：");
    private JTextField txt_teacher = new JTextField(25);
    private JLabel credit = new JLabel("学 分 ：");
    private JTextField txt_credit = new JTextField(25);
    private JLabel time = new JLabel("课程时间：");
    private JTextField txt_time = new JTextField(25);

    // 底部组件
    private JPanel last_panel = new JPanel();
    private JButton save_btn = new JButton("保存");
    private JButton reset_btn = new JButton("重置");

    public AddCourse(){
        super("添加课程信息");

        // 组件及布局设置
        super.setVisible(true);
        super.setResizable(false);
        super.setBounds(350, 170, 600, 500);
        super.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        // 左侧设置字体
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

        // 下层按钮
        last_panel.setLayout(new FlowLayout(FlowLayout.CENTER));
        last_panel.setOpaque(false);
        last_panel.add(save_btn);
        last_panel.add(reset_btn);

        // 设置垂直盒式布局管理器(将上下层面板放在一起)
        Box box = Box.createVerticalBox();
        box.setOpaque(false);
        box.add(left_panel);
        box.add(last_panel);
        super.add(box);

        // 上层面板中的左右面板
        left_panel.setLayout(new GridLayout(6, 1));
        left_panel.setOpaque(false);

        // 第一行  提醒
        left_p1.setLayout(new FlowLayout(FlowLayout.LEFT));
        left_p1.setOpaque(false);
        left_p1.add(in_tip);
        left_panel.add(left_p1);

        // 第二行  课程编号
        left_p2.setLayout(new FlowLayout(FlowLayout.LEFT));
        left_p2.setOpaque(false);
        left_p2.add(courseId);
        left_p2.add(txt_courseId);
        left_panel.add(left_p2);

        // 第三行  课程名
        left_p3.setLayout(new FlowLayout(FlowLayout.LEFT));
        left_p3.setOpaque(false);
        left_p3.add(courseName);
        left_p3.add(txt_courseName);
        left_panel.add(left_p3);

        // 第四行  任课教师
        left_p4.setLayout(new FlowLayout(FlowLayout.LEFT));
        left_p4.setOpaque(false);
        left_p4.add(teacher);
        left_p4.add(txt_teacher);
        left_panel.add(left_p4);

        // 第五行  学分
        left_p5.setLayout(new FlowLayout(FlowLayout.LEFT));
        left_p5.setOpaque(false);
        left_p5.add(credit);
        left_p5.add(txt_credit);
        left_panel.add(left_p5);

        // 第六行  课程时间
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

                //添加课程信息
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
