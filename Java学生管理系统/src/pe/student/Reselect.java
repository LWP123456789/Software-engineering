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

	//下部组件,用于存放两按钮,分别实现添加和删除的功能
	private JPanel show = new JPanel();
	private JButton b1 = new JButton("添加");
	private JButton b2 = new JButton("删除");
	public Reselect(){
		//表格表头
		String []titles= {"课程号","课程名","任课教师","学分","课程时间"};

		//获取所有课程信息
		List<Course> allCourse = DBHelp.getAllCourse();

		//定义一个二维数组，用于存放课程信息
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

		b1.setFont(new Font("宋体", Font.BOLD, 18));
		b2.setFont(new Font("宋体", Font.BOLD, 18));
		b1.setContentAreaFilled(false);
		b1.setFocusPainted(false);

		this.setVisible(true);
		this.setBackground(Color.white);

		table = new JTable(courses,titles);
		JScrollPane scrollPane = new JScrollPane(table);//存放表格
		scrollPane.setPreferredSize(new Dimension(1300, 650));

		show.add(b1);
		show.add(b2);

		vSplitPane.setLeftComponent(scrollPane);
		vSplitPane.setRightComponent(show);

		this.add(vSplitPane);

		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//获取选中行的数据 获得索引：课程号-1
				int selectedRow = table.getSelectedRow();
				//获得课程号
				String  courseId = "0"+ (selectedRow + 1);

				//弹出框 提醒用户是否确定添加
				if (selectedRow==-1){

					JOptionPane.showMessageDialog(null, "你未选择课程信息", "警告", JOptionPane.ERROR_MESSAGE);

				} else {

					int n = JOptionPane.showConfirmDialog(null, "确认添加吗?", "确认选课操作", JOptionPane.YES_NO_OPTION);
					if (n == JOptionPane.YES_OPTION) {
						// 判断课程是否已选
						List<Stu_Course> stu_course = DBHelp.getStu_Course(Student.getUsername());
						boolean flag = false;

						for (int i=0; i < stu_course.size(); i++){
							if (stu_course.get(i).getCourse_id().equals(courseId)){
								JOptionPane.showMessageDialog(null, "你已选择过此课程", "警告", JOptionPane.ERROR_MESSAGE);
								flag = true;
								break;
							}
						}

						if (!flag){
							// 将课程号与学生id关联
							DBHelp.addCourse(courseId,Student.getUsername());

							JOptionPane.showMessageDialog(null, "添加成功", "success", JOptionPane.INFORMATION_MESSAGE);
						}

					} else if (n == JOptionPane.NO_OPTION) {

					}
				}

			}
		});

		//删除已选课程
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//获取选中行的数据 获得索引：课程号-1
				int selectedRow = table.getSelectedRow();
				//获得课程号
				String  courseId = "0"+ (selectedRow + 1);

				//弹出框 提醒用户是否确定添加
				if (selectedRow==-1){

					JOptionPane.showMessageDialog(null, "你未选择课程信息", "警告", JOptionPane.ERROR_MESSAGE);

				} else {

					int n = JOptionPane.showConfirmDialog(null, "确认删除吗?", "确认删除操作", JOptionPane.YES_NO_OPTION);
					if (n == JOptionPane.YES_OPTION) {
						// 判断课程是否已选
						List<Stu_Course> stu_course = DBHelp.getStu_Course(Student.getUsername());
						boolean flag = false;

						for (int i=0; i < stu_course.size(); i++){
							if (stu_course.get(i).getCourse_id().equals(courseId)){
								flag = true;
								break;
							}
						}
						//调用数据库方法进行删除操作
						if (flag){
							// 将课程号与学生id关联
							DBHelp.deleteCourse(courseId,Student.getUsername());

							JOptionPane.showMessageDialog(null, "删除成功", "success", JOptionPane.INFORMATION_MESSAGE);
						} else {
							//没有选择该课程,无法执行删除操作
							JOptionPane.showMessageDialog(null, "没有选择该课程,无法执行删除操作", "警告", JOptionPane.ERROR_MESSAGE);
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
