package account;

import main.Utils;
import student.StudentData;

public class StudentAccount extends Account {

    private StudentData studentData;

    public StudentAccount(final int id, final String username, final String password, final StudentData studentData) {
        super(id, username, password, Utils.rights.READ);
        this.studentData = studentData;
    }

    

}
