package org.example;
import java.util.ArrayList;

public class Module {

    public String moduleName;
    public String moduleID;
    public ArrayList<Student> studentList;
    public Lecturer lecturer;

    public Module(String moduleName, String moduleID) {
        this.moduleName = moduleName;
        this.moduleID = moduleID;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }
    public void setModuleID(String moduleID) {
        this.moduleID = moduleID;
    }
    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }
    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }


    public String getModuleName() {
        return moduleName;
    }
    public String getModuleID() {
        return moduleID;
    }
    public ArrayList<Student> getStudentList() {
        return studentList;
    }
    public Lecturer getLecturer() {
        return lecturer;
    }

}