package pe.function;

import pe.databases.DBHelp;

import javax.swing.*;
import java.awt.*;

public class LoginHelp {
	public LoginHelp() {
	}

	// 判断用户输入的信息是否合法
	public static boolean login(String login_type, String username,
			String password) {
		if (login_type.equals("教师")) {
			boolean bool = DBHelp.Administrator(username, password);
			if (bool == true) {
				return true;
			} else {
				return false;
			}
		} else if (login_type.equals("系统管理员")) {
			boolean bool = DBHelp.Administrator(username, password);
			if (bool == true) {
				return true;
			} else {
				return false;
			}
		} else {
			boolean bool = DBHelp.NormalUser(username, password);
			if (bool == true) {
				return true;
			} else {
				return false;
			}
		}
	}

	// ‘登录界面’的‘重置按钮的作用’
	public static void Loginclear(JTextField txt1, JTextField txt2,
			Choice type, JTextField txt_code) {
		txt1.setText("");
		txt2.setText("");
		type.select(0);
		txt_code.setText("");
	}

	// ‘登录界面’的‘重置按钮的作用’
	public static void Loginclear(JTextField txt1, JTextField txt2,
								   JTextField txt_code) {
		txt1.setText("");
		txt2.setText("");
		txt_code.setText("");
	}

	public static void Loginclear(JTextField txt1, JTextField txt2,
								  JTextField txt3, JTextField txt_code,JTextField txt4) {
		txt1.setText("");
		txt2.setText("");
		txt3.setText("");
		txt4.setText("");
		txt_code.setText("");
	}

	public static void Loginclear(JTextField txt1, JTextField txt2,
								  JTextField txt3, JTextField txt4,JTextField txt5,JTextField txt6,JTextField txt7,JTextField txt8,JTextField txt9) {
		txt1.setText("");
		txt2.setText("");
		txt3.setText("");
		txt4.setText("");
		txt5.setText("");
		txt6.setText("");
		txt7.setText("");
		txt8.setText("");
		txt9.setText("");
	}

	// 验证码的确认
	public static boolean isValidCode(JTextField txt_code, ValidCode vcode) {
		if (txt_code == null) {
			return false;
		} else if (vcode == null) {
			return true;
		} else if (vcode.getCode().toUpperCase().equals(txt_code.getText().toUpperCase())) {
			return true;
		} else {
			return false;
		}

	}

}
