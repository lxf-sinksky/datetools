# DateTools
DateTools是一个对时间或日期进行操作的工具类，提供了一系列的时间或日期的操作方法，支持链式调用。
> DateTools是一个非线程安全的工具类
## 使用方法
### 导入依赖：

```xml
<dependency>
    <groupId>io.github.lxf-sinksky</groupId>
    <artifactId>datetools</artifactId>
    <version>1.0</version>
</dependency>
```

### 创建一个时间：
DateTools中的set()方法，提供了多种创建时间的方法。

| 方法 | 返回值 | 说明 |
|-------|-------|-------|
| `.set()` | DateTools | 初始化时间为当前时间 |
| `.set(Date date)` | DateTools | 初始化时间为传入的Date对象 |
| `.set(long time)` | DateTools | 初始化时间为传入的时间戳 |
| `.set(String source, String pattern)` | DateTools | 初始化时间为传入的时间字符串 |
| `.set(String source)` | DateTools | 初始化时间为传入的时间字符串（根据DatePattern中的模板自适应转换） |
| `.set(int year, int month, int day)` | DateTools | 初始化时间为传入的时间属性 |
| `.set(int year, int month, int day, int hour, int minute, int second)` | DateTools | 初始化时间为传入的时间属性 |
| `.set(int year, int month, int day, int hour, int minute, int second, int millisecond)` | DateTools | 初始化时间为传入的时间属性 |

以下是使用案例:
```java
// 创建一个当前时间，相当于new Date()
Date date = DateTools.set().toDate();

// 从字符串创建时间
Date date = DateTools.set("2024-08-06","yyyy-MM-dd");

// 从常用的字符串创建时间也可以不设置pattern，工具类会从DatePattern类中查找适合的pattern进行匹配，只要是DatePattern记录过的，都可以自行适配，你也可以自行扩展。
Date date = DateTools.set("2024-08-06");
Date date = DateTools.set("2024-08-06 16:00:00");

// 从时间戳创建时间
Date date = DateTools.set(1722931937).toDate();

// 更精细的方式创建时间
Date date = DateTools.set(2024,08,06).toDate(); // 只设置日期，时分秒为0
Date date = DateTools.set(2024,08,06,16,0,0); // 设置完整的时间，毫秒为0
Date date = DateTools.set(2024,08,06,16,0,0,0); // 对毫秒的设置

```
### 输出时间：
DateTools支持输出Date，Long，String类型的时间。

| 方法 | 返回值 | 说明 |
|-------|-------|-------|
| `.toDate()` | Date | 将时间返回 |
| `.toTime()` | Long | 将时间转换为时间戳并返回 |
| `.toDateString()` | String | 将时间格式化为字符串并返回，默认格式为 yyyy-MM-dd HH:mm:ss |
| `.toDateString(String pattern)` | String | 根据格式化模板将时间格式化为字符串并返回 |
以下是使用案例:
```java
// 输出Date类型
Date date = DateTools.set().toDate();

// 输出Long类型
Long time = DateTools.set().toTime();

// 输出String类型
String strDate = DateTools.set().toDateString(); // 默认输出格式为 yyyy-MM-dd HH:mm:ss
String strDate = DateTools.set().toDateString("yyyy-MM-dd"); // 也可以使用DatePattern中定义的模板

```
### 创建时间后，对时间进行修改：
DateTools支持对创建后的时间进行修改，然后再进行输出。

| 方法 | 返回值 | 说明 |
|-------|-------|-------|
| `.setYear(int year)` | DateTools | 设置年份 |
| `.setMonth(int month)` | DateTools | 设置月份 |
| `.setDay(int day)` | DateTools | 设置日期 |
| `.setHour(int hour)` | DateTools | 设置日期 |
| `.setMinute(int minute)` | DateTools | 设置日期 |
| `.setSecond(int second)` | DateTools | 设置日期 |
| `.setMillisecond(int millisecond)` | DateTools | 设置日期 |
| `.clearTime()` | DateTools | 清空时分秒毫秒 |
| `.skip(DateSkipType type, int amount)` | DateTools | 跳跃指定的时间 |
以下是使用案例:
```java
// 基础修改
Date date = DateTools.set()
    .setYear(2023) // 修改年份
    .setMonth(06) // 修改月份
    .setDay(01) // 修改天
    .setHour(16) // 修改小时数
    .setMinute(0) // 修改分钟数
    .setSecond(0) // 修改秒数
    .setMillisecond(0) // 修改毫秒数
  .toDate();

// 清除时分秒
Date date = DateTools.set("2024-08-06 16:30:00").clearTime().toDateString(); // 输出 2024-08-06 00:00:00

// 时间跳跃
// 示例：向前跳跃1年
Date date = DateTools.set("2024-08-06 16:30:00").skip(DateSkipType.YEAR, 1).toDateString(); // 输出：2025-08-06 16:30:00

// 示例：向后跳跃2月，向后跳跃5日
Date date = DateTools.set("2024-08-06 16:30:00").skip(DateSkipType.MONTH, -2).skip(DateSkipType.DAY, -5).toDateString(); // 输出：2025-06-01 16:30:00
// DateSkipType中包含 [ YEAR:年 | MONTH:月 | DAY:日 | HOUR:时 | MINUTE:分 | SECOND:秒 | MILLISECOND:毫秒 ] 等类型
```
### 获取时间属性：
DateTools可以通过`.prop()`，以获取时间的一些属性，比如年份，月份，天，是否是闰年等属性。
> `DateTools.set().prop()...`

| 方法 | 返回值 | 说明 |
|-------|-------|-------|
| `.getYear()` | int | 获取年份 |
| `.getYearString()` | String | 获取年份字符串 |
| `.getMonth()` | int | 获取月份 |
| `.getMonthString()` | String | 获取月份字符串，如果是1-9月，返回的将是01-09 |
| `.getDay()` | int | 获取月份的天数 |
| `.getDayString()` | String | 获取月份的天数字符串，如果是小于10，返回的字符串前会带有0 |
| `.getHour()` | int | 获取24小时制的小时数 |
| `.getHourString()` | String | 获取24小时制的小时数字符串 |
| `.get12Hour()` | int | 获取12小时制的小时数 |
| `.get12HourString()` | String | 获取12小时制的小时数字符串 |
| `.getAmPmMarker()` | String | 获取AM/PM标识，上午 / 下午 |
| `.getAmPmMarkerEN()` | String | 获取AM/PM标识， AM / PM |
| `.getMinute()` | int | 获取分钟 |
| `.getMinuteString()` | String | 获取分钟字符串，如果是小于10，返回的字符串前会带有0 |
| `.getSecond()` | int | 获取秒 |
| `.getSecondString()` | String | 获取秒 | 获取秒字符串，如果是小于10，返回的字符串前会带有0 |
| `.getMillisecond()` | int | 获取毫秒 |
| `.getMillisecondString()` | String | 获取毫秒字符串 |
| `.getWeek()` | int | 获取当前周数字 |
| `.getWeekString()` | String | 获取当前周字符串 |
| `.getDayOfYear()` | int | 获取一年中的第几天 |
| `.getDayOfMonth()` | int | 获取一月中的第几天 |
| `.getDayOfWeek()` | int | 获取一周中的第几天 |
| `.getWeekOfYear()` | int | 获取一年中的第几周 |
| `.getWeekOfMonth()` | int | 获取一月中的第几周 |
| `.isLeapYear()` | boolean | 判断是否是闰年 |
以下是使用案例:
```java
// 获取当前年份
int year = DateTools.set().prop().getYear();
// 判断是否是闰年
boolean isLeap = DateTools.set().prop().isLeapYear();
```

### 对时间的计算
DateTools可以通过`.calc()`，对时间进行大小的比较、判断是否在2个时间的范围之内、与当前时间的差值计算等操作。
> `DateTools.set().calc()...`

| 方法 | 返回值 | 说明 |
|-------|-------|-------|
| `.before(Date date)` | boolean | 是否在某个日期之前 |
| `.before(Long time)` | boolean | 是否在某个时间戳之前 |
| `.after(Date date)` | boolean | 是否在某个日期之后 |
| `.after(Long time)` | boolean | 是否在某个时间戳之后 |
| `.between(Date startDate, Date endDate)` | boolean | 是否在两个日期之间 |
| `.between(Long startTime, Long endTime)` | boolean | 是否在两个时间戳之间 |
| `.pastSeconds()` | long | 与当前日期相差秒数 |
| `.pastSeconds(Date date)` | long | 与传入日期相差秒数 |
| `.pastMinutes()` | long | 与当前日期相差分钟数 |
| `.pastMinutes(Date date)` | long | 与传入日期相差分钟数 |
| `.pastHours()` | long | 与当前日期相差小时数 |
| `.pastHours(Date date)` | long | 与传入日期相差小时数 |
| `.pastDays()` | long | 与当前日期相差天数 |
| `.pastDays(Date date)` | long | 与传入日期相差天数 |
| `.pastMonths()` | long | 与当前日期相差月数 |
| `.pastMonths(Date date)` | long | 与传入日期相差月数 |
| `.pastYears()` | long | 与当前日期相差年数 |
| `.pastYears(Date date)` | long | 与传入日期相差年数 |
| `.past()` | String | 与当前日期相差字符串详情，例如：2天2小时23分46秒 |
| `.past(boolean isOmit)` | String | 与当前日期相差字符串详情，同上，如果isOmit为true，示例：2天前 |
| `.past(Date date, boolean isOmit)` | String | 与传入日期相差字符串详情，同上，和传入的日期对比 |
以下是使用案例:
```java
// 判断当前时间是否在2个日期之间
boolean isBetween = DateTools.set().calc().between(DateTools.set("2024-08-01").toDate(), DateTools.set("2024-08-30").toDate());

// 获取距离当前时间已经过去了多少小时
long hours = DateTools.set().calc().pastSeconds();

// 获取2个时间之间距离多少天
long day = DateTools.set("2024-08-01").calc().pastDays(DateTools.set("2024-08-05").toDate());

// 获取省略的距离
Date date1 = DateTools.set("2024-08-01 09:00:00").toDate();
Date date2 = DateTools.set("2024-08-03 10:30:00").toDate();
String past1 = DateTools.set(date1).calc().past(date2); // 输出：2天1小时30分钟
String past1 = DateTools.set(date1).calc().past(date2, true); // 输出：2天前

```
### 时间的扩展方法：
DateTools可以通过`.extend()`，使用一些扩展的方法。
> `DateTools.set().extend()...`

| 方法 | 返回值 | 说明 |
|-------|-------|-------|
| `.startOfDay()` | DateTools | 获取今日的开始时间 |
| `.endOfDay()` | DateTools | 获取今日的结束时间 |
| `.startOfMonth()` | DateTools | 获取本月的第一天 |
| `.endOfMonth()` | DateTools | 获取本月的最后一天 |
| `.startOfWeek()` | DateTools | 获取本周的第一天 |
| `.endOfWeekWork()` | DateTools | 获取本周工作日的最后一天 |
| `.endOfWeek()` | DateTools | 获取本周的最后一天 |
| `.startOfYear()` | DateTools | 获取本年的第一天 |
| `.endOfYear()` | DateTools | 获取本年的最后一天 |

以下是使用案例:
```java
// 获取今日的开始时间和结束时间
Date start = DateTools.set().extend().startOfDay().toDate();
Date end = DateTools.set().extend().endOfDay().toDate();
```




