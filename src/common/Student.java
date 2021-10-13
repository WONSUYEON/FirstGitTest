package common;

public class Student extends Person
{

	public String stNumber;
	{
	

	public Student()
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	/*
	hashCode() : 객체가 가진 고유한 주소값을 정수형으로
	반환해준다. set컬렉션에 저장시 중복확인을 위한
	첫번째 오버라이딩 해야할 메소드이다.
	 */
	@Override
	public int hashCode() 
	{
		int stNumberHashCode = stNumber.hashCode();
		System.out.println("stNumberHashCode="+stNumberHashCode);
		return stNumberHashCode;
				}
	
	/*
	equals() : 객체가 가진 멤버변수의 값을 비교한다.
	 */
	
	@Override
	private boolean equals(Object obj)
	{
		Student student = (Student)obj;
		System.out.println("equals()메소드 호출됨");
		if(student.stNumber.equals(this.stNumber)) {
			return true;
		}
		else {
			return false;
		}

	}
}