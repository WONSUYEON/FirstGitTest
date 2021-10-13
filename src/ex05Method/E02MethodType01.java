package ex05Method;
/*
 Method(메소드, 함수)
 	: 객체지향 프로그램에서 행동 또는 동작을 의미한다.
 	즉 어떤 하나의 업무를 처리하는 모듈(부속품)이라 정의할 수 있다.
규칙
 	-메소드는 반드시 class안에 정의해야한다.
 	-메소드안에 또다른 메소드를 정의할 수 없다.
 	-반환타입이 없다면 반드시 void를 명시해야 한다.
 	-이름의 규칙은 변수명과 동일하다. (Ex : addcalculate())
 Java에서의 NameingRule(이름규칙)
 	-클래스명 : SimpleFunc => 대문자로 시작하는 camel Case
 	-메소드명, 변수명 : simpleFunc => 소문자로 시작하는 카멜케이스
	-상수명 : SIMPLE_FUNC => 전체를 대문자로, 연결단어는 _(언더바)로 표현
	-패키지명 : simple.func => 전체를 소문자로, 연결단어는 .(점)으로 표현
 */
public class E02MethodType01 {
	
	//반환타입, 매개변수 둘다 없는 타입의 메소드 정의
	
	static void noParamNoReturn() {
		System.out.println("==메뉴를 선택하세욤==");
		System.out.println("1.열기, 2.계속하기, 3.종료");
		System.out.println("========================");
	}
	/*
	 필요에 따라 실행부가 없는 메소드를 정의하는 경우가 있다.
	 */
	static void noParamNoReturn2() {
		}
	/*
	 동일한 이름의 메소드를 정의하였으나 매개변수의 개수로
	 호출할 대상을 구분할 수 있으므로 다른 함수라 생각하면 되고,
	 이와같은 문법을 "메소드 오버로딩"이라 한다.
	 */
	static void noParamNoReturn2(int a) {
	}
	
	static void noParamNoReturn3() {
		int returnValue = 89;
		System.out.println("[Return문 이전]");
		
		//return; => 에러발생됨
		/*
		 위와 같이 메소드 중간에 return을 쓰면 함수가 즉시 종료되므로
		 아래문장은 실행되지 않는 쓰레기 코드가 된다.
		 따라서 반드시 조건문과 함께 사용되어야 한다. 단 마지막 라인에
		 있을때는 상관없다.
		 */
		
		if(returnValue%2==0) {
			System.out.println(returnValue+"는 짝수");		
			return;
		}
		System.out.println(returnValue + "는 홀수");
		System.out.println("[return문 이후]");
	}
		
	
	
	
	
	public static void main (String[] args) {
		//메소드 호출시에는 메소드의 원형을 그대로 사용하면된다.

		noParamNoReturn();
		noParamNoReturn2();
		noParamNoReturn3();

	}

}
