package pe.student;
/*
* ��ҳ
* */
import javax.swing.*;
import java.awt.*;

public class Home_Page extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel test=new JLabel("��ӭ����ѧ������ϵͳ,�������ർ������ʾ���в���!лл���!",JLabel.CENTER);

	public Home_Page(){
		
		test.setFont(new Font("����",Font.BOLD,50));
		this.setLayout(new GridLayout(2,1));
		this.add(test);
		this.setVisible(true);
		this.setBackground(Color.white);

	}
	
	
	
	
	
	
	
	public JPanel view(){
		return this;
	}
}
