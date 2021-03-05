import java.util.Scanner;

public class Q06_04
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int num = 1;
		int result = 0;

		int nMax = 1000;
		do
		{
			if (num != nMax)
			{
				System.out.print(num + "+");
			} else
			{
				System.out.print(num + "=");
			}
			result = result + num;
			num++;

		} while (num <= nMax);

		System.out.println(result);

	}

}
