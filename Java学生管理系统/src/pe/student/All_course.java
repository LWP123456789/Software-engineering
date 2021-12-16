package pe.student;
/*
* ��ʽ���пγ���Ϣ
* */

import pe.databases.DBHelp;
import pe.entity.Course;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class All_course extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public All_course(){

		this.setLayout(new FlowLayout());

		//����ͷ
		String []titles= {"�γ̺�","�γ���","�ον�ʦ","ѧ��","�γ�ʱ��"};

		//��ȡ���пγ���Ϣ
		List<Course> allCourse = DBHelp.getAllCourse();

		//����һ����ά���飬���ڴ�ſγ���Ϣ
		String[][] courses = new String[allCourse.size()][5];
		for (int i = 0; i < allCourse.size(); i++){
			courses[i][0] = allCourse.get(i).getId();
			courses[i][1] = allCourse.get(i).getName();
			courses[i][2] = allCourse.get(i).getTeacher();
			courses[i][3] = allCourse.get(i).getCredit();
			courses[i][4] = allCourse.get(i).getTime();
		}
		
		this.setVisible(true);
		this.setBackground(Color.white);

		JTable table = new JTable(courses, titles);
		JScrollPane scrollPane = new JScrollPane(table);//��ű��
		scrollPane.setPreferredSize(new Dimension(1400, 850));

		this.add(scrollPane);

//		System.out.println(allCourse.get(0).getId() + "    " + allCourse.get(0).getName() + "    " + allCourse.get(0).getTeacher() + "    ");

		
	}
	
	public JPanel view(){
		return this;
	}
}
