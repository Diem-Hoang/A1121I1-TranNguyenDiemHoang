package CaseStudy.models;

public abstract class Facility {
    private String serviceName;
    private double usableArea;
    private double rentalCosts;
    private int maxPeople;
    private String rentalType;

    public Facility(){

    }
    public Facility(String serviceName, double usableArea, double rentalCosts, int maxPeople, String rentalType){
        this.serviceName = serviceName;
        this. usableArea = usableArea;
        this.rentalCosts = rentalCosts;
        this.maxPeople = maxPeople;
        this.rentalType = rentalType;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(double usableArea) {
        this.usableArea = usableArea;
    }

    public double getRentalCosts() {
        return rentalCosts;
    }

    public void setRentalCosts(double rentalCosts) {
        this.rentalCosts = rentalCosts;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }
}
