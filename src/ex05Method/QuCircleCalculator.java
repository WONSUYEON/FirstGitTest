package ex05Method;

import java.util.Scanner;

//원의 반지름을 파라메타로 전달하면 원의넓이와 둘레를 계산하여 
//반환하는 메소드를 각각 정의하자. 이를 호출하는 main 메소드를 정의하라.
//메소드명 : circleArea() > 원의넓이, circleRound() > 원의둘레
//-넓이공식 : 3.14 * 반지름 * 반지름
//-둘레공식 : 2 * 3.14 * 반지름


public class QuCircleCalculator {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("반지름을 입력하세요.");
		double rad = scanner.nextDouble();
		circleArea(rad);
		//반환값이 있는 메소드이므로 print문 안에서 호출한다.
		System.out.println("원의 둘레는:"+circleRound(rad));
		
	}
	//반환값이 없으므로 매개변수를 받은후 결과를 즉시 출력한다.
	static void circleArea(double radian ) {//원의넓이
		double result = 3.14 * radian * radian;
		System.out.println("원의넓이는:"+ result);
	}
	
	static double circleRound(double rad) {//원의 둘레
		
		return (2 * 3.14 * radian);
			}
	
	
	
	
	}

}
