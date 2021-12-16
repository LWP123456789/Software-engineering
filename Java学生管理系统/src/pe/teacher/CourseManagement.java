package pe.teacher;

import pe.databases.DBHelp;
import pe.entity.Course;
import pe.entity.Teacher;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class CourseManagement extends JPanel{

    private static final long serialVersionUID = 1L;

    public CourseManagement(){

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

        JLabel text = new JLabel("您的课程");
        text.setFont(new Font("宋体",Font.BOLD,18));

        JButton b1 = new JButton("申请添加课程");
        JButton b2 = new JButton("申请删除课程");
        JButton b3 = new JButton("查看课程信息");
        b1.setFont(new Font("宋体",Font.BOLD,18));
        b2.setFont(new Font("宋体",Font.BOLD,18));
        b3.setFont(new Font("宋体",Font.BOLD,18));

        JPanel panel = new JPanel();
        panel.add(text);
        panel.add(scrollPane);
        JPanel p = new JPanel();

        p.add(b1);
        p.add(b2);
        p.add(b3);

        this.add(panel);
        this.add(p);

        int selectedRow = table.getSelectedRow();

        // 申请添加课程
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (selectedRow == -1){
                    JOptionPane.showMessageDialog(null, "你未选择课程信息", "警告", JOptionPane.ERROR_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "请求已发送，等待系统管理员处理", "success", JOptionPane.INFORMATION_MESSAGE);
                }

            }
        });

        // 申请删除课程
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (selectedRow == -1){
                    JOptionPane.showMessageDialog(null, "你未选择课程信息", "警告", JOptionPane.ERROR_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "请求已发送，等待系统管理员处理", "success", JOptionPane.INFORMATION_MESSAGE);
                }

            }
        });

        // 查看课程信息
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //获取选中行的数据 获得索引：课程号-1
                int selectedRow = table.getSelectedRow();

                //弹出框 提醒用户是否确定添加
                if (selectedRow==-1){

                    JOptionPane.showMessageDialog(null, "你未选择课程信息", "警告", JOptionPane.ERROR_MESSAGE);

                } else {

                    //获得课程号
                    Object courseId = table.getValueAt(selectedRow, 0);
                    //获得课程名
                    Object courseName = table.getValueAt(selectedRow, 1);

                    //查看该课程下的所有学生信息
                    new CourseAllStudent(courseName,courseId);
                }
            }
        });



    }

    public JPanel view(){
        return this;
    }

}
