import java.util.Scanner;

public class Q06_06
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("1.입력할 정수의 갯수를 입력하세요.");
		int num1 = sc.nextInt();

		System.out.println("2.입력하신 숫자만큼 정수를 입력하세요. ");
		double result = 0.0;
		for (int i = 0; i < num1; i++)
		{

			int num2 = sc.nextInt();
			result = result + num2;

		}
		double average = result / num1;
		System.out.printf("3.입력하신 정수의 평균은 %f 입니다. ", average);

	}

}
