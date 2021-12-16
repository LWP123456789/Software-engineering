package pe.admin;
/*
* �����ʦ��Ϣ
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

    private static final String IMAGE_ICON_PATH = "D:\\image\\��\\yahoo.png";

    public TeacherManagement(){
        super("�����ʦ��Ϣ");
        // ͼ������
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
                "<html><body><p align=\"center\">�����ʦ��Ϣ<br> </p></body></html>");
        title.add(title_lbl);
        title_lbl.setFont(new Font("����", Font.BOLD, 35));
        this.add(title);

        String []titles= {"��ʦ���","����","�Ա�","��ϵ��ʽ"};

        //��ȡ�����û���Ϣ
        List<Teacher> allUser = DBHelp.getTeacherInfo();

//        System.out.println(allUser.get(0).getUsername() + "  " + allUser.get(0).getPassword() + "  " + allUser.get(0).getEmail() + "  " + allUser.get(0).getIdentity());
        //����һ����ά���飬���ڴ�ſγ���Ϣ
        String[][] users = new String[allUser.size()][5];
        for (int i = 0; i < allUser.size(); i++){
            users[i][0] = String.valueOf(allUser.get(i).getId());
            users[i][1] = allUser.get(i).getName();
            users[i][2] = allUser.get(i).getSex();
            users[i][3] = allUser.get(i).getTele();
        }

        JTable table = new JTable(users,titles);

        JScrollPane scrollPane = new JScrollPane(table);//��ű��
        scrollPane.setPreferredSize(new Dimension(1200, 250));

        JButton b1 = new JButton("ɾ��");
        b1.setFont(new Font("����", Font.BOLD, 18));
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

        //ɾ���û���Ϣ
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //��ȡѡ���е����� ����������γ̺�-1
                int selectedRow = table.getSelectedRow();
                Object username = table.getValueAt(selectedRow, 1);

                if (selectedRow == -1){
                    JOptionPane.showMessageDialog(null, "��δѡ���ʦ��Ϣ", "����", JOptionPane.ERROR_MESSAGE);
                } else {

                    int n = JOptionPane.showConfirmDialog(null, "ȷ��ɾ����?", "ȷ��ɾ������", JOptionPane.YES_NO_OPTION);

                    if (n == JOptionPane.YES_OPTION) {

                        DBHelp.deleteTeacher(username);

                        //��ȡ�����û���Ϣ
                        List<Teacher> allUser2 = DBHelp.getTeacherInfo();

                        //����һ����ά���飬���ڴ�ſγ���Ϣ
                        String[][] users2 = new String[allUser2.size()][5];
                        for (int i = 0; i < allUser2.size(); i++){
                            users2[i][0] = String.valueOf(allUser2.get(i).getId());
                            users2[i][1] = allUser2.get(i).getName();
                            users2[i][2] = allUser2.get(i).getSex();
                            users2[i][3] = allUser2.get(i).getTele();
                        }

                        TableModel t = new DefaultTableModel(users2,titles);

                        table.setModel(t);

                        JOptionPane.showMessageDialog(null, "ɾ���ɹ�", "success", JOptionPane.INFORMATION_MESSAGE);

                    } else if (n == JOptionPane.NO_OPTION) {

                    }
                }

            }
        });
    }

}
