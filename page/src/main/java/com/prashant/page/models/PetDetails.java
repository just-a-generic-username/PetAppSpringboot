package com.prashant.page.models;

public class PetDetails {

    private String name;
    private String age;
    private String gender;
    private String size;
    private String location;
    private String contactNumber;
    private String contactEmail;
    private String owner;
    private String detail;

    public PetDetails(String name, String age, String gender, String size, String location, String contactNumber, String contactEmail, String owner, String detail) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.size = size;
        this.location = location;
        this.contactNumber = contactNumber;
        this.contactEmail = contactEmail;
        this.owner = owner;
        this.detail = detail;
    }

    public PetDetails() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
