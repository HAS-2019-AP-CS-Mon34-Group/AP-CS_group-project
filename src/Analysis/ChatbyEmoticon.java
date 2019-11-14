package Analysis;

import Member.MainUI;

import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class ChatbyEmoticon extends TextToList {
    public static void WordsCount() {
        File file = new File(MainUI.getBaseFile()); // File saving location input
        ArrayList<String> sentence = lineParsing(file); // Redirected file with line-spaced
        ArrayList<String> words = new ArrayList<>();
        for (int i = 0 ; i < sentence.size() ; i++){
            words.addAll(analysis(sentence.get(i)));
        }
        LinkedHashMap<Object,Integer> wordsmap = wordstomap(words); // Redirected file with words to map
        System.out.println("이모티콘이 총 "+wordsmap.get("이모티콘")+" 회 사용되었습니다.");
    }
}