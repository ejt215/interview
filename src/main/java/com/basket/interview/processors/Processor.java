package com.basket.interview.processors;

import java.util.List;

public interface Processor<T> {
    List<T> process(String path);
}
