package Analysis;

import javax.xml.crypto.Data;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.LinkedBlockingDeque;

public class SplitData {

    public static ArrayList<String> GetName(ArrayList<String>DataList) {
        ArrayList<String> Name = new ArrayList<>();
        String[] DataSet = new String[DataList.size()];
        DataSet = DataList.toArray(DataSet);
        for (int i=0; i<DataList.size(); i++) {

        }
        return Name;
    }



    public static ArrayList<String> GetDate(ArrayList<String>DataList) {
        ArrayList<String> Date = new ArrayList<>(); //날짜 데이터 저장한 값
        // 처리 속도를 빠르게 하기 위해 Iterator 대신 String 변환 -> Arrays function 사용
        String[] DataSet = new String[DataList.size()];
        DataSet = DataList.toArray(DataSet);
        for (int i=0; i<DataList.size(); i++) {
            // String[] date = DataSet[i].split(",");
            int date_index = (DataSet[i].indexOf(':')+3);
            Date.add(DataSet[i].substring(0, date_index)); // 날짜 구분해서 잘라 준다.
        }
        return Date;
    }

    public static void main(String[] args) {
        ArrayList<String> MyList = new ArrayList<>();
        MyList.add("2019년 4월 29일 오후 5:50, 이시현 : 심화미분적분학 오늘 18시에서 19시 반까지 반 구분 없이 서술 답 확인 가능하대요!!");
        MyList.add("2019년 4월 29일 오후 6:20, 임소진 : 오늘 올 수 있는 사람 지금 오라고 하십니당");
        MyList.add("2019년 4월 30일 오전 12:35, 김준원 : 여러분");
        GetDate(MyList);
    }
}
