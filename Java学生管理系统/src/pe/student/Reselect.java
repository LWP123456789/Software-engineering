package pe.student;

import pe.databases.DBHelp;
import pe.entity.Course;
import pe.entity.Stu_Course;
import pe.entity.Student;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class Reselect extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTable table;

	//�²����,���ڴ������ť,�ֱ�ʵ����Ӻ�ɾ���Ĺ���
	private JPanel show = new JPanel();
	private JButton b1 = new JButton("���");
	private JButton b2 = new JButton("ɾ��");
	public Reselect(){
		//����ͷ
		String []titles= {"�γ̺�","�γ���","�ον�ʦ","ѧ��","�γ�ʱ��"};

		//��ȡ���пγ���Ϣ
		List<Course> allCourse = DBHelp.getAllCourse();

		//����һ����ά���飬���ڴ�ſγ���Ϣ
		String courses[][] = new String[allCourse.size()][5];
		for (int i = 0; i < allCourse.size(); i++){
			courses[i][0] = allCourse.get(i).getId();
			courses[i][1] = allCourse.get(i).getName();
			courses[i][2] = allCourse.get(i).getTeacher();
			courses[i][3] = allCourse.get(i).getCredit();
			courses[i][4] = allCourse.get(i).getTime();
		}


		JSplitPane vSplitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
		vSplitPane.setDividerLocation(680);
		vSplitPane.setPreferredSize(new Dimension(1300, 800));

		b1.setFont(new Font("����", Font.BOLD, 18));
		b2.setFont(new Font("����", Font.BOLD, 18));
		b1.setContentAreaFilled(false);
		b1.setFocusPainted(false);

		this.setVisible(true);
		this.setBackground(Color.white);

		table = new JTable(courses,titles);
		JScrollPane scrollPane = new JScrollPane(table);//��ű��
		scrollPane.setPreferredSize(new Dimension(1300, 650));

		show.add(b1);
		show.add(b2);

		vSplitPane.setLeftComponent(scrollPane);
		vSplitPane.setRightComponent(show);

		this.add(vSplitPane);

		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//��ȡѡ���е����� ����������γ̺�-1
				int selectedRow = table.getSelectedRow();
				//��ÿγ̺�
				String  courseId = "0"+ (selectedRow + 1);

				//������ �����û��Ƿ�ȷ�����
				if (selectedRow==-1){

					JOptionPane.showMessageDialog(null, "��δѡ��γ���Ϣ", "����", JOptionPane.ERROR_MESSAGE);

				} else {

					int n = JOptionPane.showConfirmDialog(null, "ȷ�������?", "ȷ��ѡ�β���", JOptionPane.YES_NO_OPTION);
					if (n == JOptionPane.YES_OPTION) {
						// �жϿγ��Ƿ���ѡ
						List<Stu_Course> stu_course = DBHelp.getStu_Course(Student.getUsername());
						boolean flag = false;

						for (int i=0; i < stu_course.size(); i++){
							if (stu_course.get(i).getCourse_id().equals(courseId)){
								JOptionPane.showMessageDialog(null, "����ѡ����˿γ�", "����", JOptionPane.ERROR_MESSAGE);
								flag = true;
								break;
							}
						}

						if (!flag){
							// ���γ̺���ѧ��id����
							DBHelp.addCourse(courseId,Student.getUsername());

							JOptionPane.showMessageDialog(null, "��ӳɹ�", "success", JOptionPane.INFORMATION_MESSAGE);
						}

					} else if (n == JOptionPane.NO_OPTION) {

					}
				}

			}
		});

		//ɾ����ѡ�γ�
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//��ȡѡ���е����� ����������γ̺�-1
				int selectedRow = table.getSelectedRow();
				//��ÿγ̺�
				String  courseId = "0"+ (selectedRow + 1);

				//������ �����û��Ƿ�ȷ�����
				if (selectedRow==-1){

					JOptionPane.showMessageDialog(null, "��δѡ��γ���Ϣ", "����", JOptionPane.ERROR_MESSAGE);

				} else {

					int n = JOptionPane.showConfirmDialog(null, "ȷ��ɾ����?", "ȷ��ɾ������", JOptionPane.YES_NO_OPTION);
					if (n == JOptionPane.YES_OPTION) {
						// �жϿγ��Ƿ���ѡ
						List<Stu_Course> stu_course = DBHelp.getStu_Course(Student.getUsername());
						boolean flag = false;

						for (int i=0; i < stu_course.size(); i++){
							if (stu_course.get(i).getCourse_id().equals(courseId)){
								flag = true;
								break;
							}
						}
						//�������ݿⷽ������ɾ������
						if (flag){
							// ���γ̺���ѧ��id����
							DBHelp.deleteCourse(courseId,Student.getUsername());

							JOptionPane.showMessageDialog(null, "ɾ���ɹ�", "success", JOptionPane.INFORMATION_MESSAGE);
						} else {
							//û��ѡ��ÿγ�,�޷�ִ��ɾ������
							JOptionPane.showMessageDialog(null, "û��ѡ��ÿγ�,�޷�ִ��ɾ������", "����", JOptionPane.ERROR_MESSAGE);
						}

					} else if (n == JOptionPane.NO_OPTION) {

					}
				}

			}
		});
	}
	
	public JPanel view(){
		return this;
	}
}
