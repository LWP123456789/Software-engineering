package pe.databases;

public interface DBConfig {
	String driver = "com.mysql.cj.jdbc.Driver";// MySQL���ݿ�����Э��
	String URL = "jdbc:mysql://localhost:3306/lwp?characterEncoding=utf-8&serverTimezone=GMT";// MySQL���ݿ��ַ
	String user = "root";// MySQL���ݿ������û���
	String password = "php123456";// MySQL���ݿ���������
}
