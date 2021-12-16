package pe.databases;

public interface DBConfig {
	String driver = "com.mysql.cj.jdbc.Driver";// MySQL数据库连接协议
	String URL = "jdbc:mysql://localhost:3306/lwp?characterEncoding=utf-8&serverTimezone=GMT";// MySQL数据库地址
	String user = "root";// MySQL数据库连接用户名
	String password = "php123456";// MySQL数据库连接密码
}
