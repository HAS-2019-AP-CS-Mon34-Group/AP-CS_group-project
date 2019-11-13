package Member;
import java.io.File;
import java.util.HashMap;
import java.util.regex.Pattern;

public class MemberInfo {
	
	static HashMap<String, String> members=new HashMap<>();
	
	String id;
	String pw;
	String path;
	
	void getID(String id) {
		String regex="\\w{4,8}";
		if(Pattern.matches(regex, id)==true) {
			if(checkIDOverlap(id)==true)
				this.id=id;
		}
		else System.out.println("잘못된 아이디입니다.");
	}
	
	void getPW(String pw) {
		String regex="\\w{4,8}";
		if(Pattern.matches(regex, pw)==true) {
			this.pw=pw;
			putInfo(this);
			makeUserFile(this.id);
		}
		else System.out.println("잘못된 비밀번호입니다.");
	}
	
	void putInfo(MemberInfo member) {
		members.put(member.id, member.pw);
		this.path="C:\\memberMap\\"+member.id;
		// System.out.println("맵 진입 성공");
	}
	
	boolean checkIDOverlap(String id) {
		if(members.containsKey(id)==true)
		{
			System.out.println("중복된 아이디가 있습니다.");
			return false;
		}
		else return true;
	}
	
	void makeUserFile(String id) {
		File folder=new File(path);
		if(folder.mkdirs()) {
			System.out.println("성공");
			System.out.println(folder.getName());
		}
		else System.out.println("실패");
	}
	
	

}
