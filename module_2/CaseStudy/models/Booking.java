package CaseStudy.models;

import java.util.Date;

public class Booking {
    private String idBooking;
    private String startDate;
    private String endDate;
    private String idCustomer;
    private String serviceName;
    private String serviceType;

    public Booking(int id, String startDate, String endDate, Customer customer, Facility facility){

    }
    public Booking(String idBooking, String startDate, String endDate, String idCustomer, String serviceName, String serviceType){
        this.idBooking = idBooking;
        this.startDate = startDate;
        this.endDate =endDate;
        this.idCustomer = idCustomer;
        this.serviceName = serviceName;
        this.serviceType = serviceType;
    }

    public String getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(String idBooking) {
        this.idBooking = idBooking;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }
}
