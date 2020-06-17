package com.basket.interview.writers;

import org.apache.commons.csv.CSVRecord;

import java.util.Collection;

public interface Writer {
    void write(Collection<CSVRecord> items, String fileName);
}
