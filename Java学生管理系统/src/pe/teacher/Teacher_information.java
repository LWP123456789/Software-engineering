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

    //上部组件
    private final JLabel title=new JLabel("个人信息",JLabel.CENTER);
    private final JPanel p1 = new JPanel();
    private final JPanel p2 = new JPanel();
    private final JPanel p3 = new JPanel();
    private final JPanel p4 = new JPanel();
    private final JPanel p5 = new JPanel();
    private final JPanel p6 = new JPanel();
    private final JButton btn = new JButton("修改信息");

    public Teacher_information(){



        //设置布局管理
        title.setFont(new Font("宋体",Font.BOLD,50));
        title.setBackground(Color.white);

        String teacher_name = Teacher.getUsername();
        List<Teacher> l1 = DBHelp.getTeacherInfo(teacher_name);
        //获取教师信息
        String id = l1.get(0).getId();
        String name = l1.get(0).getName();
        String sex = l1.get(0).getSex();
        String tele = l1.get(0).getTele();

        System.out.println(id);

        JTextArea teacherId= new JTextArea();
        JTextArea teacherName= new JTextArea();
        JTextArea teacherSex= new JTextArea();
        JTextArea teacherTele= new JTextArea();

        teacherId.setText("教师编号 :" + id + "    ");
        teacherName.setText("教师姓名 :" + name + "    ");
        teacherSex.setText("性别 :" + sex + "    ");
        teacherTele.setText("联系方式 :" + tele + "    ");

        teacherId.setFont(new Font("宋体",Font.BOLD,25));
        teacherName.setFont(new Font("宋体",Font.BOLD,25));
        teacherSex.setFont(new Font("宋体",Font.BOLD,25));
        teacherTele.setFont(new Font("宋体",Font.BOLD,25));

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

        btn.setFont(new Font("宋体",Font.BOLD,18));

        //第一行 标题
        p1.add(title);
        this.add(p1);
        //教师编号 教师名
        p2.add(teacherId);
        p2.add(teacherName);
        this.add(p2);
        //性别 联系方式
        p3.add(teacherSex);
        p3.add(teacherTele);
        this.add(p3);


        p4.add(btn);
        this.add(p6);
        this.add(p4);

        // 设置‘修改信息’按钮作用
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
