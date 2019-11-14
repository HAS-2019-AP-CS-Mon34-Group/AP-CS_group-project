package Analysis;

import Member.MainUI;

import java.io.File;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

import static Analysis.SplitData.*;
import static Analysis.TextToList.lineParsing;

public class ChatbyDate {

    public static int[] ScannerDate() {
        Scanner scr = new Scanner(System.in);
        System.out.println("검색할 날짜를 입력해 주십시오. Ex) 2019.04.29");
        String input = scr.nextLine();
        scr.close();
        String[] ScrDate0 = input.split("\\.");
        int[] ScrDate = new int[ScrDate0.length];
        for (int i=0; i<ScrDate.length; i++) {
            ScrDate[i] = Integer.parseInt(ScrDate0[i]);
        }
        return ScrDate;
    }

    public static void ChatByDate(ArrayList<String> DataList, int[] ScrDate) {
        String[] DateArr = GetDate(DataList);
        int count = 0;
        for (String s : DateArr) {
            LocalDateTime DateTime = TimeFormat.DateInitialize(s);
            int year0 = DateTime.getYear();
            int month0 = DateTime.getMonthValue();
            int day0 = DateTime.getDayOfMonth();
            // Scanner 로 받은 날짜 입력값과 동일하다면
            if ((ScrDate[0] == year0) && (ScrDate[1] == month0) && (ScrDate[2] == day0)) {
                // System.out.println(s);
                // System.out.println(DateTime);
                count += 1;
            }
            else
                count += 0;
        }
        System.out.println("선택하신 날짜의 대화량은 "+ count +" (회/일) 입니다.");
    }

    // 실행 메소드 (Thread 사용 시 활용)
    public static void GetChatByDate() {
        File file = new File(MainUI.getBaseFile());
        ArrayList<String> sentence = lineParsing(file);
        int[] ScrDate = ScannerDate();
        ChatByDate(sentence, ScrDate);
    }
}