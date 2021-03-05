import java.util.Scanner;

public class Q02_04
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("비교할 두 수를 '스페이스'로 구분하여 순서대로 입력하세요.");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int big = (num1 > num2)? num1: num2;	
		System.out.printf("입력한 수 중 큰 수는 %d 입니다.", big);	

	}

}
