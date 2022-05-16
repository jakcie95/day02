package day02;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		final String KOREA = "대한민국";
		System.out.println(KOREA);
		//KOREA = "케나다";
		//System.out.println(KOREA);
		//final 선언을 할때는 통상적으로 대문자로 변수를 써서 구분한다.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력 : ");
		String name = sc.next();
		int age;
		System.out.println("나이 입력 : ");
		age =sc.nextInt();
		
		System.out.println(name +"님의 나이는 " + age);
	}

}
