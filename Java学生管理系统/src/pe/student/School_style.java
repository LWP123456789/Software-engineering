package pe.student;

import javax.swing.*;
import java.awt.*;

public class School_style extends JPanel{
	/**
	 * 
	 */
	private  JPanel p1 = new JPanel();
	private  JPanel p2 = new JPanel();
	private  JPanel p3 = new JPanel();


	private JLabel img1_1;//存放明伦校区
	private JLabel img1_2;//存放明伦校区
	private JLabel img2_1;//存放金明校区
	private JLabel img2_2;//存放金明校区
	private JLabel img3_1;//存放龙子湖校区
	private JLabel img3_2;//存放龙子湖校区
	private JLabel img3_3;//存放龙子湖校区

	private JLabel s1 = new JLabel("金明校区");
	private JLabel s2 = new JLabel("明伦校区");
	private JLabel s3 = new JLabel("龙子湖校区");

	private static final String IMAGE_PATH_1 = "D:\\Image\\软工\\金明1.jpg";
	private static final String IMAGE_PATH_2 = "D:\\Image\\软工\\金明2.jpg";
	private static final String IMAGE_PATH_3 = "D:\\Image\\软工\\明伦1.jpg";
	private static final String IMAGE_PATH_4 = "D:\\Image\\软工\\明伦2.jpg";
	private static final String IMAGE_PATH_5 = "D:\\Image\\软工\\龙子湖1.jpg";
	private static final String IMAGE_PATH_6 = "D:\\Image\\软工\\龙子湖2.jpg";
	private static final String IMAGE_PATH_7 = "D:\\Image\\软工\\龙子湖3.jpg";

	public School_style(){
		img1_1 = new JLabel(new ImageIcon(IMAGE_PATH_1));
		img1_2 = new JLabel(new ImageIcon(IMAGE_PATH_2));
		img2_1 = new JLabel(new ImageIcon(IMAGE_PATH_3));
		img2_2 = new JLabel(new ImageIcon(IMAGE_PATH_4));
		img3_1 = new JLabel(new ImageIcon(IMAGE_PATH_5));
		img3_2 = new JLabel(new ImageIcon(IMAGE_PATH_6));
		img3_3 = new JLabel(new ImageIcon(IMAGE_PATH_7));

		s1.setFont(new Font("宋体",Font.BOLD,30));
		s2.setFont(new Font("宋体",Font.BOLD,30));
		s3.setFont(new Font("宋体",Font.BOLD,30));

		this.setLayout(new GridLayout(3,1));

		p1.setLayout(new FlowLayout());
		p2.setLayout(new FlowLayout());
		p3.setLayout(new FlowLayout());

		p1.add(s1);
		p1.add(img1_1);
		p1.add(img1_2);

		p2.add(s2);
		p2.add(img2_1);
		p2.add(img2_2);

		p3.add(s3);
		p3.add(img3_1);
		p3.add(img3_2);
		p3.add(img3_3);

		this.add(p1);
		this.add(p2);
		this.add(p3);

	}
	
	public JPanel view(){
		return this;
	}
}
