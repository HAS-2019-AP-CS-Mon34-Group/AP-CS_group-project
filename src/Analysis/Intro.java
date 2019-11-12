package Analysis;

import java.awt.image.AreaAveragingScaleFilter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

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


    public static void main(String[] args) {
        File file = new File("C:\\Users\\user\\Documents\\GitHub\\AP-CS_group-project\\src\\Analysis\\test.txt");

        ArrayList<String> sentence = lineParsing(file);
        for(String s : sentence){
            System.out.println(s);
        }
    }
}
