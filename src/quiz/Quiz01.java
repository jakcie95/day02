package quiz;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����� �̸��� �����Դϱ� : ");
		String name = sc.next();
		System.out.println(name + "���� ���� ���� : ");
		int kl = sc.nextInt();
		System.out.println(name + "���� ���� ���� : ");
		int eng = sc.nextInt();
		System.out.println(name + "���� ���� ���� : ");
		int math = sc.nextInt();
		
		System.out.println("�̸� : " + name);
		System.out.println("==============");
		System.out.println("���� : " + kl);
		System.out.println("���� : " + eng);
		System.out.println("���� : " + math);
		System.out.println("==============");
		System.out.println("�հ� : "+(kl + eng+ math));
		System.out.println("==============");
		
		

	}

}
