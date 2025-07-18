package teacher;

public class TeacherData {
    private int teacherID;
    private String teacherSurname, teacherFirstName;
    //TODO: class for teacher course
    public TeacherData(int teacherID, String teacherSurname, String teacherFirstName) {
        this.teacherID = teacherID;
        this.teacherSurname = teacherSurname;
        this.teacherFirstName = teacherFirstName;
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
