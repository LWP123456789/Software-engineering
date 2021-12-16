package pe.guiset;

import javax.swing.*;
import java.awt.*;

public class Background_Navigation_tree_teacher {

    private static final String IMAGE_ICON_PATH_1 = "D:\\Image\\��\\��ҳ.png";
    private static final String IMAGE_ICON_PATH_2 = "D:\\Image\\��\\ѡ��.png";
    private static final String IMAGE_ICON_PATH_3 = "D:\\Image\\��\\���.png";
    private static final String IMAGE_ICON_PATH_4 = "D:\\Image\\��\\�ճ̰���.png";
    private static final String IMAGE_ICON_PATH_5 = "D:\\Image\\��\\����.png";
    private static final String IMAGE_ICON_PATH_6 = "D:\\Image\\��\\������Ϣ.png";

    public JPanel pNorth, pSouth, subMenuContainer, left;
    public JButton item1,item2, item3, item4, item5, item6;
    private Font font = new Font("����", Font.BOLD, 28);

    // ���ݰ�ť�����ò���
    public static void setButtonPanelLayout(JPanel panel, JButton[] btn) {
        panel.setLayout(new GridLayout(btn.length, 1));
    }

    public Background_Navigation_tree_teacher() {

        Icon icon1 = new ImageIcon(IMAGE_ICON_PATH_1);
        Icon icon2 = new ImageIcon(IMAGE_ICON_PATH_2);
        Icon icon3 = new ImageIcon(IMAGE_ICON_PATH_3);
        Icon icon4 = new ImageIcon(IMAGE_ICON_PATH_4);
        Icon icon5 = new ImageIcon(IMAGE_ICON_PATH_5);
        Icon icon6 = new ImageIcon(IMAGE_ICON_PATH_6);

        left = new JPanel();
        // {
        // protected void paintComponent(Graphics g){
        // ImageIcon icon=new ImageIcon(BACKGROUND_PATH);
        // Image img=icon.getImage();
        // g.drawImage(img, 0, 0, icon.getIconWidth(), icon.getIconHeight(),
        // icon.getImageObserver());
        // }
        // };
        left.setBackground(new Color(212, 242, 231));
        // left.setBackground(Color.WHITE);

        // ����

        pNorth = new JPanel();
        pNorth.setLayout(new GridLayout(6, 1));
        pNorth.setOpaque(false);

        pSouth = new JPanel();
        pSouth.setOpaque(false);
        subMenuContainer = new JPanel();
        subMenuContainer.setOpaque(false);

        // ��������ť
        item1 = new JButton("��ҳ");
        item2 = new JButton("���Ŀγ�");
        item3 = new JButton("�γ̹���");
        item4 = new JButton("��ѧ����");
        item5 = new JButton("ѧУ���");
        item6 = new JButton("������Ϣ");

        // �������ð�ť��С
       item1.setPreferredSize(new Dimension(250, 70));
        item2.setPreferredSize(new Dimension(250, 70));
        item3.setPreferredSize(new Dimension(250, 70));
        item4.setPreferredSize(new Dimension(250, 70));
        item5.setPreferredSize(new Dimension(250, 70));
        item6.setPreferredSize(new Dimension(250, 70));

        // ȥ����ť�Ľ����
        item1.setFocusPainted(false);
        item2.setFocusPainted(false);
        item3.setFocusPainted(false);
        item4.setFocusPainted(false);
        item5.setFocusPainted(false);
        item6.setFocusPainted(false);

        // ���ð�ťͼ��
        item1.setIcon(icon1);
        item2.setIcon(icon2);
        item3.setIcon(icon3);
        item4.setIcon(icon4);
        item5.setIcon(icon5);
        item6.setIcon(icon6);

        // ���ð�ť�����弰��С
        item1.setFont(font);
        item2.setFont(font);
        item3.setFont(font);
        item4.setFont(font);
        item5.setFont(font);
        item6.setFont(font);

        // ����Ϊ͸��
        item1.setContentAreaFilled(false);
        item2.setContentAreaFilled(false);
        item3.setContentAreaFilled(false);
        item4.setContentAreaFilled(false);
        item5.setContentAreaFilled(false);
        item6.setContentAreaFilled(false);

        // ��Ӱ�ť
        pNorth.add(item1);
        pNorth.add(item2);
        pNorth.add(item3);
        pNorth.add(item4);
        pNorth.add(item5);
        pNorth.add(item6);


        left.setLayout(new BorderLayout());

        left.add(pNorth, BorderLayout.NORTH);
        left.add(subMenuContainer, BorderLayout.CENTER);
        left.add(pSouth, BorderLayout.SOUTH);

    }

}
