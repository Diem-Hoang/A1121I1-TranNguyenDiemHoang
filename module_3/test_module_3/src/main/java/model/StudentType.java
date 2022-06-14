package model;

public class StudentType {
    private int id;
    private String nameType;

    public StudentType() {
    }

    public StudentType(int id, String nameType) {
        this.id = id;
        this.nameType = nameType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameType() {
        return nameType;
    }

    public void setNameType(String nameType) {
        this.nameType = nameType;
    }
}
