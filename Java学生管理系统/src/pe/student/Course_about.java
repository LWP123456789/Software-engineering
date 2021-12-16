package pe.student;

import javax.swing.*;
import java.awt.*;

public class Course_about extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel test=new JLabel("课程相关");
	private JPanel p1 = new JPanel();
	private JPanel p2 = new JPanel();
	private JTextArea jTextArea = new JTextArea("根据各专业培养方案，学生可自行点击选课操作进入选课课表页面点击添加或删除进行选课或退选\n\n" +
			"1.所有学生第一轮必须选课,以便教务处测算学生课程需求量并合理安排和调整教学资源。第一轮不选课者将限制其后续选课\n\n" +
			"2.本选课系统在第一和第二轮选课后,均要按规定进行筛选,学生在每一轮选课时均应进入选课系统查询自己的选课情况，及时调整和选定课程\n\n" +
			"3.学生可根据《课程表》和教学计划自主安排、选择本学期课程。选课前应查看要选课程的课程简介，注意先修课程，避免选入后修读不了。\n" +
			"选课时应注意要选课程的课程编号、课程名称、课程学分是否与教学计划中的一致\n\n" +
			"4.凡一、二年级体育课不及格的同学,重修必须安排在三、四年级进行。不允许同一学期选两门体育课\n\n" +
			"5.为了使不会游泳的同学能在有限的教学资源中得到学习游泳的机会，请已经会游泳的同学不要选游泳课，游泳课只限尚未通过游泳测试的同学\n" +
			"选，同时采取高年级同学优先的筛选原则\n\n" +
			"6.现已取消退改选制度，每位同学必须在第1~2轮内将应选的课程全部选定，第三轮选课，因受教学资源等因素制约，不能保证尚未选入的课程能选进；\n" +
			"\n" +
			"7．学生选课必须本人上机操作，不得代选。\n" +
			"\n" +
			"8．选课中如有问题，请在机房开放时，凭本人学生证至选课机房教务处所设咨询点联系解决。\n" +
			"\n" +
			"9．选课最后结果在第三轮选课结束后才能确定；学生个人课表可从选课系统中的选课查询窗口，查询自己的选课结果：上课时间、上课地点等。\n" +
			"\n" +
			"10．对课程编号、课程名称、学分等有疑问的，请咨询系教务员或学院教学秘书。");

	public Course_about(){
		test.setFont(new Font("宋体",Font.BOLD,50));
		this.setLayout(new FlowLayout());

		p1.setBackground(Color.white);
		p1.add(test);
		p2.setBackground(Color.white);
		jTextArea.setFont(new Font("宋体",Font.BOLD,23));
		p2.add(jTextArea);
		this.add(p1);
		this.setVisible(true);
		this.setBackground(Color.white);
		this.add(p2);
	}
	
	public JPanel view(){
		return this;
	}
}
