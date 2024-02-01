package org.example.Model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Staff extends Person{
    private String jobTitle;
    private ArrayList<Student> studentList = new ArrayList<Student>();
    //-----------------------------------------------------------------
    public Staff(String firstName, String lastName, LocalDate birthDate, String jobTitle) {
        super(firstName, lastName, birthDate);
        this.jobTitle = jobTitle;
    }
    //---------------------------------------------------------------
    public void addStudent(Student student){
        this.studentList.add(student);
    }
    public void removeStudent(Student student){
        try{
            this.studentList.remove(student);
        }catch (Exception ex){
        }
    }
    //-------------------------------------------------------------------
    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
    //----------------------------------------------------------------

    @Override
    public String toString() {
        return super.toString()+
                "Job Title = " + jobTitle + '\n' +
                "Student List = \n" + studentList + '\n' + '\n';
    }
}
