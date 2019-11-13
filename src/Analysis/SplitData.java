package Analysis;

import java.util.ArrayList;

public class SplitData {
    public static String[] SplitList(ArrayList<String>DataList) {
        // 처리 속도를 빠르게 하기 위해 Iterator 대신 String 변환 -> Arrays function 사용
        String[] DataSet = new String[DataList.size()];
        DataSet = DataList.toArray(DataSet);
        return DataSet;
    }
}
