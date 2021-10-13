//국어,영어,수학 점수를 99, 80, 96점으로 입력하고
//평균점수를 구해서 출력하는 프로그램을 작성하시오.

package ex02variable;

public class Qu_02_02 {

	public static void main(String[] args) {
		int k=99, e=80, m=96;
		int avg1= (k+e+m) / 3;
		double avg2= (k+e+m) / 3.0;
		System.out.println("평균점수(실수형)="+avg2);
		System.out.println("평균점수(정수형)="+avg1);
		
		
	
		// 내가한거 float avg2 = (long) sum/3f;
		//내가 한거 int avg = sum/3 ; 
		System.out.printf("평균점수(실수형)=", +avg2 );
		System.out.println(avg2);
		
		//System.out.printf("평균점수(정수형)=", +avg);
		//System.out.println(avg);
		

	}

}
