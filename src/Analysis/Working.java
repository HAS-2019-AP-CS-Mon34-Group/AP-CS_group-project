package Member;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Working {
	
	public static void main(String[] args) throws IOException
	{
		FileMaker();
		
		// MemberInfo.openProgram();
		Scanner sc=new Scanner(System.in);
		
		ShowMenu();
		System.out.println("메뉴 선택");
		
		double select=sc.nextDouble();
		
		if(select==1) {
			Applying();
		}
		else if(select==2) {
			
		}
		else if(select==3.1) {
			
		}
		else if(select==3.2) {
			
		}
		else if(select==3.3) {
			
		}
		else {
			System.out.println("메뉴를 잘못 선택하셨습니다. 다시 해주세요.");
		}
		sc.close();
		// MemberInfo.closeProgram();
	}
	
	static void FileMaker() {
		File folder=new File("C:\\KakoforHAS\\memberMap");
		if(folder.mkdirs())
			System.out.println("프로그램 실행 준비 완료");
		else
			System.out.println("이미 준비되어 있음 - 실행");
	}
	
	static void ShowMenu() {		
		System.out.println("---------메뉴---------");
		System.out.println("1> 회원가입");
		System.out.println("2> 로그인");
		System.out.println("3.1> 일자별 대화량 비교");
		System.out.println("3.2> 이모티콘 사용 빈도 체크");
		System.out.println("3.3> 반복 단어 체크");
		System.out.println("4> 종료");
		System.out.println("**로그아웃은 종료 후 재접속하세요.");
		System.out.print("메뉴를 선택하세요: ");
	}
	
	static void Applying() {
		MemberInfo newMem=new MemberInfo();
		
		Scanner sc=new Scanner(System.in);
		
		String id;
		String pw;		
		
		System.out.println("영문, 숫자로 구성된 4자 이상 8자 이하의 아이디 입력: ");
		id=sc.nextLine();
		
		System.out.println("영문, 숫자로 구성된 4자 이상 8자 이하의 비밀번호 입력: ");
		pw=sc.nextLine();
		
		newMem.getID(id);
		newMem.getPW(pw);
		
		sc.close();
	}

}
