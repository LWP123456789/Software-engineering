package pe.student;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Report_management extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel test=new JLabel("举报反馈,请在右侧输入你要反馈的消息");
	private JPanel p = new JPanel();
	private JPanel p2 = new JPanel();
	private JTextArea t = new JTextArea(40,60);
	private JButton b = new JButton("举报");

	public Report_management(){
		test.setFont(new Font("宋体",Font.BOLD,30));
		this.add(test, BorderLayout.CENTER);
		this.setVisible(true);
		this.setBackground(Color.white);
		t.setSize(600,300);
		p.add(t);
		this.add(p,BorderLayout.SOUTH);
		p2.add(b);
		this.add(p2);

		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "举报反馈已提交，请等待受理", "警告", JOptionPane.INFORMATION_MESSAGE);
			}
		});
	}
	
	public JPanel view(){
		return this;
	}
}

