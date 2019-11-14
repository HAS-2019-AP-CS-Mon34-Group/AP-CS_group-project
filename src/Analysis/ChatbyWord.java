package Analysis;

import Member.MainUI;

import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Set;

public class ChatbyWord extends TextToList {

    public static void WordsCount() {
        File file = new File(MainUI.getBaseFile()); // File saving location input
        ArrayList<String> sentence = lineParsing(file); // Redirected file with line-spaced
        ArrayList<String> words = new ArrayList<>();
        for (int i = 0 ; i < sentence.size() ; i++){
            words.addAll(analysis(sentence.get(i)));
        }
        LinkedHashMap<Object,Integer> wordsmap = wordstomap(words); // Redirected file with words to map
        Set<Object> setwordsmap = wordsmap.keySet();
        System.out.println("채팅에 등장한 단어들입니다.");
        for(Object s : setwordsmap){
            System.out.println(s + " (은/는) 총 " + wordsmap.get(s)+" 회 사용되었습니다.");
        }
    }
}