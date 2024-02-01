package org.example.Controller;

import org.example.Model.College;
import org.example.Model.Faculty;
import org.example.Model.Staff;
import org.example.Model.Student;
import org.example.View.View;

import java.time.LocalDate;

public class MyController {
    private View menu = new View();
    private Student student;
    private Staff staff;
    private Faculty faculty;
    private College col;
    public void doWork(){
        int selection = -1;
        while(selection != 9) {
            selection = menu.DisplayMainMenu();
            switch (selection) {
                case 1:
                    createCollege();
                    break;
                case 2:
                    menu.displayCollege(col);
                    break;
                case 3:
                    createStudent();
                    break;
                case 4:
                    removeStudent();
                    break;
                case 5:
                    createStaff();
                    break;
                case 6:
                    removeStaff();
                    break;
                case 7:
                    createFaculty();
                    break;
                case 8:
                    removeFaculty();
                    break;
                case 9:
                    break;
            }
        }
    }
    //----------------------------------------------------
    public void createCollege(){
        String name = menu.displayCreateCollegePt1();
        String location = menu.displayCreateCollegePt2();
        col = new College(name,location);
    }
    public void createStudent(){
        if(col!=null){
            String fName = menu.inputFirstName("Student");
            String lName = menu.inputLastName("Student");
            int birthYear = menu.inputBirthYear("Student");
            int birthMonth = menu.inputBirthMonth("Student");
            int birthDay = menu.inputBirthDay("Student");
            float gpa = menu.inputGPA();
            student = new Student(fName,lName, LocalDate.of(birthYear,birthMonth,birthDay),gpa);
            col.addStudent(student);
        }else{
            menu.displayNullCollege();
        }
    }
    public void removeStudent(){
        if(col != null){
            if(col.getStudentBody().size()>0) {
                boolean loop = true;
                while(loop) {
                    int intStudent = menu.remove(col.displayStudents());
                    if(intStudent < col.getStudentBody().size() && intStudent >= 0) {
                        col.removeStudent(intStudent);
                        loop = false;
                    }
                }
            }else{
                menu.displayNullList("Student");
            }
        }else{
            menu.displayNullCollege();
        }
    }
    public void createStaff(){
        if(col!=null){
            String fName = menu.inputFirstName("Staff");
            String lName = menu.inputLastName("Staff");
            int birthYear = menu.inputBirthYear("Staff");
            int birthMonth = menu.inputBirthMonth("Staff");
            int birthDay = menu.inputBirthDay("Staff");
            String jobTitle = menu.inputJobTitle();
            staff = new Staff(fName,lName, LocalDate.of(birthYear,birthMonth,birthDay),jobTitle);
            col.addStaff(staff);
        }else{
            menu.displayNullCollege();
        }
    }
    public void removeStaff(){
        if(col != null){
            if(col.getStaff().size()>0) {
                boolean loop = true;
                while(loop) {
                    int intStaff = menu.remove(col.displayStaff());
                    if (intStaff < col.getStaff().size() && intStaff >= 0) {
                        col.removeStaff(intStaff);
                        loop = false;
                    }
                }
            }else{
                menu.displayNullList("Staff");
            }
        }else{
            menu.displayNullCollege();
        }
    }
    public void createFaculty(){
        if(col!=null){
            String fName = menu.inputFirstName("Faculty");
            String lName = menu.inputLastName("Faculty");
            int birthYear = menu.inputBirthYear("Faculty");
            int birthMonth = menu.inputBirthMonth("Faculty");
            int birthDay = menu.inputBirthDay("Faculty");
            String officeNumber = menu.inputOfficeNumber();
            String officeHour = menu.inputOfficeHour();
            faculty = new Faculty(fName,lName, LocalDate.of(birthYear,birthMonth,birthDay),officeNumber,officeHour);
            col.addFaculty(faculty);
        }else{
            menu.displayNullCollege();
        }
    }
    public void removeFaculty(){
        if(col != null){
            if(col.getFaculty().size()>0) {
                boolean loop = true;
                while (loop) {
                    int intFaculty = menu.remove(col.displayFaculty());
                    if(intFaculty < col.getFaculty().size() && intFaculty >= 0) {
                        col.removeFaculty(intFaculty);
                        loop = false;
                    }
                }
            }else{
                menu.displayNullList("Faculty");
            }
        }else{
            menu.displayNullCollege();
        }
    }

}
