package CaseStudy.models;

import java.util.Date;

public abstract class Person {
    private String id;
    private String name;
    private Date dateOfBirth;
    private String gender;
    private int idCardNumber;
    private int phoneNumber;
    private String email;

    public Person(){

    }
    public Person(String id, String name, Date dateOfBirth, String gender, int idCardNumber, int phoneNumber, String email){
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

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
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
}
