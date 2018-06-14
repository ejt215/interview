package com.basket.interview.writers;

import java.util.List;

public interface Writer<T> {
    public void Write(List<T> items);
}
