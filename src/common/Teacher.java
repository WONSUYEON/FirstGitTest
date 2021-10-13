package common;

import java.util.Objects;

public class Teacher extends Person
{
	
	private String subject;
	public Teacher(String name, int age, String subject)
	{
		super(name, age);
		this.subject = subject;
	}
	@Override
	public String getInfo()
	{
			return String.format("%s, 과목:%s", super.getInfo(), subject);
	}
	@Overide
	public void showInfo()
	{
		System.out.println(getInfo());
	}
	@Override
	public int hashCode()
	{
		return Objects.hash(subject);
	}
	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Teacher other = (Teacher) obj;
		return Objects.equals(subject, other.subject);
	}
}
