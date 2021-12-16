package pe.student;

import javax.swing.*;
import java.awt.*;

public class Training_program extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel test1=new JLabel("计算机科学与技术培养方案");
	private JLabel test2 = new JLabel("大数据培养方案");
	private JPanel p1 = new JPanel();
	private JPanel p2 = new JPanel();
	private JTextArea text1 = new JTextArea("				2019级选课指导：\n" +
			"				必修课、集中性实践教学环节必须完成所有指定课程学分方可毕业；公共选修课总学分不少于8学分；专业选修课所修学分按以下选课课程组要求：方向选修课程：（方向选修课程至少需完成组I、组II其中一个方向所有限选课程）；任选课总学分不低于14学分，其中至少7学分从对应方向任选课程组中选课；其它学分可从其它方向限选课程组或任选课程组中选修。");
	private JTextArea text2 = new JTextArea("（1）培养目标\n" +
			"本专业培养德、智、体、美全面发展的大数据领域与行业应用交叉融合的复合型高级技术人才，具有\n" +
			"良好的科学素养和职业道德，掌握自然科学和人文社科基本知识，掌握计算机科学、数据科学及大数据技\n" +
			"术的基本知识、基本理论和基本技能，能够跟踪大数据领域的前沿技术，具备一定的大数据工程创新能力、\n" +
			"大数据分析与价值挖掘能力，能够从事应用驱动的大数据产品的设计、开发和生产。\n" +
			"（2）专业要求\n" +
			"本专业学生主要学习自然科学、人文社科、计算科学、数据科学等方面的基础理论和基本知识，接受\n" +
			"数据分析方面的基本训练，掌握软件开发实践能力、大数据分析项目的设计与部署能力，具备初步的创新\n" +
			"创业意识、竞争意识和团队精神。\n" +
			"毕业生应获得以下几方面的知识、能力和素质：\n" +
			"1）掌握基本的人文和社会科学知识，具有良好的人文社会科学素养、职业道德和心理素质；\n" +
			"2）掌握从事本专业工作所需的数学、自然科学知识以及一定的经济学知识；\n" +
			"3）掌握计算学科基础理论和专业知识，了解计算学科的核心概念、知识结构和典型方法；\n" +
			"4）掌握数据学科的基本理论和知识，熟悉数据抓取及清洗、数据的存储、数据库的架构和管理、数据\n" +
			"分析、数据挖掘、大数据项目设计、数据可视化等方面的方法和技术；\n" +
			"5）经过系统化的大数据项目训练，获得从事大数据项目的规划、部署、应用、开发、管理与维护工作\n" +
			"所需的专业能力；\n" +
			"6）具备综合运用所学知识、方法和技术，分析解决实际问题的能力，能够权衡多种设计方案并做出合\n" +
			"理选择，并使用适当的工具进行软件设计、开发等工作；\n" +
			"7）理解团队合作的重要性，能够充分融入团队工作，具备人际交往和沟通能力以及一定的组织管理能\n" +
			"力；\n" +
			"8）具备初步的外语应用能力，能阅读本专业的外文资料，具有一定的国际视野和跨文化交流能力；\n" +
			"9）掌握体育运动的一般知识和基本方法，形成良好的体育锻炼习惯。");

	public Training_program(){
		test1.setFont(new Font("宋体",Font.BOLD,30));
		test2.setFont(new Font("宋体",Font.BOLD,30));
		this.add(test1, BorderLayout.CENTER);
		this.setVisible(true);
		this.setBackground(Color.white);
		p1.add(text1);
		this.add(p1);
		this.add(test2, BorderLayout.CENTER);
		p2.add(text2);
		this.add(p2,BorderLayout.SOUTH);
	}
	
	public JPanel view(){
		return this;
	}
}
