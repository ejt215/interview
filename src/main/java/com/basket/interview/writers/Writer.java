package com.basket.interview.writers;

import java.util.List;

public interface Writer<T> {
    void write(List<T> items);
}
