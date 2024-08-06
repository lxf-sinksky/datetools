package org.sinksky.datetools;

import java.util.Calendar;

/**
 * 日期跳过类型
 */
public enum DateSkipType {

    /**
     * 年
     */
    YEAR(Calendar.YEAR),
    /**
     * 月
     */
    MONTH(Calendar.MONTH),
    /**
     * 日
     */
    DAY(Calendar.DATE),
    /**
     * 时
     */
    HOUR(Calendar.HOUR),
    /**
     * 分
     */
    MINUTE(Calendar.MINUTE),
    /**
     * 秒
     */
    SECOND(Calendar.SECOND),
    /**
     * 毫秒
     */
    MILLISECOND(Calendar.MILLISECOND);


    private int type;

    DateSkipType(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }


}
