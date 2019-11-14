package Analysis;

import java.util.ArrayList;

public class SplitData {

    public static ArrayList<String> Name = new ArrayList<>();
    public static ArrayList<String> Message = new ArrayList<>();
    public static ArrayList<String> Date = new ArrayList<>(); //날짜 데이터 저장한 값

    public static void GetName(ArrayList<String>DataList) {
        String[] DataSet = new String[DataList.size()];
        DataSet = DataList.toArray(DataSet);
        for (int i=0; i<DataList.size(); i++) {
            int name_index1 = (DataSet[i].indexOf(':')+5);
            int name_index2 = name_index1+3;
            String NewStr = DataSet[i].substring(name_index1, name_index2);
            NewStr = NewStr.trim(); //공백 제거
            Name.add(NewStr); // 이름 구분하여 리스트에 추가
        }
    }

    public static void GetMessage(ArrayList<String>DataList) {
        String[] DataSet = new String[DataList.size()];
        DataSet = DataList.toArray(DataSet);
        for (int i=0; i<DataList.size(); i++) {
            try {
                String[] subMessage = DataSet[i].split(",\\s\\S{2,3}\\s:\\s");
                Message.add(subMessage[1]);
            } catch (ArrayIndexOutOfBoundsException ignored){}
        }
    }


    public static void GetDate(ArrayList<String>DataList) {
        // 처리 속도를 빠르게 하기 위해 Iterator 대신 String 변환 -> Arrays function 사용
        String[] DataSet = new String[DataList.size()];
        DataSet = DataList.toArray(DataSet);
        for (int i=0; i<DataList.size(); i++) {
            int date_index = (DataSet[i].indexOf(':')+3);
            String NewStr = DataSet[i].substring(0, date_index);
            NewStr = NewStr.trim();
            Date.add(NewStr); // 날짜 구분하여 리스트에 추가
        }
    }

    public static void main(String[] args) {
        ArrayList<String> MyList = new ArrayList<>();
        MyList.add("2019년 4월 29일 오후 5:50, 이시현 : 심화미분적분학 오늘 18시에서 19시 반까지 반 구분 없이 서술 답 확인 가능하대요!!");
        MyList.add("2019년 5월 3일 오전 4:20, 박지성님이 고도형님을 초대했습니다."); //Exception Handling
        MyList.add("2019년 4월 29일 오후 6:20, 임소진 : 오늘 올 수 있는 사람 지금 오라고 하십니당");
        MyList.add("2019년 4월 30일 오전 12:35, 한별 : 여러분 근데 말이에요");
        GetName(MyList);
        GetDate(MyList);
        GetMessage(MyList);
        System.out.println(Date);
        System.out.println(Name);
        System.out.println(Message);
    }
}
