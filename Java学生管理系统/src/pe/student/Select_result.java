package pe.student;

import pe.databases.DBHelp;
import pe.entity.Stu_Course;
import pe.entity.Student;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class Select_result extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Select_result(){

		//获取唯一标识
		String username = Student.getUsername();

		this.setLayout(new FlowLayout());

		//表格表头
		String []titles= {"姓名","课程编号","课程名","成绩"};

		List<Stu_Course> stu_course = DBHelp.getStu_Course(username);

		String[][] stu_courses = new String[stu_course.size()][4];
		for (int i = 0; i < stu_course.size(); i++){
			stu_courses[i][0] = stu_course.get(i).getStudentName();
			stu_courses[i][1] = stu_course.get(i).getCourse_id();
			stu_courses[i][2] = stu_course.get(i).getCourseName();
			stu_courses[i][3] = String.valueOf(stu_course.get(i).getScore());
		}

		JLabel title = new JLabel("正选结果");
		title.setFont(new Font("宋体",Font.BOLD,40));
		this.setLayout(new FlowLayout());
		this.add(title);
		this.setVisible(true);
		this.setBackground(Color.white);

		JTable table = new JTable(stu_courses,titles);

		JScrollPane scrollPane = new JScrollPane(table);//存放表格
		scrollPane.setPreferredSize(new Dimension(1400, 900));


		this.add(scrollPane);



//		System.out.println(stu_course.get(0).getStudentName()+stu_course.get(0).getCourse_id()+stu_course.get(0).getCourseName()+stu_course.get(0).getScore());
		
	}
	
	public JPanel view(){
		return this;
	}
}
