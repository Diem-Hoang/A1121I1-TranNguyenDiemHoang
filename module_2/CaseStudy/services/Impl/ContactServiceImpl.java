package CaseStudy.services.Impl;

import CaseStudy.models.Booking;
import CaseStudy.models.Contract;
import CaseStudy.models.Customer;
import CaseStudy.services.ContactService;
import nhap.A;

import java.awt.*;
import java.awt.List;
import java.util.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class ContactServiceImpl implements ContactService {
    static ArrayList<Contract> contractList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {

    }

    @Override
    public void addNew() {
        Queue<Booking> bookingsQueue = new LinkedList<>();
        Set<Booking> bookingSet = new BookingServiceImpl().sendBooking();
        for(Booking booking : bookingSet){
            bookingsQueue.add(booking);
        }
        Booking booking = bookingsQueue.poll();
        String idCustomer = booking.getIdCustomer();

        System.out.println("Creating contract for booking with information: " + booking.toString());
        System.out.println("Creating contract for customer with information: " + idCustomer.toString());
        System.out.print("Enter id contract: ");
        String id = scanner.nextLine();
        System.out.println("Enter prepayment amount: ");
        int pre = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the cost number: ");
        int pay = Integer.parseInt(scanner.nextLine());

        //Contract contract = new Contract(id,booking, )
    }

    @Override
    public void edit() {

    }

    @Override
    public void delete() {

    }
}
