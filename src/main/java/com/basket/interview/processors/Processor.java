package com.basket.interview.processors;

import org.apache.commons.csv.CSVRecord;

import java.math.BigDecimal;
import java.util.Collection;


public interface Processor {
    Collection<CSVRecord> process(Iterable<CSVRecord> records, BigDecimal priceLimit);
}
