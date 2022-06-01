package quiz;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
		//짝수층 엘리베이터 버튼을 눌러 짝수층일 경우 층수를 출력하고
		//아닐경우 잘못된 동작입니다를 출력하시오
		Scanner sc = new Scanner(System.in);
		System.out.println("버튼을 눌러주세요");
		int button = sc.nextInt();
		if(button%2 == 0) {
			System.out.println(button +"층 입니다.");
		}
		if(button%2 != 0) {
			System.out.println("잘못된 동작입니다.");
		}
		
		sc.close();

	}

}
