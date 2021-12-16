package pe.admin;
/*
* 管理学生信息
* */
import pe.databases.DBHelp;
import pe.entity.Student;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class StudentPanel extends JFrame {

    private static final String IMAGE_ICON_PATH = "D:\\image\\软工\\yahoo.png";

    public StudentPanel(){
        super("管理学生信息");
        // 图标设置
        ImageIcon ig = new ImageIcon(IMAGE_ICON_PATH);
        Image im = ig.getImage();
        setIconImage(im);

        super.setVisible(true);
        super.setBounds(300, 170, 1254, 734);
        super.setResizable(false);

        JPanel title = new JPanel();
        title.setPreferredSize(new Dimension(1366, 70));
        title.setLayout(new FlowLayout(FlowLayout.CENTER));
        JLabel title_lbl = new JLabel(
                "<html><body><p align=\"center\">管理学生信息<br> </p></body></html>");
        title.add(title_lbl);
        title_lbl.setFont(new Font("宋体", Font.BOLD, 35));
        this.add(title);

        String []titles= {"学号","性别","所修课程数","班级","民族","系别","真实姓名","联系方式","住址","政治面貌"};

        //获取所有用户信息
        List<Student> allUser = DBHelp.getStudentInfo();

        //定义一个二维数组，用于存放课程信息
        String[][] users = new String[allUser.size()][11];
        for (int i = 0; i < allUser.size(); i++){
            users[i][0] = String.valueOf(allUser.get(i).getStu_id());
            users[i][1] = allUser.get(i).getStu_sex();
            users[i][2] = allUser.get(i).getStu_courseNumber();
            users[i][3] = allUser.get(i).getStu_class();
            users[i][4] = allUser.get(i).getStu_nation();
            users[i][5] = allUser.get(i).getStu_department();
            users[i][6] = allUser.get(i).getStu_realName();
            users[i][7] = allUser.get(i).getStu_tele();
            users[i][8] = allUser.get(i).getStu_address();
            users[i][9] = allUser.get(i).getStu_political_outlook();
        }

        JTable table = new JTable(users,titles);

        JScrollPane scrollPane = new JScrollPane(table);//存放表格
        scrollPane.setPreferredSize(new Dimension(1200, 250));

        JButton b1 = new JButton("删除");
        b1.setFont(new Font("宋体", Font.BOLD, 18));
        b1.setContentAreaFilled(false);
        b1.setFocusPainted(false);

        JPanel p = new JPanel();
        p.add(b1);

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
                Object username = table.getValueAt(selectedRow, 6);
//                System.out.println(username);

                if (selectedRow == -1){
                    JOptionPane.showMessageDialog(null, "你未选择学生信息", "警告", JOptionPane.ERROR_MESSAGE);
                } else {

                    int n = JOptionPane.showConfirmDialog(null, "确认删除吗?", "确认删除操作", JOptionPane.YES_NO_OPTION);

                    if (n == JOptionPane.YES_OPTION) {

                        DBHelp.deleteStudent(username);

                        //获取所有用户信息
                        List<Student> allUser2 = DBHelp.getStudentInfo();

                        //定义一个二维数组，用于存放课程信息
                        String[][] users2 = new String[allUser2.size()][10];
                        for (int i = 0; i < allUser2.size(); i++){
                            users2[i][0] = String.valueOf(allUser.get(i).getStu_id());
                            users2[i][1] = allUser.get(i).getStu_sex();
                            users2[i][2] = allUser.get(i).getStu_courseNumber();
                            users2[i][3] = allUser.get(i).getStu_class();
                            users2[i][4] = allUser.get(i).getStu_nation();
                            users2[i][5] = allUser.get(i).getStu_department();
                            users2[i][6] = allUser.get(i).getStu_realName();
                            users2[i][7] = allUser.get(i).getStu_tele();
                            users2[i][8] = allUser.get(i).getStu_address();
                            users2[i][9] = allUser.get(i).getStu_political_outlook();
                        }

                        TableModel t = new DefaultTableModel(users2,titles);

                        table.setModel(t);

                        JOptionPane.showMessageDialog(null, "删除成功", "success", JOptionPane.INFORMATION_MESSAGE);

                    } else if (n == JOptionPane.NO_OPTION) {

                    }
                }

            }
        });
    }

}
