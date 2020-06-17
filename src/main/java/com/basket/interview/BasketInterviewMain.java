package com.basket.interview;

import com.basket.interview.processors.Processor;
import com.basket.interview.processors.ProcessorImpl;
import com.basket.interview.readers.Reader;
import com.basket.interview.readers.ReaderImpl;
import com.basket.interview.writers.Writer;
import com.basket.interview.writers.WriterImpl;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Collection;


public class BasketInterviewMain {
    public static void main(String[] args) {
            Reader reader = new ReaderImpl();
            Iterable records = reader.read("example.csv");
            Processor processor = new ProcessorImpl();
            Collection filtered = processor.process(records, new BigDecimal("5.00"));
            Writer writer = new WriterImpl();
            writer.write(filtered, "example-filtered.csv");


    }
}
