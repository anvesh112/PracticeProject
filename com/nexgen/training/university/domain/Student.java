package com.nexgen.training.university.domain;

public class Student {

   private String course;

   private Address address;

   private Person person;

   public  Student(){}

    public Student( Person person,String course,Address address) {
         this.course = course;
        this.address = address;
        this.person = person;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
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
        return "Student [course=" + course + ", person=" + person + ", address=" + address +  "]";
    }


}



