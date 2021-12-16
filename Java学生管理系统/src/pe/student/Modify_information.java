package pe.student;
/*
*
* 学生端修改个人信息
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

    private Font font = new Font("宋体", Font.BOLD, 18);
    private JPanel left_panel = new JPanel();

    // 正文左侧的组件
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

    private JLabel in_tip = new JLabel("请填写您的基本资料(以下项目不能为空)");
    private JLabel name = new JLabel("真实姓名：");
    private JTextField txt_name = new JTextField(25);

    private JLabel sex = new JLabel("性别：");
    private JTextField txt_sex = new JTextField(25);
    private JLabel courseNumber = new JLabel("课程数：");
    private JTextField txt_courseNumber = new JTextField(25);

    private JLabel department = new JLabel("系别：");
    private JTextField txt_department = new JTextField(25);

    private JLabel stu_class = new JLabel("班级：");
    private JTextField txt_class = new JTextField(25);

    private JLabel tele = new JLabel("联系方式：");
    private JTextField txt_tele = new JTextField(25);

    private JLabel nation = new JLabel("民族：");
    private JTextField txt_nation = new JTextField(25);

    private JLabel address = new JLabel("住址：");
    private JTextField txt_address = new JTextField(25);

    private JLabel polity = new JLabel("政治面貌：");
    private JTextField txt_polity = new JTextField(25);

    // 底部组件
    private JPanel last_panel = new JPanel();
    private JButton save_btn = new JButton("保存");
    private JButton reset_btn = new JButton("重置");

    public Modify_information(){
        super("修改信息");

        // 组件及布局设置
        super.setVisible(true);
        super.setResizable(false);
        super.setBounds(350, 170, 1254, 734);
        super.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        // 左侧设置字体
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
        left_panel.setLayout(new GridLayout(10, 1));
        left_panel.setOpaque(false);

        /*
         *
         * 左侧内容
         */

        // 第一行  提醒
        left_p1.setLayout(new FlowLayout(FlowLayout.LEFT));
        left_p1.setOpaque(false);
        left_p1.add(in_tip);
        left_panel.add(left_p1);

        // 第二行  真实姓名
        left_p2.setLayout(new FlowLayout(FlowLayout.LEFT));
        left_p2.setOpaque(false);
        left_p2.add(name);
        left_p2.add(txt_name);
        left_panel.add(left_p2);

        // 第三行  性别
        left_p3.setLayout(new FlowLayout(FlowLayout.LEFT));
        left_p3.setOpaque(false);
        left_p3.add(sex);
        left_p3.add(txt_sex);
        left_panel.add(left_p3);

        // 第四行  课程数
         left_p4.setLayout(new FlowLayout(FlowLayout.LEFT));
         left_p4.setOpaque(false);
         left_p4.add(courseNumber);
         left_p4.add(txt_courseNumber);
         left_panel.add(left_p4);

        // 第五行  系别
        left_p5.setLayout(new FlowLayout(FlowLayout.LEFT));
        left_p5.setOpaque(false);
        left_p5.add(department);
        left_p5.add(txt_department);
        left_panel.add(left_p5);

        // 第六行  班级
        left_p6.setLayout(new FlowLayout(FlowLayout.LEFT));
        left_p6.setOpaque(false);
        left_p6.add(stu_class);
        left_p6.add(txt_class);
        left_panel.add(left_p6);

        // 第七行  联系方式
        left_p7.setLayout(new FlowLayout(FlowLayout.LEFT));
        left_p7.setOpaque(false);
        left_p7.add(tele);
        left_p7.add(txt_tele);
        left_panel.add(left_p7);

        // 第八行  民族
        left_p8.setLayout(new FlowLayout(FlowLayout.LEFT));
        left_p8.setOpaque(false);
        left_p8.add(nation);
        left_p8.add(txt_nation);
        left_panel.add(left_p8);

        // 第九行  住址
        left_p9.setLayout(new FlowLayout(FlowLayout.LEFT));
        left_p9.setOpaque(false);
        left_p9.add(address);
        left_p9.add(txt_address);
        left_panel.add(left_p9);

        // 第九行  政治面貌
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

                //修改数据库中对应标识的数据
                DBHelp.modifyInformation(Student.getUsername(),realName,sex1,text,text1,text2,text3,text4,text5,text6);
//                System.out.println(Student.getUsername());
                JOptionPane.showMessageDialog(null, "修改成功", "提醒", JOptionPane.INFORMATION_MESSAGE);
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
