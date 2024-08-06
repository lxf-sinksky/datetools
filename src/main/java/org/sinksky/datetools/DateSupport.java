package org.sinksky.datetools;


import java.util.Date;

public final class DateSupport {

    private DateSupport() {
    }

    public static DateTools init() {
        return new DateProcessor();
    }

    public static DateTools init(Date date) {
        return new DateProcessor(date);
    }

    public static DateTools init(long time) {
        return new DateProcessor(time);
    }

    public static DateTools init(String source, String pattern) {
        return new DateProcessor(source, pattern);
    }

    public static DateTools init(String source) {
        return new DateProcessor(source);
    }

    public static DateTools init(int year, int month, int day, int hour, int minute, int second) {
        return new DateProcessor(year, month, day, hour, minute, second);
    }

    public static DateTools init(int year, int month, int day, int hour, int minute, int second, int millisecond) {
        return new DateProcessor(year, month, day, hour, minute, second, millisecond);
    }

    public static DateTools init(int year, int month, int day) {
        return new DateProcessor(year, month, day);
    }

}
