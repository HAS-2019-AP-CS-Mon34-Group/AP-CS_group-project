package Member;

import java.io.File;

public class MakeFile {
	String path;
	
	void makeFile() {
		File folder=new File(path);
		if(folder.mkdirs()) {
			System.out.println("����");
			System.out.println(folder.getName());
		}
		else System.out.println("�̹� �ֽ��ϴ�.");
	}

}
