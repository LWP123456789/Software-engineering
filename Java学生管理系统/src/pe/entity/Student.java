package pe.entity;

public class Student {
	
	//ѧ����ʶ	
	private static String username;
	
	private int stu_id;//ѧ��
	private String stu_name;//�û���
	private String stu_sex;//�Ա�
	private String stu_courseNumber;//���޿γ���
	private String stu_class;//�༶
	private String stu_nation;//����
	private String stu_department;//ϵ��
	private String stu_realName;//��ʵ����
	private String stu_tele;//��ϵ��ʽ
	private String stu_address;//סַ
	private String stu_political_outlook;//������ò
	
	public Student() {
		
	}
	
	public int getStu_id() {
		return stu_id;
	}
	public Student(int stu_id, String stu_name, String stu_sex, String stu_courseNumber, String stu_class) {
		super();
		this.stu_id = stu_id;
		this.stu_name = stu_name;
		this.stu_sex = stu_sex;
		this.stu_courseNumber = stu_courseNumber;
		this.stu_class = stu_class;
	}
	
	
	public Student(int stu_id, String stu_name, String stu_sex, String stu_courseNumber, String stu_class,
			String stu_realName, String stu_tele,String stu_nation, String stu_address,  String stu_political_outlook,
			String stu_department) {
		super();
		this.stu_id = stu_id;
		this.stu_name = stu_name;
		this.stu_sex = stu_sex;
		this.stu_courseNumber = stu_courseNumber;
		this.stu_class = stu_class;
		this.stu_nation = stu_nation;
		this.stu_department = stu_department;
		this.stu_realName = stu_realName;
		this.stu_tele = stu_tele;
		this.stu_address = stu_address;
		this.stu_political_outlook = stu_political_outlook;
	}

	public String getStu_nation() {
		return stu_nation;
	}

	public void setStu_nation(String stu_nation) {
		this.stu_nation = stu_nation;
	}

	public String getStu_department() {
		return stu_department;
	}

	public void setStu_department(String stu_department) {
		this.stu_department = stu_department;
	}

	public String getStu_realName() {
		return stu_realName;
	}

	public void setStu_realName(String stu_realName) {
		this.stu_realName = stu_realName;
	}

	public String getStu_tele() {
		return stu_tele;
	}

	public void setStu_tele(String stu_tele) {
		this.stu_tele = stu_tele;
	}

	public String getStu_address() {
		return stu_address;
	}

	public void setStu_address(String stu_address) {
		this.stu_address = stu_address;
	}

	public String getStu_political_outlook() {
		return stu_political_outlook;
	}

	public void setStu_political_outlook(String stu_political_outlook) {
		this.stu_political_outlook = stu_political_outlook;
	}

	//ע���ʶ			
	public static void setUsername(String username) {
		Student.username = username;
	}
	
	//��ȡ��ʶ����
	public static String getUsername() {
		return Student.username;
	}

	public void setStu_id(int stu_id) {
		this.stu_id = stu_id;
	}
	public String getStu_name() {
		return stu_name;
	}
	public void setStu_name(String stu_name) {
		this.stu_name = stu_name;
	}
	public String getStu_sex() {
		return stu_sex;
	}
	public void setStu_sex(String stu_sex) {
		this.stu_sex = stu_sex;
	}
	public String getStu_courseNumber() {
		return stu_courseNumber;
	}
	public void setStu_courseNumber(String stu_courseNumber) {
		this.stu_courseNumber = stu_courseNumber;
	}
	public String getStu_class() {
		return stu_class;
	}
	public void setStu_class(String stu_class) {
		this.stu_class = stu_class;
	}
	
	
}
