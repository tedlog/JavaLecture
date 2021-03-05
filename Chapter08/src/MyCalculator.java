import java.util.Scanner;

public class MyCalculator
{

	public static void showMenu()
	{
		System.out.println("");
		System.out.println("========================================");
		System.out.println("계산기 메뉴를 선택하세요");
		System.out.println("1.더하기 2.빼기 3.곱하기 4.나누기 5.거듭제곱 0.끝내기");
		System.out.println("========================================");
		System.out.print("메뉴 선택");
	}

	public static void add(int num1, int num2)
	{
		System.out.println("덧셈을 시작합니다.");

		System.out.println("================");
		System.out.println("결과값 : " + (num1 + num2));
		System.out.println("================");
	}

	public static void substract(int num1, int num2)
	{
		System.out.println("뺄셈을 시작합니다.");

		System.out.println("================");
		System.out.println("결과값 : " + (num1 - num2));
		System.out.println("================");
	}

	public static void multiply(int num1, int num2)
	{
		System.out.println("곱셈을 시작합니다.");

		System.out.println("================");
		System.out.println("결과값 : " + (num1 * num2));
		System.out.println("================");

	}

	public static void divide(int num1, int num2)
	{
		System.out.println("나눗셈을 시작합니다.");

		System.out.println("================");
		System.out.println("결과값 : " + (num1 / num2));
		System.out.println("================");
	}
	
	public static void power(int num1, int num2)
	{
		System.out.println("거듭제곱을 시작합니다.");
	
		int nResult = 1;
		for (int k = 0; k < num2; k = k + 1)
		{
			nResult = nResult * num1;
		}
		System.out.println("================");
		System.out.println("결과값 : " + nResult);
		System.out.println("================");
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		while (true)
		{
			showMenu();

			int nMenu = sc.nextInt();

			if (nMenu == 0)
			{

				System.out.println("계산기를 종료합니다.");
				break;

			}
			if (nMenu > 5)
			{

				System.out.println("없는 메뉴입니다.");
				System.out.println("메뉴를 다시 선택하세요.");

				continue;
			}
			System.out.println("계산할 숫자를 차례로 입력해주세요");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();

			if (nMenu == 1)
			{
				add(num1, num2);

			}

			else
			{
				
				if (nMenu == 2)
				{
					substract(num1, num2);
				} else
				{
					if (nMenu == 3)
					{
						multiply(num1, num2);
					} else
					{
						if (nMenu == 4)
						{
							divide(num1, num2);
						} else
						{
							power(num1, num2);
						}

					}
				}
			}

			// 계산 진행
		}
	}
}
