/**package org.example;
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

}**/

package org.example;
import java.util.ArrayList;

public class Modules {

    public String modName;
    public String modID;
    public ArrayList<Student> studentList;
    public Lecturer lecturer;

    public Modules(String modName, String modID) {
        this.modName=modName;
        this.modID=modID;
    }

    public String getModName() {
        return modName;
    }

    public void setModName(String modName) {
        this.modName = modName;
    }

    public String getModID() {
        return modID;
    }

    public void setModID(String modID) {
        this.modID = modID;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }



}