package quiz;

import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {
		//������ �ΰ� �Է¹޾� ��� ������ �Ͽ� ����ϰ� ������� ���ٰ� ���
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է� : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		if(num1 > num2) {
			System.out.println(num1  + "��" + num2 +"���� ũ��.");
		}
		if(num1 < num2) {
			System.out.println(num2  + "��" + num1 +"���� ũ��.");
		}
		if(num1 == num2) {
			System.out.println("���� ���� ����.");
		}
	}

}
