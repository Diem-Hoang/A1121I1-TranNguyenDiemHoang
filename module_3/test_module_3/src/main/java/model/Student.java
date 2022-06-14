package model;

public class Student {
    private int id;
    private String name;
    private String birthday;
    private String email;
    private int idStudentType;

    public Student() {
    }

    public Student(int id, String name, String birthday, String email, int idStudentType) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.email = email;
        this.idStudentType = idStudentType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdStudentType() {
        return idStudentType;
    }

    public void setIdStudentType(int idStudentType) {
        this.idStudentType = idStudentType;
    }
}
