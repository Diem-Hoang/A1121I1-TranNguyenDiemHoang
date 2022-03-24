package CaseStudy.models;

public class Employee extends Person{
    private String qualification;
    private String position;
    private int salary;

    public Employee(){

    }
    public Employee(String id, String name, String dateOfBirth, String gender, int idCardNumber, int phoneNumber, String email, String qualification, String position, int salary){
        super(id, name, dateOfBirth, gender, idCardNumber, phoneNumber, email);
        this.qualification = qualification;
        this.position = position;
        this. salary = salary;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
