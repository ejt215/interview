package com.basket.interview.readers;

import java.util.stream.Stream;

public interface Reader<T> {
    Stream<T> read(String path);
}
