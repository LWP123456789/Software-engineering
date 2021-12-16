package pe.databases;

import pe.function.RegisterHelp;

import javax.swing.*;
import java.awt.*;
import java.sql.SQLException;

public class RegisterFunction {
	public RegisterFunction() {
	}

	/*
	 * 
	 * ��ע�ᡱ���������ݿ�֮��Ľ���
	 */
	// �ж��û����Ƿ�ռ��
	public static int isUsernameUsed(String username) {
		String sql = "select * from user where username='" + username + "'";
		try {
			if (DBHelp.query(sql).next()) {
				return 1;// ���û����ѱ�ʹ��
			} else {
				return 0;// ���û���δ��ʹ��
			}
		} catch (SQLException e) {
			return -1;// ���ݿ���ִ���
		}
	}

	// �жϵ��������Ƿ�ʹ��
	public static int isEmailUsed(String email) {
		String sql = "select * from user where email='" + email + "'";
		try {
			if (DBHelp.query(sql).next()) {
				return 1;// �õ��������ѱ�ʹ��
			} else {
				return 0;// �õ�������δ��ʹ��
			}
		} catch (SQLException e) {
			return -1;// ���ݿ���ִ���
		}
	}

	// ����ע�ᡱ���ݴ������ݿ�
	public static int insertDatabase(Choice type, JTextField username,
			JTextField password, JTextField email) {

		String type_str = type.getSelectedItem();
		String username_str = username.getText();
		String password_str = password.getText();
		String email_str = email.getText();

		if (RegisterHelp.strisnull(username_str, password_str,
				email_str) == false) {

			try {

				String sql = "insert into user(username,password,email,shenfen) "
						+ "value('"
						+ username_str
						+ "','"
						+ password_str
						+ "','"+ email_str + "','" + type_str + "')";

				int b = DBHelp.update(sql);

				if (b > 0) {
					return 1;
				} else {
					return -1;// ���ִ���
				}

			} catch (Exception e) {
				e.printStackTrace();
				return -1;// ���ִ���
			}
		} else {
			JOptionPane.showMessageDialog(null, "������Ŀ�������գ�");
			return 0;
		}

	}

}
