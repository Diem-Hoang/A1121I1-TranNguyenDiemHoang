package com.codegym.formregister.entity;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( name = "id")
    private int id;

    @NotBlank(message = "{notempty}")
    @Size(max = 45, min = 5, message = "Không đúng số ký tự!")
    private String firstname;

    @NotBlank(message = "{notempty}")
    @Size(max = 45, min = 5, message = "Không đúng số ký tự!")
    private String lastname;

    @Min(value = 18, message = "{ageMin}")
    private int age;

    @Email(message = "Email không đúng định dạng!")
    private String email;

    private String phoneNumber;


    public Account() {
    }

    public Account(int id, @NotBlank(message = "{notempty}") @Size(max = 45, min = 5, message = "Không đúng số ký tự!") String firstname, @NotBlank(message = "{notempty}") @Size(max = 45, min = 5, message = "Không đúng số ký tự!") String lastname, @Min(value = 18, message = "{ageMin}") int age, @Email(message = "Email không đúng định dạng!") String email, String phoneNumber) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
