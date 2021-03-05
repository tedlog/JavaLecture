
public class Ex03_TypeChange2
{

	public static void main(String[] args)
	{
		int num1 = 2147483647;
		int num2 = 2147483648; //3byte 초과
		long num3 = 2147483648; //상수는 디폴트가 integer이기 때문에 long임을 끝에 적어야함
		long num4 = 2147483648L;
		
		float num5 = 1.0; //상수와는 다르게 단순히 절삭할 수 있는게 아니라 e와m을 통해 계산한 값을 반여하기 때문에 인식이안됨
		float num6 = 1.0F;
		
		double num7 = 30; //int => double 자동 형변환

	}

}
