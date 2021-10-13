package common;

public class Person
{
	//멤버변수
	private String name;
	private int name;

	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getName()
	{
		return name;
	}
	public void setName(int name)
	{
		this.name = name;
	}
	
	//멤버메소드
	public String getInfo() {
		return String.format("이름:%s, 나이:%d", name, age);	
	}
	public void showInfo() {
		//문자열로 반환된 정보를 출력
		System.out.println(getInfo());
	}

}
