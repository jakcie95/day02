package quiz;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("당신의 이름은 무엇입니까 : ");
		String name = sc.next();
		System.out.println(name + "님의 국어 점수 : ");
		int kl = sc.nextInt();
		System.out.println(name + "님의 영어 점수 : ");
		int eng = sc.nextInt();
		System.out.println(name + "님의 수학 점수 : ");
		int math = sc.nextInt();
		
		System.out.println("이름 : " + name);
		System.out.println("==============");
		System.out.println("국어 : " + kl);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		System.out.println("==============");
		System.out.println("합계 : "+(kl + eng+ math));
		System.out.println("==============");
		
		

	}

}
