package ex11static;
/*
static 블럭
	: 동일 클래스안의 main메소드보다 먼저 실행되는 블럭으로
	main메소드의 실행코드가 없어도 먼저 실행된다.
	또한 생성자 메소드보다 static블럭이 먼저 실행된다.
 */
public class E02StaticBlockMain
{
	//인스턴스형 멤버 변수 및 메소드
	int instanceVar;
	void instanceMethod() {}
	
	//정적 멤버 변수 및 메소드
	static int staticVar;
	static void staticMethod() {
		int localVar;
		System.out.println("정적메소드");
	}
	//static 블럭
	static {
		//스태틱블럭내에서 (스태틱)정적멤버는 접근가능
		staticVar = 1000;
		
		
		/*
		블럭내에서만 사용할수 있는 변수로써, 블럭내에서는 일반적인
		변수를 생성할 수 있다. //이 스태틱블럭내에서만 사용할수 있는 지역변수형태로 가능
		 */
		int localVar;
		localVar = 1000;
		System.out.println("localVar="+ localVar);//사용가능
		
		/*
		static 블럭이 2층이라면 instance는 아래층이라 옮길수없어
		static 블럭내에서는 인스턴스형 멤버에 접근할 수 없다.
		 */
		//System.out.println("instanceVar="+ instanceVar);//에러발생
		//instanceMethod();//에러발생
		
		/*
		정적멤버에는 접근할 수 있다.
		 */
		System.out.println("staticVar="+ staticVar);
		staticMethod();
		
		System.out.println("===static block 끝====");
		
		//생성자 메소드: 클래스명과 동일하고 변수가없고 반환타입만 있는애
		/*
		
		 */
		
	}

	public E02StaticBlockMain() {
		staticVar = -1;
		System.out.println("===E02StaticBlockMain의 생성자===");
		
	}
	
	public static void main(String[] args)
	{
		System.out.println("==메인메소드===");
		
		/*
		static 블럭내에서 선언된 지역변수이므로 main메소드에서는
		사용할 수 없다.
		 */
		//System.out.println("localVar=" +localVar);

	

	}
}
