package org.sinksky.datetools;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * 日期属性
 */
public class DateProperty {

    /**
     * 日期
     */
    private Date date;

    /**
     * 构造函数
     * @param date 日期
     */
    public DateProperty(Date date) {
        this.date = date;
    }

    /**
     * 获取年份字符串
     * @return 年份字符串
     */
    public String getYearString() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
        return sdf.format(date);
    }

    /**
     * 获取年份
     * @return 年份
     */
    public int getYear() {
        SimpleDateFormat sdf = new SimpleDateFormat("y");
        return Integer.parseInt(sdf.format(date));
    }

    /**
     * 获取月份字符串
     * @return 月份字符串
     */
    public String getMonthString() {
        SimpleDateFormat sdf = new SimpleDateFormat("MM");
        return sdf.format(date);
    }

    /**
     * 获取月份
     * @return 月份
     */
    public int getMonth() {
        SimpleDateFormat sdf = new SimpleDateFormat("M");
        return Integer.parseInt(sdf.format(date));
    }

    /**
     * 获取月份的天数字符串
     * @return 月份的天数字符串
     */
    public String getDayString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd");
        return sdf.format(date);
    }

    /**
     * 获取月份的天数
     * @return 月份的天数
     */
    public int getDay() {
        SimpleDateFormat sdf = new SimpleDateFormat("d");
        return Integer.parseInt(sdf.format(date));
    }

    /**
     * 获取小时字符串
     * @return 小时字符串
     */
    public String getHourString() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH");
        return sdf.format(date);
    }

    /**
     * 获取24小时制的小时
     * @return 24小时制的小时
     */
    public int getHour() {
        SimpleDateFormat sdf = new SimpleDateFormat("H");
        return Integer.parseInt(sdf.format(date));
    }

    /**
     * 获取12小时制的小时字符串
     * @return 12小时制的小时字符串
     */
    public String get12HourString() {
        SimpleDateFormat sdf = new SimpleDateFormat("hh");
        return sdf.format(date);
    }

    /**
     * 获取12小时制的小时
     * @return 12小时制的小时
     */
    public int get12Hour() {
        SimpleDateFormat sdf = new SimpleDateFormat("h");
        return Integer.parseInt(sdf.format(date));
    }

    /**
     * 获取AM/PM标识 中文
     * @return AM/PM标识 中文
     */
    public String getAmPmMarker() {
        SimpleDateFormat sdf = new SimpleDateFormat("a");
        return sdf.format(date);
    }

    /**
     * 获取AM/PM标识 英文
     * @return AM/PM标识 英文
     */
    public String getAmPmMarkerEN() {
        SimpleDateFormat sdf = new SimpleDateFormat("a", Locale.ENGLISH);
        return sdf.format(date);
    }

    /**
     * 获取分钟字符串
     * @return 分钟字符串
     */
    public String getMinuteString() {
        SimpleDateFormat sdf = new SimpleDateFormat("mm");
        return sdf.format(date);
    }

    /**
     * 获取分钟
     * @return 分钟
     */
    public int getMinute() {
        SimpleDateFormat sdf = new SimpleDateFormat("m");
        return Integer.parseInt(sdf.format(date));
    }

    /**
     * 获取秒字符串
     * @return 秒字符串
     */
    public String getSecondString() {
        SimpleDateFormat sdf = new SimpleDateFormat("ss");
        return sdf.format(date);
    }

    /**
     * 获取秒
     * @return 秒
     */
    public int getSecond() {
        SimpleDateFormat sdf = new SimpleDateFormat("s");
        return Integer.parseInt(sdf.format(date));
    }

    /**
     * 获取毫秒字符串
     * @return 毫秒字符串
     */
    public String getMillisecondString() {
        SimpleDateFormat sdf = new SimpleDateFormat("SSS");
        return sdf.format(date);
    }

    /**
     * 获取毫秒
     * @return 毫秒
     */
    public int getMillisecond() {
        SimpleDateFormat sdf = new SimpleDateFormat("S");
        return Integer.parseInt(sdf.format(date));
    }

    /**
     * 获取周几
     * @return 周几
     */
    public String getWeekString() {
        SimpleDateFormat sdf = new SimpleDateFormat("E");
        return sdf.format(date);
    }

    /**
     * 获取周几
     * @return 周几
     */
    public int getWeek() {
        SimpleDateFormat sdf = new SimpleDateFormat("u");
        return Integer.parseInt(sdf.format(date));
    }

    /**
     * 获取一年中的第几天
     * @return 一年中的第几天
     */
    public int getDayOfYear() {
        SimpleDateFormat sdf = new SimpleDateFormat("D");
        return Integer.parseInt(sdf.format(date));
    }

    /**
     * 获取一月中的第几天
     * @return 一月中的第几天
     */
    public int getDayOfMonth() {
        SimpleDateFormat sdf = new SimpleDateFormat("d");
        return Integer.parseInt(sdf.format(date));
    }

    /**
     * 获取一周中的第几天
     * @return 一周中的第几天
     */
    public int getDayOfWeek() {
        SimpleDateFormat sdf = new SimpleDateFormat("u");
        return Integer.parseInt(sdf.format(date));
    }

    /**
     * 获取一年中的第几周
     * @return 一年中的第几周
     */
    public int getWeekOfYear() {
        SimpleDateFormat sdf = new SimpleDateFormat("w");
        return Integer.parseInt(sdf.format(date));
    }

    /**
     * 获取一月中的第几周
     * @return 一月中的第几周
     */
    public int getWeekOfMonth() {
        SimpleDateFormat sdf = new SimpleDateFormat("W");
        return Integer.parseInt(sdf.format(date));
    }

    /**
     * 判断是否是闰年
     * @return 是否是闰年
     */
    public boolean isLeapYear() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int year = calendar.get(Calendar.YEAR);
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
}
