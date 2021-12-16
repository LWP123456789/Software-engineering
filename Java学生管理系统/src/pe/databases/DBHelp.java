package pe.databases;

import pe.entity.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBHelp implements DBConfig{
	private static Connection conn;
	private static Statement stmt;
	private static ResultSet rs;
	
	// ���Connection���͵Ķ���
	public static Connection getConnection() {
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(URL, user, password);
			return conn;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	// ���Statement���͵Ķ���
	public static Statement openStatement() {
		try {
			stmt = getConnection().createStatement();
			return stmt;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	// ������ݵĸ��²��������Խ������ݵ���(insert)��ɾ(delete)����(update)
	public static int update(String sql) {
		try {
			return openStatement().executeUpdate(sql);
		} catch (Exception e) {
//			e.printStackTrace();
			return -1;// ���������ݿ�����򷵻ش���ֵ��-1��
		}
	}

	// ������ݵĲ�ѯ���������Խ������ݵĲ�ѯ(select)
	public static ResultSet query(String sql) {
		try {
			return openStatement().executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	// �ͷŸ�����Դ
	public static void close() {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (stmt != null) {
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	// ��ѯ�û��Ƿ�Ϸ�
	public static boolean NormalUser(String username, String password) {
		boolean result = false;
		PreparedStatement ps;
		try {
			String sql = "select * from user where username=? and password=?";
			ps = getConnection().prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			if (!rs.next()) {
				result = false;
			} else {
				result = true;
			}
			DBHelp.close();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	// ��ѯ��̨�����û��Ƿ�Ϸ�
	public static boolean Administrator(String username, String password) {
		boolean result = false;
		PreparedStatement ps;
		try {
			String sql = "select * from user where username=? and password=?";
			ps = getConnection().prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			if (!rs.next()) {
				result = false;
			} else {
				result = true;
			}
			DBHelp.close();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}


	//��ȡ���ݿ��и�ѧ������Ϣ
	public static List<Student> getInfo(String name){
		List<Student> list = new ArrayList<Student>();
		PreparedStatement ps;
		String sql = "select * from studentinfo where stu_name = ?";
		try {
			ps = getConnection().prepareStatement(sql);
			ps.setString(1,name);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				list.add(new Student(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	//��ȡ���ݿ��иý�ʦ����Ϣ
	public static List<Teacher> getTeacherInfo(String name){
		List<Teacher> list = new ArrayList<Teacher>();
		PreparedStatement ps;
		String sql = "select * from teacherinfo where username = ?";
		try {
			ps = getConnection().prepareStatement(sql);
			ps.setString(1,name);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				list.add(new Teacher(rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)));
			}
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
		return list;
	}

	//��ȡ���пγ�����
	public static List<Course> getAllCourse(){
		List<Course> list = new ArrayList<>();
		PreparedStatement ps;
		String sql = "select * from course";
		try {
			ps = getConnection().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				list.add(new Course(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	//�޸�ѧ��������Ϣ
	public static void modifyInformation(String username,String realName,String sex,String courseNumber,String department,String stu_class,String nation,String tele,String address,String polity){
		PreparedStatement ps;
		String sql = "update studentinfo set stu_realName = ?,stu_sex = ?, stu_courseNumber = ?, stu_department = ?,stu_class = ? ,stu_nation = ?,stu_tele = ?, stu_address = ? , stu_political_outlook = ? where stu_name = ?";
		try {
			ps = getConnection().prepareStatement(sql);
			ps.setString(1,realName);
			ps.setString(2,sex);
			ps.setString(3,courseNumber);
			ps.setString(4,department);
			ps.setString(5,stu_class);
			ps.setString(6,nation);
			ps.setString(7,tele);
			ps.setString(8,address);
			ps.setString(9,polity);
			ps.setString(10,username);
			ps.executeUpdate();
			ps.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}
	}

	//�޸Ľ�ʦ������Ϣ
	//��ȡѧ���Ŀγ���Ϣ
	//��ѯ�����û���Ϣ
	//ɾ����Ӧ�û���Ϣ
	//��ȡ��ʦ�û�����Ӧ����ʵ����
	//��ȡ����ѧ����Ϣ
	//��ȡ���н�ʦ��Ϣ
	//ɾ����Ӧ�Ľ�ʦ��Ϣ
	//ɾ����Ӧ��ѧ����Ϣ
	//��óɼ���Ϣ
	//�޸�ѧ���ɼ�
	public static void updateScore(Object id, Object studentId, Object score) {
		PreparedStatement ps;
		String sql = "update course_stu set score = ? where stu_id = ? and course_id = ?";
		try {
			ps = getConnection().prepareStatement(sql);
			ps.setString(1, (String) score);
			ps.setString(2, (String) studentId);
			ps.setString(3, (String) id);
			ps.executeUpdate();
			ps.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}
	}

	public static void modifyInformation(String username,String realName,String sex,String tele){
		PreparedStatement ps;
		String sql = "update teacherinfo set name = ?,sex = ?,tele = ? where username = ?";
		try {
			ps = getConnection().prepareStatement(sql);
			ps.setString(1,realName);
			ps.setString(2,sex);
			ps.setString(3,tele);
			ps.setString(4,username);
			ps.executeUpdate();
			ps.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}
	}

	public static List<Stu_Course> getStu_Course(String username){

		List<Stu_Course> list = new ArrayList<>();
		PreparedStatement ps;
		String sql = "SELECT studentinfo.stu_realName,course_stu.course_id,course.course_name,course_stu.score FROM studentinfo,course_stu,course WHERE studentinfo.stu_id = course_stu.stu_id and course_stu.course_id = course.course_id and stu_name = ?";

		try {
			ps = getConnection().prepareStatement(sql);
			ps.setString(1,username);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				list.add(new Stu_Course(rs.getString(1),rs.getString(2),rs.getString(3),rs.getInt(4)));
			}
			ps.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return list;
	}

	public static void addCourse(String course_id,String course_name, String course_teacher, String course_credit, String course_time) {
		PreparedStatement ps;
		String sql = "INSERT INTO course VALUES (?,?,?,?,?)";

		try {
			ps = getConnection().prepareStatement(sql);
			ps.setString(1,course_id);
			ps.setString(2,course_name);
			ps.setString(3,course_teacher);
			ps.setString(4,course_credit);
			ps.setString(5,course_time);
			ps.execute();
			ps.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}
	}

	public static void addCourse(String courseId,String username) {

		PreparedStatement ps;
		String sql = "INSERT INTO course_stu VALUES (?,?,?,?)";
		//��ȡѧ��
		String stu_id = String.valueOf(getInfo(username).get(0).getStu_id());


		try {
			ps = getConnection().prepareStatement(sql);
 			ps.setString(1,null);
			ps.setString(2,stu_id);
			ps.setString(3,courseId);
			ps.setInt(4,100);
			ps.execute();
			ps.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}

	}

	public static void deleteCourse(String courseId, String username) {

		//���ݿγ�idɾ������
		PreparedStatement ps;
		String sql = "DELETE FROM course_stu WHERE course_id = ? and stu_id = ?";
		//��ȡѧ��
		String stu_id = String.valueOf(getInfo(username).get(0).getStu_id());
		try {
			ps = getConnection().prepareStatement(sql);
			ps.setString(1,courseId);
			ps.setString(2,stu_id);
			ps.execute();
			ps.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}

	}

	public static void deleteCourse(Object courseId) {

		//���ݿγ�idɾ������
		PreparedStatement ps;
		String sql = "DELETE FROM course WHERE course_id = ?";

		try {
			ps = getConnection().prepareStatement(sql);
			ps.setObject(1,courseId);
			ps.execute();
			ps.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}

	}

	public static List<User> getAllUser() {
		List<User> list = new ArrayList<>();
		PreparedStatement ps;
		String sql = "select username,password,email,shenfen from user";
		try {
			ps = getConnection().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				list.add(new User(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)));
			}
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
		return list;
	}

	public static void deleteUser(Object username) {
		//���ݿγ�idɾ������
		PreparedStatement ps;
		String sql = "DELETE FROM user WHERE username = ?";

		try {
			ps = getConnection().prepareStatement(sql);
			ps.setObject(1,username);
			ps.execute();
			ps.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}
    }

	//��ȡ�û����¶�Ӧ���û�����
	public static String getIdentify(String username_str) {
		PreparedStatement ps;
		String sql = "SELECT shenfen FROM user WHERE username = ?";
		String identify = null;

		try {
			ps = getConnection().prepareStatement(sql);
			ps.setObject(1,username_str);
			ResultSet rs = ps.executeQuery();
			if (rs.next()){
				identify = rs.getString(1);
			}
			ps.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return identify;
	}

    public static List<Course> getTeacherCourse(String name) {

		List<Course> list = new ArrayList<>();
		PreparedStatement ps;
		String sql = "select * from course where course_teacher = ?";
		try {
			ps = getConnection().prepareStatement(sql);
			ps.setString(1,name);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				list.add(new Course(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)));
			}
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
		return list;
    }

    public static String getRealName(String username) {
		PreparedStatement ps;
		String sql = "select name from teacherinfo where username = ?";
		String realName = null;
		try {
			ps = getConnection().prepareStatement(sql);
			ps.setString(1,username);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				realName = rs.getString(1);
			}
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
		return realName;

	}

    public static List<Student> getStudentInfo() {
		List<Student> list = new ArrayList<Student>();
		PreparedStatement ps;
		String sql = "select * from studentinfo";
		try {
			ps = getConnection().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				list.add(new Student(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
    }

	public static List<Score> getScore(String courseId) {

		List<Score> list = new ArrayList<Score>();
		PreparedStatement ps;
		String sql = "SELECT DISTINCT course_stu.stu_id,studentinfo.stu_realName,course_stu.score \n" +
				"FROM `studentinfo`,`course_stu`,`course`\n" +
				"WHERE course_stu.course_id =  ? and course_stu.stu_id = studentinfo.stu_id";
		try {
			ps = getConnection().prepareStatement(sql);
			ps.setString(1,courseId);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				list.add(new Score(rs.getString(1),rs.getString(2),rs.getString(3)));
			}
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
		return list;

	}

    public static List<Teacher> getTeacherInfo() {
		List<Teacher> list = new ArrayList<Teacher>();
		PreparedStatement ps;
		String sql = "select * from teacherinfo";
		try {
			ps = getConnection().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				list.add(new Teacher(rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)));
			}
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
		return list;
    }

	public static void deleteTeacher(Object username) {
		//���ݿγ�idɾ������
		PreparedStatement ps;
		String sql = "DELETE FROM teacherinfo WHERE name = ?";

		try {
			ps = getConnection().prepareStatement(sql);
			ps.setObject(1,username);
			ps.execute();
			ps.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}
	}

	public static void deleteStudent(Object username) {
		//���ݿγ�idɾ������
		PreparedStatement ps;
		String sql = "DELETE FROM studentinfo WHERE stu_realName = ?";

		try {
			ps = getConnection().prepareStatement(sql);
			ps.setObject(1,username);
			ps.execute();
			ps.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}
	}
}
