package pe.admin;

import pe.databases.DBHelp;
import pe.entity.Course;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class SystemCourse extends JFrame {

    private static final String IMAGE_ICON_PATH = "D:\\image\\软工\\yahoo.png";

    public SystemCourse(){
        super("管理课程信息");
        // 图标设置
        ImageIcon ig = new ImageIcon(IMAGE_ICON_PATH);
        Image im = ig.getImage();
        setIconImage(im);

        super.setVisible(true);
        super.setBounds(300, 170, 1254, 734);

        JPanel title = new JPanel();
        title.setPreferredSize(new Dimension(1366, 70));
        title.setLayout(new FlowLayout(FlowLayout.CENTER));
        JLabel title_lbl = new JLabel(
                "<html><body><p align=\"center\">管理课程信息<br> </p></body></html>");
        title.add(title_lbl);
        title_lbl.setFont(new Font("宋体", Font.BOLD, 35));
        this.add(title);

        String []titles= {"课程号","课程名","任课教师","学分","课程时间"};

        //获取所有课程信息
        List<Course> allCourse = DBHelp.getAllCourse();

        //定义一个二维数组，用于存放课程信息
        String courses[][] = new String[allCourse.size()][5];
        for (int i = 0; i < allCourse.size(); i++){
            courses[i][0] = allCourse.get(i).getId();
            courses[i][1] = allCourse.get(i).getName();
            courses[i][2] = allCourse.get(i).getTeacher();
            courses[i][3] = allCourse.get(i).getCredit();
            courses[i][4] = allCourse.get(i).getTime();
        }

        JTable table = new JTable(courses,titles);

        JScrollPane scrollPane = new JScrollPane(table);//存放表格
        scrollPane.setPreferredSize(new Dimension(1200, 250));

        JButton b1 = new JButton("删除");
        b1.setFont(new Font("宋体", Font.BOLD, 18));
        b1.setContentAreaFilled(false);
        b1.setFocusPainted(false);

        JButton b2 = new JButton("添加课程");
        b1.setFont(new Font("宋体", Font.BOLD, 18));
        b1.setContentAreaFilled(false);
        b1.setFocusPainted(false);

        JPanel p = new JPanel();
        p.add(b1);
        p.add(b2);

        JSplitPane vSplitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
        vSplitPane.setDividerLocation(500);
        vSplitPane.setPreferredSize(new Dimension(1200, 650));

        vSplitPane.setLeftComponent(scrollPane);
        vSplitPane.setRightComponent(p);


        this.add(vSplitPane);

        //删除用户信息
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //获取选中行的数据 获得索引：课程号-1
                int selectedRow = table.getSelectedRow();
                Object courseId = table.getValueAt(selectedRow, 0);

                if (selectedRow == -1){
                    JOptionPane.showMessageDialog(null, "你未选择课程信息", "警告", JOptionPane.ERROR_MESSAGE);
                } else {

                    int n = JOptionPane.showConfirmDialog(null, "确认删除吗?", "确认删除操作", JOptionPane.YES_NO_OPTION);

                    if (n == JOptionPane.YES_OPTION) {

                        DBHelp.deleteCourse(courseId);

                        JOptionPane.showMessageDialog(null, "删除成功", "success", JOptionPane.INFORMATION_MESSAGE);

                        table.validate();
                        table.updateUI();

                    } else if (n == JOptionPane.NO_OPTION) {

                    }
                }

            }
        });

        //添加课程信息
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new AddCourse();
            }
        });
    }

}
