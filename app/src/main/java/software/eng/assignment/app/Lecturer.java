package org.example;

import org.joda.time.DateTime;
import java.util.Date;

import java.util.ArrayList;

public class Lecturer {

    public String name;
    public int age;
    public DateTime dob;
    public int lecturerID;
    public String username;
    public ArrayList<Module> modules;


    public Lecturer(String lecturer, int age, DateTime dob, int lecturerID) {
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.lecturerID = this.lecturerID;
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
    public void setLecturerID(int lecturerID) {
        this.lecturerID = lecturerID;
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
    public int getLecturerID() {
        return lecturerID;
    }
    public String getUsername() {
        return username;
    }

    //working on
    public ArrayList<Module> getModules() {
        return modules;
    }
    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }

}