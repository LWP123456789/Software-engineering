package pe.student;

import javax.swing.*;
import java.awt.*;

public class Professional_guidance extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel test1=new JLabel("�������ѧ�뼼��ָ��");
	private JPanel p1 = new JPanel();
	private JTextArea text1 = new JTextArea("				2019��ѡ��ָ����\n" +
			"				���޿Ρ�������ʵ����ѧ���ڱ����������ָ���γ�ѧ�ַ��ɱ�ҵ������ѡ�޿���ѧ�ֲ�����8ѧ�֣�רҵѡ�޿�����ѧ�ְ�����ѡ�ογ���Ҫ�󣺷���ѡ�޿γ̣�������ѡ�޿γ������������I����II����һ������������ѡ�γ̣�����ѡ����ѧ�ֲ�����14ѧ�֣���������7ѧ�ִӶ�Ӧ������ѡ�γ�����ѡ�Σ�����ѧ�ֿɴ�����������ѡ�γ������ѡ�γ�����ѡ�ޡ�");

	public Professional_guidance(){
		test1.setFont(new Font("����",Font.BOLD,30));
		this.add(test1, BorderLayout.CENTER);
		this.setVisible(true);
		this.setBackground(Color.white);
		p1.add(text1);
		this.add(p1);
	}
	
	public JPanel view(){
		return this;
	}
}
