package org.example.newconcept;

import java.io.IOException;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

public class ExcelReaderOptimizer {
    public static void main(String[] args) {
//        int currentYear = YearMonth.now().getYear();
//        int startMonth = 4;
//        int totalMonths = 12;
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-yyyy");
//        for (int i = 0; i < totalMonths; i++) {
//            YearMonth yearMonth = YearMonth.of(currentYear, startMonth).plusMonths(i);
//            System.out.println(yearMonth.format(formatter));
//        }
        String date="04/03/2023";
        if(date.contains("/"))
            date=date.replaceAll("/","-");
        System.out.println(date);

    }
}




