package quiz;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		// 시험 점수를 입력받아 70이상일 경우 합격 70미만일경우 불합격으로 출력하시오
		Scanner sc = new Scanner(System.in);
		System.out.println("시험점수 : ");
		int score = sc.nextInt();
		if(score >= 70) {
			System.out.println("축하합니다 시험에 합격하셨습니다.");
		}
		if(score < 70) {
			System.out.println("시험에 불합격하셨습니다.");
		}
		
			
	}

}
