package pe.admin;

import pe.databases.DBHelp;
import pe.entity.Course;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class SystemCourse extends JFrame {

    private static final String IMAGE_ICON_PATH = "D:\\image\\��\\yahoo.png";

    public SystemCourse(){
        super("����γ���Ϣ");
        // ͼ������
        ImageIcon ig = new ImageIcon(IMAGE_ICON_PATH);
        Image im = ig.getImage();
        setIconImage(im);

        super.setVisible(true);
        super.setBounds(300, 170, 1254, 734);

        JPanel title = new JPanel();
        title.setPreferredSize(new Dimension(1366, 70));
        title.setLayout(new FlowLayout(FlowLayout.CENTER));
        JLabel title_lbl = new JLabel(
                "<html><body><p align=\"center\">����γ���Ϣ<br> </p></body></html>");
        title.add(title_lbl);
        title_lbl.setFont(new Font("����", Font.BOLD, 35));
        this.add(title);

        String []titles= {"�γ̺�","�γ���","�ον�ʦ","ѧ��","�γ�ʱ��"};

        //��ȡ���пγ���Ϣ
        List<Course> allCourse = DBHelp.getAllCourse();

        //����һ����ά���飬���ڴ�ſγ���Ϣ
        String courses[][] = new String[allCourse.size()][5];
        for (int i = 0; i < allCourse.size(); i++){
            courses[i][0] = allCourse.get(i).getId();
            courses[i][1] = allCourse.get(i).getName();
            courses[i][2] = allCourse.get(i).getTeacher();
            courses[i][3] = allCourse.get(i).getCredit();
            courses[i][4] = allCourse.get(i).getTime();
        }

        JTable table = new JTable(courses,titles);

        JScrollPane scrollPane = new JScrollPane(table);//��ű��
        scrollPane.setPreferredSize(new Dimension(1200, 250));

        JButton b1 = new JButton("ɾ��");
        b1.setFont(new Font("����", Font.BOLD, 18));
        b1.setContentAreaFilled(false);
        b1.setFocusPainted(false);

        JButton b2 = new JButton("��ӿγ�");
        b1.setFont(new Font("����", Font.BOLD, 18));
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

        //ɾ���û���Ϣ
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //��ȡѡ���е����� ����������γ̺�-1
                int selectedRow = table.getSelectedRow();
                Object courseId = table.getValueAt(selectedRow, 0);

                if (selectedRow == -1){
                    JOptionPane.showMessageDialog(null, "��δѡ��γ���Ϣ", "����", JOptionPane.ERROR_MESSAGE);
                } else {

                    int n = JOptionPane.showConfirmDialog(null, "ȷ��ɾ����?", "ȷ��ɾ������", JOptionPane.YES_NO_OPTION);

                    if (n == JOptionPane.YES_OPTION) {

                        DBHelp.deleteCourse(courseId);

                        JOptionPane.showMessageDialog(null, "ɾ���ɹ�", "success", JOptionPane.INFORMATION_MESSAGE);

                        table.validate();
                        table.updateUI();

                    } else if (n == JOptionPane.NO_OPTION) {

                    }
                }

            }
        });

        //��ӿγ���Ϣ
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new AddCourse();
            }
        });
    }

}
