package Analysis;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Scanner;

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

    public void ChatByDate(ArrayList<String> DataList, int[] ScrDate) {
        String[] DateArr = new String[DataList.size()];
        SplitData.GetDate(DataList);
        DateArr = SplitData.Date.toArray(DateArr);
        int count = 0;
        for (String s : DateArr) {
            ZonedDateTime DateTime = TimeFormat.DateInitialize(s);
            int year0 = DateTime.getYear();
            int month0 = DateTime.getMonthValue();
            int day0 = DateTime.getDayOfMonth();
            // Scanner 로 받은 날짜 입력값과 동일하다면
            if (ScrDate[0] == year0 && ScrDate[1] == month0 && ScrDate[2] == day0) {
                count += 1;
            }
        }
        System.out.println("선택하신 날짜의 대화량은 "+" (회/일) 입니다.");
    }
}