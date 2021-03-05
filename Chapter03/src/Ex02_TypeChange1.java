
public class Ex02_TypeChange1
{

	public static void main(String[] args)
	{
		int num1 = 1;  	//3byte	
		byte num2 = 1; 	//1byte
		byte num3 = 127;
//		byte num4 = 128;
		
		short num5 = 1; //2byte
		
//		num2 = num5;
		num5 = num2;
		num2 = (byte)num5; //명시적, 강제 형변환=> 앞의 여덟자리가 00000000이라서 가능
		
		
	}

}
