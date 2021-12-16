package pe.teacher;

import javax.swing.*;
import java.awt.*;

public class Home_Page_teacher extends JPanel {

    private static final long serialVersionUID = 1L;
    private JLabel test=new JLabel("欢迎来到学生管理系统(教师端),请根据左侧导航栏提示进行操作!谢谢配合!",JLabel.CENTER);

    public Home_Page_teacher(){

        test.setFont(new Font("宋体",Font.BOLD,40));
        this.setLayout(new GridLayout(2,1));
        this.add(test);
        this.setVisible(true);
        this.setBackground(Color.white);

    }







    public JPanel view(){
        return this;
    }

}
