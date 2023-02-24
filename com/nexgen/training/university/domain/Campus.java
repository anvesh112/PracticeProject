package com.nexgen.training.university.domain;

import java.util.List;

public class Campus {

    private String name;

   private List<Department> department;

    private Address address;

    public Campus(){

    }
    public Campus(String name,  Address address) {
        this.name = name;
       // this.department = department;List<Department> department,
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Department> getDepartment() {
        return department;
    }

    public void setDepartment(List<Department> department) {
        this.department = department;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Campus [name=" + name + ", department=" + department + ", address=" + address + "]";
    }


}
