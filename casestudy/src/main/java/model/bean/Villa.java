package model.bean;

import model.bean.Facility;

public class Villa extends Facility {
    private String standardRoomVilla;
    private String descriptionConvenienceVilla;
    private double poolAreaVilla;
    private int numberFloorsVilla;

    public Villa() {
    }

    public Villa(int id,
                 String serviceName,
                 double serviceArea,
                 double serviceCost,
                 int serviceMaxPeople,
                 String serviceRentalType,
                 String standardRoomVilla,
                 String descriptionConvenienceVilla,
                 double poolAreaVilla,
                 int numberFloorsVilla) {
        super(id, serviceName, serviceArea, serviceCost, serviceMaxPeople, serviceRentalType);
        this.standardRoomVilla = standardRoomVilla;
        this.descriptionConvenienceVilla = descriptionConvenienceVilla;
        this.poolAreaVilla = poolAreaVilla;
        this.numberFloorsVilla = numberFloorsVilla;
    }

    public String getStandardRoomVilla() {
        return standardRoomVilla;
    }

    public void setStandardRoomVilla(String standardRoomVilla) {
        this.standardRoomVilla = standardRoomVilla;
    }

    public String getDescriptionConvenienceVilla() {
        return descriptionConvenienceVilla;
    }

    public void setDescriptionConvenienceVilla(String descriptionConvenienceVilla) {
        this.descriptionConvenienceVilla = descriptionConvenienceVilla;
    }

    public double getPoolAreaVilla() {
        return poolAreaVilla;
    }

    public void setPoolAreaVilla(double poolAreaVilla) {
        this.poolAreaVilla = poolAreaVilla;
    }

    public int getNumberFloorsVilla() {
        return numberFloorsVilla;
    }

    public void setNumberFloorsVilla(int numberFloorsVilla) {
        this.numberFloorsVilla = numberFloorsVilla;
    }
}
