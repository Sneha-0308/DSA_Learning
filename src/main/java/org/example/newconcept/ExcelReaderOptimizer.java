package org.example.newconcept;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;

public class ExcelReaderOptimizer {
    public static void main(String[] args) throws IOException {
        /**
         * 10 seconds
         * System.out.println(new Date());
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Minfy\\Downloads\\547767985611.csv"));
        CSVParser parser = CSVFormat.DEFAULT.withDelimiter(',').withHeader().parse(br);
        int i=0;
        for (CSVRecord bill : parser) {
         bill.get("lineItem/UsageAccountId");
        }
        System.out.println(new Date());
//         */
        System.out.println(new Date());
        String fileName = "C:\\Users\\Minfy\\Downloads\\547767985611.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            int i=0;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println(new Date());
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
