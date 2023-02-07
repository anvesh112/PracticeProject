package com.nexgen.training.university.domain;


import java.util.ArrayList;
import java.util.List;

public class University {
    String universityName;
    String dean;

    String register;

    List<Campus> campuses = new ArrayList<>();

    Address address;





    public String getUniversityName() {
        return universityName;
    }






    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }






    public String getDean() {
        return dean;
    }






    public void setDean(String dean) {
        this.dean = dean;
    }






    public String getRegister() {
        return register;
    }






    public void setRegister(String register) {
        this.register = register;
    }






    public List<Campus> getCampuses() {
        return campuses;
    }






    public void setCampuses(List<Campus> campuses) {
        this.campuses = campuses;
    }






    public Address getAddress() {
        return address;
    }






    public void setAddress(Address address1) {
        this.address = address1;
    }






    @Override
    public String toString() {
        return "University1 [universityName=" + universityName + ", dean=" + dean + ", register=" + register
                + ", campuses=" + campuses + ", address=" + address + "]";
    }


}


