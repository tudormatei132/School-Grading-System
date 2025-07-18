package courses;

import main.Utils;
import teacher.TeacherData;

public class Course {
    private int id;
    private String courseName;
    private int credits;
    private Utils.COURSE_TYPE type;

    public Course(int id, String courseName, int credits, Utils.COURSE_TYPE type) {
        this.id = id;
        this.courseName = courseName;
        this.credits = credits;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public Utils.COURSE_TYPE getType() {
        return type;
    }

    public void setType(Utils.COURSE_TYPE type) {
        this.type = type;
    }
}
