package Analysis;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class SplitData {

    public static String[] GetName(ArrayList<String>DataList) {
        ArrayList<String> Name = new ArrayList<>();
        String[] DataSet = new String[DataList.size()];
        DataSet = DataList.toArray(DataSet);
        for (int i=2; i<DataList.size(); i++) {

            try {
                int name_index1;
                if (DataSet[i].indexOf(':') < 0) {
                    name_index1 = -9999;
                }
                else
                    name_index1 = (DataSet[i].indexOf(':')+5);
                int name_index2 = name_index1+3;
                if (DataSet[i].charAt(name_index2) != '님') {
                    if (!DataSet[i].contains("삭제된 메시지입니다.")) {
                        String NewStr = DataSet[i].substring(name_index1, name_index2);
                        NewStr = NewStr.trim(); //공백 제거
                        Name.add(NewStr); // 이름 구분하여 리스트에 추가
                    }
                }
            } catch (StringIndexOutOfBoundsException ignored) { }
        }
        String[] Final_Name = new String[Name.size()];
        Final_Name = Name.toArray(Final_Name);
        return Final_Name;
    }

    public static String[] GetMessage(ArrayList<String>DataList) {
        ArrayList<String> Message = new ArrayList<>();
        String[] DataSet = new String[DataList.size()];
        DataSet = DataList.toArray(DataSet);
        for (int i=0; i<DataList.size(); i++) {
            try {
                String[] subMessage = DataSet[i].split(",\\s\\S{2,3}\\s:\\s");
                Message.add(subMessage[1]);
            } catch (ArrayIndexOutOfBoundsException ignored){}
        }
        String[] Final_Message = new String[Message.size()];
        Final_Message = Message.toArray(Final_Message);
        return Final_Message;
    }


    public static String[] GetDate(ArrayList<String>DataList) {
        ArrayList<String> Date = new ArrayList<>(); //날짜 데이터 저장한 값
        // 처리 속도를 빠르게 하기 위해 Iterator 대신 String 변환 -> Arrays function 사용
        String[] DataSet = new String[DataList.size()];
        DataSet = DataList.toArray(DataSet);
        for (int i=2; i<DataList.size(); i++) {
            try{
                int date_index = (DataSet[i].indexOf(':')+3);
                if (DataSet[i].contains("년 ") && DataSet[i].contains("월 ") && DataSet[i].contains("일 ")) {
                    String NewStr = DataSet[i].substring(0, date_index);
                    NewStr = NewStr.trim();
                    Date.add(NewStr); // 날짜 구분하여 리스트에 추가
                }
            } catch (StringIndexOutOfBoundsException ignored) {}
        }
        String[] Final_Date = new String[Date.size()];
        Final_Date = Date.toArray(Final_Date);
        return Final_Date;
    }
}
