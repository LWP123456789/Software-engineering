package pe.teacher;

import pe.databases.DBHelp;
import pe.entity.Score;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class CourseAllStudent extends JFrame {

    private static final String IMAGE_ICON_PATH = "D:\\image\\��\\yahoo.png";

    public CourseAllStudent(Object name,Object id){
        super("ѡ��" + name + "������ѧ���ɼ���Ϣ");
        // ͼ������
        ImageIcon ig = new ImageIcon(IMAGE_ICON_PATH);
        Image im = ig.getImage();
        setIconImage(im);

        super.setVisible(true);
        super.setBounds(300, 170, 800, 600);
        super.setResizable(false);

        JPanel title = new JPanel();
        title.setPreferredSize(new Dimension(800, 70));
        title.setLayout(new FlowLayout(FlowLayout.CENTER));
        JLabel title_lbl = new JLabel(
                "<html><body><p align=\"center\">�ɼ�<br> </p></body></html>");
        title.add(title_lbl);
        title_lbl.setFont(new Font("����", Font.BOLD, 35));
        this.add(title);

        String []titles= {"ѧ��","����","�ɼ�"};

        //��ȡ����ѡ�޸ÿγ̵ĳɼ���Ϣ
        java.util.List<Score> allUser = DBHelp.getScore((String) id);

        //����һ����ά���飬���ڴ�ſγ���Ϣ
        String[][] users = new String[allUser.size()][3];
        for (int i = 0; i < allUser.size(); i++){
            users[i][0] = allUser.get(i).getId();
            users[i][1] = allUser.get(i).getName();
            users[i][2] = allUser.get(i).getScore();
        }

        JTable table = new JTable(users,titles);

        JScrollPane scrollPane = new JScrollPane(table);//��ű��
        scrollPane.setPreferredSize(new Dimension(800, 250));

        JSplitPane vSplitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
        vSplitPane.setDividerLocation(500);
        vSplitPane.setPreferredSize(new Dimension(800, 650));

        JButton b1 = new JButton("�޸�ѧ���ɼ�");
        b1.setFont(new Font("����", Font.BOLD, 18));
        b1.setContentAreaFilled(false);
        b1.setFocusPainted(false);

        JPanel p = new JPanel();
        p.add(b1);

        vSplitPane.setLeftComponent(scrollPane);
        vSplitPane.setRightComponent(p);

        this.add(vSplitPane);

        //�޸�ѧ����Ϣ����
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //��ȡѡ���е����� ����������γ̺�-1
                int selectedRow = table.getSelectedRow();
                Object studentId = table.getValueAt(selectedRow, 0);
                Object score = table.getValueAt(selectedRow, 2);
                int scoreTest = (int) score;

//                System.out.println(score);

                if (selectedRow == -1){
                    JOptionPane.showMessageDialog(null, "��δѡ��ѧ���ɼ�", "����", JOptionPane.ERROR_MESSAGE);
                } else {

                    int n = JOptionPane.showConfirmDialog(null, "ȷ���޸���?", "ȷ���޸Ĳ���", JOptionPane.YES_NO_OPTION);

                    if (n == JOptionPane.YES_OPTION) {

                        if (scoreTest < 0 || scoreTest >100) {
                            JOptionPane.showMessageDialog(null, "�޸ĵĳɼ�ֵ�������0С��100", "success", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            DBHelp.updateScore(id,studentId,score);

                            List<Score> allUser2 = DBHelp.getScore((String) id);

                            //����һ����ά���飬���ڴ�ſγ���Ϣ
                            String[][] users2 = new String[allUser2.size()][3];
                            for (int i = 0; i < allUser2.size(); i++){
                                users2[i][0] = String.valueOf(allUser.get(i).getId());
                                users2[i][1] = allUser.get(i).getName();
                                users2[i][2] = allUser.get(i).getScore();
                            }

                            TableModel t = new DefaultTableModel(users2,titles);

                            table.setModel(t);

                            JOptionPane.showMessageDialog(null, "�޸ĳɹ�", "success", JOptionPane.INFORMATION_MESSAGE);
                        }
                    } else if (n == JOptionPane.NO_OPTION) {

                    }

                }

            }
        });

    }

}
