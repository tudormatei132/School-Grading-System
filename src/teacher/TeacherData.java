package teacher;

import courses.Course;
import student.StudentData;

import java.util.ArrayList;

public class TeacherData {
    private int teacherID;
    private String teacherSurname, teacherFirstName;
    private ArrayList<Course> courses;
    public TeacherData(int teacherID, String teacherSurname, String teacherFirstName) {
        this.teacherID = teacherID;
        this.teacherSurname = teacherSurname;
        this.teacherFirstName = teacherFirstName;
    }

    public boolean teachesCourse(int courseID) {
        for (Course course : courses) {
            if (course.getId() == courseID) {
                return true;
            }
        }
        return false;
    }
    //TODO: throw exception if teacher doesn't teach the course
    public void addGrade(StudentData student, final int grade, final int courseID) {
        if (!teachesCourse(courseID)) {
            System.out.println("Teacher has no access to this course");
            return;
        }
        student.addGrade(grade, courseID);
    }

    public int getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(int teacherID) {
        this.teacherID = teacherID;
    }

    public String getTeacherSurname() {
        return teacherSurname;
    }

    public void setTeacherSurname(String teacherSurname) {
        this.teacherSurname = teacherSurname;
    }

    public String getTeacherFirstName() {
        return teacherFirstName;
    }

    public void setTeacherFirstName(String teacherFirstName) {
        this.teacherFirstName = teacherFirstName;
    }

}
