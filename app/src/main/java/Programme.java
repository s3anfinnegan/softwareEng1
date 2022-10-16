package org.example;
import java.util.ArrayList;

import org.joda.time.DateTime;
//import java.util.Date;

public class Programme {

    public String courseName;
    public ArrayList<Student> studentList;
    public ArrayList<Modules> moduleList;
    public DateTime startDate;
    public DateTime endDate;

    public Programme(String courseName, DateTime startDate, DateTime endDate) {
        this.courseName = courseName;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public void setStudentList(ArrayList<Student> courseStudentList) {
        this.studentList = courseStudentList;
    }
    public void setModuleList(ArrayList<Modules> moduleList) {
        this.moduleList = moduleList;
    }
    public void setStartDate(DateTime startDate) {
        this.startDate = startDate;
    }
    public void setEndDate(DateTime endDate) {
        this.endDate = endDate;
    }

    public String getCourseName() {
        return courseName;
    }
    public ArrayList<Student> getStudentList() {
        return studentList;
    }
    public ArrayList<Modules> getModuleList() {
        return moduleList;
    }
    public DateTime getStartDate() {
        return startDate;
    }
    public DateTime getEndDate() {
        return endDate;
    }

}