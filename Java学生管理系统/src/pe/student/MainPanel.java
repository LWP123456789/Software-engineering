package pe.student;
/*
* ����ѧ����ʱ��������
* */
import pe.guiset.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class MainPanel extends JFrame {

	JPanel panel, bigPanel;
	private JPanel title;
	private JLabel title_lbl;
	private Image im;
	private Background_Navigation_tree daohang = new Background_Navigation_tree();
	private static final String IMAGE_ICON_PATH = "D:\\image\\��\\yahoo.png";

	public MainPanel() {
		super("ѧ��ѡ�ι���ϵͳ");

		// ͼ������
		ImageIcon ig = new ImageIcon(IMAGE_ICON_PATH);
		im = ig.getImage();
		setIconImage(im);

		Container con = getContentPane();
		title = new JPanel();
		title.setPreferredSize(new Dimension(1366, 70));
		title.setLayout(new FlowLayout(FlowLayout.CENTER));
		title_lbl = new JLabel(
				"<html><body><p align=\"center\">ѧ��ѡ�ι���ϵͳ(ѧ����)<br> </p></body></html>");
		title.add(title_lbl);
		title_lbl.setFont(new Font("����", Font.BOLD, 35));
		con.setLayout(new BorderLayout());
		con.add(title, BorderLayout.NORTH);
		bigPanel = new JPanel();
		bigPanel.setLayout(new BorderLayout());
		con.add(bigPanel);
		con.add(daohang.left, BorderLayout.WEST);// ������
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setExtendedState(JFrame.MAXIMIZED_BOTH);
		super.setVisible(true);

		/*
		 * ��ҳ����
		 */
		Home_Page home_Page = new Home_Page();
		panel = home_Page.view();
		bigPanel.add(panel);
		// validate();
		// repaint();

//		 ��ҳ
		daohang.item1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bigPanel.remove(panel);
				Home_Page home_Page1 = new Home_Page();
				panel = home_Page1.view();
				bigPanel.add(panel, BorderLayout.CENTER);
				validate();
				repaint();
			}
		});

		/*
		 * ѡ�β���
		 */

		// ѡ�β���
		daohang.btn2[0].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bigPanel.remove(panel);
				Select_course select_course = new Select_course();
				panel = select_course.view();
				bigPanel.add(panel);
				validate();
				repaint();
			}
		});

	    // ���пγ�
		daohang.btn2[1].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bigPanel.remove(panel);
				All_course all_course = new All_course();
				panel = all_course.view();
				bigPanel.add(panel);
				validate();
				repaint();
			}
		});
//
//		// �γ����
		daohang.btn2[2].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bigPanel.remove(panel);
				Course_about course_about = new Course_about();
				panel = course_about.view();
				bigPanel.add(panel);
				validate();
				repaint();
			}
		});

		/*
		 * ѡ�ν��
		 */

		// ��ѡ���
		daohang.btn3[0].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bigPanel.remove(panel);
				Select_result select_result = new Select_result();
				panel = select_result.view();
				bigPanel.add(panel);
				validate();
				repaint();
			}
		});

		// ����ѡ��
		daohang.btn3[1].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bigPanel.remove(panel);
				Reselect reselect = new Reselect();
				panel = reselect.view();
				bigPanel.add(panel);
				validate();
				repaint();
			}
		});

		/*
		 * ��ѧ����
		 */

		// ��Ȱ���
		daohang.btn4[0].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bigPanel.remove(panel);
				Year_arrangement year_arrangement = new Year_arrangement();
				panel = year_arrangement.view();
				bigPanel.add(panel);
				validate();
				repaint();
			}
		});

		// רҵָ��
		daohang.btn4[1].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bigPanel.remove(panel);
				Professional_guidance professional_guidance = new Professional_guidance();
				panel = professional_guidance.view();
				bigPanel.add(panel);
				validate();
				repaint();
			}
		});

		/*
		 * ��������
		 */

		// ѧУ����
		daohang.btn5[0].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bigPanel.remove(panel);
				School_announcement school_announcement = new School_announcement();
				panel = school_announcement.view();
				bigPanel.add(panel);
				validate();
				repaint();
			}
		});

		// �ٱ�����
		daohang.btn5[1].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bigPanel.remove(panel);
				Report_management report_management = new Report_management();
				panel = report_management.view();
				bigPanel.add(panel);
				validate();
				repaint();
			}
		});

		// ѧУ���
		daohang.btn5[2].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bigPanel.remove(panel);
				School_style school_style = new School_style();
				panel = school_style.view();
				bigPanel.add(panel);
				validate();
				repaint();
			}
		});

		// ��������
		daohang.btn5[3].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bigPanel.remove(panel);
				Training_program training_program = new Training_program();
				panel = training_program.view();
				bigPanel.add(panel);
				validate();
				repaint();
			}
		});

		/*
		 * ������Ϣ
		 */

		// �˻���Ϣ
		daohang.btn6[0].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bigPanel.remove(panel);
				Student_information student_information = new Student_information();
				panel = student_information.view();
				bigPanel.add(panel);
				validate();
				repaint();
			}
		});

	}

}
