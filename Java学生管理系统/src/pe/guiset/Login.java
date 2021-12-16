package pe.guiset;

import java.awt.Choice;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import pe.admin.SystemMain;
import pe.databases.DBHelp;
import pe.entity.Student;
import pe.entity.Teacher;
import pe.function.LoginHelp;
import pe.function.ValidCode;
import pe.student.MainPanel;
import pe.teacher.TeacherPanel;

@SuppressWarnings("serial")
public class Login extends JFrame {
	private static final String IMAGE_ICON_PATH = "D:\\repository\\Vue\\vue_test\\public\\favicon.icon";
	private static final String IMAGE_PATH = "D:\\Image\\background\\gray.jpg";
	private Image im;
	private JLabel lbl1 = new JLabel("用户名：");
	private JLabel lbl2 = new JLabel("密  码：");
	private JLabel lbl3 = new JLabel("选择登录类型：");
	private JLabel lbl4 = new JLabel("验证码：");
	private JLabel top_tip = new JLabel("学生管理系统");
	private JLabel test1 = new JLabel("");
	private JLabel test2 = new JLabel("Student Management System");
	private ValidCode vcode = new ValidCode();// 获取验证码
	private JButton btn1, btn2, btn3;
	private JTextField txt1, txt2, txt_code;
	private Choice type;
	private JPanel p1 = new JPanel();
	private JPanel p2 = new JPanel();
	private JPanel p3 = new JPanel();
	private JPanel p4 = new JPanel();
	private JPanel p5 = new JPanel();
	private JPanel top = new JPanel();
	private JPanel yzmPanel = new JPanel();
	private JPanel big_top = new JPanel();
	private JPanel test2_panel = new JPanel();
	private Font font = new Font("宋体", Font.BOLD, 20);

	public Login() {
		super("学生管理系统");

		// 图标设置
		ImageIcon ig = new ImageIcon(IMAGE_ICON_PATH);
		im = ig.getImage();
		setIconImage(im);
		// 背景图片设置
		ImageIcon background = new ImageIcon(IMAGE_PATH);
		JLabel label = new JLabel(background);
		label.setBounds(0, 0, background.getIconWidth(),
				background.getIconHeight());
		super.getLayeredPane().add(label, new Integer(Integer.MIN_VALUE));
		JPanel jp = (JPanel) super.getContentPane();
		jp.setOpaque(false);

		// 组件
		btn1 = new JButton("登录");
		btn2 = new JButton("重置");
		btn3 = new JButton("注册");
		txt1 = new JTextField(20);
		txt2 = new JPasswordField(20);
		txt_code = new JTextField(11);
		type = new Choice();
		super.setLayout(new GridLayout(3, 1));
		super.add(big_top);
		super.add(p5);
		super.add(test2);
		super.setVisible(true);
		super.setBounds(350, 170, 1254, 734);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setResizable(false);
		// 设置字体
		lbl1.setFont(font);
		lbl2.setFont(font);
		lbl3.setFont(font);
		lbl4.setFont(font);
		lbl1.setForeground(Color.black);
		lbl2.setForeground(Color.black);
		lbl3.setForeground(Color.black);
		lbl4.setForeground(Color.black);
		btn1.setFont(new Font("宋体", Font.BOLD, 18));
		btn2.setFont(new Font("宋体", Font.BOLD, 18));
		btn3.setFont(new Font("宋体", Font.BOLD, 18));
		type.setFont(font);
		txt1.setFont(font);
		txt2.setFont(font);
		top_tip.setFont(new Font("楷体", Font.BOLD, 60));
		txt_code.setFont(font);
		super.getRootPane().setDefaultButton(btn1);// 设置‘登录’快捷键
		type.add("学生");
		type.add("教师");
		type.add("系统管理员");
		p5.setLayout(new GridLayout(5, 1));
		p5.setOpaque(false);
		p1.setLayout(new FlowLayout(FlowLayout.CENTER));
		p1.setOpaque(false);
		p1.add(lbl1);
		p1.add(txt1);
		p2.setLayout(new FlowLayout(FlowLayout.CENTER));
		p2.setOpaque(false);
		p2.add(lbl2);
		p2.add(txt2);
		p3.setLayout(new FlowLayout(FlowLayout.CENTER));
		p3.setOpaque(false);
		p3.add(lbl3);
		p3.add(type);
		p4.setLayout(new FlowLayout(FlowLayout.CENTER));
		p4.setOpaque(false);
		p4.add(btn1);
		p4.add(btn2);
		p4.add(btn3);
		yzmPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		yzmPanel.setOpaque(false);
		yzmPanel.add(lbl4);
		yzmPanel.add(txt_code);
		yzmPanel.add(vcode);
		top.setLayout(new FlowLayout(FlowLayout.CENTER));
		top.setOpaque(false);
		top.add(top_tip);
		big_top.setLayout(new GridLayout(3, 1));
		big_top.setOpaque(false);
		big_top.add(test1);
		big_top.add(top);
		big_top.add(test2_panel);
		test2_panel.setLayout(new FlowLayout(FlowLayout.CENTER));
		test2_panel.setOpaque(false);
		test2_panel.add(test2);
		test2.setFont(new Font("楷体", Font.PLAIN, 25));
		test2.setForeground(Color.black);
		p5.add(p1);
		p5.add(p2);
		p5.add(p3);
		p5.add(yzmPanel);
		p5.add(p4);

		// 设置按钮透明
		btn1.setContentAreaFilled(false);
		btn2.setContentAreaFilled(false);
		btn3.setContentAreaFilled(false);

		// 去除按钮焦点框
		btn1.setFocusPainted(false);
		btn2.setFocusPainted(false);
		btn3.setFocusPainted(false);
		

		// 设置‘登录’按钮作用
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String login_type = type.getSelectedItem();
				String username_str = txt1.getText();
				String password_str = txt2.getText();
				Student.setUsername(username_str);
				
				//检验登录类型是否与用户名类型匹配
				String identify = DBHelp.getIdentify(username_str);

//				System.out.println(identify);

				// 判断验证码是否输入正确
				boolean iscode = LoginHelp.isValidCode(txt_code, vcode);
				// 判断用户是否合法
				boolean userisgood = LoginHelp.login(login_type, username_str,
						password_str);

				if (iscode == true) {
					if (userisgood == true) {
						if (identify.equals(login_type)){
							if (type.getSelectedItem().equals("系统管理员")) {
								JOptionPane.showMessageDialog(null, "登录成功，欢迎使用！");
								@SuppressWarnings("unused")
								SystemMain systemPanel = new SystemMain();
								LoginHelp.Loginclear(txt1, txt2, type, txt_code);
								dispose();
							}else if(type.getSelectedItem().equals("教师")){
								Teacher.setUsername(username_str);
								JOptionPane.showMessageDialog(null, "登录成功，欢迎使用！");
								/*
								 *
								 * 实例化前台
								 *
								 */
								@SuppressWarnings("unused")
								TeacherPanel t = new TeacherPanel();
								LoginHelp.Loginclear(txt1, txt2, type, txt_code);
								dispose();
							}else {
								JOptionPane.showMessageDialog(null, "登录成功，欢迎使用！");
								@SuppressWarnings("unused")
                                MainPanel mainPanel = new MainPanel();
								LoginHelp.Loginclear(txt1, txt2, type, txt_code);
								dispose();
							}
						} else {
							JOptionPane.showMessageDialog(null, "用户类型错误，请重新选择！");
						}
					} else {
						JOptionPane.showMessageDialog(null, "用户名或密码错误，请重新输入！");
						vcode.nextCode();
					}
				} else if (iscode == false) {
					JOptionPane.showMessageDialog(null, "验证码输入错误，请重新输入！");
					txt_code.setText("");
					vcode.nextCode();
				}

			}
		});

		// 设置‘重置’按钮作用
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginHelp.Loginclear(txt1, txt2, type, txt_code);
			}
		});

		// 设置‘注冊’按钮作用
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Register();
			}
		});

	}

	// main函数
	public static void main(String[] args) {
		new Login();
	}
}
