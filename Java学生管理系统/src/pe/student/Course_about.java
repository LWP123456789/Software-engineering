package pe.student;

import javax.swing.*;
import java.awt.*;

public class Course_about extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel test=new JLabel("�γ����");
	private JPanel p1 = new JPanel();
	private JPanel p2 = new JPanel();
	private JTextArea jTextArea = new JTextArea("���ݸ�רҵ����������ѧ�������е��ѡ�β�������ѡ�οα�ҳ������ӻ�ɾ������ѡ�λ���ѡ\n\n" +
			"1.����ѧ����һ�ֱ���ѡ��,�Ա���񴦲���ѧ���γ��������������ź͵�����ѧ��Դ����һ�ֲ�ѡ���߽����������ѡ��\n\n" +
			"2.��ѡ��ϵͳ�ڵ�һ�͵ڶ���ѡ�κ�,��Ҫ���涨����ɸѡ,ѧ����ÿһ��ѡ��ʱ��Ӧ����ѡ��ϵͳ��ѯ�Լ���ѡ���������ʱ������ѡ���γ�\n\n" +
			"3.ѧ���ɸ��ݡ��γ̱��ͽ�ѧ�ƻ��������š�ѡ��ѧ�ڿγ̡�ѡ��ǰӦ�鿴Ҫѡ�γ̵Ŀγ̼�飬ע�����޿γ̣�����ѡ����޶����ˡ�\n" +
			"ѡ��ʱӦע��Ҫѡ�γ̵Ŀγ̱�š��γ����ơ��γ�ѧ���Ƿ����ѧ�ƻ��е�һ��\n\n" +
			"4.��һ�����꼶�����β������ͬѧ,���ޱ��밲�����������꼶���С�������ͬһѧ��ѡ����������\n\n" +
			"5.Ϊ��ʹ������Ӿ��ͬѧ�������޵Ľ�ѧ��Դ�еõ�ѧϰ��Ӿ�Ļ��ᣬ���Ѿ�����Ӿ��ͬѧ��Ҫѡ��Ӿ�Σ���Ӿ��ֻ����δͨ����Ӿ���Ե�ͬѧ\n" +
			"ѡ��ͬʱ��ȡ���꼶ͬѧ���ȵ�ɸѡԭ��\n\n" +
			"6.����ȡ���˸�ѡ�ƶȣ�ÿλͬѧ�����ڵ�1~2���ڽ�Ӧѡ�Ŀγ�ȫ��ѡ����������ѡ�Σ����ܽ�ѧ��Դ��������Լ�����ܱ�֤��δѡ��Ŀγ���ѡ����\n" +
			"\n" +
			"7��ѧ��ѡ�α��뱾���ϻ����������ô�ѡ��\n" +
			"\n" +
			"8��ѡ�����������⣬���ڻ�������ʱ��ƾ����ѧ��֤��ѡ�λ�������������ѯ����ϵ�����\n" +
			"\n" +
			"9��ѡ��������ڵ�����ѡ�ν��������ȷ����ѧ�����˿α�ɴ�ѡ��ϵͳ�е�ѡ�β�ѯ���ڣ���ѯ�Լ���ѡ�ν�����Ͽ�ʱ�䡢�Ͽεص�ȡ�\n" +
			"\n" +
			"10���Կγ̱�š��γ����ơ�ѧ�ֵ������ʵģ�����ѯϵ����Ա��ѧԺ��ѧ���顣");

	public Course_about(){
		test.setFont(new Font("����",Font.BOLD,50));
		this.setLayout(new FlowLayout());

		p1.setBackground(Color.white);
		p1.add(test);
		p2.setBackground(Color.white);
		jTextArea.setFont(new Font("����",Font.BOLD,23));
		p2.add(jTextArea);
		this.add(p1);
		this.setVisible(true);
		this.setBackground(Color.white);
		this.add(p2);
	}
	
	public JPanel view(){
		return this;
	}
}
