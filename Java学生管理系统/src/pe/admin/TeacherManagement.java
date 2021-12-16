package pe.admin;
/*
* 管理教师信息
* */
import pe.databases.DBHelp;
import pe.entity.Teacher;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class TeacherManagement extends JFrame {

    private static final String IMAGE_ICON_PATH = "D:\\image\\软工\\yahoo.png";

    public TeacherManagement(){
        super("管理教师信息");
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
                "<html><body><p align=\"center\">管理教师信息<br> </p></body></html>");
        title.add(title_lbl);
        title_lbl.setFont(new Font("宋体", Font.BOLD, 35));
        this.add(title);

        String []titles= {"教师编号","姓名","性别","联系方式"};

        //获取所有用户信息
        List<Teacher> allUser = DBHelp.getTeacherInfo();

//        System.out.println(allUser.get(0).getUsername() + "  " + allUser.get(0).getPassword() + "  " + allUser.get(0).getEmail() + "  " + allUser.get(0).getIdentity());
        //定义一个二维数组，用于存放课程信息
        String[][] users = new String[allUser.size()][5];
        for (int i = 0; i < allUser.size(); i++){
            users[i][0] = String.valueOf(allUser.get(i).getId());
            users[i][1] = allUser.get(i).getName();
            users[i][2] = allUser.get(i).getSex();
            users[i][3] = allUser.get(i).getTele();
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
                Object username = table.getValueAt(selectedRow, 1);

                if (selectedRow == -1){
                    JOptionPane.showMessageDialog(null, "你未选择教师信息", "警告", JOptionPane.ERROR_MESSAGE);
                } else {

                    int n = JOptionPane.showConfirmDialog(null, "确认删除吗?", "确认删除操作", JOptionPane.YES_NO_OPTION);

                    if (n == JOptionPane.YES_OPTION) {

                        DBHelp.deleteTeacher(username);

                        //获取所有用户信息
                        List<Teacher> allUser2 = DBHelp.getTeacherInfo();

                        //定义一个二维数组，用于存放课程信息
                        String[][] users2 = new String[allUser2.size()][5];
                        for (int i = 0; i < allUser2.size(); i++){
                            users2[i][0] = String.valueOf(allUser2.get(i).getId());
                            users2[i][1] = allUser2.get(i).getName();
                            users2[i][2] = allUser2.get(i).getSex();
                            users2[i][3] = allUser2.get(i).getTele();
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
