package org.example.Model;

import java.util.ArrayList;

public class College {
    private String collegeName;
    private String location;
    private ArrayList<Student> studentBody = new ArrayList<Student>();
    private ArrayList<Faculty> faculty = new ArrayList<Faculty>();
    private ArrayList<Staff> staff = new ArrayList<Staff>();
    //-------------------------------------------
    public College(String _collegeName, String _location) {
        this.collegeName = _collegeName;
        this.location = _location;
    }
    //----------------------------------------------
    public ArrayList<Student> getStudentBody() {
        return studentBody;
    }
    public void addStudent(Student _student){
        this.studentBody.add(_student);
    }
    public void removeStudent (int _student){
        try{
            this.studentBody.remove(_student);
        }catch (Exception ex){
        }
    }
    public void setStudentBody(ArrayList<Student> _studentBody) {
        this.studentBody = _studentBody;
    }
    //----------------------------------------------
    public ArrayList<Faculty> getFaculty() {
        return faculty;
    }
    public void addFaculty(Faculty _faculty){
        this.faculty.add(_faculty);
    }
    public void removeFaculty(int _faculty){
        try{
            this.faculty.remove(_faculty);
        }catch (Exception ex){
        }
    }
    public void setFaculty(ArrayList<Faculty> faculty) {
        this.faculty = faculty;
    }
    //---------------------------------------------------
    public ArrayList<Staff> getStaff() {
        return staff;
    }
    public void addStaff(Staff _staff){
        this.staff.add(_staff);
    }
    public void removeStaff(int _Staff){
        try{
            this.staff.remove(_Staff);
        }catch (Exception ex){


        }
    }
    //-----------------------------------------------------------------
    public String displayStudents(){
        return "Student Body = \n" + studentBody + "\n";
    }

    public String displayStaff(){
        return "Staff = \n" + staff + "\n";
    }
    public String displayFaculty(){
        return "Faculty = \n" + faculty + "\n";
    }
    //----------------------------------------------------------------


    @Override
    public String toString() {
        return "College Name = " + collegeName + '\n' +
                "Location = " + location + '\n' + '\n' +
                "Student Body = \n" + studentBody + "\n" + '\n' +
                "Faculty = \n" + faculty + "\n" + '\n' +
                "Staff = \n" + staff;
    }
}
