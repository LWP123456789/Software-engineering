package pe.student;

import javax.swing.*;
import java.awt.*;

public class Professional_guidance extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel test1=new JLabel("计算机科学与技术指导");
	private JPanel p1 = new JPanel();
	private JTextArea text1 = new JTextArea("				2019级选课指导：\n" +
			"				必修课、集中性实践教学环节必须完成所有指定课程学分方可毕业；公共选修课总学分不少于8学分；专业选修课所修学分按以下选课课程组要求：方向选修课程：（方向选修课程至少需完成组I、组II其中一个方向所有限选课程）；任选课总学分不低于14学分，其中至少7学分从对应方向任选课程组中选课；其它学分可从其它方向限选课程组或任选课程组中选修。");

	public Professional_guidance(){
		test1.setFont(new Font("宋体",Font.BOLD,30));
		this.add(test1, BorderLayout.CENTER);
		this.setVisible(true);
		this.setBackground(Color.white);
		p1.add(text1);
		this.add(p1);
	}
	
	public JPanel view(){
		return this;
	}
}
