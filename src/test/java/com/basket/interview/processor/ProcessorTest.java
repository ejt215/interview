package com.basket.interview.processor;

import com.basket.interview.utils.CSVUtils;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

public class ProcessorTest {

    Path p;

    @BeforeEach
    public void setup() throws URISyntaxException {
        p = Paths.get(ClassLoader.getSystemResource("example-filtered.csv").toURI());
    }

    @Test
    public void isParseable(){
        try {
            CSVParser parser = CSVUtils.CSV_FORMAT.parse(Files.newBufferedReader(p));
        } catch (IOException e) {
            fail("couldn't parse file");
        }
    }

    @Test
    public void hasOnlyRecordsLessthanFiveDollars(){
        try {
            CSVParser parser = CSVUtils.CSV_FORMAT.parse(Files.newBufferedReader(p));
            for(CSVRecord record : parser.getRecords()){
                String listPrice = record.get(1);
                assertTrue(new BigDecimal(listPrice).compareTo(new BigDecimal("5.00")) < 0, String.format("list price %s not less than 5.00", listPrice));
            }
        } catch (IOException  e) {
            fail("couldn't parse file");
        }
    }
}
