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

public class MemberInfo extends MakeFile {
	
	static HashMap<String, String> members=new HashMap<>();
	
	String id;
	String pw;
	// String path;
	
	/* static void openProgram() throws IOException {
		File folder=new File("C:\\KakaoforHAS\\memberHashMap.txt");
		FileReader fileReader=new FileReader(folder);
		int reader;
		String key="";
		String value="";
		int decide=0;
		while((reader=fileReader.read())!=0)
		{
			if((reader=fileReader.read())==13)
			{
				members.put(key, value);
				System.out.println("done");
				key="";
				value="";
				decide=0;
			}
			else
			{
				if((reader=fileReader.read())==32) {
					decide=1;
					value=value+(char)reader;
				}
				else if (decide==0)
				{
					key=key+(char)reader;
				}
			}
		}
		
		System.out.println("�Ϸ�");
		
		fileReader.close();
	} */
	
	void getID(String id) {
		String regex="\\w{4,8}";
		if(Pattern.matches(regex, id)==true) {
			// if(checkIDOverlap(id)==true)
				this.id=id;
		}
		else System.out.println("�߸��� ���̵��Դϴ�.");
	}
	
	void getPW(String pw) {
		String regex="\\w{4,8}";
		if(Pattern.matches(regex, pw)==true) {
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
	
	/* boolean checkIDOverlap(String id) {
		if(members.containsKey(id)==true)
		{
			System.out.println("�ߺ��� ���̵� �ֽ��ϴ�.");
			return false;
		}
		else return true;
	} */
	
	/* void makeUserFile() {
		File folder=new File(path);
		if(folder.mkdirs()) {
			System.out.println("����");
			System.out.println(folder.getName());
		}
		else System.out.println("�̹� �ֽ��ϴ�.");
	} */
	
	/* static void closeProgram() throws IOException {
		File folder=new File("C:\\KakaoforHAS\\memberHashMap.txt");
		try {
			if(folder.createNewFile())
				System.out.println("ȸ�� ���� ���� ���� �Ϸ�");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Set<Entry<String, String>> set=members.entrySet();
		Iterator<Entry<String, String>> it=set.iterator();
		
		BufferedWriter bufferWriter=new BufferedWriter(new FileWriter(folder));
		if(folder.isFile()&&folder.canWrite()) {
			while(it.hasNext()) {
				Map.Entry<String, String> mem=(Map.Entry<String, String>)it.next();
				String memInfo=mem.getKey()+" "+mem.getValue();
				bufferWriter.write(memInfo);
				bufferWriter.newLine();
			}
			
			bufferWriter.close();
		}
		
		
	} */

}
