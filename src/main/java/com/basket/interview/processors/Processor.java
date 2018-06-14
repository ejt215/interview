package com.basket.interview.processors;

import java.util.List;

public interface Processor<T> {
    default List<T> process(String path){
        throw new UnsupportedOperationException("please implement");
    };
}
