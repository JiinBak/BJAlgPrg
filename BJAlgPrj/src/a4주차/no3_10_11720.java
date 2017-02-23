package a4주차;

import java.util.Scanner;

public class no3_10_11720 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum1 = 0;
		//int sum2 = 0;
		int num = scan.nextInt();
		scan.nextLine(); //줄바꿈 인식 위함.
		String line = scan.nextLine();

		for(int i=0;i<num;i++){
			//charAt() :~번째 값 가져옴 (0부터 시작)
			//char형은 ASCII코드 사용. 숫자로 변환시 주의해야 함
			
			sum1 += Character.getNumericValue(line.charAt(i));
			//sum2 += (int)line.charAt(i) -48;
			//System.out.println((int)line.charAt(i)); //ascii코드인것 고려하지 않았을때 나오는 값
			//System.out.println(Character.getNumericValue(line.charAt(i))); //아스키코드인것 고려하고 변환했을 경우

		}
		System.out.println(sum1);
		//System.out.println(sum2);
		scan.close();
	}

}
