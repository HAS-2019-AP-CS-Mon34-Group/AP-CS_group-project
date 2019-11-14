package Member;

import Analysis.*;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MainUI {

	public static String pathname = "C:\\KakaoforHAS\\memberMap";

	static void FileMaker() {
		File folder = new File(pathname);
		if(folder.mkdirs())
			System.out.println("Ready to Launch");
		else
			System.out.println("Program is already ready to launch.");
	}

	static void ShowMenu() {
		System.out.println("--------Menu--------");
		System.out.println("1> Sign up");
		System.out.println("2.1> Chat analysis (via name)");
		System.out.println("2.2> Chat analysis (via date)");
		System.out.println("2.3> Chat analysis (via Emoticon usage)");
		System.out.println("2.4> Frequent word usage");
		System.out.println("3> Exit");
		System.out.println("**Please restart the program to log out.");
		System.out.print("Please select menu from above.");
	}

	static void Applying() {
		Member.MemberInfo newMem = new Member.MemberInfo();
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

	public static String getBaseFile() {
		System.out.println("Please type in absolute location of your base file and its name.");
		Scanner sc = new Scanner(System.in);
		String basefileloc = sc.nextLine();
		return basefileloc;
	}

	public static void main(String[] args) {
		FileMaker();
		// MemberInfo.openProgram();
		Scanner sc = new Scanner(System.in);
		ShowMenu();
		System.out.println("Select Menu");
		double select = sc.nextDouble();

		while (true) {
			if (select == 1) {
				Applying();
				break;
			}

			else if (select == 2.1) {
				ChatbyName.GetChatByName();
				break;
			}

			else if (select == 2.2) {
				ChatbyDate.GetChatByDate();
				break;
			}

			else if (select == 2.3) {
				ChatbyEmoticon.WordsCount();
				break;
			}

			else if (select == 2.4) {
				ChatbyWord.WordsCount();
				break;
			}

			else if (select == 3) {
				sc.close();
				// MemberInfo.closeProgram();
				break;
			}
			else {
				System.out.println("Invalid Input. Restart the program.");
				break;
			}
		}
	}
}
