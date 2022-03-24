package CaseStudy.models;

public class House extends Facility{
    private String standardRoomHouse;
    private int numberFloorHouse;

    public House(){

    }
    public House(String serviceName, double usableArea, double rentalCosts, int maxPeople, String rentalType, String standardRoomHouse, int numberFloorHouse){
        super(serviceName, usableArea, rentalCosts, maxPeople, rentalType);
        this.standardRoomHouse =standardRoomHouse;
        this.numberFloorHouse = numberFloorHouse;
    }

    public String getStandardRoomHouse() {
        return standardRoomHouse;
    }

    public void setStandardRoomHouse(String standardRoomHouse) {
        this.standardRoomHouse = standardRoomHouse;
    }

    public int getNumberFloorHouse() {
        return numberFloorHouse;
    }

    public void setNumberFloorHouse(int numberFloorHouse) {
        this.numberFloorHouse = numberFloorHouse;
    }
}
