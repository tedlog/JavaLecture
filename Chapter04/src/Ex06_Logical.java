
public class Ex06_Logical
{

	public static void main(String[] args)
	{
		int num1 = 11;
		int num2 = 22;
		boolean result;
		
		result = (1 < num1) && (num1 < 10);
				System.out.println("11은 1초과 10미만인가? : " + result);
		
		result = ((num2 % 2) == 0) || ((num2 % 3) == 0);
				System.out.println("22는 2또는 3의 배수인가? : " + result);
	}

}
