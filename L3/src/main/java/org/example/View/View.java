package org.example.View;

import org.example.Model.College;

public class View {
    private MyInput io = new MyInput();
    public int DisplayMainMenu(){
        return io.getUserInt("Pleases select a menu option: \n1) Create College "+
                "\n2) Display the College \n3) Add Student \n4) Remove Student \n5) Add Staff "+
                "\n6) Remove Staff \n7) Add Faculty \n8) Remove Faculty \n9) Exit",true);
    }
    //--------------------------------------------------------------------
    public String displayCreateCollegePt1(){
        return io.getUserStr("What is your college name",true);
    }
    //----------------------------------------------------------------
    public String displayCreateCollegePt2(){
        return io.getUserStr("Where is your college located",true);
    }
    //---------------------------------------------------
    public void displayCollege(College col){
        if(col != null){
            System.out.println(col.toString());
        }
        else {
            displayNullCollege();
        }
    }
    public void displayNullCollege(){
        System.out.println("You don't have a college yet");
    }
    public void displayNullList(String who){System.out.println("You need to add "+who+" to this list");}
    //-------------------------------------------
    public String inputFirstName(String who){
        return io.getUserStr("What is the "+ who + " First Name",true);
    }
    public String inputLastName(String who){
        return io.getUserStr("What is the "+ who +" Last Name",true);
    }
    public int inputBirthYear(String who){
        return io.getUserInt("What is the "+who+" Birth Year (yyyy)",true);
    }
    public int inputBirthMonth(String who){
        return io.getUserInt("What is the "+who+" Birth Month (1-12)",1,12,true);
    }
    public int inputBirthDay(String who){
        return io.getUserInt("What is the "+who+" Birth Day (1-31)",1,31,true);
    }
    public float inputGPA(){
        return io.getUserFlt("What is the GPA",true);
    }
    public String inputJobTitle(){
        return io.getUserStr("What is the Staff Job Title",true);
    }
    public String inputOfficeNumber(){
        return io.getUserStr("What is the Faculty Office Room Number",true);
    }
    public String inputOfficeHour(){
        return io.getUserStr("What is the Faculty Office Hours",true);
    }
    public int remove(String type){
        return io.getUserInt(type + "\nFrom 0 - how many you added minus 1\nWhich one do you want to remove",true);
    }
}
