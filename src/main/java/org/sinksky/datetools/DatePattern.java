package org.sinksky.datetools;


import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;


public class DatePattern {

    //带毫秒的12小时制时间格式
    public static final String ALL_TIME_12 = "yyyy-MM-dd hh:mm:ss SSS";
    //带毫秒的12小时制时间格式
    public static final String ALL_TIME_12_SLASH = "yyyy/MM/dd hh:mm:ss SSS";
    //带毫秒的12小时制时间格式
    public static final String ALL_TIME_12_DOT = "yyyy.MM.dd hh:mm:ss SSS";
    //带毫秒的12小时制时间格式
    public static final String ALL_TIME_12_CHINA = "yyyy年MM月dd日 hh:mm:ss SSS";
    //带毫秒的24小时制时间格式
    public static final String ALL_TIME_24 = "yyyy-MM-dd HH:mm:ss SSS";
    //带毫秒的24小时制时间格式
    public static final String ALL_TIME_24_SLASH = "yyyy/MM/dd HH:mm:ss SSS";
    //带毫秒的24小时制时间格式
    public static final String ALL_TIME_24_DOT = "yyyy.MM.dd HH:mm:ss SSS";
    //带毫秒的24小时制时间格式
    public static final String ALL_TIME_24_CHINA = "yyyy年MM月dd日 HH:mm:ss SSS";
    //不带毫秒的12小时制时间格式
    public static final String TIME_12 = "yyyy-MM-dd hh:mm:ss";
    //不带毫秒的12小时制时间格式
    public static final String TIME_12_SLASH = "yyyy/MM/dd hh:mm:ss";
    //不带毫秒的12小时制时间格式
    public static final String TIME_12_DOT = "yyyy.MM.dd hh:mm:ss";
    //不带毫秒的12小时制时间格式
    public static final String TIME_12_CHINA = "yyyy年MM月dd日 hh:mm:ss";
    //不带毫秒的24小时制时间格式
    public static final String TIME_24 = "yyyy-MM-dd HH:mm:ss";
    //不带毫秒的24小时制时间格式
    public static final String TIME_24_SLASH = "yyyy/MM/dd HH:mm:ss";
    //不带毫秒的24小时制时间格式
    public static final String TIME_24_DOT = "yyyy.MM.dd HH:mm:ss";
    //不带毫秒的24小时制时间格式
    public static final String TIME_24_CHINA = "yyyy年MM月dd日 HH:mm:ss";
    //只有年月日的时间格式
    public static final String DATE = "yyyy-MM-dd";
    //只有年月日的时间格式
    public static final String DATE_SLASH = "yyyy/MM/dd";
    //只有年月日的时间格式
    public static final String DATE_DOT = "yyyy.MM.dd";
    //只有年月日的时间格式
    public static final String DATE_CONNECT = "yyyyMMdd";
    //只有年月日的时间格式
    public static final String DATE_CHINA = "yyyy年MM月dd日";
    //只有年月的时间格式
    public static final String YEAR_MONTH = "yyyy-MM";
    //只有年月的时间格式
    public static final String YEAR_MONTH_SLASH = "yyyy/MM";
    //只有年月的时间格式
    public static final String YEAR_MONTH_DOT = "yyyy.MM";
    //只有年月的时间格式
    public static final String YEAR_MONTH_CONNECT = "yyyyMM";
    //只有年月的时间格式
    public static final String YEAR_MONTH_CHINA = "yyyy年MM月";
    //24小时制只有时间的格式
    public static final String ONLY_TIME_24 = "HH:mm:ss";
    //12小时制只有时间的格式
    public static final String ONLY_TIME_12 = "hh:mm:ss";
    //24小时制只有时钟和分钟的格式
    public static final String HOUR_MINUTE_24 = "HH:mm";
    //12小时制只有时钟和分钟的格式
    public static final String HOUR_MINUTE_12 = "hh:mm";
    //年份
    public static final String YEAR = "yyyy";
    //月份
    public static final String MONTH = "MM";
    //日期
    public static final String DAY = "dd";
    //24小时制小时数
    public static final String HOUR_12 = "hh";
    //12小时制小时数
    public static final String HOUR_24 = "HH";
    //分钟
    public static final String MINUTE = "mm";
    //秒
    public static final String SECOND = "ss";
    //毫秒
    public static final String MILLISECOND = "SSS";


    public static List<String> getPatternList() throws IllegalAccessException {
        DatePattern datePattern = new DatePattern();
        Field[] fields = DatePattern.class.getDeclaredFields();
        List<String> patternList = new ArrayList<>();
        for (Field field : fields) {
            if (field.getType() == String.class) {
                if (field.get(datePattern) != null) {
                    if (!field.getName().equals("YEAR") && !field.getName().equals("MM") && !field.getName().equals("dd") && !field.getName().equals("hh") && !field.getName().equals("HH") && !field.getName().equals("mm") && !field.getName().equals("ss") && !field.getName().equals("SSS")){
                        patternList.add((String) field.get(datePattern));
                    }
                }
            }
        }
        return patternList;
    }


}
