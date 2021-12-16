package pe.teacher;

import pe.databases.DBHelp;
import pe.entity.Course;
import pe.entity.Teacher;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class SeeCourse extends JPanel{

    private static final long serialVersionUID = 1L;

    public SeeCourse(){

        this.setLayout(new FlowLayout());

        //表格表头
        String []titles= {"课程号","课程名","任课教师","学分","课程时间"};
        
        //获得标识
        String username = Teacher.getUsername();
        //根据标识获得教师姓名
        String name = DBHelp.getRealName(username);

        //获取所有课程信息
        List<Course> allCourse = DBHelp.getTeacherCourse(name);

        //定义一个二维数组，用于存放课程信息
        String[][] courses = new String[allCourse.size()][5];
        for (int i = 0; i < allCourse.size(); i++){
            courses[i][0] = allCourse.get(i).getId();
            courses[i][1] = allCourse.get(i).getName();
            courses[i][2] = allCourse.get(i).getTeacher();
            courses[i][3] = allCourse.get(i).getCredit();
            courses[i][4] = allCourse.get(i).getTime();
        }

        this.setVisible(true);
        this.setBackground(Color.white);

        JTable table = new JTable(courses, titles);
        JScrollPane scrollPane = new JScrollPane(table);//存放表格
        scrollPane.setPreferredSize(new Dimension(1400, 850));


        this.add(scrollPane);

//		System.out.println(allCourse.get(0).getId() + "    " + allCourse.get(0).getName() + "    " + allCourse.get(0).getTeacher() + "    ");


    }

    public JPanel view(){
        return this;
    }

}
