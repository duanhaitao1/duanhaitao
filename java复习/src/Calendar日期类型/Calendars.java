package Calendar日期类型;

import java.util.Calendar;

public class Calendars {
    public static void main(String[] args)
    {
        //获取日历的对象
        Calendar calendar=Calendar.getInstance();
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH));//该处cd月份是0-11要加一
        //获取当前日
        System.out.println(calendar.get(calendar.DATE));
        //当前在哪个小时
        System.out.println(calendar.get(calendar.HOUR_OF_DAY));
        System.out.println(calendar.get(calendar.HOUR));
        //分钟
        System.out.println(calendar.get(calendar.MINUTE));
        //秒
        System.out.println(calendar.get(calendar.SECOND));

    }
}
