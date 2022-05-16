package quiz;

import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {
		//정수를 두개 입력받아 대소 구분을 하여 출력하고 같을경우 같다고 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		if(num1 > num2) {
			System.out.println(num1  + "이" + num2 +"보다 크다.");
		}
		if(num1 < num2) {
			System.out.println(num2  + "이" + num1 +"보다 크다.");
		}
		if(num1 == num2) {
			System.out.println("둘의 값이 같다.");
		}
	}

}
