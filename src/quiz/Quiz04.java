package quiz;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
	// 정수를 입력 받아 입력받은 정수가 5의 배수인지 아닌지 출력하시오
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력");
		int a = sc.nextInt();
		if(a%5 == 0) {
			System.out.println("5의 배수입니다.");
		}
		if(a%5!= 0) {
			System.out.println("5의 배수가 아닙니다.");
		}
		sc.close();
}		
}

