package quiz;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		// ���� ������ �Է¹޾� 70�̻��� ��� �հ� 70�̸��ϰ�� ���հ����� ����Ͻÿ�
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� : ");
		int score = sc.nextInt();
		if(score >= 70) {
			System.out.println("�����մϴ� ���迡 �հ��ϼ̽��ϴ�.");
		}
		if(score < 70) {
			System.out.println("���迡 ���հ��ϼ̽��ϴ�.");
		}
		
			
	}

}
