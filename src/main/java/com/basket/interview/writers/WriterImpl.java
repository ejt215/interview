package com.basket.interview.writers;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;

public class WriterImpl implements Writer {

    @Override
    public void write(Collection<CSVRecord> items, String fileName) {
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            CSVPrinter printer = new CSVPrinter(fileWriter, CSVFormat.DEFAULT);
            printer.printRecords(items);
            printer.close();
        } catch (IOException ex) {
            System.out.println("Unable to write file");
        }
    }
}
