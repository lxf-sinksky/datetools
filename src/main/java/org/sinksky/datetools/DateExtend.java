package org.sinksky.datetools;

import java.util.Calendar;
import java.util.Date;

/**
 * 日期扩展
 */
public class DateExtend {

    /**
     * 日期
     */
    private Date date;

    /**
     * 构造函数
     * @param date 日期
     */
    public DateExtend(Date date) {
        this.date = date;
    }

    /**
     * 获取今日的开始时间
     * @return 今日的开始时间
     */
    public DateTools startOfDay() {
        return DateTools.set(date).clearTime();
    }

    /**
     * 获取今日的结束时间
     * @return 今日的结束时间
     */
    public DateTools endOfDay() {
        return DateTools.set(date).setHour(23).setMinute(59).setSecond(59).setMillisecond(999);
    }

    /**
     * 获取本月的第一天
     * @return 本月的第一天
     */
    public DateTools startOfMonth() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(this.date);
        calendar.set(Calendar.DATE, 1);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        this.date = calendar.getTime();
        return DateTools.set(this.date);
    }

    /**
     * 获取本月的最后一天
     * @return 本月的最后一天
     */
    public DateTools endOfMonth() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(this.date);
        calendar.set(Calendar.DATE, calendar.getActualMaximum(Calendar.DATE));
        calendar.set(Calendar.HOUR_OF_DAY, 23);
        calendar.set(Calendar.MINUTE, 59);
        calendar.set(Calendar.SECOND, 59);
        calendar.set(Calendar.MILLISECOND, 999);
        this.date = calendar.getTime();
        return DateTools.set(this.date);
    }

    /**
     * 获取本周的第一天
     * @return 本周的第一天
     */
    public DateTools startOfWeek() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(this.date);
        calendar.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        this.date = calendar.getTime();
        return DateTools.set(this.date);
    }

    /**
     * 获取本周工作日的最后一天
     * @return 本周工作日的最后一天
     */
    public DateTools endOfWeekWork() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(this.date);
        calendar.set(Calendar.DAY_OF_WEEK, Calendar.FRIDAY);
        calendar.set(Calendar.HOUR_OF_DAY, 23);
        calendar.set(Calendar.MINUTE, 59);
        calendar.set(Calendar.SECOND, 59);
        calendar.set(Calendar.MILLISECOND, 999);
        this.date = calendar.getTime();
        return DateTools.set(this.date);
    }

    /**
     * 获取本周的最后一天
     * @return 本周的最后一天
     */
    public DateTools endOfWeek() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(this.date);
        calendar.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
        calendar.add(Calendar.WEEK_OF_YEAR, 1);
        calendar.set(Calendar.HOUR_OF_DAY, 23);
        calendar.set(Calendar.MINUTE, 59);
        calendar.set(Calendar.SECOND, 59);
        calendar.set(Calendar.MILLISECOND, 999);
        this.date = calendar.getTime();
        return DateTools.set(this.date);
    }

    /**
     * 获取本年的第一天
     * @return 本年的第一天
     */
    public DateTools startOfYear() {
        return DateTools.set(this.date).setMonth(1).setDay(1).clearTime();
    }

    /**
     * 获取本年的最后一天
     * @return 本年的最后一天
     */
    public DateTools endOfYear() {
        return DateTools.set(this.date).setMonth(12).setDay(31).setHour(23).setMinute(59).setSecond(59).setMillisecond(999);
    }
}
