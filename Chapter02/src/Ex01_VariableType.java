
public class Ex01_VariableType
{
	public static void main(String[] args)
	{
		byte num1 = 1;	//1byte 사용, 값의 크기: 2^8 (-128 ~ 127)
		short num2 = 1; //2byte 사용, 값의 크기: 2^16(-32,768 ~ 32,767)
		int num3 = 1;	//3byte 사용, 값의 크기: 2^32(-2,147,483,648 ~ 2,147,483,647)
		long num4 = 1;	//4byte 사용, 값의 크기: 2^64(-9,223,372,036,854,775,808 ~ )
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
	}
}
