package quiz;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
		//¦���� ���������� ��ư�� ���� ¦������ ��� ������ ����ϰ�
		//�ƴҰ�� �߸��� �����Դϴٸ� ����Ͻÿ�
		Scanner sc = new Scanner(System.in);
		System.out.println("��ư�� �����ּ���");
		int button = sc.nextInt();
		if(button%2 == 0) {
			System.out.println(button +"�� �Դϴ�.");
		}
		if(button%2 != 0) {
			System.out.println("�߸��� �����Դϴ�.");
		}
		
		

	}

}
