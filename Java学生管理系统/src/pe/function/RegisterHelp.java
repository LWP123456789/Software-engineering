package pe.function;

import java.awt.Choice;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JTextField;

import pe.databases.RegisterFunction;

public class RegisterHelp {
	public RegisterHelp() {
	}

	// ��ȡͼ��·�����������ı�������
	public static void getIconpath(JButton btn, JTextField field) {
		JFileChooser chooser = new JFileChooser();
		String filepath = null;
		chooser.setMultiSelectionEnabled(true);
		int returnVal = chooser.showOpenDialog(btn);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			filepath = chooser.getSelectedFile().getAbsolutePath();
		}
		field.setText(filepath);
	}

	// ��ע�ᡰҳ��ġ����á���ť������
	public static void RegisterReset(Choice type, JTextField username_set,
			JTextField password_set, /*
										 * JTextField passwordOK_set, JTextField password_tip, JTextField
										 * password_tip_daan, JTextField safe_code, JTextField safeOK_code, JTextField
										 * icon,
										 */
			JTextField email, JLabel userlbl, JLabel emaillbl) {
		type.select(0);
		username_set.setText("");
		password_set.setText("");
		/*
		 * passwordOK_set.setText(""); password_tip.setText("");
		 * password_tip_daan.setText(""); safe_code.setText("");
		 * safeOK_code.setText(""); icon.setText("");
		 */
		email.setText("");
		userlbl.setText("ģ����ѯ");
		emaillbl.setText("");
	}

	// ��ע�ᡰҳ��ġ��Ƿ�ռ�á���ť������
	public static void isUsed(JTextField user_name, JLabel tip) {
		String username = user_name.getText();
		if (RegisterFunction.isUsernameUsed(username) == 1) {
			tip.setText("���û����ѱ�ռ��");
		} else if (RegisterFunction.isUsernameUsed(username) == 0) {
			tip.setText("���û���δ��ʹ��");
		}
	}

	// ��ע�ᡰҳ��ġ������ʼ��Ƿ�ռ�á���ť������
	public static void usedEmail(JTextField email, JLabel tip) {
		String emailString = email.getText();
		if (emailString.equals("")) {
			tip.setText("�������������!");  	
		} else if (RegisterFunction.isEmailUsed(emailString) == 1) {
			tip.setText("�õ��������ѱ�ռ��");
		} else if (RegisterFunction.isEmailUsed(emailString) == 0) {
			tip.setText("�õ�������δ��ռ��");
		}
	}

	// �жϻ�ȡ���ַ����Ƿ�Ϊ��
	public static boolean strisnull(String s1, String s2, String s3) {
		boolean bool1 = s1.isEmpty();
		boolean bool2 = s2.isEmpty();
		boolean bool3 = s3.isEmpty();

		if (bool1 == false && bool2 == false && bool3 == false) {
			return false;
		} else {
			return true;
		}

	}
	
	
	
	//�жϡ�������롰ȷ������򡱣�����ȫ�롱�롱ȷ�ϰ�ȫ�롰�Ƿ���ͬ
	public static boolean isOK_forPasswordCode(JTextField password,
			JTextField password_ok){
		String password_str=password.getText();
		String password_ok_str=password_ok.getText();
		/*
		 * String safe_str=safe.getText(); String safe_ok_str=safe_ok.getText();
		 */
		
		if (password_ok_str.equals(password_str)/* &&safe_ok_str.equals(safe_str) */) {
			return true;
		} else if (!password_ok_str.equals(password_str)/* ||!safe_ok_str.equals(safe_str) */) {
			return false;
		}else {
			return false;
		}
		
	}

}
