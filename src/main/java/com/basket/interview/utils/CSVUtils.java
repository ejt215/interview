package com.basket.interview.utils;

import lombok.NonNull;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.QuoteMode;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class CSVUtils {
    private static final DateTimeFormatter DATE_TIME_CSV_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public static final CSVFormat CSV_FORMAT = CSVFormat.DEFAULT
            .withDelimiter(',')
            .withNullString("")
            .withIgnoreEmptyLines()
            .withQuoteMode(QuoteMode.ALL)
            .withEscape('\\')
            .withIgnoreSurroundingSpaces();

    public static List<CSVRecord> readLine(String line) {
        try {
            CSVParser parser = CSVParser.parse(line, CSV_FORMAT);
            return parser.getRecords();
        } catch (IOException e) {
            throw new RuntimeException("Error while reading line " + line, e);
        }
    }

    public static String deserialize(@NonNull LocalDateTime localDateTime) {
        return DATE_TIME_CSV_FORMATTER.format(localDateTime);
    }
}
