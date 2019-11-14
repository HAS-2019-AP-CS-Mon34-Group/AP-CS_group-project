package Analysis;

import java.io.File;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static Analysis.SplitData.*;
import static Analysis.TextToList.analysis;
import static Analysis.TextToList.lineParsing;

public class ChatbyDate {

    public static int[] ScannerDate() {
        Scanner sc = new Scanner(System.in);
        System.out.println("검색할 날짜를 입력해 주십시오. Ex) 2019.04.29");
        String input = sc.nextLine();
        sc.close();
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
            ZonedDateTime DateTime = TimeFormat.DateInitialize(s);
            int year0 = DateTime.getYear();
            int month0 = DateTime.getMonthValue();
            int day0 = DateTime.getDayOfMonth();
            // Scanner 로 받은 날짜 입력값과 동일하다면
            if ((ScrDate[0] == year0) && (ScrDate[1] == month0) && (ScrDate[2] == day0)) {
                count += 1;
            }
            else
                count += 0;
        }
        System.out.println("선택하신 날짜의 대화량은 "+ count +" (회/일) 입니다.");
    }

    public static void main(String[] args) {
        File file = new File("E:\\Github\\AP-CS_group-project\\src\\Analysis\\test.txt");

        ArrayList<String> sentence = lineParsing(file);
        System.out.println(sentence);

        System.out.println("이름 리스트 "+ Arrays.toString(GetName(sentence)));
        System.out.println("날짜 리스트 "+ Arrays.toString(GetDate(sentence)));
        System.out.println("메시지 리스트: "+ Arrays.toString(GetMessage(sentence)));

        int[] ScrDate = ScannerDate();
        ChatByDate(sentence, ScrDate);

    }
}