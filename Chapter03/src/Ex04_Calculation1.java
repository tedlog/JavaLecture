
public class Ex04_Calculation1
{

	public static void main(String[] args)
	{
		byte num11 = 1;			//메모리(저장)의 문제				
		byte num12 = 2;			//메모리(저장)의 문제
		byte result = num11 + num12; //CPU의 문제, 계산을 위해 각각을 integer로 바꿔 계산했지만, byte와 byte의 연산 결과는 byte여야하기때문에 integer가 byte에 들어갈 수 없음
		
		short num21 = 1;
		short num22 = 2;
		short result21 = num21 + num22; //CPU의 문제, 계산을 위해 각각을 integer로 바꿔 계산했지만, short와 short의 연산 결과는 short여야하기때문에 integer가 byte에 들어갈 수 없음
		
		short result22 = (short)(num21 + num22); //short로 강제 형변환(개발자가 보증해주는 격)
	}

}
