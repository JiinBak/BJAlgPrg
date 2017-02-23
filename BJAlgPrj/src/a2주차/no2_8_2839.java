package a2주차;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class no2_8_2839 {
	public static void main(String[] args) {
		ArrayList<Integer> sums = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		int sugar = scan.nextInt();
		
		for(int i=0;i<sugar/5+1;i++){
			for(int j=0;j<sugar/3+1;j++){
				if(5*i+3*j==sugar){
					//i->5kg봉지 갯수, j->3kg 봉지갯수
					//System.out.println(i+"(5kg)+"+j+"(3kg) ="+(i+j)); //봉지조합확인
					sums.add(i+j); //총 봉지갯수 arraylist에 넣기					
				}
			}
		}
		
		//System.out.println(sums); //arraylist확인

		Collections.sort(sums); //가장 작은 수의 봉지갯수를 구하기 위해 arraylist정렬
		//System.out.println(sums); //정렬되었는지 확인
		
		if(sums.size()==0){
			System.out.println(-1);
			scan.close();
		}else{
			System.out.println(sums.get(0));
			scan.close();
		}
		
	}
}
