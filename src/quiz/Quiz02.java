package quiz;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		//내 풀이
		Scanner sc = new Scanner(System.in);
		System.out.print("수를 입력하십시오 : ");
		int su1 = sc.nextInt();
		String a = (su1%2==0)?"짝수":"홀수";
		System.out.println(su1 + " = " + a);
		String b = (su1%3==0)?"3의배수다":"3의배수가 아니다";
		System.out.println(su1 + " = " + b);
		System.out.print("두 수 입력 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("num1 : " + num1 + ",num2 : " + num2);
		String c = (num1 > num2)?"num1이 num2보다 크다" : "num2가 num1보다 크다";
		System.out.println(c);
		
		//강사님 풀이
		System.out.println("수 입력 : ");
		int g = sc.nextInt();
		String s;
		s = (g%2 == 0)? "짝" :"홀";
		System.out.println(g+"="+s);
		s = (g%3 == 0)? "배수" : "아님";
		System.out.println(g+"="+s);
		
		int su3, su4;
		System.out.println("두수 입력");
		su3 = sc.nextInt();
		su4 = sc.nextInt();
		s = (su3 > su4)?"su1크다":"su2크다";
		System.out.println(su3+","+su4+s);
	}

}
