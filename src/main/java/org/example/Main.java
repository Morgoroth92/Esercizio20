package org.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;

        LocalDateTime date1 = LocalDateTime.parse("2023-03-01T13:00:00Z", formatter);
        LocalDateTime date2 = LocalDateTime.parse("2024-03-01T13:00:00Z", formatter);

        boolean isFirstDateBeforeSecond = date1.isBefore(date2);
        boolean isSecondDateAfterFirst = date2.isAfter(date1);
        boolean areDatesEqualNow = date1.isEqual(LocalDateTime.now()) && date2.isEqual(LocalDateTime.now());

        System.out.println("Is the first date before the second? " + isFirstDateBeforeSecond);
        System.out.println("Is the second date after the first? " + isSecondDateAfterFirst);
        System.out.println("Are the dates equal to now? " + areDatesEqualNow);
    }
}