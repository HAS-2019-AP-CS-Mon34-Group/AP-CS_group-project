package Member;

import java.io.File;

public class MakeFile {
	String path;
	
	void makeFile() {
		File folder = new File(path);
		if(folder.mkdirs()) {
			System.out.println("directory confirmed");
			System.out.println(folder.getName());
		}
		else System.out.println("Duplicated directory");
	}

}
