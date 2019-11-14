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
		String regex="[a-zA-Z가-힣]{4,8}";
		if(Pattern.matches(regex, id)) {
				this.id=id;
		}
		else System.out.println("Invalid type of ID. Please check again.");
	}
	
	void getPW(String pw) {
		String regex="[a-zA-Z가-힣]{4,8}";
		if(Pattern.matches(regex, pw)) {
			this.pw=pw;
			putInfo(this);
			makeFile();
		}
		else System.out.println("Invalid type of Password. Please check again.");
	}
	
	void putInfo (MemberInfo member) {
		members.put(member.id, member.pw);
		this.path="C:\\KakaoforHAS\\memberMap\\"+member.id;
	}
}