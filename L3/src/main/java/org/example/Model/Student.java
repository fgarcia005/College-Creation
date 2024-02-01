package org.example.Model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Student extends Person{
    private float GPA;
    private Staff advocate;
    private ArrayList<Course> courses = new ArrayList<>();
    //-----------------------------------------------------
    public Student(String firstName, String lastName, LocalDate birthDate, float GPA) {
        super(firstName, lastName, birthDate);
        this.GPA = GPA;
    }
    //------------------------------------
    public void addCourse(Course course){
        this.courses.add(course);
    }
    public void removeCourse(Course course){
        try{
            this.courses.remove(course);
        }catch (Exception ex){

        }
    }
    //------------------------------------
    public float getGPA() {
        return GPA;
    }

    public void setGPA(float GPA) {
        this.GPA = GPA;
    }
    //---------------------------------------
    public Staff getAdvocate() {
        return advocate;
    }

    public void setAdvocate(Staff advocate) {
        this.advocate = advocate;
    }
    //------------------------------------------------
    @Override
    public String toString() {
        if(advocate != null) {
            return super.toString()  +
                    "GPA = " + GPA + '\n' +
                    "Advocate = " + advocate.getFirstName() + " " + advocate.getLastName() + '\n' +
                    "Courses = " + courses + '\n' + '\n';
        }else{
            return super.toString()  +
                    "GPA = " + GPA + '\n' +
                    "Advocate = " + advocate + '\n' +
                    "Courses = " + courses + '\n' + '\n';
        }
    }
}
