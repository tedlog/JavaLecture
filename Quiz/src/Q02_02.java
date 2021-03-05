import java.util.Scanner;

public class Q02_02
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("제곱을 계산하기 위한 숫자를 입력하세요.");
		int num1 = sc.nextInt();
		
		int result = 1;
		
		for(int i=0; i<2; i++)
		{
			result = result * num1;
		}
		System.out.printf("입력한 숫자의 제곱은 %d 입니다.\n", result);
	}

}
