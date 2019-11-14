package Analysis;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeFormat {
    public static LocalDateTime DateInitialize (String DateString) {
        DateString = DateString.replace("년 ", "/");
        DateString = DateString.replace("월 ", "/");
        DateString = DateString.replace("일 ", "/");
        if (DateString.contains("오후 ")) DateString = DateString.replace("오후 ", "");
        else DateString = DateString.replace("오전 ", "");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/M/d/H:mm");
        LocalDateTime dateTime = LocalDateTime.parse(DateString, formatter);
        return dateTime;
    }

    public static void main(String[] args) {
        String DateString = "2019년 4월 9일 오후 00:50";
        System.out.println(DateInitialize(DateString));
    }
}
