package CaseStudy.utils;

import CaseStudy.models.Booking;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;

public class BookingComparator implements Comparator<Booking> {
    @Override
    public int compare(Booking o1, Booking o2) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/mm/yyyy");
        LocalDate startDate1 = LocalDate.parse(o1.getStartDate(), formatter);
        LocalDate startDate2 = LocalDate.parse(o2.getStartDate(), formatter);
        LocalDate endDate1 = LocalDate.parse(o1.getEndDate(), formatter);
        LocalDate endDate2 = LocalDate.parse(o2.getEndDate(), formatter);

        if(startDate1.compareTo(startDate2) > 0){
            return 1;
        }else if(startDate1.compareTo(startDate2) < 0){
            return -1;
        }else{
            if(endDate1.compareTo(endDate2) > 0){
                return 1;
            }else if(endDate1.compareTo(endDate2) < 0){
                return -1;
            }else{
                return 0;
            }
        }
    }
}

