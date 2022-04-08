package CaseStudy.services.Impl;

import CaseStudy.models.Booking;
import CaseStudy.models.Customer;
import CaseStudy.models.Facility;
import CaseStudy.services.BookingService;
import CaseStudy.services.ContactService;
import CaseStudy.utils.BookingComparator;

import java.util.*;

public class BookingServiceImpl implements BookingService {
    static Set<Booking> bookingSet = new TreeSet<>(new BookingComparator());

    //static
    static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();

    static{
    }

    @Override
    public void display() {
        
    }

    @Override
    public void addNew() {

    }

    @Override
    public void edit() {

    }

    @Override
    public void delete() {

    }

    public static class ContractServiceImpl implements ContactService {
        @Override
        public void display() {

        }

        @Override
        public void addNew() {

        }

        @Override
        public void edit() {

        }

        @Override
        public void delete() {

        }
    }
}
