import java.util.Scanner;

public class Q06_03
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("팩토리얼 함수 계산을 위한 숫자를 입력하세요. ");
		int num = sc.nextInt();
		int result = 1;

		while (num > 0)
		{

			result = result * num;
			if (num != 1)
			{
				System.out.print(num + "*");
			} else
			{
				System.out.print(num + "=");
			}
			num--;

		}

		System.out.printf("%d", result);

	}

}
