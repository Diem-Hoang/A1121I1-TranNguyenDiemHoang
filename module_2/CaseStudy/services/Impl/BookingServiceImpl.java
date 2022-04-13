package CaseStudy.services.Impl;

import CaseStudy.models.Booking;
import CaseStudy.models.Customer;
import CaseStudy.models.Facility;
import CaseStudy.models.Villa;
import CaseStudy.services.BookingService;
import CaseStudy.services.ContactService;
import CaseStudy.utils.BookingComparator;

import java.util.*;

public class BookingServiceImpl implements BookingService {
    static Scanner scanner = new Scanner(System.in);
    static Set<Booking> bookingSet = new TreeSet<>(new BookingComparator());
    static List<Customer> customerList = new ArrayList<>();
    static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();

    static{
        customerList.add(new Customer("01", "Diem Hoang", "10/06/2001", "female", 123455, 3584530, "diemhoang@gmail.com", "VIP", "DaNang"));
        customerList.add(new Customer("02", "Nhu Ngoc", "23/08/2001", "female", 126795, 2454530, "nhungoc@gmail.com", "VIP", "HaNoi"));
        customerList.add(new Customer("03", "Phuong Tram", "14/05/2001", "female", 123445, 3584340, "phuongtram@gmail.com", "NORMAL", "DaNang"));

        facilityIntegerMap.put(new Villa(01, "Villa 01", 200, 150, 10, "DAY", "VIP", 15, 2), 0);
        facilityIntegerMap.put(new Villa(02, "Villa 02", 150, 250, 12, "HOUR", "VIP", 20, 1), 0);
        facilityIntegerMap.put(new Villa(03, "Villa 03", 300, 350, 15, "MONTH", "NORMAL", 25, 4), 0);
    }
    public Set<Booking> sendBooking(){
        return bookingSet;
    }

    @Override
    public void display() {
        for(Booking booking : bookingSet){
            System.out.println(booking.toString());
        }
    }

    @Override
    public void addNew() {
        int id = 1;
        if(!bookingSet.isEmpty()){
            id = bookingSet.size();
        }
        Customer customer = chooseCustomer();
        Facility facility = chooseFacility();
        System.out.println("Enter rental start date: ");
        String startDate = scanner.nextLine();
        System.out.println("Enter check-out date: ");
        String endDate = scanner.nextLine();
        Booking booking = new Booking(id, startDate, endDate, customer, facility);

        bookingSet.add(booking);
        System.out.println("Booking success!");
    }

    @Override
    public void edit() {

    }

    @Override
    public void delete() {

    }
    public static Customer chooseCustomer(){
        System.out.println("List customer: ");
        for(Customer customer : customerList){
            System.out.println(customer.toString());
        }
        System.out.println("Enter ID customer: ");
        boolean check = true;
        String id = scanner.nextLine();

        while(check){
            for(Customer customer : customerList){
                if(id != null && id.equals(customer.getId())){
                    check = false;
                    return customer;
                }
            }
            if(check){
                System.out.println("Error! Please enter again!");
                id = scanner.nextLine();
            }
        }
        return null;
    }

    public static Facility chooseFacility(){
        System.out.println("List service: ");
        for(Map.Entry<Facility, Integer> entry : facilityIntegerMap.entrySet()){
            System.out.println(entry.getKey().toString());
        }
        System.out.println("Enter ID service: ");
        boolean check = true;
        String id = scanner.nextLine();

        while(check){
            for(Map.Entry<Facility, Integer> entry : facilityIntegerMap.entrySet()){
                if(id.equals(entry.getKey().getId())){
                    check = false;
                    return entry.getKey();
                }
            }
            if(check){
                System.out.println("Error! Please enter again!");
                id = scanner.nextLine();
            }
        }
        return null;
    }

}
