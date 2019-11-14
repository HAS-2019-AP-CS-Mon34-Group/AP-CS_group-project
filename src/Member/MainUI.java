package Member;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MainUI {
	
	public static void main(String[] args) throws IOException //존재 이유?
	{
		FileMaker();
		
		// MemberInfo.openProgram();
		Scanner sc=new Scanner(System.in);
		
		ShowMenu();
		System.out.println("Select Menu");
		
		double select=sc.nextDouble();
		
		if(select==1) {
			Applying();
		}
		else if(select==2) { }
		else if(select==3.1) { }
		else if(select==3.2) { }
		else if(select==3.3) { }
		else {
			System.out.println("Please Select menu again.");
		}
		sc.close();
		// MemberInfo.closeProgram();
	}
	
	static void FileMaker() {
		File folder=new File("C:\\KakoforHAS\\memberMap");
		if(folder.mkdirs())
			System.out.println("Ready to Launch");
		else
			System.out.println("Program is already ready to launch.");
	}
	
	static void ShowMenu() {		
		System.out.println("--------Menu--------");
		System.out.println("1> Sign up");
		System.out.println("2> Sign in");
		System.out.println("3.1> Chat analysis (via date)");
		System.out.println("3.2> Chat analysis (via Emoticon usage)");
		System.out.println("3.3> Frequent word usage");
		System.out.println("4> Exit");
		System.out.println("**Please restart the program to log out.");
		System.out.print("Please select menu from above.");
	}
	
	static void Applying() {
		Member.MemberInfo newMem=new Member.MemberInfo();
		
		Scanner sc=new Scanner(System.in);
		
		String id;
		String pw;		
		
		System.out.println("ID consists of 4 to 8 English, Korean characters: ");
		id=sc.nextLine();
		
		System.out.println("Password consists of 4 to 8 English, Korean characters: ");
		pw=sc.nextLine();
		
		newMem.getID(id);
		newMem.getPW(pw);
		
		sc.close();
	}

}
