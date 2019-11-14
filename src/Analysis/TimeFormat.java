package Analysis;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class TimeFormat {

    public static ZonedDateTime DateInitialize(String DateString) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy'년 'MM'월 'dd'일 'a KK':'mm");
        Date date = new Date();
        try {
            date = sdf.parse(DateString);
        } catch(ParseException e) {
            e.printStackTrace();
        }
        Instant instant = date.toInstant();
        ZonedDateTime dateTime = ZonedDateTime.ofInstant(instant, ZoneId.systemDefault());
        return dateTime;
    }

    public static void main(String[] args) {
        String DateString = "2019년 4월 29일 오후 5:50";
        System.out.println(DateInitialize(DateString));
    }
}
