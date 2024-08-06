package org.sinksky.datetools;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

public class DateProcessor implements DateTools {

    private final SimpleDateFormat simpleDateFormatForParse = new SimpleDateFormat(DatePattern.TIME_24);
    private final SimpleDateFormat simpleDateFormatForOutput = new SimpleDateFormat(DatePattern.TIME_24);


    private Date date;

    public DateProcessor() {
        this.date = new Date();
    }

    public DateProcessor(Date date) {
        this.date = date;
    }

    public DateProcessor(long time) {
        this.date = new Date(time);
    }

    public DateProcessor(String source, String pattern) {
        applyPatternForParse(pattern);
        try {
            Date possibleDate = simpleDateFormatForParse.parse(source);
            String dateStr = simpleDateFormatForParse.format(possibleDate);
            if (!dateStr.equals(source)){
                throw new ParesStringToDateException("Failed to parse date from string: " + source + " with pattern: " + pattern + ".");
            }
            this.date = possibleDate;
        } catch (ParseException e){
            throw new ParesStringToDateException("Failed to parse date from string: " + source + " with pattern: " + pattern + ".");
        }
    }

    public DateProcessor(String source) {
        try {
            List<String> patternList = DatePattern.getPatternList();
            for (String pattern : patternList) {
                try {
                    if (pattern.length() == source.length()){
                        applyPatternForParse(pattern);
                        Date possibleDate = simpleDateFormatForParse.parse(source);
                        String dateStr = simpleDateFormatForParse.format(possibleDate);
                        if (dateStr.equals(source)){
                            this.date = possibleDate;
                            break;
                        }
                    }
                }catch (ParseException ignored){}
            }
            if (this.date == null){
                throw new ParseException("String: " + source + " automatically matching the pattern failed. Please use .set(String dateStr, String pattern) to manually specify the pattern.",0);
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }


    public DateProcessor(int year, int month, int day, int hour, int minute, int second) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month - 1);
        calendar.set(Calendar.DATE, day);
        calendar.set(Calendar.HOUR_OF_DAY, hour);
        calendar.set(Calendar.MINUTE, minute);
        calendar.set(Calendar.SECOND, second);
        calendar.set(Calendar.MILLISECOND, 0);
        this.date = calendar.getTime();
    }

    public DateProcessor(int year, int month, int day, int hour, int minute, int second, int millisecond) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month - 1);
        calendar.set(Calendar.DATE, day);
        calendar.set(Calendar.HOUR_OF_DAY, hour);
        calendar.set(Calendar.MINUTE, minute);
        calendar.set(Calendar.SECOND, second);
        calendar.set(Calendar.MILLISECOND, millisecond);
        this.date = calendar.getTime();
    }

    public DateProcessor(int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month - 1);
        calendar.set(Calendar.DATE, day);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        this.date = calendar.getTime();
    }

    @Override
    public DateTools setYear(int year) {
        Calendar calendar = getCalendar();
        calendar.set(Calendar.YEAR, year);
        this.date = calendar.getTime();
        return this;
    }

    @Override
    public DateTools setMonth(int month) {
        Calendar calendar = getCalendar();
        calendar.set(Calendar.MONTH, month - 1);
        this.date = calendar.getTime();
        return this;
    }

    @Override
    public DateTools setDay(int day) {
        Calendar calendar = getCalendar();
        calendar.set(Calendar.DATE, day);
        this.date = calendar.getTime();
        return this;
    }

    @Override
    public DateTools setHour(int hour) {
        Calendar calendar = getCalendar();
        calendar.set(Calendar.HOUR_OF_DAY, hour);
        this.date = calendar.getTime();
        return this;
    }

    @Override
    public DateTools setMinute(int minute) {
        Calendar calendar = getCalendar();
        calendar.set(Calendar.MINUTE, minute);
        this.date = calendar.getTime();
        return this;
    }

    @Override
    public DateTools setSecond(int second) {
        Calendar calendar = getCalendar();
        calendar.set(Calendar.SECOND, second);
        this.date = calendar.getTime();
        return this;
    }

    @Override
    public DateTools clearTime() {
        Calendar calendar = getCalendar();
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        this.date = calendar.getTime();
        return this;
    }

    @Override
    public DateTools setMillisecond(int millisecond) {
        Calendar calendar = getCalendar();
        calendar.set(Calendar.MILLISECOND, millisecond);
        this.date = calendar.getTime();
        return this;
    }

    @Override
    public DateTools skip(DateSkipType skipType, int amount) {
        Calendar calendar = getCalendar();
        calendar.add(skipType.getType(), amount);
        date = calendar.getTime();
        return this;
    }

    @Override
    public String toDateString() {
        return simpleDateFormatForOutput.format(this.date);
    }

    @Override
    public String toDateString(String pattern) {
        applyPatternForOutput(pattern);
        return simpleDateFormatForOutput.format(this.date);
    }



    @Override
    public long toTime() {
        return date.getTime();
    }

    @Override
    public Date toDate() {
        return this.date;
    }

    @Override
    public DateProperty prop() {
        return new DateProperty(this.date);
    }

    @Override
    public DateExtend extend() {
        return new DateExtend(this.date);
    }

    @Override
    public DateCalculate calc() {
        return new DateCalculate(this.date);
    }


    private Calendar getCalendar() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(this.date);
        return calendar;
    }


    /**
     * 应用日期格式化模板
     * @param pattern 日期格式化模板
     */
    private void applyPatternForParse(String pattern) {
        try {
            simpleDateFormatForParse.applyPattern(pattern);
        } catch (Exception e) {
            throw new InvalidPatternException("The date format pattern '" + pattern + "' is invalid.");
        }
    }

    /**
     * 应用日期格式化模板
     * @param pattern 日期格式化模板
     */
    private void applyPatternForOutput(String pattern) {
        try {
            simpleDateFormatForOutput.applyPattern(pattern);
        } catch (Exception e) {
            throw new InvalidPatternException("The date format pattern '" + pattern + "' is invalid.");
        }
    }


}
