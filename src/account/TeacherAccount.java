package account;

import main.Utils;
import teacher.TeacherData;

public class TeacherAccount extends Account {
    private TeacherData teacherData;
    public TeacherAccount(int teacherID, String teacherUsername, String teacherPassword, TeacherData teacherData) {
        super(teacherID, teacherUsername, teacherPassword, Utils.rights.READWRITE);
        this.teacherData = teacherData;
    }


}
