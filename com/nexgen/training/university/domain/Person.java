package com.nexgen.training.university.domain;

public class Person {

  private String name;
   private Address address;
   private String sex;
   private int dob;
   private int id;
   private long phoneNumber;

   private int courseId;

    public Person() {
    }

    public Person(String name, String sex, int dob, int id, long phoneNumber, int courseId) {
        this.name = name;
        this.sex = sex;
        this.dob = dob;
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.courseId = courseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getSex() {
        return sex;
    }
/*
* gender should be matches to Male or female
* */
    public void setSex(String sex) throws Exception {

        if(sex.toLowerCase().equals("male")){
            this.sex = sex;
        }else if (sex.toLowerCase().equals("female")){
            this.sex = sex;
        }else{
            throw new Exception("invalid gender");
        }

    }

    public int getDob() {
        return dob;
    }
/*
* date of birth should be like mm/dd/yy
* six integers
* */
    public void setDob(int dob) throws Exception {

        if (String.valueOf(dob).length() == 6) {

            this.dob = dob;
        }else {
            throw new Exception("invalid date of birth");
        }
    }

    public int getId() {
        return id;
    }
/*
* id length should be 4 digits
* if length greater than 4 it should show error
* */
    public void setId(int id) throws Exception {
        if(String.valueOf(id).length() == 4){
            this.id = id;
        }else{
            throw new Exception("invalid id");
        }

    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    /* phone number should not be null
   length should be 9 characters
    */
    public void setPhoneNumber(long phoneNumber) throws Exception {

        if (String.valueOf(phoneNumber).length() == 10) {

            this.phoneNumber = phoneNumber;
        }else {
            throw new Exception("invalid phone number length should be 10 inetegers");
        }

    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address=" + address +
                ", sex='" + sex + '\'' +
                ", dob=" + dob +
                ", id=" + id +
                ", phoneNumber=" + phoneNumber +
                ", courseId=" + courseId +
                '}';
    }
}
