package org.example.newconcept;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
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
        System.out.println("start"+new Date());
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Minfy\\Downloads\\547767985611.csv"))) {
            String line;
            int lineNumber = 0;
            while ((line = br.readLine()) != null) {
                lineNumber++;
                int indexOfHeader = 0;
                if (lineNumber == 1) {
                    // Assuming the first line contains headers, process headers
                    String[] headers = line.split(","); // Adjust delimiter as needed
//                    Arrays.stream(headers).forEach(System.out::println);
                    // Example: ["Header1", "Header2", "Header3"]

                    // Find the index of the header you are interested in
                    indexOfHeader = findIndexOfHeader(headers, "lineItem/UsageAccountId");
                    System.out.println(indexOfHeader);
                    if (indexOfHeader == -1) {
//                        System.out.println("Header not found.");
                        return; // or continue; depending on your flow
                    }
                    // continue; // if you need to skip to next iteration
                } else {
                    // Process data lines
                    String[] values = line.split(","); // Adjust delimiter as needed

                    // Example: ["Value1", "Value2", "Value3"]

                    // Retrieve value based on header index
                    String valueOfInterest = values[indexOfHeader];

                    // Do something with valueOfInterest
//                    System.out.println("Value for Header2: " + valueOfInterest);
                }
            }
            System.out.println("end"+new Date());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int findIndexOfHeader(String[] headers, String headerToFind) {
        for (int i = 0; i < headers.length; i++) {
            System.out.println(headers[i]);
            if (headers[i].equalsIgnoreCase(headerToFind)) {
                return i;
            }
        }
        return -1; // Header not found
    }


}
