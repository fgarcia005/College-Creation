package org.example.Model;


public class Course {
    private String courseName;
    private String classID;
    private String roomNumber;
    private boolean isRequired = false;
    private String courseTime;
    //-------------------------------------

    public Course(String courseName, String classID, String roomNumber, boolean isRequired, String courseTime) {
        this.courseName = courseName;
        this.classID = classID;
        this.roomNumber = roomNumber;
        this.isRequired = isRequired;
        this.courseTime = courseTime;
    }
    //--------------------------------------
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    //---------------------------------------------
    public String getClassID() {
        return classID;
    }

    public void setClassID(String classID) {
        this.classID = classID;
    }
    //---------------------------------------------
    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }
    //-----------------------------------------------------
    public boolean isRequired() {
        return isRequired;
    }

    public void setRequired(boolean required) {
        isRequired = required;
    }
    //-----------------------------------------------------

    public String getCourseTime() {
        return courseTime;
    }

    public void setCourseTime(String courseTime) {
        this.courseTime = courseTime;
    }

    //-----------------------------------------------
    @Override
    public String toString() {
        return "\nCourse Name = " + courseName + '\n' +
                "class ID = " + classID + '\n' +
                "room Number = " + roomNumber + '\n' +
                "is Required = " + isRequired+'\n';
    }
}
