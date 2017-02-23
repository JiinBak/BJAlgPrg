package a3주차;

import java.util.Scanner;

public class no3_8_2007 {

	public static void main(String[] args) {
		int[] days={31,28,31,30,31,30,31,31,30,31,30,31};
		int sum=0;//월 무시하고 일단위로만 환산한 값 넣을 예정
		
		Scanner scan = new Scanner(System.in);
		int mon = scan.nextInt();
		int day = scan.nextInt();
		
		if(mon==1){
			sum+=day;
		}else{
			for(int i=0;i<mon-1;i++){
				sum+=days[i]; //전월까지의 날짜합
			}
			sum+=day;//해당월의 날짜
		}
		//System.out.println(sum); //확인
		
		if(sum%7==1){
			System.out.println("MON");
		}else if(sum%7==2){
			System.out.println("TUE");
		}else if(sum%7==3){
			System.out.println("WED");
		}else if(sum%7==4){
			System.out.println("THU");
		}else if(sum%7==5){
			System.out.println("FRI");
		}else if(sum%7==6){
			System.out.println("SAT");
		}else{
			System.out.println("SUN");
		}
		scan.close();

	}

}
