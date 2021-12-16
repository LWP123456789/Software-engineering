package pe.guiset;

import java.awt.Choice;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import pe.databases.RegisterFunction;
import pe.function.RegisterHelp;

@SuppressWarnings("serial")
public class Register extends JFrame {
	private static final String IMAGE_ICON_PATH = "D:\\image\\软工\\yahoo.png";
	private static final String BACKGROUND_PATH = "D:\\Image\\background\\gray.jpg";
	private Image im;
	private Font font = new Font("宋体", Font.BOLD, 18);
	private JPanel big_panel = new JPanel();
	private JPanel left_panel = new JPanel();
	private JPanel right_panel = new JPanel();

	// 正文左侧的组件
	private JPanel left_p1 = new JPanel();
	private JPanel left_p2 = new JPanel();
	private JPanel left_p3 = new JPanel();
	private JPanel left_p5 = new JPanel();
	private JPanel left_p6 = new JPanel();
	private JPanel left_p12 = new JPanel();
	private JPanel left_p13 = new JPanel();
	private JLabel choice_type = new JLabel("请选择注册类型：");
	private Choice type = new Choice();
	private JLabel kong_ge = new JLabel(" ");
	private JLabel kong_ge1 = new JLabel(" ");
	private JLabel in_tip = new JLabel("请填写您的基本资料(以下项目不能为空)");
	private JLabel user_name = new JLabel("用 户 名：");
	private JTextField txt_username = new JTextField(15);
	private JButton check_username_btn = new JButton("是否占用");
//	private JLabel set_tip = new JLabel("请填写安全设置:(安全设置用于验证账号和找回密码)");
	private JLabel password = new JLabel("密   码：");
	private JTextField txt_password = new JPasswordField(25);
	private JLabel check_password = new JLabel("确认密码：");
	private JTextField txt_check_password = new JPasswordField(25);

	private JLabel email = new JLabel("电子邮箱：");
	private JTextField txt_email = new JTextField(25);
	private JButton isUse_btn = new JButton("电子邮件是否被占用");
	private JLabel email_checktip_lbl = new JLabel("");

	// 正文右侧的组件
	private Font font1 = new Font("宋体", Font.BOLD, 15);
	private JLabel rig_kong_ge = new JLabel(" ");
	private JLabel rig_kong_ge1 = new JLabel(" ");
	private JLabel rig_kong_ge2 = new JLabel(" ");
	private JLabel user_find = new JLabel("模糊查询");
	private JLabel tip_password = new JLabel(
			"<html><body><p align=\"center\">密码长度为6~20位，区分字母大小写。登录密码可以由字母，数字，特殊<br/>字符组成。</p></body></html>");
	private JLabel tip_password2 = new JLabel(
			"<html><body><p align=\"center\">请确认密码，两次输入的密码应一致</p></body></html>");

	private JLabel tip_email = new JLabel("<html><body><p align=\"center\">您的注册电子邮件。注册成功后，将不能修改。</p></body></html>");

	// 底部组件
	private JPanel last_panel = new JPanel();
	private JButton save_btn = new JButton("保存");
	private JButton reset_btn = new JButton("重置");

	public Register() {
		super("注册");

		// 图标设置
		ImageIcon ig = new ImageIcon(IMAGE_ICON_PATH);
		im = ig.getImage();
		setIconImage(im);

		// 背景图片设置
		ImageIcon background = new ImageIcon(BACKGROUND_PATH);
		JLabel label = new JLabel(background);
		label.setBounds(0, 0, background.getIconWidth(), background.getIconHeight());
		super.getLayeredPane().add(label, new Integer(Integer.MIN_VALUE));
		JPanel jp = (JPanel) super.getContentPane();
		jp.setOpaque(false);

		// 组件及布局设置
		super.setVisible(true);
		super.setResizable(false);
		super.setBounds(56, 0, 1254, 734);
		super.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});

		kong_ge.setFont(font);
		kong_ge1.setFont(font);
		// 左侧设置字体
		save_btn.setFont(font);
		reset_btn.setFont(font);
		choice_type.setFont(font);
		type.setFont(font);
		in_tip.setFont(font);
		user_name.setFont(font);
		txt_username.setFont(font);
//		set_tip.setFont(font);
		check_username_btn.setFont(font);
		password.setFont(font);
		txt_password.setFont(font);
		check_password.setFont(font);
		txt_check_password.setFont(font);

		email.setFont(font);
		txt_email.setFont(font);
		isUse_btn.setFont(font);
		email_checktip_lbl.setFont(font);

		rig_kong_ge.setFont(font);
		rig_kong_ge1.setFont(font);
		rig_kong_ge2.setFont(font);

		// 右侧设置字体
		user_find.setFont(font);
		tip_password.setFont(font1);
		tip_password.setForeground(Color.black);
		tip_password2.setFont(font1);
		tip_password2.setForeground(Color.black);

		tip_email.setFont(font1);
		tip_email.setForeground(Color.black);

		// 下层按钮
		last_panel.setLayout(new FlowLayout(FlowLayout.CENTER));
		last_panel.setOpaque(false);
		last_panel.add(save_btn);
		last_panel.add(reset_btn);

		// 设置垂直盒式布局管理器(将上下层面板放在一起)
		Box box = Box.createVerticalBox();
		box.setOpaque(false);
		box.add(big_panel);
		box.add(last_panel);
		super.add(box);

		// 上层面板
		big_panel.setLayout(new GridLayout(1, 2));
		big_panel.setOpaque(false);
		big_panel.add(left_panel);
		big_panel.add(right_panel);

		// 上层面板中的左右面板
		left_panel.setLayout(new GridLayout(8, 1));
		left_panel.setOpaque(false);
		right_panel.setLayout(new GridLayout(8, 1));
		right_panel.setOpaque(false);

		/*
		 * 
		 * 左侧内容
		 */

		// 第一行
		left_p1.setLayout(new FlowLayout(FlowLayout.CENTER));
		left_p1.setOpaque(false);
		type.add("教师");
		type.add("学生");
		left_p1.add(choice_type);
		left_p1.add(type);
		left_panel.add(left_p1);

		// 空
		left_panel.add(kong_ge);

		// 第二行
		left_p2.setLayout(new FlowLayout(FlowLayout.CENTER));
		left_p2.setOpaque(false);
		left_p2.add(in_tip);
		left_panel.add(left_p2);

		// 第三行
		left_p3.setLayout(new FlowLayout(FlowLayout.CENTER));
		left_p3.setOpaque(false);
		left_p3.add(user_name);
		left_p3.add(txt_username);
		left_p3.add(check_username_btn);
		left_panel.add(left_p3);

		// 第五行
		left_p5.setLayout(new FlowLayout(FlowLayout.CENTER));
		left_p5.setOpaque(false);
		left_p5.add(password);
		left_p5.add(txt_password);
		left_panel.add(left_p5);

		// 第六行
		left_p6.setLayout(new FlowLayout(FlowLayout.CENTER));
		left_p6.setOpaque(false);
		left_p6.add(check_password);
		left_p6.add(txt_check_password);
		left_panel.add(left_p6);


		// 第十二行
		left_p12.setLayout(new FlowLayout(FlowLayout.CENTER));
		left_p12.setOpaque(false);
		left_p12.add(email);
		left_p12.add(txt_email);
		left_panel.add(left_p12);

		// 第十三行
		left_p13.setLayout(new FlowLayout(FlowLayout.CENTER));
		left_p13.setOpaque(false);
		left_p13.add(isUse_btn);
		left_p13.add(email_checktip_lbl);
		left_panel.add(left_p13);

		/*
		 * 
		 * 右侧内容
		 */
		// 空
		right_panel.add(rig_kong_ge);
		right_panel.add(rig_kong_ge1);
		right_panel.add(rig_kong_ge2);

		// 第一行
		right_panel.add(user_find);

		// 第二行
		right_panel.add(tip_password);

		// 第三行
		right_panel.add(tip_password2);

		// 第九行
		right_panel.add(tip_email);

		// 设置按钮透明
//		save_btn.setContentAreaFilled(false);
//		reset_btn.setContentAreaFilled(false);
		check_username_btn.setContentAreaFilled(false);
		isUse_btn.setContentAreaFilled(false);
		/* icon_path_btn.setContentAreaFilled(false); */

		// 去除按钮的焦点框
		save_btn.setFocusPainted(false);
		reset_btn.setFocusPainted(false);
		check_username_btn.setFocusPainted(false);
		isUse_btn.setFocusPainted(false);
//		icon_path_btn.setFocusPainted(false);

		// “是否占用”按钮作用
		check_username_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegisterHelp.isUsed(txt_username, user_find);
			}
		});

		// "电子邮件是否被占用"按钮的作用
		isUse_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegisterHelp.usedEmail(txt_email, email_checktip_lbl);
			}
		});

		// "重置"按钮的作用
		reset_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegisterHelp.RegisterReset(type, txt_username, txt_password,
						/*
						 * txt_check_password, txt_password_tip, txt_password_tip_ok, txt_code_safe,
						 * txt_code_safe_ok, txt_icon_path,
						 */ txt_email, user_find, email_checktip_lbl);
			}
		});

		save_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (RegisterHelp.isOK_forPasswordCode(txt_password, txt_check_password) == true) {

					if (RegisterFunction.isUsernameUsed(txt_username.getText()) == 0
							&& RegisterFunction.isEmailUsed(txt_email.getText()) == 0) {

						int test = RegisterFunction.insertDatabase(type, txt_username, txt_password, txt_email);

						if (test == 1) {
							JOptionPane.showMessageDialog(null, "保存成功！");
						} else {
							JOptionPane.showMessageDialog(null, "保存失败！");
						}

					} else {
						JOptionPane.showMessageDialog(null, "该用户名或者电子邮箱已被占用！请检查！");
					}

				} else if (RegisterHelp.isOK_forPasswordCode(txt_password,
						txt_check_password/* , txt_code_safe, txt_code_safe_ok */) == false) {
					JOptionPane.showMessageDialog(null, "两次输入的密码不一致，请检查！");
				}

			}
		});
	}
}
