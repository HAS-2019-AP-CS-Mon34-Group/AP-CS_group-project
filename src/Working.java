package Member;

import java.util.Scanner;

public class Working {
	
	public static void main(String[] args)
	{
		MemberInfo newMem=new MemberInfo();
		
		Scanner sc=new Scanner(System.in);
		
		String id;
		String pw;
		
		System.out.println("����, ���ڷ� ������ 4�� �̻� 8�� ������ ���̵� �Է�: ");
		id=sc.nextLine();
		
		System.out.println("����, ���ڷ� ������ 4�� �̻� 8�� ������ ��й�ȣ �Է�: ");
		pw=sc.nextLine();
		
		newMem.getID(id);
		newMem.getPW(pw);
		
		sc.close();
	}

}
