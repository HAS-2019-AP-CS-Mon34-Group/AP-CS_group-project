package Analysis;

import java.awt.image.AreaAveragingScaleFilter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Intro {

    public static ArrayList<String> lineParsing(File file){
        try{


            FileReader filereader = new FileReader(file);
            //입력 버퍼 생성
            BufferedReader bufReader = new BufferedReader(filereader);

            ArrayList<String> sent = new ArrayList<>();

            String line="";

            while(true){
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


        }catch (FileNotFoundException e) {
            // TODO: handle exception
            return null;
        }catch(IOException e) {
            System.out.println(e);
            return null;
        }

    }

    public static ArrayList<String> analysis(String one_sent){
        String[] words = one_sent.split("\\s");
        ArrayList<String> real_words = new ArrayList<>();

        String[] postpositions = {"은","는","이","가","에","로","의","을","를"};
        String[] punctuation_marks = {".",",","!","?"};

        for(int i = 0 ; i<words.length ; i++){
            if(words[i].length() >= 2){
                if(Arrays.asList(postpositions).contains((words[i].substring(words[i].length() - 1)))) {
                    real_words.add(words[i].substring(0, words[i].length() - 1));
                }
                else if(Arrays.asList(punctuation_marks).contains((words[i].substring(words[i].length() - 1)))) {
                    real_words.add(words[i].substring(0, words[i].length() - 1));
                }
                else{
                    real_words.add(words[i]);
                }
            }
        }

        return real_words;
    }


    public static void main(String[] args) {
        File file = new File("C:\\Users\\user\\Documents\\GitHub\\AP-CS_group-project\\src\\Analysis\\test.txt");

        ArrayList<String> sentence = lineParsing(file);
        for(String s : sentence){
            System.out.println(s);
        }
        System.out.println();

        ArrayList<String> words = new ArrayList<>();

        for (int i = 0 ; i < sentence.size() ; i++){
            words.addAll(analysis(sentence.get(i)));
        }

        for(String s : words){
            System.out.println(s);
        }




    }
}
