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
	private JLabel test=new JLabel("�ٱ�����,�����Ҳ�������Ҫ��������Ϣ");
	private JPanel p = new JPanel();
	private JPanel p2 = new JPanel();
	private JTextArea t = new JTextArea(40,60);
	private JButton b = new JButton("�ٱ�");

	public Report_management(){
		test.setFont(new Font("����",Font.BOLD,30));
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
				JOptionPane.showMessageDialog(null, "�ٱ��������ύ����ȴ�����", "����", JOptionPane.INFORMATION_MESSAGE);
			}
		});
	}
	
	public JPanel view(){
		return this;
	}
}

