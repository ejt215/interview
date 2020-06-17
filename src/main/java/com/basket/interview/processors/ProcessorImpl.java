package com.basket.interview.processors;

import org.apache.commons.csv.CSVRecord;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.HashMap;

public class ProcessorImpl implements Processor {

    public static int IDINDEX = 0;
    public static int PRICEINDEX = 1;


    @Override
    public Collection<CSVRecord> process(Iterable<CSVRecord> records, BigDecimal priceLimit) {
        HashMap<String, CSVRecord> map = new HashMap();
        for (CSVRecord record : records) {
            BigDecimal price = new BigDecimal(record.get(PRICEINDEX));
            if ((price.compareTo(priceLimit) < 0) && !map.containsKey(record.get(IDINDEX))) {

                map.put(record.get(IDINDEX), record);
            }
        }
        return map.values();
    }
}
