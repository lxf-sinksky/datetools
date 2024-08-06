package org.sinksky.datetools;

import java.util.Date;

/**
 * <h3>DateTools时间工具类</h3>
 * <br>
 * DateTools是一个对时间或日期进行操作的工具类，提供了一系列的时间或日期的操作方法，支持链式调用。
 * <br>
 * <p> </p>
 * <strong>初始化时间：</strong>
 * <table>
 *     <tr>
 *         <td>DateTools.set() -> DateTools</td>
 *         <td>初始化时间为当前时间</td>
 *     </tr>
 *     <tr>
 *         <td>DateTools.set(Date date) -> DateTools</td>
 *         <td>初始化时间为传入的Date对象</td>
 *     </tr>
 *     <tr>
 *         <td>DateTools.set(long time) -> DateTools</td>
 *         <td>初始化时间为传入的时间戳</td>
 *     </tr>
 *     <tr>
 *         <td>DateTools.set(String source, String pattern) -> DateTools</td>
 *         <td>初始化时间为传入的时间字符串</td>
 *     </tr>
 *     <tr>
 *         <td>DateTools.set(String source) -> DateTools</td>
 *         <td>初始化时间为传入的时间字符串(根据DatePattern中的模板自适应转换)</td>
 *     </tr>
 *     <tr>
 *         <td>DateTools.set(int year, int month, int day) -> DateTools</td>
 *         <td>初始化时间为传入的时间属性</td>
 *     </tr>
 *     <tr>
 *         <td>DateTools.set(int year, int month, int day, int hour, int minute, int second) -> DateTools</td>
 *         <td>初始化时间为传入的时间属性</td>
 *     </tr>
 *     <tr>
 *         <td>DateTools.set(int year, int month, int day, int hour, int minute, int second, int millisecond) -> DateTools</td>
 *         <td>初始化时间为传入的时间属性</td>
 *     </tr>
 * </table>
 * <br>
 * <strong>对时间的简单操作：</strong>
 * <table>
 *     <tr>
 *         <td>DateTools.set().setYear(int year) -> DateTools</td>
 *         <td>设置年份</td>
 *     </tr>
 *     <tr>
 *         <td>DateTools.set().setMonth(int month) -> DateTools</td>
 *         <td>设置月份</td>
 *     </tr>
 *     <tr>
 *         <td>DateTools.set().setDay(int day) -> DateTools</td>
 *         <td>设置日期</td>
 *     </tr>
 *     <tr>
 *         <td>DateTools.set().setHour(int hour) -> DateTools</td>
 *         <td>设置小时</td>
 *     </tr>
 *     <tr>
 *         <td>DateTools.set().setMinute(int minute) -> DateTools</td>
 *         <td>设置分钟</td>
 *     </tr>
 *     <tr>
 *         <td>DateTools.set().setSecond(int second) -> DateTools</td>
 *         <td>设置秒钟</td>
 *     </tr>
 *     <tr>
 *         <td>DateTools.set().setMillisecond(int millisecond) -> DateTools</td>
 *         <td>设置毫秒</td>
 *     </tr>
 *     <tr>
 *         <td>DateTools.set().clearTime() -> DateTools</td>
 *         <td>清空时分秒毫秒</td>
 *     </tr>
 *     <tr>
 *         <td>DateTools.set().skip(DateSkipType type, int amount) -> DateTools</td>
 *         <td>跳跃指定的时间</td>
 *     </tr>
 * </table>
 * <br>
 * <strong>更多的操作：</strong>
 * <table>
 *     <tr>
 *         <td>DateTools.set().prop() -> DateProperty</td>
 *         <td>将DateTools转换为DateProperty，以获取更多日期属性方法</td>
 *     </tr>
 *     <tr>
 *         <td>DateTools.set().extend() -> DateExtend</td>
 *         <td>将DateTools转换为DateExtend，以获取更多日期扩展方法</td>
 *     </tr>
 *     <tr>
 *         <td>DateTools.set().calc() -> DateCalculate</td>
 *         <td>将DateTools转换为DateCalculate，以获取更多日期计算方法</td>
 *     </tr>
 * </table>
 * <br>
 * <strong>时间的输出：</strong>
 * <table>
 *     <tr>
 *         <td>DateTools.set().toDateString() -> String</td>
 *         <td>将时间格式化为字符串并返回，默认格式为 yyyy-MM-dd HH:mm:ss</td>
 *     </tr>
 *     <tr>
 *         <td>DateTools.set().toDateString(String pattern) -> String</td>
 *         <td>根据格式化模板将时间格式化为字符串并返回</td>
 *     </tr>
 *     <tr>
 *         <td>DateTools.set().toTime() -> Long</td>
 *         <td>将时间转换为时间戳并返回</td>
 *     </tr>
 *     <tr>
 *         <td>DateTools.set().toDate() -> Date</td>
 *         <td>将时间返回</td>
 *     </tr>
 * </table>
 */
public interface DateTools {

    /**
     * 初始化DateTools时间：
     * <br>
     * <table>
     *     <tr>
     *         <td>.set() -> DateTools</td>
     *         <td>初始化时间为当前时间</td>
     *     </tr>
     *     <tr>
     *         <td>.set(Date date) -> DateTools</td>
     *         <td>初始化时间为传入的Date对象</td>
     *     </tr>
     *     <tr>
     *         <td>.set(long time) -> DateTools</td>
     *         <td>初始化时间为传入的时间戳</td>
     *     </tr>
     *     <tr>
     *         <td>.set(String source, String pattern) -> DateTools</td>
     *         <td>初始化时间为传入的时间字符串</td>
     *     </tr>
     *     <tr>
     *         <td>.set(String source) -> DateTools</td>
     *         <td>初始化时间为传入的时间字符串（根据DatePattern中的模板自适应转换）</td>
     *     </tr>
     *     <tr>
     *         <td>.set(int year, int month, int day) -> DateTools</td>
     *         <td>初始化时间为传入的时间属性</td>
     *     </tr>
     *     <tr>
     *         <td>.set(int year, int month, int day, int hour, int minute, int second) -> DateTools</td>
     *         <td>初始化时间为传入的时间属性</td>
     *     </tr>
     *     <tr>
     *         <td>.set(int year, int month, int day, int hour, int minute, int second, int millisecond) -> DateTools</td>
     *         <td>初始化时间为传入的时间属性</td>
     *     </tr>
     * </table>
     */
    static DateTools set() {
        return DateSupport.init();
    }

    /**
     * 初始化DateTools时间：
     * <br>
     * <table>
     *     <tr>
     *         <td>.set() -> DateTools</td>
     *         <td>初始化时间为当前时间</td>
     *     </tr>
     *     <tr>
     *         <td>.set(Date date) -> DateTools</td>
     *         <td>初始化时间为传入的Date对象</td>
     *     </tr>
     *     <tr>
     *         <td>.set(long time) -> DateTools</td>
     *         <td>初始化时间为传入的时间戳</td>
     *     </tr>
     *     <tr>
     *         <td>.set(String source, String pattern) -> DateTools</td>
     *         <td>初始化时间为传入的时间字符串</td>
     *     </tr>
     *     <tr>
     *         <td>.set(String source) -> DateTools</td>
     *         <td>初始化时间为传入的时间字符串（根据DatePattern中的模板自适应转换）</td>
     *     </tr>
     *     <tr>
     *         <td>.set(int year, int month, int day) -> DateTools</td>
     *         <td>初始化时间为传入的时间属性</td>
     *     </tr>
     *     <tr>
     *         <td>.set(int year, int month, int day, int hour, int minute, int second) -> DateTools</td>
     *         <td>初始化时间为传入的时间属性</td>
     *     </tr>
     *     <tr>
     *         <td>.set(int year, int month, int day, int hour, int minute, int second, int millisecond) -> DateTools</td>
     *         <td>初始化时间为传入的时间属性</td>
     *     </tr>
     * </table>
     */
    static DateTools set(Date date) {
        return DateSupport.init(date);
    }

    /**
     * 初始化DateTools时间：
     * <br>
     * <table>
     *     <tr>
     *         <td>.set() -> DateTools</td>
     *         <td>初始化时间为当前时间</td>
     *     </tr>
     *     <tr>
     *         <td>.set(Date date) -> DateTools</td>
     *         <td>初始化时间为传入的Date对象</td>
     *     </tr>
     *     <tr>
     *         <td>.set(long time) -> DateTools</td>
     *         <td>初始化时间为传入的时间戳</td>
     *     </tr>
     *     <tr>
     *         <td>.set(String source, String pattern) -> DateTools</td>
     *         <td>初始化时间为传入的时间字符串</td>
     *     </tr>
     *     <tr>
     *         <td>.set(String source) -> DateTools</td>
     *         <td>初始化时间为传入的时间字符串（根据DatePattern中的模板自适应转换）</td>
     *     </tr>
     *     <tr>
     *         <td>.set(int year, int month, int day) -> DateTools</td>
     *         <td>初始化时间为传入的时间属性</td>
     *     </tr>
     *     <tr>
     *         <td>.set(int year, int month, int day, int hour, int minute, int second) -> DateTools</td>
     *         <td>初始化时间为传入的时间属性</td>
     *     </tr>
     *     <tr>
     *         <td>.set(int year, int month, int day, int hour, int minute, int second, int millisecond) -> DateTools</td>
     *         <td>初始化时间为传入的时间属性</td>
     *     </tr>
     * </table>
     */
    static DateTools set(long time) {
        return DateSupport.init(time);
    }

    /**
     * 初始化DateTools时间：
     * <br>
     * <table>
     *     <tr>
     *         <td>.set() -> DateTools</td>
     *         <td>初始化时间为当前时间</td>
     *     </tr>
     *     <tr>
     *         <td>.set(Date date) -> DateTools</td>
     *         <td>初始化时间为传入的Date对象</td>
     *     </tr>
     *     <tr>
     *         <td>.set(long time) -> DateTools</td>
     *         <td>初始化时间为传入的时间戳</td>
     *     </tr>
     *     <tr>
     *         <td>.set(String source, String pattern) -> DateTools</td>
     *         <td>初始化时间为传入的时间字符串</td>
     *     </tr>
     *     <tr>
     *         <td>.set(String source) -> DateTools</td>
     *         <td>初始化时间为传入的时间字符串（根据DatePattern中的模板自适应转换）</td>
     *     </tr>
     *     <tr>
     *         <td>.set(int year, int month, int day) -> DateTools</td>
     *         <td>初始化时间为传入的时间属性</td>
     *     </tr>
     *     <tr>
     *         <td>.set(int year, int month, int day, int hour, int minute, int second) -> DateTools</td>
     *         <td>初始化时间为传入的时间属性</td>
     *     </tr>
     *     <tr>
     *         <td>.set(int year, int month, int day, int hour, int minute, int second, int millisecond) -> DateTools</td>
     *         <td>初始化时间为传入的时间属性</td>
     *     </tr>
     * </table>
     */
    static DateTools set(String source, String pattern) {
        return DateSupport.init(source, pattern);
    }

    /**
     * 初始化DateTools时间：
     * <br>
     * <table>
     *     <tr>
     *         <td>.set() -> DateTools</td>
     *         <td>初始化时间为当前时间</td>
     *     </tr>
     *     <tr>
     *         <td>.set(Date date) -> DateTools</td>
     *         <td>初始化时间为传入的Date对象</td>
     *     </tr>
     *     <tr>
     *         <td>.set(long time) -> DateTools</td>
     *         <td>初始化时间为传入的时间戳</td>
     *     </tr>
     *     <tr>
     *         <td>.set(String source, String pattern) -> DateTools</td>
     *         <td>初始化时间为传入的时间字符串</td>
     *     </tr>
     *     <tr>
     *         <td>.set(String source) -> DateTools</td>
     *         <td>初始化时间为传入的时间字符串（根据DatePattern中的模板自适应转换）</td>
     *     </tr>
     *     <tr>
     *         <td>.set(int year, int month, int day) -> DateTools</td>
     *         <td>初始化时间为传入的时间属性</td>
     *     </tr>
     *     <tr>
     *         <td>.set(int year, int month, int day, int hour, int minute, int second) -> DateTools</td>
     *         <td>初始化时间为传入的时间属性</td>
     *     </tr>
     *     <tr>
     *         <td>.set(int year, int month, int day, int hour, int minute, int second, int millisecond) -> DateTools</td>
     *         <td>初始化时间为传入的时间属性</td>
     *     </tr>
     * </table>
     */
    static DateTools set(String source) {
        return DateSupport.init(source);
    }

    /**
     * 初始化DateTools时间：
     * <br>
     * <table>
     *     <tr>
     *         <td>.set() -> DateTools</td>
     *         <td>初始化时间为当前时间</td>
     *     </tr>
     *     <tr>
     *         <td>.set(Date date) -> DateTools</td>
     *         <td>初始化时间为传入的Date对象</td>
     *     </tr>
     *     <tr>
     *         <td>.set(long time) -> DateTools</td>
     *         <td>初始化时间为传入的时间戳</td>
     *     </tr>
     *     <tr>
     *         <td>.set(String source, String pattern) -> DateTools</td>
     *         <td>初始化时间为传入的时间字符串</td>
     *     </tr>
     *     <tr>
     *         <td>.set(String source) -> DateTools</td>
     *         <td>初始化时间为传入的时间字符串（根据DatePattern中的模板自适应转换）</td>
     *     </tr>
     *     <tr>
     *         <td>.set(int year, int month, int day) -> DateTools</td>
     *         <td>初始化时间为传入的时间属性</td>
     *     </tr>
     *     <tr>
     *         <td>.set(int year, int month, int day, int hour, int minute, int second) -> DateTools</td>
     *         <td>初始化时间为传入的时间属性</td>
     *     </tr>
     *     <tr>
     *         <td>.set(int year, int month, int day, int hour, int minute, int second, int millisecond) -> DateTools</td>
     *         <td>初始化时间为传入的时间属性</td>
     *     </tr>
     * </table>
     */
    static DateTools set(int year, int month, int day, int hour, int minute, int second) {
        return DateSupport.init(year, month, day, hour, minute, second);
    }

    /**
     * 初始化DateTools时间：
     * <br>
     * <table>
     *     <tr>
     *         <td>.set() -> DateTools</td>
     *         <td>初始化时间为当前时间</td>
     *     </tr>
     *     <tr>
     *         <td>.set(Date date) -> DateTools</td>
     *         <td>初始化时间为传入的Date对象</td>
     *     </tr>
     *     <tr>
     *         <td>.set(long time) -> DateTools</td>
     *         <td>初始化时间为传入的时间戳</td>
     *     </tr>
     *     <tr>
     *         <td>.set(String source, String pattern) -> DateTools</td>
     *         <td>初始化时间为传入的时间字符串</td>
     *     </tr>
     *     <tr>
     *         <td>.set(String source) -> DateTools</td>
     *         <td>初始化时间为传入的时间字符串（根据DatePattern中的模板自适应转换）</td>
     *     </tr>
     *     <tr>
     *         <td>.set(int year, int month, int day) -> DateTools</td>
     *         <td>初始化时间为传入的时间属性</td>
     *     </tr>
     *     <tr>
     *         <td>.set(int year, int month, int day, int hour, int minute, int second) -> DateTools</td>
     *         <td>初始化时间为传入的时间属性</td>
     *     </tr>
     *     <tr>
     *         <td>.set(int year, int month, int day, int hour, int minute, int second, int millisecond) -> DateTools</td>
     *         <td>初始化时间为传入的时间属性</td>
     *     </tr>
     * </table>
     */
    static DateTools set(int year, int month, int day) {
        return DateSupport.init(year, month, day);
    }

    /**
     * 初始化DateTools时间：
     * <br>
     * <table>
     *     <tr>
     *         <td>.set() -> DateTools</td>
     *         <td>初始化时间为当前时间</td>
     *     </tr>
     *     <tr>
     *         <td>.set(Date date) -> DateTools</td>
     *         <td>初始化时间为传入的Date对象</td>
     *     </tr>
     *     <tr>
     *         <td>.set(long time) -> DateTools</td>
     *         <td>初始化时间为传入的时间戳</td>
     *     </tr>
     *     <tr>
     *         <td>.set(String source, String pattern) -> DateTools</td>
     *         <td>初始化时间为传入的时间字符串</td>
     *     </tr>
     *     <tr>
     *         <td>.set(String source) -> DateTools</td>
     *         <td>初始化时间为传入的时间字符串（根据DatePattern中的模板自适应转换）</td>
     *     </tr>
     *     <tr>
     *         <td>.set(int year, int month, int day) -> DateTools</td>
     *         <td>初始化时间为传入的时间属性</td>
     *     </tr>
     *     <tr>
     *         <td>.set(int year, int month, int day, int hour, int minute, int second) -> DateTools</td>
     *         <td>初始化时间为传入的时间属性</td>
     *     </tr>
     *     <tr>
     *         <td>.set(int year, int month, int day, int hour, int minute, int second, int millisecond) -> DateTools</td>
     *         <td>初始化时间为传入的时间属性</td>
     *     </tr>
     * </table>
     */
    static DateTools set(int year, int month, int day, int hour, int minute, int second, int millisecond) {
        return DateSupport.init(year, month, day, hour, minute, second, millisecond);
    }

    /**
     * 设置DateTools对象中存储的时间的年份
     * @param year 年
     * @return 返回DateTools对象
     */
    DateTools setYear(int year);

    /**
     * 设置DateTools对象中存储的时间的月份
     * @param month 月
     * @return 返回DateTools对象
     */
    DateTools setMonth(int month);

    /**
     * 设置DateTools对象中存储的时间的日期
     * @param day 日
     * @return 返回DateTools对象
     */
    DateTools setDay(int day);

    /**
     * 设置DateTools对象中存储的时间的小时
     * @param hour 时
     * @return 返回DateTools对象
     */
    DateTools setHour(int hour);

    /**
     * 设置DateTools对象中存储的时间的分钟
     * @param minute 分
     * @return 返回DateTools对象
     */
    DateTools setMinute(int minute);

    /**
     * 设置DateTools对象中存储的时间的秒钟
     * @param second 秒
     * @return 返回DateTools对象
     */
    DateTools setSecond(int second);

    /**
     * 设置DateTools对象中存储的时间的毫秒
     * @param millisecond 毫秒
     * @return 返回DateTools对象
     */
    DateTools setMillisecond(int millisecond);

    /**
     * 将DateTools对象中存储的时间的时，分，秒，毫秒清空为 0
     * @return 返回DateTools对象
     */
    DateTools clearTime();

    /**
     * 将DateTools对象中存储的时间根据DateSkipType中定义的时间属性，跳跃指定的数值<br>
     * <br>
     * DateSkipType类型：
     * <ul>
     *     <li>YEAR : 年</li>
     *     <li>MONTH : 月</li>
     *     <li>DATE : 日</li>
     *     <li>HOUR : 时</li>
     *     <li>MINUTE : 分</li>
     *     <li>SECOND : 秒</li>
     *     <li>MILLISECOND : 毫秒</li>
     * </ul>
     * 举例：<br>
     *      1.skip(DateSkipType.YEAR, 2) -> 往前跳跃2年<br>
     *      2.skip(DateSkipType.MONTH, -1) -> 往后跳跃1月<br>
     * @param dateSkipType 跳转的时间类型
     * @param amount 跳过的指数（正数表示往前跳跃，负数表示往后跳跃）
     * @return 返回DateTools对象
     */
    DateTools skip(DateSkipType dateSkipType, int amount);

    /**
     * 将DateTools对象中存储的时间格式化为字符串并返回，默认格式为 yyyy-MM-dd HH:mm:ss
     * @return 返回格式化后的时间字符串
     */
    String toDateString();

    /**
     * 根据格式化模板将DateTools对象中存储的时间格式化为字符串并返回
     * @param pattern 时间格式化模板
     * @return 格式化后的时间字符串
     */
    String toDateString(String pattern);

    /**
     * 将DateTools对象中存储的时间转换为时间戳并返回
     * @return 时间戳
     */
    long toTime();

    /**
     * 将DateTools对象中存储的时间转换为Date对象并返回
     * @return Date类型时间
     */
    Date toDate();

    /**
     * 将DateTools对象中存储的时间转换为DateProperty对象
     * <br>
     * DateProperty对象包含了一系列的日期属性方法
     * <br>
     * <Table>
     *     <tr>
     *         <td>.prop().getYear() -> int</td>
     *         <td>获取年份</td>
     *     </tr>
     *     <tr>
     *         <td>.prop().getYearString() -> String</td>
     *         <td>获取年份字符串</td>
     *     </tr>
     *     <tr>
     *         <td>.prop().getMonth() -> int</td>
     *         <td>获取月份</td>
     *     </tr>
     *     <tr>
     *         <td>.prop().getMonthString() -> String</td>
     *         <td>获取月份字符串</td>
     *     </tr>
     *     <tr>
     *         <td>.prop().getDay() -> int</td>
     *         <td>获取月份的天数</td>
     *     </tr>
     *     <tr>
     *         <td>.prop().getDayString() -> String</td>
     *         <td>获取月份的天数字符串</td>
     *     </tr>
     *     <tr>
     *         <td>.prop().getHour() -> int</td>
     *         <td>获取小时（24小时制）</td>
     *     </tr>
     *     <tr>
     *         <td>.prop().getHourString() -> String</td>
     *         <td>获取小时字符串（24小时制）</td>
     *     </tr>
     *     <tr>
     *         <td>.prop().get12Hour() -> int</td>
     *         <td>获取小时（12小时制）</td>
     *     </tr>
     *     <tr>
     *         <td>.prop().get12HourString() -> String</td>
     *         <td>获取小时字符串（12小时制）</td>
     *     </tr>
     *     <tr>
     *         <td>.prop().getAmPmMarker() -> String</td>
     *         <td>获取AM/PM标识（上午 / 下午）</td>
     *     </tr>
     *     <tr>
     *         <td>.prop().getAmPmMarkerEN() -> String</td>
     *         <td>获取AM/PM标识（AM / MP）</td>
     *     </tr>
     *     <tr>
     *         <td>.prop().getMinute() -> int</td>
     *         <td>获取分钟</td>
     *     </tr>
     *     <tr>
     *         <td>.prop().getMinuteString() -> String</td>
     *         <td>获取分钟字符串</td>
     *     </tr>
     *     <tr>
     *         <td>.prop().getSecond() -> int</td>
     *         <td>获取秒钟</td>
     *     </tr>
     *     <tr>
     *         <td>.prop().getSecondString() -> String</td>
     *         <td>获取秒钟字符串</td>
     *     </tr>
     *     <tr>
     *         <td>.prop().getMillisecond() -> int</td>
     *         <td>获取毫秒</td>
     *     </tr>
     *     <tr>
     *         <td>.prop().getMillisecondString() -> String</td>
     *         <td>获取毫秒字符串</td>
     *     </tr>
     *     <tr>
     *         <td>.prop().getWeek() -> int</td>
     *         <td>获取今日是周几（数字）</td>
     *     </tr>
     *     <tr>
     *         <td>.prop().getWeekString() -> String</td>
     *         <td>获取今日是周几</td>
     *     </tr>
     *     <tr>
     *         <td>.prop().getDayOfYear() -> int</td>
     *         <td>获取一年中的第几天</td>
     *     </tr>
     *     <tr>
     *         <td>.prop().getDayOfMonth() -> int</td>
     *         <td>获取一月中的第几天</td>
     *     </tr>
     *     <tr>
     *         <td>.prop().getDayOfWeek() -> int</td>
     *         <td>获取一周中的第几天</td>
     *     </tr>
     *     <tr>
     *         <td>.prop().getWeekOfYear() -> int</td>
     *         <td>获取一年中的第几周</td>
     *     </tr>
     *     <tr>
     *         <td>.prop().getWeekOfMonth() -> int</td>
     *         <td>获取一月中的第几周</td>
     *     </tr>
     *     <tr>
     *         <td>.prop().isLeapYear() -> boolean</td>
     *         <td>判断是否是闰年</td>
     *     </tr>
     * </Table>
     */
    DateProperty prop();

    /**
     * 将DateTools转换成DateExtend对象
     * <br>
     * DateExtend对象包含了一系列的日期扩展方法
     * <Table>
     *     <tr>
     *         <td>.extend().startOfDay() -> DateTools</td>
     *         <td>获取今日的开始时间</td>
     *     </tr>
     *     <tr>
     *         <td>.extend().endOfDay() -> DateTools</td>
     *         <td>获取今日的结束时间</td>
     *     </tr>
     *     <tr>
     *         <td>.extend().startOfMonth() -> DateTools</td>
     *         <td>获取本月的第一天</td>
     *     </tr>
     *     <tr>
     *         <td>.extend().endOfMonth() -> DateTools</td>
     *         <td>获取本月的最后一天</td>
     *     </tr>
     *     <tr>
     *         <td>.extend().startOfWeek() -> DateTools</td>
     *         <td>获取本周的第一天</td>
     *     </tr>
     *     <tr>
     *         <td>.extend().endOfWeekWork() -> DateTools</td>
     *         <td>获取本周工作日的最后一天</td>
     *     </tr>
     *     <tr>
     *         <td>.extend().endOfWeek() -> DateTools</td>
     *         <td>获取本周的最后一天</td>
     *     </tr>
     *     <tr>
     *         <td>.extend().startOfYear() -> DateTools</td>
     *         <td>获取本年的第一天</td>
     *     </tr>
     *     <tr>
     *         <td>.extend().endOfYear() -> DateTools</td>
     *         <td>获取本年的最后一天</td>
     *     </tr>
     * </Table>
     */
    DateExtend extend();

    /**
     * 将DateTools转换成DateCalculate对象，
     * <br>
     * DateCalculate对象包含了一系列的日期计算方法
     * <Table>
     *     <tr>
     *         <td>.calc().before(Date date) -> boolean</td>
     *         <td>是否在某个日期之前</td>
     *     </tr>
     *     <tr>
     *         <td>.calc().before(Long date) -> boolean</td>
     *         <td>是否在某个日期之前</td>
     *     </tr>
     *     <tr>
     *         <td>.calc().after(Date date) -> boolean</td>
     *         <td>是否在某个日期之后</td>
     *     </tr>
     *     <tr>
     *         <td>.calc().after(Long date) -> boolean</td>
     *         <td>是否在某个日期之后</td>
     *     </tr>
     *     <tr>
     *         <td>.calc().between(Date startDate, Date endDate) -> boolean</td>
     *         <td>是否在两个日期之间</td>
     *     </tr>
     *     <tr>
     *         <td>.calc().between(Long startDate, Long endDate) -> boolean</td>
     *         <td>是否在两个日期之间</td>
     *     </tr>
     *     <tr>
     *         <td>.calc().pastSeconds() -> long</td>
     *         <td>与当前日期相差秒数</td>
     *     </tr>
     *     <tr>
     *         <td>.calc().pastSeconds(Date date) -> long</td>
     *         <td>与传入日期相差秒数</td>
     *     </tr>
     *     <tr>
     *         <td>.calc().pastMinutes() -> long</td>
     *         <td>与当前日期相差分钟数</td>
     *     </tr>
     *     <tr>
     *         <td>.calc().pastMinutes(Date date) -> long</td>
     *         <td>与传入日期相差分钟数</td>
     *     </tr>
     *     <tr>
     *         <td>.calc().pastHours() -> long</td>
     *         <td>与当前日期相差小时数</td>
     *     </tr>
     *     <tr>
     *         <td>.calc().pastHours(Date date) -> long</td>
     *         <td>与传入日期相差小时数</td>
     *     </tr>
     *     <tr>
     *         <td>.calc().pastDays() -> long</td>
     *         <td>与当前日期相差天数</td>
     *     </tr>
     *     <tr>
     *         <td>.calc().pastDays(Date date) -> long</td>
     *         <td>与传入日期相差天数</td>
     *     </tr>
     *     <tr>
     *         <td>.calc().pastMonths() -> long</td>
     *         <td>与当前日期相差月数</td>
     *     </tr>
     *     <tr>
     *         <td>.calc().pastMonths(Date date) -> long</td>
     *         <td>与传入日期相差月数</td>
     *     </tr>
     *     <tr>
     *         <td>.calc().pastYears() -> long</td>
     *         <td>与当前日期相差年数</td>
     *     </tr>
     *     <tr>
     *         <td>.calc().pastYears(Date date) -> long</td>
     *         <td>与传入日期相差年数</td>
     *     </tr>
     *     <tr>
     *         <td>.calc().past() -> String</td>
     *         <td>与当前日期相差字符串详情</td>
     *     </tr>
     *     <tr>
     *         <td>.calc().past(boolean isOmit) -> String</td>
     *         <td>与当前日期相差字符串详情</td>
     *     </tr>
     *     <tr>
     *         <td>.calc().past(Date date, boolean isOmit) -> String</td>
     *         <td>与传入日期相差字符串详情</td>
     *     </tr>
     * </Table>
     */
    DateCalculate calc();
}
