package ex17collection;

import java.util.HashSet;
import java.util.Iterator;

import common.Student;
import common.Teacher;

public class Ex04HashSet2
{
	public static void main(String[] args)
	{
		/*
		 아래의 경우 객체3과 s3Copy는 동일한 객체이므로
		 중복제거를 위해서는 
		 Student클래스에 hashCode(), equals()메소드를 오버라이딩하여
		 객체간의 hash값 비교, 멤버변수간의 비교를 진행해야 한다.
		 */
		HashSet<Student> hashSet = new HashSet<Student>();
		
		Student s1 = new Student("정우성",40, "2000-01");
		Student s2 = new Student("황정민",42, "2000-02");
		Student s3 = new Student("최민식",44, "2000-03");
		
		hashSet.add(s1);
		hashSet.add(s2);
		hashSet.add(s3);
		
		System.out.println("hashSet의 크기:" + hashSet.size());
		
		//오버라이딩후에는 저장되지 않는다.
		Student s3Copy = new Student("최민식", 44,"2000-03");
		System.out.println();
		
		
	}
}
