package Analysis;

import Member.MainUI;
import sun.applet.Main;
import sun.awt.image.ImageWatched;

import java.awt.image.AreaAveragingScaleFilter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.*;

public class TextToList {

    public static ArrayList<String> lineParsing(File file){

        try{
            FileReader filereader = new FileReader(file); //입력 버퍼 생성
            BufferedReader bufReader = new BufferedReader(filereader);
            ArrayList<String> sent = new ArrayList<>();
            String line="";

            while (true) {
                line = bufReader.readLine();
                if(line == null){
                    break;
                }
                if(line.equals("")){
                    continue;
                }
                sent.add(line);
            }

//            for(String s : sent){
//                System.out.println(s);
//            }

            bufReader.close();
            return sent;
        } catch (FileNotFoundException e) {
            // TODO: handle exception
            return null;
        } catch(IOException e) {
            System.out.println(e);
            return null;
        }

    }

    public static ArrayList<String> analysis(String one_sent){
        String[] words = one_sent.split("\\s");
        ArrayList<String> real_words = new ArrayList<>();

        String[] postpositions = {"은","는","이","가","에","로","의","을","를"};
        String[] punctuation_marks = {".",",","!","?"};

        for (String word : words) {
            if (word.length() >= 2) {
                if (Arrays.asList(postpositions).contains((word.substring(word.length() - 1)))) {
                    real_words.add(word.substring(0, word.length() - 1));
                } else if (Arrays.asList(punctuation_marks).contains((word.substring(word.length() - 1)))) {
                    real_words.add(word.substring(0, word.length() - 1));
                } else {
                    real_words.add(word);
                }
            }
        }

        return real_words;
    }

    public static LinkedHashMap<Object, Integer> wordstomap(ArrayList words){
        LinkedHashMap<Object,Integer> wordsmap = new LinkedHashMap<>();

        for(int i = 0 ; i < words.size() ; i++){
            if(wordsmap.containsKey(words.get(i))){
                wordsmap.put(words.get(i),wordsmap.get(words.get(i))+1);
            }
            else {
                wordsmap.put(words.get(i), 1);
            }
        }
        return wordsmap;
    }
}