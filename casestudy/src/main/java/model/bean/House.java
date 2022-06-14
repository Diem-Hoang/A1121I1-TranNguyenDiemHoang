package model.bean;

import model.bean.Facility;

public class House extends Facility {
    private String standardRoomHouse;
    private String descriptionConvenienceHouse;
    private int numberFloorsHouse;

    public House() {
    }
    public House(int id,
                 String serviceName,
                 double serviceArea,
                 double serviceCost,
                 int serviceMaxPeople,
                 String serviceRentalType,
                 String standardRoomHouse,
                 String descriptionConvenienceHouse,
                 int numberFloorsHouse) {
        super(id, serviceName, serviceArea, serviceCost, serviceMaxPeople, serviceRentalType);
        this.standardRoomHouse = standardRoomHouse;
        this.descriptionConvenienceHouse = descriptionConvenienceHouse;
        this.numberFloorsHouse = numberFloorsHouse;
    }

    public String getStandardRoomHouse() {
        return standardRoomHouse;
    }

    public void setStandardRoomHouse(String standardRoomHouse) {
        this.standardRoomHouse = standardRoomHouse;
    }

    public String getDescriptionConvenienceHouse() {
        return descriptionConvenienceHouse;
    }

    public void setDescriptionConvenienceHouse(String descriptionConvenienceHouse) {
        this.descriptionConvenienceHouse = descriptionConvenienceHouse;
    }

    public int getNumberFloorsHouse() {
        return numberFloorsHouse;
    }

    public void setNumberFloorsHouse(int numberFloorsHouse) {
        this.numberFloorsHouse = numberFloorsHouse;
    }
}
