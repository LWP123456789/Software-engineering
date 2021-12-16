package pe.entity;

public class Stu_Course {

    private String course_id;
    private String studentName;
    private String courseName;
    private int score;

    public Stu_Course() {
    }

    public Stu_Course( String studentName, String course_id,String courseName, int score) {
        this.course_id = course_id;
        this.studentName = studentName;
        this.courseName = courseName;
        this.score = score;
    }

    public String getCourse_id() {
        return course_id;
    }

    public void setCourse_id(String course_id) {
        this.course_id = course_id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
