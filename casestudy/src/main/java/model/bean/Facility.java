package model.bean;

public abstract class Facility {
    private int id;
    private String serviceName;
    private double serviceArea;
    private double serviceCost;
    private int serviceMaxPeople;
    private String serviceRentalType;

    public Facility() {
    }

    public Facility(int id, String serviceName, double serviceArea, double serviceCost, int serviceMaxPeople, String serviceRentalType) {
        this.id = id;
        this.serviceName = serviceName;
        this.serviceArea = serviceArea;
        this.serviceCost = serviceCost;
        this.serviceMaxPeople = serviceMaxPeople;
        this.serviceRentalType = serviceRentalType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getServiceArea() {
        return serviceArea;
    }

    public void setServiceArea(double serviceArea) {
        this.serviceArea = serviceArea;
    }

    public double getServiceCost() {
        return serviceCost;
    }

    public void setServiceCost(double serviceCost) {
        this.serviceCost = serviceCost;
    }

    public int getServiceMaxPeople() {
        return serviceMaxPeople;
    }

    public void setServiceMaxPeople(int serviceMaxPeople) {
        this.serviceMaxPeople = serviceMaxPeople;
    }

    public String getServiceRentalType() {
        return serviceRentalType;
    }

    public void setServiceRentalType(String serviceRentalType) {
        this.serviceRentalType = serviceRentalType;
    }
}
