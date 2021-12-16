package pe.student;
/*
* 首页
* */
import javax.swing.*;
import java.awt.*;

public class Home_Page extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel test=new JLabel("欢迎来到学生管理系统,请根据左侧导航栏提示进行操作!谢谢配合!",JLabel.CENTER);

	public Home_Page(){
		
		test.setFont(new Font("宋体",Font.BOLD,50));
		this.setLayout(new GridLayout(2,1));
		this.add(test);
		this.setVisible(true);
		this.setBackground(Color.white);

	}
	
	
	
	
	
	
	
	public JPanel view(){
		return this;
	}
}
