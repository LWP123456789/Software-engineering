package pe.teacher;

import javax.swing.*;
import java.awt.*;

public class Home_Page_teacher extends JPanel {

    private static final long serialVersionUID = 1L;
    private JLabel test=new JLabel("��ӭ����ѧ������ϵͳ(��ʦ��),�������ർ������ʾ���в���!лл���!",JLabel.CENTER);

    public Home_Page_teacher(){

        test.setFont(new Font("����",Font.BOLD,40));
        this.setLayout(new GridLayout(2,1));
        this.add(test);
        this.setVisible(true);
        this.setBackground(Color.white);

    }







    public JPanel view(){
        return this;
    }

}
