package com.example.bankbloodproject.model;

public class doonerModel  {
    private String name;
    private String age;
    private String address;
    private String password;
    private String dateDonate;
    private String donateBefore;
    private String donatePerson;
    private String gender;
    private String phoneNumber;
    private String TimeToConnected;
    private String nationalNumber;

    public doonerModel() {
    }

    public doonerModel(String name, String age, String address, String password, String dateDonate, String donateBefore, String donatePerson, String gender, String phoneNumber, String timeToConnected, String nationalNumber) {

        this.name = name;
        this.age = age;
        this.address = address;
        this.password = password;
        this.dateDonate = dateDonate;
        this.donateBefore = donateBefore;
        this.donatePerson = donatePerson;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        TimeToConnected = timeToConnected;
        this.nationalNumber = nationalNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setDateDonate(String dateDonate) {
        this.dateDonate = dateDonate;
    }

    public void setDonateBefore(String donateBefore) {
        this.donateBefore = donateBefore;
    }

    public void setDonatePerson(String donatePerson) {
        this.donatePerson = donatePerson;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setTimeToConnected(String timeToConnected) {
        TimeToConnected = timeToConnected;
    }

    public void setNationalNumber(String nationalNumber) {
        this.nationalNumber = nationalNumber;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getPassword() {
        return password;
    }

    public String getDateDonate() {
        return dateDonate;
    }

    public String getDonateBefore() {
        return donateBefore;
    }

    public String getDonatePerson() {
        return donatePerson;
    }

    public String getGender() {
        return gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getTimeToConnected() {
        return TimeToConnected;
    }

    public String getNationalNumber() {
        return nationalNumber;
    }
}
