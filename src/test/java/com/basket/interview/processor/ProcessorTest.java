package com.basket.interview.processor;

import com.basket.interview.utils.CSVUtils;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.math.BigDecimal;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

class ProcessorTest {

    private Path p;

    @BeforeEach
    void setup() {
        try {
            URI uri = ClassLoader.getSystemResource("example-filtered.csv").toURI();
            p = Paths.get(uri);
        } catch (NullPointerException | URISyntaxException e) {
            fail("couldn't find file",e);
        }
    }

    @Test
    void isParseable(){
        try {
            CSVParser parser = CSVUtils.CSV_FORMAT.parse(Files.newBufferedReader(p));
        } catch (IOException e) {
            fail("couldn't parse file", e);
        }
    }

    @Test
    void hasOnlyRecordsLessthanFiveDollars(){
        try {
            CSVParser parser = CSVUtils.CSV_FORMAT.parse(Files.newBufferedReader(p));
            for(CSVRecord record : parser.getRecords()){
                String listPrice = record.get(1);
                assertTrue(new BigDecimal(listPrice).compareTo(new BigDecimal("5.00")) < 0, String.format("list price %s not less than 5.00", listPrice));
            }
        } catch (IOException  e) {
            fail("couldn't parse file", e);
        }
    }
}
