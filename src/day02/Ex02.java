package day02;

public class Ex02 {

	public static void main(String[] args) {
		int num1 = 9, num2 = 2;
		System.out.println(num1 / num2); //나누기 연산자는 정수나누기 정수 후 몫만 나옴
		System.out.println(num1 / (double)num2); //실수 값을 원할시 하나의 정수를 실수로 변환해야함
		System.out.println(num1 / 2.0);
		System.out.println(num1 % num2); //퍼센트 연산자는 나머지를 구해줌
		
		/*
		 * 복합대입 연산자
		 a = 10 b =5;
		 a = a + b; => a+=b;
		 a = a * b; => a*=b;
		 */
		int a = 10, b = 5;
		a += b;
		System.out.println(a);
		
		int su1, su2;
		su1 = su2 = 5;
		System.out.println(su1+=1);
		System.out.println(su1-=1);
		System.out.println(su1*=su2);
		System.out.println(su1/=su2);
		System.out.println(su1%=su2);
		/*
		 관계연산자 : 결과적으로는 참(true)또는 거짓(false)
		 a =10, b =5;
		 a > b : true
		 a <= b : false
		 a == b : false
		 a != b : true
		 10 > 5 > 2 : 사용 못함
		 관계연산자는 이항연산자이며 연산자 사이 피 연산자가 2개 온다
		 */
		double do1 = 3.1, do2 = 3.0;
		System.out.println(do1 <= do2);
		System.out.println(do1 >= do2);
		System.out.println(do1 == do2);
		System.out.println(do1 != do2);
		/*
		 논리연산자 : 참또는 거짓 결과
		 &&(and) : 모두가 참일때 참
		 ||(or) : 하나라도 참이면 참
		 !(not) : 반전시켜준다.
		 */
		int su3;
		su1 = 10; su2 = 20; su3 = 30;
		System.out.println(su1 > su2 && su1 > su3);
		System.out.println("=== and ===");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		System.out.println("=== or ===");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		System.out.println("=== not ===");
		System.out.println(!true);
		System.out.println(!false);
		/*
		 증감 연산자 : 결과적으로 자기자신을 1증가 또는 감소
		 a = 10;
		 ++a : 전치 또는 전위
		 a++ : 후치 또는 후위
		 a++, ++a : a = a+1;
		 a--, --a : a = a+1;
		 */
		System.out.println("===증감연산자===");
		su1 = 10;
		su1++;
		System.out.println(su1);
		
		su1 = 10;
		++su1;
		System.out.println(su1);
		
		su1 = 10;
		su2 = su1++;
		System.out.println("su1 : "+su1);
		System.out.println("su2 : "+su2);
		
		su1 = 10;
		su2 = ++su1;
		System.out.println("su1 : " + su1); //부호가 앞에 붙어있으면 어떠한 연산자 보다 변수를 증감시킴
		System.out.println("su2 : " + su2);
		
		System.out.println("===삼항연사자===");
		/*
		 삼항연산자(조건연산자)
		 변수 = 식 ? 참(값) : 거짓(값);
		 */
		su1 = 11; 
		String s = (su1%2==0)?"짝수":"홀수"; //값이 참이면 ?앞에 값, 거짓이면 : 다음값이 변수에 저장됨.
		System.out.println(su1 + s );
	}
}
