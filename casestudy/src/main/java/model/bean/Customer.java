package model.bean;

public class Customer extends Person {
    private boolean gender;
    private int idTypeCustomer;

    public Customer() {
    }

    public Customer(
                    String name,
                    String birthday,
                    boolean gender,
                    String idCard,
                    String phone,
                    String email,
                    String address,
                    int idTypeCustomer) {
        super(name, birthday, idCard, phone, email, address);
        this.gender = gender;
        this.idTypeCustomer = idTypeCustomer;
    }


    public Customer(int id,
                    String name,
                    String birthday,
                    boolean gender,
                    String idCard,
                    String phone,
                    String email,
                    String address,
                    int idTypeCustomer) {
        super(id, name, birthday, idCard, phone, email, address);
        this.gender = gender;
        this.idTypeCustomer = idTypeCustomer;
    }

    public boolean getGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getIdTypeCustomer() {
        return idTypeCustomer;
    }

    public void setIdTypeCustomer(int idTypeCustomer) {
        this.idTypeCustomer = idTypeCustomer;
    }

    @Override
    public String toString() {
        return super.toString() +"Customer{" +
                "gender=" + gender +
                ", idTypeCustomer=" + idTypeCustomer +
                '}';
    }
}
