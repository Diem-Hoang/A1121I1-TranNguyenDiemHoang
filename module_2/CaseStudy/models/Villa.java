package CaseStudy.models;

public class Villa extends Facility{
    private String standardRoomVilla;
    private double areaPool;
    private int numberFloorVilla;

    public Villa(){

    }
    public Villa(String serviceName, double usableArea, double rentalCosts, int maxPeople, String rentalType, String standardRoomVilla, double areaPool, int floorNumber){
        super(serviceName, usableArea, rentalCosts, maxPeople, rentalType);
        this.standardRoomVilla = standardRoomVilla;
        this.areaPool = areaPool;
        this.numberFloorVilla = floorNumber;
    }

    public String getStandardRoomVilla() {
        return standardRoomVilla;
    }

    public void setStandardRoomVilla(String standardRoomVilla) {
        this.standardRoomVilla = standardRoomVilla;
    }

    public double getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(double areaPool) {
        this.areaPool = areaPool;
    }

    public int getFloorNumber() {
        return numberFloorVilla;
    }

    public void setFloorNumber(int floorNumber) {
        this.numberFloorVilla = floorNumber;
    }
}
