package pe.entity;
/*
* 教师信息
* */
public class Teacher {

    //教师标识
    private static String username;

    private String id;
    private String name;
    private String sex;
    private String tele;

    public Teacher() {
    }

    public Teacher(String id, String name, String sex, String tele) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.tele = tele;
    }

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        Teacher.username = username;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getTele() {
        return tele;
    }

    public void setTele(String tele) {
        this.tele = tele;
    }
}
