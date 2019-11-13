package Member;

import java.util.Scanner;

public class Working {
	
	public static void main(String[] args)
	{
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
