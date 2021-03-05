
public class Ex03_PlusMinusSign
{

	public static void main(String[] args)
	{
		short num1 = 5;
		System.out.println(+num1);		//결과적으로 불필요한 +연산
		System.out.println(-num1);		//부호를 바꿔서 얻은 결과를 출력
		System.out.println(num1);		//num1의 값은 변하지 않음
		
		short num2 = 7;
		short num3 = (short)(+num2);	//형 변환하지 않으면 오류발생		
		short num4 = (short)(-num2);	//형 변환하지 않으면 오류발생
		System.out.println(num3);
		System.out.println(num4);
		
		// ****연산이 들어가는 순간 디폴트인 integer로 변환된다****
	}

}
