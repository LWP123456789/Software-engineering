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
	 * “注册”界面与数据库之间的交互
	 */
	// 判断用户名是否被占用
	public static int isUsernameUsed(String username) {
		String sql = "select * from user where username='" + username + "'";
		try {
			if (DBHelp.query(sql).next()) {
				return 1;// 该用户名已被使用
			} else {
				return 0;// 该用户名未被使用
			}
		} catch (SQLException e) {
			return -1;// 数据库出现错误
		}
	}

	// 判断电子邮箱是否被使用
	public static int isEmailUsed(String email) {
		String sql = "select * from user where email='" + email + "'";
		try {
			if (DBHelp.query(sql).next()) {
				return 1;// 该电子邮箱已被使用
			} else {
				return 0;// 该电子邮箱未被使用
			}
		} catch (SQLException e) {
			return -1;// 数据库出现错误
		}
	}

	// 将“注册”数据存入数据库
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
					return -1;// 出现错误
				}

			} catch (Exception e) {
				e.printStackTrace();
				return -1;// 出现错误
			}
		} else {
			JOptionPane.showMessageDialog(null, "上述项目不能留空！");
			return 0;
		}

	}

}
