package ex12Inheritance;

public class E07RideAndLoad02
{

	public static void main(String[] args)
	{
		/*
		자식참조변수로 자식객체를 참조하는 가장 일반적인 형식
		
		 */
		System.out.println("Child형 참조변수로  Child객체 참조");
		DeChild child = new DeChild("율곡이이", 49, "00학번");
		
		/*
		 오버라이딩 처리된 메소드이므로 참조변수에 상관없이
		 무조건 자식쪽 메소드가 호출된다.
		 */
		child.excercise();
		child.sleep();
		child.printParent();
		
		child.study(); //자식에서 확장한 메소드(부모에는 없음)
		child.walk();//오버로딩 - 부모쪽에서 정의됨
		child.walk(25);//오버로딩 - 자식쪽에서 정의됨
		
		/*
		정적메소드는 클래스명을 통해 호출한다.
		static의 기본규칙을 따르므로, 오버라이딩의 대상이 될수없다.
		 */
		DeChild.staticMethod();
		
		////////////////////////////////////////////////
		/*
		부모타입의 참조변수로 자식객체를 참조. 상속관계가 있으므로
		가능함.
		 */
		
		System.out.println("Parent형 참조변수로 Child객체 참조");
		DeParent parent = new DeChild("퇴계이황", 35, "99학번");
		
		/*
		 오버라이딩 처리된 메소드이므로 참조변수에 상관없이
		 자식쪽 메소드가 호출된다. 참조변수의 영향을 받지 않는다.
		 */
		parent.excercise();
		parent.sleep();
		parent.printParent();
		
		//parent.study();//(자식쪽에만 있는아이들. 자식에서 확장한 메소드이므 불가능해)
		parent.walk();
		//parent.walk(20);//자식쪽에서 정의된 메소드이브로 접근불가
		
		//정적메소드는 오버라이딩 되지않고, 클래스명으로 호출한다.
		DeParent.staticMethod();

	}

}
