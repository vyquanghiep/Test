package Phan7_Date;
import java.util.*;
import java.text.*;
import java.util.concurrent.TimeUnit;

public class Datecalander {

    public static void showCalendar(Calendar c) {
        int year = c.get(Calendar.YEAR);

        // Trả về giá trị từ 0 - 11
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);
        int hour = c.get(Calendar.HOUR_OF_DAY);
        int minute = c.get(Calendar.MINUTE);
        int second = c.get(Calendar.SECOND);
        int millis = c.get(Calendar.MILLISECOND);

        System.out.println(year + "-" + (month + 1) + "-" + day //
                + " " + hour + ":" + minute + ":" + second + " " + millis);
    }
    public static void main(String[] args) throws ParseException {

        Calendar c = Calendar.getInstance();

        // year, month, day
        c.set(2000, 11, 24);

        Date date = c.getTime();//c-d

        System.out.println("Date " + date);

        long timeInMillis = System.currentTimeMillis();

        // Trừ đi 24 giờ.
        timeInMillis -= TimeUnit.HOURS.toMillis(24);

        Date date2 = new Date(timeInMillis);
        Calendar c2 = Calendar.getInstance();
        c2.setTime(date2);//d - c

        showCalendar(c2);


    }
}
