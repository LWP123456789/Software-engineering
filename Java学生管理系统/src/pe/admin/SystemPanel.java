package pe.admin;
/*
* 管理用户信息
* */

import pe.databases.DBHelp;
import pe.entity.User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class SystemPanel extends JFrame {

    private static final String IMAGE_ICON_PATH = "D:\\image\\软工\\yahoo.png";

    public SystemPanel(){
        super("管理用户信息");
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
                "<html><body><p align=\"center\">管理用户信息<br> </p></body></html>");
        title.add(title_lbl);
        title_lbl.setFont(new Font("宋体", Font.BOLD, 35));
        this.add(title);

        String []titles= {"用户名","密码","邮箱","身份"};

        //获取所有用户信息
        List<User> allUser = DBHelp.getAllUser();

//        System.out.println(allUser.get(0).getUsername() + "  " + allUser.get(0).getPassword() + "  " + allUser.get(0).getEmail() + "  " + allUser.get(0).getIdentity());
        //定义一个二维数组，用于存放课程信息
        String[][] users = new String[allUser.size()][4];
        for (int i = 0; i < allUser.size(); i++){
            users[i][0] = allUser.get(i).getUsername();
            users[i][1] = allUser.get(i).getPassword();
            users[i][2] = allUser.get(i).getEmail();
            users[i][3] = allUser.get(i).getIdentity();
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
                Object username = table.getValueAt(selectedRow, 0);

                if (selectedRow == -1){
                    JOptionPane.showMessageDialog(null, "你未选择用户信息", "警告", JOptionPane.ERROR_MESSAGE);
                } else {

                    int n = JOptionPane.showConfirmDialog(null, "确认删除吗?", "确认删除操作", JOptionPane.YES_NO_OPTION);

                    if (n == JOptionPane.YES_OPTION) {

                        DBHelp.deleteUser(username);

                        JOptionPane.showMessageDialog(null, "删除成功", "success", JOptionPane.INFORMATION_MESSAGE);

                        table.validate();
                        table.updateUI();

                    } else if (n == JOptionPane.NO_OPTION) {

                    }
                }

            }
        });
    }

}
