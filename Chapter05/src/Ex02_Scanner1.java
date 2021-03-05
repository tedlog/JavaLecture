import java.util.Scanner;

public class Ex02_Scanner1
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 1 2 3 입력하고 엔터를 누르세요.");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		System.out.println("숫자 1을 입려하고 엔터를 누르세요.");
		int num4 = sc.nextInt();
		System.out.println("숫자 2을 입려하고 엔터를 누르세요.");
		int num5 = sc.nextInt();
		System.out.println("숫자 3을 입려하고 엔터를 누르세요.");
		int num6 = sc.nextInt();
		
		System.out.printf("%d %d %d %d %d %d \n", num1, num2, num3, num4, num5, num6);
		System.out.println(num1);
	}

}
