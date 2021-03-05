import java.util.Scanner;

public class Q06_05
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("덧셈을 진행할 값을 계속해서 입력하세요(Enter로 구분). '0'을 입력하면 덧셈이 진행됩니다. ");

		for (int i = 0;;)
		{
			
			int num = sc.nextInt();
			if (num == 0)
			{
				System.out.printf("결과값은 %d 입니다. ", i);
				break;
			}
			i = i + num;

		}

	}

}
