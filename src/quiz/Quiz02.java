package quiz;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		//�� Ǯ��
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է��Ͻʽÿ� : ");
		int su1 = sc.nextInt();
		String a = (su1%2==0)?"¦��":"Ȧ��";
		System.out.println(su1 + " = " + a);
		String b = (su1%3==0)?"3�ǹ����":"3�ǹ���� �ƴϴ�";
		System.out.println(su1 + " = " + b);
		System.out.print("�� �� �Է� : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("num1 : " + num1 + ",num2 : " + num2);
		String c = (num1 > num2)?"num1�� num2���� ũ��" : "num2�� num1���� ũ��";
		System.out.println(c);
		
		//����� Ǯ��
		System.out.println("�� �Է� : ");
		int g = sc.nextInt();
		String s;
		s = (g%2 == 0)? "¦" :"Ȧ";
		System.out.println(g+"="+s);
		s = (g%3 == 0)? "���" : "�ƴ�";
		System.out.println(g+"="+s);
		
		int su3, su4;
		System.out.println("�μ� �Է�");
		su3 = sc.nextInt();
		su4 = sc.nextInt();
		s = (su3 > su4)?"su1ũ��":"su2ũ��";
		System.out.println(su3+","+su4+s);
	}

}
