package org.example;

import java.util.ArrayList;
//import java.util.Date;

import org.joda.time.DateTime;

public class Student {

    public String name;
    public int age;
    public DateTime dob;
    public int studentID;
    public String username;
    public Programme courses;
    public ArrayList<Modules> modulesList;


    public Student(String name, int age, DateTime dob, int studentID) {
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.studentID = studentID;
        this.username= name.concat(Integer.toString(age));
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setDob(DateTime dob) {
        this.dob = dob;
    }
    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }
    //public void setUsername(String name, int age) {
        //this.username= name.concat(Integer.toString(age));
    //}

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public DateTime getDob() {
        return dob;
    }
    public int getStudentID() {
        return studentID;
    }
    public String getUsername() {
        return username;
    }
// set modules and set courses
    public ArrayList<Modules> getModuleList() {
        return modulesList;
    }
    public void setModuleList(ArrayList<Modules> modulesList) {
        this.modulesList = modulesList;
    }
    public Programme getCourses() {
        return courses;
    }
    public void setCourses(Programme courses) {
        this.courses = courses;
    }

}

}
