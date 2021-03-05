import java.util.Scanner;

public class Ex03_Scanner2
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("'동해물과 백두산이'를 입력하고 엔터를 누르세요.");
		String name1 = sc.nextLine();
		
		System.out.println("'동해물과 백두산이'를 입력하고 엔터를 누르세요.");
		String name2 = sc.next();
		String name3 = sc.next();
		
	    System.out.printf("[%s] [%s] [%s]", name1, name2, name3);
	}

}
