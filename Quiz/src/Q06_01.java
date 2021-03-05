import java.util.Scanner;

public class Q06_01
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("차를 구할 두 숫자를 '스페이스'로 구분하여 순서대로 입력하세요.");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		int result = num1 - num2;

		if (result > 0)
		{
			System.out.println(result);
		} else
		{
			System.out.println(-result);
		}

	}

}
