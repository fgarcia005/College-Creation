package org.example.Model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Faculty extends Person{
    private String officeNumber;
    private String officeHours;
    private boolean isAdjunct = false;
    private ArrayList<Course> cources = new ArrayList<Course>();
    //------------------------------------------
    public Faculty(String firstName, String lastName, LocalDate birthDate, String officeNumber, String officeHours) {
        super(firstName,lastName,birthDate);
        this.officeNumber = officeNumber;
        this.officeHours = officeHours;
    }
    //-----------------------------------
    public void addCourse(Course course){
        this.cources.add(course);
    }
    public void removeCourse(Course course){
        try{
            this.cources.remove(course);
        }catch (Exception ex){
        }
    }
    //---------------------------------------------------
    public String getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(String officeNumber) {
        this.officeNumber = officeNumber;
    }
    //---------------------------------------------------

    public String getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    //-----------------------------------------------------
    public boolean isAdjunct() {
        return isAdjunct;
    }

    public void setAdjunct(boolean adjunct) {
        isAdjunct = adjunct;
    }
    //------------------------------------------------

    @Override
    public String toString() {
        return super.toString() +
                "Office Number = " + officeNumber + '\n' +
                "Office Hours =" + officeHours + '\n'+
                "Is Adjunct=" + isAdjunct + '\n' +
                "Cources = " + cources + '\n'+'\n';
    }
}
