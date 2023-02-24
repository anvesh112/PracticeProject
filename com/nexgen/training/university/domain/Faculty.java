package com.nexgen.training.university.domain;

import java.util.List;

public class Faculty {

   private String qualification;

   private List<Department> department;

   private Address address;

   private Person person;

   public Faculty(){

   }
    public Faculty( Person person,String qualification,Address address) {
        this.qualification = qualification;
      //  this.department = department; List<Department> department
        this.address = address;
        this.person = person;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
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

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Faculty [qualification=" + qualification + ", department=" + department +   ", person=" + person +", address=" + address +
               "]";
    }


}
