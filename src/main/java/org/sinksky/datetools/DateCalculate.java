package org.sinksky.datetools;

import java.util.Date;

/**
 * 日期计算
 */
public class DateCalculate {

    /**
     * 日期
     */
    private Date date;

    /**
     * 构造函数
     * @param date
     */
    public DateCalculate(Date date) {
        this.date = date;
    }

    /**
     * 在某个日期之前
     * @param date 比较的日期
     * @return 是否在某个日期之前
     */
    public boolean before(Date date) {
        return this.date.before(date);
    }

    /**
     * 在某个日期之前
     * @param date 比较的日期
     * @return 是否在某个日期之前
     */
    public boolean before(Long date) {
        return this.date.getTime() < date;
    }

    /**
     * 在某个日期之后
     * @param date 比较的日期
     * @return 是否在某个日期之后
     */
    public boolean after(Date date) {
        return this.date.after(date);
    }

    /**
     * 在某个日期之后
     * @param date 比较的日期
     * @return 是否在某个日期之后
     */
    public boolean after(Long date) {
        return this.date.getTime() > date;
    }

    /**
     * 在两个日期之间
     * @param startDate 开始日期
     * @param endDate 结束日期
     * @return 是否在两个日期之间
     */
    public boolean between(Date startDate, Date endDate) {
        return this.date.after(startDate) && this.date.before(endDate);
    }

    /**
     * 在两个日期之间
     * @param startDate 开始日期
     * @param endDate 结束日期
     * @return 是否在两个日期之间
     */
    public boolean between(Long startDate, Long endDate) {
        return this.date.getTime() > startDate && this.date.getTime() < endDate;
    }

    /**
     * 日期相差秒数
     * @return 日期相差秒数
     */
    public long pastSeconds() {
        return (System.currentTimeMillis() - this.date.getTime()) / 1000;
    }

    /**
     * 日期相差分钟数
     * @return 日期相差分钟数
     */
    public long pastMinutes() {
        return pastSeconds() / 60;
    }

    /**
     * 日期相差小时数
     * @return 日期相差小时数
     */
    public long pastHours() {
        return pastMinutes() / 60;
    }

    /**
     * 日期相差天数
     * @return 日期相差天数
     */
    public long pastDays() {
        return pastHours() / 24;
    }

    /**
     * 日期相差月数
     * @return 日期相差月数
     */
    public long pastMonths() {
        return pastDays() / 30;
    }

    /**
     * 日期相差年数
     * @return 日期相差年数
     */
    public long pastYears() {
        return pastMonths() / 12;
    }

    /**
     * 日期相差详情
     * @return 日期相差详情
     */
    public String past() {
        return past(false);
    }

    /**
     * 日期相差详情
     * @param isOmit 是否省略
     * @return 日期相差详情
     */
    public String past(boolean isOmit) {
        StringBuffer sb = new StringBuffer();
        if (pastYears() > 0 ) {
            sb.append(pastYears() + "年");
            if (isOmit) {
                sb.append("前");
                return sb.toString();
            }
        }
        if (pastMonths() % 12 > 0) {
            sb.append(pastMonths() % 12 + "月");
            if (isOmit) {
                sb.append("前");
                return sb.toString();
            }
        }
        if (pastDays() % 30 > 0) {
            sb.append(pastDays() % 30 + "天");
            if (isOmit) {
                sb.append("前");
                return sb.toString();
            }
        }
        if (pastHours() % 24 > 0) {
            sb.append(pastHours() % 24 + "小时");
            if (isOmit) {
                sb.append("前");
                return sb.toString();
            }
        }
        if (pastMinutes() % 60 > 0) {
            sb.append(pastMinutes() % 60 + "分钟");
            if (isOmit) {
                sb.append("前");
                return sb.toString();
            }
        }
        if (pastSeconds() % 60 > 0) {
            sb.append(pastSeconds() % 60 + "秒");
            if (isOmit) {
                sb.append("前");
                return sb.toString();
            }
        }
        return sb.toString();
    }
}
