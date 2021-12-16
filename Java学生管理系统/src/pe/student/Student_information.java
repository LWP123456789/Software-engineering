package pe.student;

import pe.databases.DBHelp;
import pe.entity.Student;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class Student_information extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//�ϲ����
	private final JLabel title=new JLabel("������Ϣ",JLabel.CENTER);
	private final JPanel p1 = new JPanel();
	private final JPanel p2 = new JPanel();
	private final JPanel p3 = new JPanel();
	private final JPanel p4 = new JPanel();
	private final JPanel p5 = new JPanel();
	private final JPanel p6 = new JPanel();
	private final JButton btn = new JButton("�޸���Ϣ");

	public Student_information(){

		

		//���ò��ֹ���
		title.setFont(new Font("����",Font.BOLD,50));
		title.setBackground(Color.white);
		
		String stu_name = Student.getUsername();
		List<Student> l1 = DBHelp.getInfo(stu_name);
		//��ȡѧ����Ϣ
		int id = l1.get(0).getStu_id();
		String name = l1.get(0).getStu_realName();
		String sex = l1.get(0).getStu_sex();
		String course_number = l1.get(0).getStu_courseNumber();
		String stu_class = l1.get(0).getStu_class();
		String tele = l1.get(0).getStu_tele();
		String nation = l1.get(0).getStu_nation();
		String address = l1.get(0).getStu_address();
		String political = l1.get(0).getStu_political_outlook();
		String department = l1.get(0).getStu_department();
//		System.out.println("ѧ��: "+l1.get(0).getStu_id()+" ����: "+l1.get(0).getStu_realName()+" �Ա�: "+l1.get(0).getStu_sex()+" �γ��� "+l1.get(0).getStu_courseNumber()+" ���ڰ༶: "+l1.get(0).getStu_class());
		
//		JTextArea studentId = new JTextArea();
		JTextArea studentName= new JTextArea();
		JTextArea studentSex= new JTextArea();
		JTextArea studentCourseNumber= new JTextArea();
		JTextArea studentClass= new JTextArea();
		JTextArea studentDepartment= new JTextArea();
		JTextArea studentTele= new JTextArea();
		JTextArea studentNation= new JTextArea();
		JTextArea studentAddress= new JTextArea();
		JTextArea studentPolitical= new JTextArea();
		
		studentName.setText("ѧ���� :" + name + "    ");
		studentSex.setText("�Ա� :" + sex + "    ");
		studentCourseNumber.setText("�γ��� :" + course_number+ "    ");//��course_numberת������String��
		studentClass.setText("�༶ :" + stu_class+ "    ");
		studentDepartment.setText("ϵ�� :" + department + "    ");
		studentTele.setText("��ϵ��ʽ :" + tele + "    ");
		studentNation.setText("���� :" + nation + "    ");
		studentAddress.setText("סַ :" + address + "    ");
		studentPolitical.setText("������ò :" + political + "    ");
		
		studentName.setFont(new Font("����",Font.BOLD,25));
		studentSex.setFont(new Font("����",Font.BOLD,25));
		studentCourseNumber.setFont(new Font("����",Font.BOLD,25));
		studentClass.setFont(new Font("����",Font.BOLD,25));
		studentDepartment.setFont(new Font("����",Font.BOLD,25));
		studentTele.setFont(new Font("����",Font.BOLD,25));
		studentNation.setFont(new Font("����",Font.BOLD,25));
		studentAddress.setFont(new Font("����",Font.BOLD,25));
		studentPolitical.setFont(new Font("����",Font.BOLD,25));
		
		this.setVisible(true);
		this.setBackground(Color.white);
		this.setLayout(new GridLayout(10,1));

		p1.setBackground(Color.white);
		p2.setBackground(Color.white);
		p3.setBackground(Color.white);
		p4.setBackground(Color.white);
		p5.setBackground(Color.white);
		p6.setBackground(Color.white);

		p2.setLayout(new GridLayout(1,3));
		p3.setLayout(new GridLayout(1,3));
		p4.setLayout(new GridLayout(1,3));
		p5.setLayout(new GridLayout(1,1));
		p6.setLayout(new GridLayout(1,1));

		btn.setFont(new Font("����",Font.BOLD,18));

		//��һ�� ����
		p1.add(title);
		this.add(p1);
		//����
		p2.add(studentName);
		p2.add(studentSex);
		p2.add(studentCourseNumber);
		this.add(p2);
		//ϵ��
		p3.add(studentDepartment);
		p3.add(studentClass);
		p3.add(studentTele);
		this.add(p3);

		p4.add(studentNation);
		p4.add(studentAddress);
		p4.add(studentPolitical);
		this.add(p4);

		p5.add(btn);
		this.add(p6);
		this.add(p5);

		// ���á��޸���Ϣ����ť����
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Modify_information();
			}
		});
		
	}
	
	public JPanel view(){
		return this;
	}
}

