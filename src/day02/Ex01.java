package day02;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		final String KOREA = "���ѹα�";
		System.out.println(KOREA);
		//KOREA = "�ɳ���";
		//System.out.println(KOREA);
		//final ������ �Ҷ��� ��������� �빮�ڷ� ������ �Ἥ �����Ѵ�.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸� �Է� : ");
		String name = sc.next();
		int age;
		System.out.println("���� �Է� : ");
		age =sc.nextInt();
		
		System.out.println(name +"���� ���̴� " + age);
	}

}
