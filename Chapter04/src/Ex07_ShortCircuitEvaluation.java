
public class Ex07_ShortCircuitEvaluation
{

	public static void main(String[] args)
	{
		int x = 0;
		int y = 0;
		boolean result;
		
		result = ((x = x + 1) < 0) && ((y = y + 1) > 0); //x=x+1에서 이미 false이기 때문에 y=y+1 연산은 하지않음
		
		System.out.println("result = " + result);
		System.out.println("x = " + x);
		System.out.println("y = " + y + '\n'); //연산을 하지 않았기 때문에 여전히 y는 0임
		// '\n'은 줄바꿈 기호
		result = ((x = x + 1) > 0) || ((y = y + 1) > 0);
		
		System.out.println("result = " + result); //x=x+1에서 이미 true이기 때문에 y=y+1 연산은 하지않음
		System.out.println("x = " + x);
		System.out.println("y= " + y);  //연산을 하지 않았기 때문에 여전히 y는 0임

	}

}
