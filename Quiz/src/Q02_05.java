import java.util.Scanner;

public class Q02_05
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("곱할 두 수를 '스페이스'로 구분하여 순서대로 입력하세요.");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		boolean result1 = ((num1 < 0) && (num2 < 0));
		boolean result2 = ((num1 < 0) || (num2 < 0));
		
		int mul1 = (result2)? (-(num1 * num2)): ((num1 * num2));
		int mul2 = (result1)? (num1 * num2): (mul1);
		System.out.printf("입력한 두수의 곱의 절대값은 %d 입니다.", mul2);	

	}

}
