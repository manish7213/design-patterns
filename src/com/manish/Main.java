package com.manish;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter fmt = new DateTimeFormatterBuilder()
                .parseCaseInsensitive()
                .appendPattern("MM/dd/yyyy hh:mm:ss a")
                .toFormatter(Locale.US);

        String date = localDateTime.format(fmt);

        System.out.println(date);

    }
}
