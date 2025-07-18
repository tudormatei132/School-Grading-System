package student;

import java.util.ArrayList;
import java.util.HashMap;

public class StudentData {
    private int studentID;
    private String firstName, surname;
    // TODO: add private ArrayList<Course> courses; after creating Course class
    private HashMap<Integer, ArrayList<Integer>> grades;
    private double finalGrade; // the final grade for all courses



    public StudentData(final int studentID, final String firstName, final String surname) {
        this.studentID = studentID;
        this.firstName = firstName;
        this.surname = surname;
        grades = new HashMap<>();
        finalGrade = 0.0;
    }

    public void addGrade(final int grade, final int courseID) {
        ArrayList<Integer> gradeList = grades.get(grade);
        if (gradeList == null) {
            gradeList = new ArrayList<>();
            gradeList.add(grade);
            grades.put(grade, gradeList);
        } else {
            gradeList.add(courseID);
        }
    }


    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public HashMap<Integer, ArrayList<Integer>> getGrades() {
        return grades;
    }

    public void setGrades(HashMap<Integer, ArrayList<Integer>> grades) {
        this.grades = grades;
    }

    public double getFinalGrade() {
        return finalGrade;
    }

    public void setFinalGrade(double finalGrade) {
        this.finalGrade = finalGrade;
    }
}
