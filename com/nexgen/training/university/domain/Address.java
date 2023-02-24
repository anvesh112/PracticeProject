package com.nexgen.training.university.domain;


public class Address {
   private int number;
   private String street;

   private int appartmentnumber;
   private String city;

   private int zipcode;
   private String state;

   public Address(){

   }

    public Address(int number, String street, int appartmentnumber, String city, int zipcode, String state) {
        this.number = number;
        this.street = street;
        this.appartmentnumber = appartmentnumber;
        this.city = city;
        this.zipcode = zipcode;
        this.state = state;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getAppartmentnumber() {
        return appartmentnumber;
    }

    public void setAppartmentnumber(int appartmentnumber) {
        this.appartmentnumber = appartmentnumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Address [number=" + number + ", street=" + street + ", appartmentnumber=" + appartmentnumber
                + ", city=" + city + ", zipcode=" + zipcode + ", state=" + state + "]";
    }


}

