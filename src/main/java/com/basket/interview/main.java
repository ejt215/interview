package com.basket.interview;

import com.basket.interview.processors.Processor;

public class main {
    public static void main(String[] args) {
        Processor processor = new Processor(){};
        processor.process("example.csv");
    }
}
