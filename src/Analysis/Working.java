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
		System.out.println("�޴� ����");
		
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
			System.out.println("�޴��� �߸� �����ϼ̽��ϴ�. �ٽ� ���ּ���.");
		}
		sc.close();
		// MemberInfo.closeProgram();
	}
	
	static void FileMaker() {
		File folder=new File("C:\\KakoforHAS\\memberMap");
		if(folder.mkdirs())
			System.out.println("���α׷� ���� �غ� �Ϸ�");
		else
			System.out.println("�̹� �غ�Ǿ� ���� - ����");
	}
	
	static void ShowMenu() {		
		System.out.println("---------�޴�---------");
		System.out.println("1> ȸ������");
		System.out.println("2> �α���");
		System.out.println("3.1> ���ں� ��ȭ�� ��");
		System.out.println("3.2> �̸�Ƽ�� ��� �� üũ");
		System.out.println("3.3> �ݺ� �ܾ� üũ");
		System.out.println("4> ����");
		System.out.println("**�α׾ƿ��� ���� �� �������ϼ���.");
		System.out.print("�޴��� �����ϼ���: ");
	}
	
	static void Applying() {
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
