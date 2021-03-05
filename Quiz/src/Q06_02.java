import java.util.Scanner;

public class Q06_02
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("국어, 영어, 수학 점수를 '스페이스'로 구분하여 차례로 입력하세요.");
		int score1 = sc.nextInt();
		int score2 = sc.nextInt();
		int score3 = sc.nextInt();
		
		double average = (score1 + score2 + score3) / 3.0;
		
		if (average >= 90)
		{
			System.out.printf("평균 점수는 %.2f 이며, A학점 입니다. \n", average);
		} else if (average >= 80)
		{
			System.out.printf("평균 점수는 %.2f 이며, B학점 입니다. \n", average);
		} else if (average >= 70)
		{
			System.out.printf("평균 점수는 %.2f 이며, C학점 입니다. \n", average);
		} else if (average >= 60)
		{
			System.out.printf("평균 점수는 %.2f 이며, D학점 입니다. \n", average);
		} else
		{
			System.out.printf("평균 점수는 %.2f 이며, F학점 입니다. \n", average);
		}

	}

}
