
public class Q06_07
{

	public static void main(String[] args)
	{
		int num = 0;
		int count = 0;

		do
		{
			num++;

			if (((num % 7) != 0) && ((num % 9) != 0))
				continue;

			System.out.println(num);
		} while (num < 100);

	}

}
