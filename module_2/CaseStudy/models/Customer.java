package CaseStudy.models;

import java.util.Date;

public class Customer extends  Person{
    private String customerType;
    private String address;

    public Customer(String name, String dateOfBirth, String gender, int idCardNumber, int phoneNumber, String email, String customerType, String address){
    }
    public Customer(String id, String name, String dateOfBirth, String gender, int idCardNumber, int phoneNumber, String email, String customerType, String address){
        super(id, name, dateOfBirth, gender, idCardNumber, phoneNumber, email);
        this.customerType = customerType;
        this.address = address;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nCustomer type: " + customerType +
                "\nAddress: " + address;
    }
}
