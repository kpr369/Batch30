package java_package;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DateAndCalander {

    public static void main(String[] args) {

     /*   String data = "17/06/2022";

        Date date = new Date();

        System.out.println(date);*/
       /* System.out.println(date.getDate());
        System.out.println(date.getDay());
        System.out.println(date.getTime());
        System.out.println(date.getYear());
        System.out.println(date.getMonth());*/

        /*SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-YYYY");
        System.out.println(sdf.format(date));*/

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
        System.out.println(calendar.getCalendarType());
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH));
       calendar.add(Calendar.MONTH,2);
        System.out.println(calendar.getTime());

    }
}
