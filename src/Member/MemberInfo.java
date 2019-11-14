package Member;
// import java.io.BufferedWriter;
import java.io.File;
// import java.io.FileWriter;
// import java.io.FileReader;
// import java.io.IOException;
import java.util.HashMap;
// import java.util.Iterator;
// import java.util.Map;
// import java.util.Map.Entry;
// import java.util.Set;
import java.util.regex.Pattern;

public class MemberInfo extends Member.MakeFile {
	
	static HashMap<String, String> members=new HashMap<>();
	
	String id;
	String pw;
	// String path;

	void getID(String id) {
		String regex="\\w{4,8}";
		if(Pattern.matches(regex, id)) {
			// if(checkIDOverlap(id)==true)
				this.id=id;
		}
		else System.out.println("�߸��� ���̵��Դϴ�.");
	}
	
	void getPW(String pw) {
		String regex="\\w{4,8}";
		if(Pattern.matches(regex, pw)) {
			this.pw=pw;
			putInfo(this);
			makeFile();
		}
		else System.out.println("�߸��� ��й�ȣ�Դϴ�.");
	}
	
	void putInfo(MemberInfo member) {
		members.put(member.id, member.pw);
		this.path="C:\\KakaoforHAS\\memberMap\\"+member.id;
	}
}
