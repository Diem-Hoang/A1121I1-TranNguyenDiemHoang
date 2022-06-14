package model.bean;

public class RentType {
    private int rent_type_id;
    private String rent_type_id_name;
    private double rent_type_cost;

    public RentType(int rent_type_id, String rent_type_id_name, double rent_type_cost) {
        this.rent_type_id = rent_type_id;
        this.rent_type_id_name = rent_type_id_name;
        this.rent_type_cost = rent_type_cost;
    }

    public int getRent_type_id() {
        return rent_type_id;
    }

    public String getRent_type_id_name() {
        return rent_type_id_name;
    }

    public double getRent_type_cost() {
        return rent_type_cost;
    }
}
