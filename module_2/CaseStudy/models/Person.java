package CaseStudy.models;

import java.util.Date;

public abstract class Person {
    private String id;
    private String name;
    private String dateOfBirth;
    private String gender;
    private int idCardNumber;
    private int phoneNumber;
    private String email;

    public Person(){

    }
    public Person(String id, String name, String dateOfBirth, String gender, int idCardNumber, int phoneNumber, String email){
        this.id = id;
        this.name = name;
        this.dateOfBirth =dateOfBirth;
        this.gender = gender;
        this.idCardNumber = idCardNumber;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getIdCardNumber() {
        return idCardNumber;
    }

    public void setIdCardNumber(int idCardNumber) {
        this.idCardNumber = idCardNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

   @Override
    public String toString(){
        return  "ID: " + id +
                "\nFull name: " + name +
                "\nDate Of Birth: " + dateOfBirth +
                "\nGender: " + gender +
                "\nIDCardNumber: " + idCardNumber +
                "\nPhone Number: " + phoneNumber +
                "\nEmail: " + email;
   }

}
