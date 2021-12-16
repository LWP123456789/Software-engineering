package pe.guiset;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Background_Navigation_tree {
	private static final String IMAGE_ICON_PATH_1 = "D:\\Image\\软工\\首页.png";
	private static final String IMAGE_ICON_PATH_2 = "D:\\Image\\软工\\选择.png";
	private static final String IMAGE_ICON_PATH_3 = "D:\\Image\\软工\\结果.png";
	private static final String IMAGE_ICON_PATH_4 = "D:\\Image\\软工\\日程安排.png";
	private static final String IMAGE_ICON_PATH_5 = "D:\\Image\\软工\\方案.png";
	private static final String IMAGE_ICON_PATH_6 = "D:\\Image\\软工\\个人信息.png";

	private static final String IMAGE_ICON_PATH_2_1 = "D:\\Image\\软工\\选课.png";
	private static final String IMAGE_ICON_PATH_2_2 = "D:\\Image\\软工\\所有课程.png";
	private static final String IMAGE_ICON_PATH_2_3 = "D:\\Image\\软工\\相关.png";
	private static final String IMAGE_ICON_PATH_3_1 = "D:\\Image\\软工\\选课结果.png";
	private static final String IMAGE_ICON_PATH_3_2 = "D:\\Image\\软工\\重新选课.png";
	private static final String IMAGE_ICON_PATH_4_1 = "D:\\Image\\软工\\年度安排.png";
	private static final String IMAGE_ICON_PATH_4_2 = "D:\\Image\\软工\\专业指导.png";
	private static final String IMAGE_ICON_PATH_5_1 = "D:\\Image\\软工\\公告.png";
	private static final String IMAGE_ICON_PATH_5_2 = "D:\\Image\\软工\\举报.png";
	private static final String IMAGE_ICON_PATH_5_3 = "D:\\Image\\软工\\风采1.png";
	private static final String IMAGE_ICON_PATH_5_4 = "D:\\Image\\软工\\培养方案.png";
	private static final String IMAGE_ICON_PATH_6_1 = "D:\\Image\\软工\\账户信息.png";

	public JPanel pNorth, pSouth, subMenuContainer, left;
	public JButton[] btn2, btn3, btn4, btn5, btn6;
	public JButton item1;
	private JButton item2, item3, item4, item5, item6;
	private Font font = new Font("宋体", Font.BOLD, 28);
	private Font font2 = new Font("楷体", Font.BOLD, 23);

	// 根据按钮组设置布局
	public static void setButtonPanelLayout(JPanel panel, JButton[] btn) {
		panel.setLayout(new GridLayout(btn.length, 1));
	}

	public Background_Navigation_tree() {

		Icon icon1 = new ImageIcon(IMAGE_ICON_PATH_1);
		Icon icon2 = new ImageIcon(IMAGE_ICON_PATH_2);
		Icon icon3 = new ImageIcon(IMAGE_ICON_PATH_3);
		Icon icon4 = new ImageIcon(IMAGE_ICON_PATH_4);
		Icon icon5 = new ImageIcon(IMAGE_ICON_PATH_5);
		Icon icon6 = new ImageIcon(IMAGE_ICON_PATH_6);

		Icon icon2_1 = new ImageIcon(IMAGE_ICON_PATH_2_1);
		Icon icon2_2 = new ImageIcon(IMAGE_ICON_PATH_2_2);
		Icon icon2_3 = new ImageIcon(IMAGE_ICON_PATH_2_3);
		Icon icon3_1 = new ImageIcon(IMAGE_ICON_PATH_3_1);
		Icon icon3_2 = new ImageIcon(IMAGE_ICON_PATH_3_2);
		Icon icon4_1 = new ImageIcon(IMAGE_ICON_PATH_4_1);
		Icon icon4_2 = new ImageIcon(IMAGE_ICON_PATH_4_2);
		Icon icon5_1 = new ImageIcon(IMAGE_ICON_PATH_5_1);
		Icon icon5_2 = new ImageIcon(IMAGE_ICON_PATH_5_2);
		Icon icon5_3 = new ImageIcon(IMAGE_ICON_PATH_5_3);
		Icon icon5_4 = new ImageIcon(IMAGE_ICON_PATH_5_4);
		Icon icon6_1 = new ImageIcon(IMAGE_ICON_PATH_6_1);

		left = new JPanel();
		// {
		// protected void paintComponent(Graphics g){
		// ImageIcon icon=new ImageIcon(BACKGROUND_PATH);
		// Image img=icon.getImage();
		// g.drawImage(img, 0, 0, icon.getIconWidth(), icon.getIconHeight(),
		// icon.getImageObserver());
		// }
		// };
		left.setBackground(new Color(212, 242, 231));
		// left.setBackground(Color.WHITE);

		// 背景

		pNorth = new JPanel();
		pNorth.setLayout(new GridLayout(6, 1));
		pNorth.setOpaque(false);

		pSouth = new JPanel();
		pSouth.setOpaque(false);
		subMenuContainer = new JPanel();
		subMenuContainer.setOpaque(false);

		// 定义主按钮
		item1 = new JButton("首页");
		item2 = new JButton("选课操作");
		item3 = new JButton("选课结果");
		item4 = new JButton("教学安排");
		item5 = new JButton("学校相关");
		item6 = new JButton("个人信息");

		// 优先设置按钮大小
		item1.setPreferredSize(new Dimension(250, 70));
		item2.setPreferredSize(new Dimension(250, 70));
		item3.setPreferredSize(new Dimension(250, 70));
		item4.setPreferredSize(new Dimension(250, 70));
		item5.setPreferredSize(new Dimension(250, 70));
		item6.setPreferredSize(new Dimension(250, 70));

		// 去除按钮的焦点框
		item1.setFocusPainted(false);
		item2.setFocusPainted(false);
		item3.setFocusPainted(false);
		item4.setFocusPainted(false);
		item5.setFocusPainted(false);
		item6.setFocusPainted(false);

		// //去除按钮边框
		// item1.setBorderPainted(false);item2.setBorderPainted(false);
		// item3.setBorderPainted(false);item4.setBorderPainted(false);
		// item5.setBorderPainted(false);item6.setBorderPainted(false);

		// 设置按钮图标
		item1.setIcon(icon1);
		item2.setIcon(icon2);
		item3.setIcon(icon3);
		item4.setIcon(icon4);
		item5.setIcon(icon5);
		item6.setIcon(icon6);

		// 设置按钮的字体及大小
		item1.setFont(font);
		item2.setFont(font);
		item3.setFont(font);
		item4.setFont(font);
		item5.setFont(font);
		item6.setFont(font);

		// 设置为透明
		item1.setContentAreaFilled(false);
		item2.setContentAreaFilled(false);
		item3.setContentAreaFilled(false);
		item4.setContentAreaFilled(false);
		item5.setContentAreaFilled(false);
		item6.setContentAreaFilled(false);

		// 添加按钮
		pNorth.add(item1);
		pNorth.add(item2);
		pNorth.add(item3);
		pNorth.add(item4);
		pNorth.add(item5);
		pNorth.add(item6);

		/*
		 * 设置子按钮
		 */

		btn2 = new JButton[3];
		btn2[0] = new JButton("选课");
		btn2[1] = new JButton("所有课程");
		btn2[2] = new JButton("课程相关");
		for (int i = 0; i < btn2.length; i++) {
			btn2[i].setBackground(new Color(212, 242, 231)); // 设置按钮颜色
			btn2[i].setPreferredSize(new Dimension(200, 30));// 设置大小
			btn2[i].setFont(font2);// 设置字体大小
			btn2[i].setContentAreaFilled(false);// 设置为透明
			btn2[i].setBorderPainted(false);
		}

		btn3 = new JButton[2];
		btn3[0] = new JButton("正选结果");
		btn3[1] = new JButton("重新选课");
		for (int i = 0; i < btn3.length; i++) {
			btn3[i].setBackground(new Color(212, 242, 231)); // 设置按钮颜色
			btn3[i].setPreferredSize(new Dimension(200, 30));// 设置大小
			btn3[i].setFont(font2);// 设置字体大小
			btn3[i].setContentAreaFilled(false);// 设置为透明
			btn3[i].setBorderPainted(false);
		}

		btn4 = new JButton[2];
		btn4[0] = new JButton("年度安排");
		btn4[1] = new JButton("专业指导");
		for (int i = 0; i < btn4.length; i++) {
			btn4[i].setBackground(new Color(212, 242, 231)); // 设置按钮颜色
			btn4[i].setPreferredSize(new Dimension(200, 30));// 设置大小
			btn4[i].setFont(font2);// 设置字体大小
			btn4[i].setContentAreaFilled(false);// 设置为透明
			btn4[i].setBorderPainted(false);
		}

		btn5 = new JButton[4];
		btn5[0] = new JButton("学校公告");
		btn5[1] = new JButton("举报管理");
		btn5[2] = new JButton("学校风采");
		btn5[3] = new JButton("培养方案");
		for (int i = 0; i < btn5.length; i++) {
			btn5[i].setBackground(new Color(212, 242, 231)); // 设置按钮颜色
			btn5[i].setPreferredSize(new Dimension(200, 30));// 设置大小
			btn5[i].setFont(font2);// 设置字体大小
			btn5[i].setContentAreaFilled(false);// 设置为透明
			btn5[i].setBorderPainted(false);
		}

		btn6 = new JButton[1];
		btn6[0] = new JButton("账户信息");
		for (int i = 0; i < btn6.length; i++) {
			btn6[i].setBackground(new Color(212, 242, 231)); // 设置按钮颜色
			btn6[i].setPreferredSize(new Dimension(200, 30));// 设置大小
			btn6[i].setFont(font2);// 设置字体大小
			btn6[i].setContentAreaFilled(false);// 设置为透明
			btn6[i].setBorderPainted(false);
		}

		// 设置子按钮图标

		btn2[0].setIcon(icon2_1);
		btn2[1].setIcon(icon2_2);
		btn2[2].setIcon(icon2_3);
		btn3[0].setIcon(icon3_1);
		btn3[1].setIcon(icon3_2);
		btn4[0].setIcon(icon4_1);
		btn4[1].setIcon(icon4_2);
		btn5[0].setIcon(icon5_1);
		btn5[1].setIcon(icon5_2);
		btn5[2].setIcon(icon5_3);
		btn5[3].setIcon(icon5_4);
		btn6[0].setIcon(icon6_1);

		left.setLayout(new BorderLayout());

		left.add(pNorth, BorderLayout.NORTH);
		left.add(subMenuContainer, BorderLayout.CENTER);
		left.add(pSouth, BorderLayout.SOUTH);

		// 适配器添加并重写方法

		item1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				/*
				 * 
				 * 调用“首页”的类
				 */
				pSouth.removeAll();
				pNorth.setLayout(new GridLayout(6, 1));
				setButtonPanelLayout(subMenuContainer, btn5);
				pNorth.add(item1);
				pNorth.add(item2);
				pNorth.add(item3);
				pNorth.add(item4);
				pNorth.add(item5);
				pNorth.add(item6);

				for (int i = 0; i < btn2.length; i++) {
					subMenuContainer.remove(btn2[i]);
				}
				for (int i = 0; i < btn3.length; i++) {
					subMenuContainer.remove(btn3[i]);
				}
				for (int i = 0; i < btn4.length; i++) {
					subMenuContainer.remove(btn4[i]);
				}
				for (int i = 0; i < btn5.length; i++) {
					subMenuContainer.remove(btn5[i]);
				}
				for (int i = 0; i < btn6.length; i++) {
					subMenuContainer.remove(btn6[i]);
				}
				left.validate();
				left.repaint();
//				System.out.println("123");
			}
		});

		item2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				pSouth.removeAll();
				pNorth.setLayout(new GridLayout(2, 1));
				pSouth.setLayout(new GridLayout(4, 1));
				setButtonPanelLayout(subMenuContainer, btn5);
				pNorth.add(item1);
				pNorth.add(item2);
				pSouth.add(item3);
				pSouth.add(item4);
				pSouth.add(item5);
				pSouth.add(item6);

				for (int i = 0; i < btn2.length; i++) {
					subMenuContainer.add(btn2[i]);
				}
				for (int i = 0; i < btn3.length; i++) {
					subMenuContainer.remove(btn3[i]);
				}
				for (int i = 0; i < btn4.length; i++) {
					subMenuContainer.remove(btn4[i]);
				}
				for (int i = 0; i < btn5.length; i++) {
					subMenuContainer.remove(btn5[i]);
				}
				for (int i = 0; i < btn6.length; i++) {
					subMenuContainer.remove(btn6[i]);
				}
				left.validate();
				left.repaint();
			}
		});

		item3.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				pSouth.removeAll();
				pNorth.setLayout(new GridLayout(3, 1));
				pSouth.setLayout(new GridLayout(3, 1));
				setButtonPanelLayout(subMenuContainer, btn5);
				pNorth.add(item1);
				pNorth.add(item2);
				pNorth.add(item3);
				pSouth.add(item4);
				pSouth.add(item5);
				pSouth.add(item6);

				for (int i = 0; i < btn2.length; i++) {
					subMenuContainer.remove(btn2[i]);
				}
				for (int i = 0; i < btn3.length; i++) {
					subMenuContainer.add(btn3[i]);
				}
				for (int i = 0; i < btn4.length; i++) {
					subMenuContainer.remove(btn4[i]);
				}
				for (int i = 0; i < btn5.length; i++) {
					subMenuContainer.remove(btn5[i]);
				}
				for (int i = 0; i < btn6.length; i++) {
					subMenuContainer.remove(btn6[i]);
				}
				left.validate();
				left.repaint();

			}
		});

		item4.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				pSouth.removeAll();
				pNorth.setLayout(new GridLayout(4, 1));
				pSouth.setLayout(new GridLayout(2, 1));
				setButtonPanelLayout(subMenuContainer, btn5);
				pNorth.add(item1);
				pNorth.add(item2);
				pNorth.add(item3);
				pNorth.add(item4);
				pSouth.add(item5);
				pSouth.add(item6);

				for (int i = 0; i < btn2.length; i++) {
					subMenuContainer.remove(btn2[i]);
				}
				for (int i = 0; i < btn3.length; i++) {
					subMenuContainer.remove(btn3[i]);
				}
				for (int i = 0; i < btn4.length; i++) {
					subMenuContainer.add(btn4[i]);
				}
				for (int i = 0; i < btn5.length; i++) {
					subMenuContainer.remove(btn5[i]);
				}
				for (int i = 0; i < btn6.length; i++) {
					subMenuContainer.remove(btn6[i]);
				}
				left.validate();
				left.repaint();
			}
		});

		item5.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				pSouth.removeAll();
				pNorth.setLayout(new GridLayout(5, 1));
				pSouth.setLayout(new GridLayout(1, 1));
				setButtonPanelLayout(subMenuContainer, btn5);
				pNorth.add(item1);
				pNorth.add(item2);
				pNorth.add(item3);
				pNorth.add(item4);
				pNorth.add(item5);
				pSouth.add(item6);

				for (int i = 0; i < btn2.length; i++) {
					subMenuContainer.remove(btn2[i]);
				}
				for (int i = 0; i < btn3.length; i++) {
					subMenuContainer.remove(btn3[i]);
				}
				for (int i = 0; i < btn4.length; i++) {
					subMenuContainer.remove(btn4[i]);
				}
				for (int i = 0; i < btn5.length; i++) {
					subMenuContainer.add(btn5[i]);
				}
				for (int i = 0; i < btn6.length; i++) {
					subMenuContainer.remove(btn6[i]);
				}
				left.validate();
				left.repaint();
			}
		});

		item6.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				pSouth.removeAll();
				pNorth.setLayout(new GridLayout(6, 1));
				setButtonPanelLayout(subMenuContainer, btn5);
				pNorth.add(item1);
				pNorth.add(item2);
				pNorth.add(item3);
				pNorth.add(item4);
				pNorth.add(item5);
				pNorth.add(item6);

				for (int i = 0; i < btn2.length; i++) {
					subMenuContainer.remove(btn2[i]);
				}
				for (int i = 0; i < btn3.length; i++) {
					subMenuContainer.remove(btn3[i]);
				}
				for (int i = 0; i < btn4.length; i++) {
					subMenuContainer.remove(btn4[i]);
				}
				for (int i = 0; i < btn5.length; i++) {
					subMenuContainer.remove(btn5[i]);
				}
				for (int i = 0; i < btn6.length; i++) {
					subMenuContainer.add(btn6[i]);
				}
				left.validate();
				left.repaint();
			}
		});

	}
}
