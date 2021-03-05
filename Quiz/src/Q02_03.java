import java.util.Scanner;

public class Q02_03
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나누고자 하는 숫자를 '스페이스'로 구분하여 순서대로 입력하세요. ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int result1 = num1 / num2;
		int result2 = num1 % num2;
		
		System.out.println("========================");
		System.out.printf("입력한 숫자의 나눗셈의 몫 %d이고, 나머지는 %d 입니다. \n", result1, result2);
		System.out.println("========================");
	}

}
