package ex04ControlStatement;
//하나의 문자를 입력받아 숫자인지 여부를 판단하는 프로그램을 삼항연산자를 이용하여 구현하시오.	
//(System.in.read()를 사용하세요)
//실행결과] 아래는 2번 실행하였습니다.

import java.io.IOException;
import java.util.Scanner;

public class Qu_04_01 {

	public static void main(String[] args) throws IOException {
		System.out.println("하나의 문자를 입력하세요");
		int asciiCode = System.in.read();
		
		if(asciiCode>'0' && asciiCode<='9')
			
		{
			System.out.println("숫자입니다");
		}
		else {
			System.out.println("숫자가 아닙니다");
			
				}
	
		 
		System.out.println("하나의 문자를 입력하세요");
		int asciiCode1 = System.in.read();
		
		//asciiCode <=9 ? '숫자입니다' : '숫자가 아닙니다';
	}
}
