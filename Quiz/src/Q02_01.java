import java.util.Scanner;

public class Q02_01
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자를 입력하세요: ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 숫자를 입력하세요: ");
		int num2 = sc.nextInt();
		
		int result1 = num1 + num2;
		int result2 = num1 - num2;
		int result3 = num1 * num2;
		int result4 = num1 / num2;
		int result5 = num1 % num2;
		System.out.println("========================");
		System.out.printf("입력한 숫자의 합은 %d 입니다. \n", result1);
		System.out.printf("입력한 숫자의 차는 %d 입니다. \n", result2);
		System.out.printf("입력한 숫자의 곱은 %d 입니다. \n", result3);
		System.out.printf("입력한 숫자의 나눗셈의 몫 %d이고, 나머지는 %d 입니다. \n", result4, result5);
		System.out.println("========================");
		
	}

}
