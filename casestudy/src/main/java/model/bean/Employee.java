package model.bean;

public class Employee extends Person{
    private double salary;
    private int idPosition;
    private int idEducationDegree;
    private int idDivision;
    private String username;

    public Employee(int employee_id, String employee_name, String employee_birthday, String employee_id_card, double employee_salary, String employee_phone, String employee_email, String employee_address, int position_id, int education_degree_id, int division_id, String username) {
    }

    public Employee(int id, String name, String birthday, String idCard, String phone, String email, String address, double salary, int idPosition, int idEducationDegree, int idDivision) {
        super(id, name, birthday, idCard, phone, email, address);
        this.salary = salary;
        this.idPosition = idPosition;
        this.idEducationDegree = idEducationDegree;
        this.idDivision = idDivision;
    }

    public Employee(String name, String birthday, String idCard, String phone, String email, String address, double salary, int idPosition, int idEducationDegree, int idDivision) {
        super(name, birthday, idCard, phone, email, address);
        this.salary = salary;
        this.idPosition = idPosition;
        this.idEducationDegree = idEducationDegree;
        this.idDivision = idDivision;
    }

    public Employee(int id, String name, String birthday, String idCard, String phone, String email, String address, double salary, int idPosition, int idEducationDegree, int idDivision, String username) {
        super(id, name, birthday, idCard, phone, email, address);
        this.salary = salary;
        this.idPosition = idPosition;
        this.idEducationDegree = idEducationDegree;
        this.idDivision = idDivision;
        this.username = username;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getIdPosition() {
        return idPosition;
    }

    public void setIdPosition(int idPosition) {
        this.idPosition = idPosition;
    }

    public int getIdEducationDegree() {
        return idEducationDegree;
    }

    public void setIdEducationDegree(int idEducationDegree) {
        this.idEducationDegree = idEducationDegree;
    }

    public int getIdDivision() {
        return idDivision;
    }

    public void setIdDivision(int idDivision) {
        this.idDivision = idDivision;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
