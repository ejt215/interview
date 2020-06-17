package com.basket.interview.readers;

import com.basket.interview.utils.CSVUtils;
import org.apache.commons.csv.CSVParser;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class ReaderImpl implements Reader {


    @Override
    public Iterable read(String path) {
        try {
            Path p = open(path);
            return CSVUtils.CSV_FORMAT.parse(Files.newBufferedReader(p));
        } catch (IOException e) {
            return new ArrayList<>();

        }
    }

    public Path open(String file) throws FileNotFoundException {
        try {
            URI uri = ClassLoader.getSystemResource(file).toURI();
            return Paths.get(uri);
        } catch (NullPointerException | URISyntaxException e) {
            throw new FileNotFoundException("File not found");
        }
    }


}
