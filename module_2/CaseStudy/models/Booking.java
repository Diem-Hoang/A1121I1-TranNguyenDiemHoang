package CaseStudy.models;

import java.awt.print.Book;
import java.util.Date;

public class Booking {
    private String idBooking;
    private Date startDate;
    private Date endDate;
    private String idCustomer;
    private String serviceName;
    private String serviceType;

    public Booking(){

    }
    public Booking(String idBooking, Date startDate, Date endDate, String idCustomer, String serviceName, String serviceType){
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

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
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
