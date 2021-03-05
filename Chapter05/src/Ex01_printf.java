
public class Ex01_printf
{

	public static void main(String[] args)
	{
		String name = "홍길동";	//글자들을 저장할 때 사용하는 자료형
		int age = 20;
		double height = 175.5;
				
				System.out.println(height);
				
		System.out.printf("%s의 나이는 %d이고, 키는 %f입니다.\n", name, age, height); //순서와 타입 모두 맞춰야한다.
		System.out.printf("%s의 나이는 %d이고, 키는 %.2f입니다.\n", name, age, height);
	}

}
