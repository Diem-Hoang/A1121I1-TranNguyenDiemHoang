package model.bean;

import model.bean.Facility;

public class Room extends Facility {
    private String serviceFree;

    public Room() {
    }

    public Room(int id, String serviceName, double serviceArea, double serviceCost, int serviceMaxPeople, String serviceRentalType, String serviceFree) {
        super(id, serviceName, serviceArea, serviceCost, serviceMaxPeople, serviceRentalType);
        this.serviceFree = serviceFree;
    }

    public String getServiceFree() {
        return serviceFree;
    }

    public void setServiceFree(String serviceFree) {
        this.serviceFree = serviceFree;
    }
}
