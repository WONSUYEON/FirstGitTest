
/*
 상속관계에 놓여있는 클래스의 생성자 정의 및 호출방식을 기본으로
  다음 클래스의 적절한 생성자를 삽입해보자. 
  그리고 이의 확인을 위한 main 메소드도 적절히 정의해보자.
 */
package ex12Inheritance;

class Car
{
       	int gasoline;
       	public Car(int g) {
       		
       		gasoline = g;
       		System.out.println("Car생성자호출");
       	}
}
class HybridCar extends Car
{
       	int electric;
       	
       	//생성자는 클래스명과 동일하고 반환타입이 없다.
       	
       	
}
class HybridWaterCar extends HybridCar
{
       	int water;
       	
       	public HybridWaterCar(int g, int e, int w) {
       		
       	}
       	public void showNowGauge()
       	{
                 	System.out.println("남은가솔린:"+gasoline);
                 	System.out.println("남은전기량:"+electric);
                 	System.out.println("남은워터량:"+water);
       	}
}
public class QuConstructorAndSuper {

	public static void main(String[] args)
	{
		HybridWaterCar hcar = new HybridWaterCar(10,20,30);
		hcar.showNowGauge();
	}
}


public class QuConstructorAndSuper
{

	public static void main(String[] args)
	{
	

	}

}
