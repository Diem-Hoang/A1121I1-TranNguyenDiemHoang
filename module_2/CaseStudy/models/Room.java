package CaseStudy.models;

public class Room extends Facility{
    private String serviceFree;

    public Room(){

    }
    public Room(int id, String serviceName, double usableArea, double rentalCosts, int maxPeople, String rentalType, String serviceFree){
        super(id, serviceName, usableArea, rentalCosts, maxPeople, rentalType);
        this.serviceFree = serviceFree;
    }

    public String getServiceFree() {
        return serviceFree;
    }

    public void setServiceFree(String serviceFree) {
        this.serviceFree = serviceFree;
    }
}
