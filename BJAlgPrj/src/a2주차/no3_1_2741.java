package a2주차;

import java.util.Scanner;

public class no3_1_2741 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		if(n<= 100000){
			for(int i=0;i<n;i++){
				System.out.println(i+1);
			}
			scan.close();
		}else{
			System.out.println("100,000보다 작거나 같은 자연수를 입력하세요");
		}
	}
}
