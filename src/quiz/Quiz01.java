package quiz;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("당신의 이름은 무엇입니까 : ");
		String name = sc.next();
		System.out.println(name + "님의 국어 점수 : ");
		int kor = sc.nextInt();
		System.out.println(name + "님의 영어 점수 : ");
		int eng = sc.nextInt();
		System.out.println(name + "님의 수학 점수 : ");
		int math = sc.nextInt();
		
		System.out.println("이 름 : " + name);
		System.out.println("==============");
		System.out.println("국 어 : " + kor);
		System.out.println("영 어 : " + eng);
		System.out.println("수 학 : " + math);
		System.out.println("==============");
		System.out.println("합 계 : "+(kor + eng+ math));
		System.out.println("==============");
		
		sc.close();

	}

}
