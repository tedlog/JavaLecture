
public class Ex08_Condition
{

	public static void main(String[] args)
	{
		int num1 = 50;
		int num2 = 100;
		
		int big = (num1 > num2)? num1: num2;	//조건문? 참일때 실행: 거짓일때 실행;
		System.out.println("큰 수 = " + big);	//둘 중 큰수가 나옴
		
		int diff = (num1 > num2)? (num1 - num2): (num2 - num1);
		System.out.println("두 수의 차 = " + diff); //두 수의 차이의 절대값이 나옴
	}

}
