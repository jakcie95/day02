package day02;

public class Ex04 {

	public static void main(String[] args) {
		int num  = 2;
		if(num%2 == 0) {
			System.out.println("짝수");
		}
		if(num%2 != 0){
			System.out.println("홀수");
		}
		
		
		
		if(num < 10)
		{
		System.out.println("1.num은 10보다 작다");//if문의 첫번째문장 = if문에 대한 종속문장 (조건이 참 일경우 실행됨)
		System.out.println("2.num은 10보다 작다");//여러개 종속문장을 사용할경우 중괄호 사용
		System.out.println("3.num은 10보다 작다");
		}
		System.out.println("다음 문장들 실행"); // 조건문에 상관없이 출력됨

}
}
