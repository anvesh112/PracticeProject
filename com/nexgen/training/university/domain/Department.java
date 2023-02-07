package com.nexgen.training.university.domain;

import java.util.List;

public class Department extends Campus {

    String name;

    List<Faculty> faculty;
    // List<Student> students;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Faculty> getFaculty() {
        return faculty;
    }

    public void setFaculty(List<Faculty> faculty) {
        this.faculty = faculty;
    }

    @Override
    public String toString() {
        return "Department [name=" + name + ", faculty=" + faculty + "]";
    }





//	    public List<Student> getStudents() {
//	        return students;
//	    }
//
//	    public void setStudents(List<Student> students) {
//	        this.students = students;}



}
