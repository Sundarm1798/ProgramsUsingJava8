package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class FindYesterdayAndTomorrowDate {
    public static void main(String[] args) {
        LocalDate localDate=LocalDate.now();
        LocalDate yesterdayDate=localDate.minusDays(1);
        LocalDate tomorrowDate=localDate.plusDays(1);
        System.out.println("Today's date "+localDate);
        System.out.println("Yesterday date "+yesterdayDate);
        System.out.println("Tomorrow date "+tomorrowDate);
    }
}
