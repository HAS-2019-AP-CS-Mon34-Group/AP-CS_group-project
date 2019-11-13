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
		else System.out.println("�߸��� ���̵��Դϴ�.");
	}
	
	void getPW(String pw) {
		String regex="\\w{4,8}";
		if(Pattern.matches(regex, pw)==true) {
			this.pw=pw;
			putInfo(this);
			makeUserFile(this.id);
		}
		else System.out.println("�߸��� ��й�ȣ�Դϴ�.");
	}
	
	void putInfo(MemberInfo member) {
		members.put(member.id, member.pw);
		this.path="C:\\memberMap\\"+member.id;
		// System.out.println("�� ���� ����");
	}
	
	boolean checkIDOverlap(String id) {
		if(members.containsKey(id)==true)
		{
			System.out.println("�ߺ��� ���̵� �ֽ��ϴ�.");
			return false;
		}
		else return true;
	}
	
	void makeUserFile(String id) {
		File folder=new File(path);
		if(folder.mkdirs()) {
			System.out.println("����");
			System.out.println(folder.getName());
		}
		else System.out.println("����");
	}
	
	

}
