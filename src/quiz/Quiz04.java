package quiz;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
	// ������ �Է� �޾� �Է¹��� ������ 5�� ������� �ƴ��� ����Ͻÿ�
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է�");
		int a = sc.nextInt();
		if(a%5 == 0) {
			System.out.println("5�� ����Դϴ�.");
		}
		if(a%5!= 0) {
			System.out.println("5�� ����� �ƴմϴ�.");
		}
		
		
}		
}

