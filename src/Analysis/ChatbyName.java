package Analysis;

import java.io.File;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static Analysis.SplitData.*;

import static Analysis.TextToList.lineParsing;

public class ChatbyName {

    public static void GetChatByName() {
        File file = new File("E:\\Github\\AP-CS_group-project\\src\\Analysis\\test.txt");
        ArrayList<String> sentence = lineParsing(file);

        String[] NameArr = GetName(sentence);
        Set<String> Name = new HashSet<>();
        Name = Stream.of(NameArr).collect(Collectors.toSet());
        String[] NameArray = Name.toArray(new String[0]);

        LinkedHashMap<String, Integer> NameTimes = new LinkedHashMap<>(); // 발언자 이름과 발언한 횟수를 저장하는 HashMap 생성
        for (int i=0; i<Name.size(); i++) {
            NameTimes.put(NameArr[i], 0);
        }
        // System.out.println(NameTimes);
        for (String ITRname : NameArray) {
            int count = 0;
            for (String s : NameArr) {
                if (s.equals(ITRname)) {
                    count += 1;
                }
            }
            NameTimes.put(ITRname, count);
        }
        System.out.println(NameTimes); //데이터 (HashMap) 출력
    }
}
