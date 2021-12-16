package pe.entity;

public class Course {

    private String id;
    private String name;
    private String teacher;
    private String credit;
    private String time;

    public Course() {
    }

    public Course(String id, String name, String teacher, String credit, String time) {
        this.id = id;
        this.name = name;
        this.teacher = teacher;
        this.credit = credit;
        this.time = time;
    }

    public String getCredit() {
        return credit;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
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

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }
}
