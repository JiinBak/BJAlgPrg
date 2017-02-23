package a2주차;

import java.util.Scanner;

public class no3_2_2742 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		if(n<= 100000){
			System.out.println("------");
			for(int i=0;i<n;i++){
				System.out.println(n-i);
			}
			System.out.println("방법2----");
			//방법2
			for(int i=n;i>0;i--){
				System.out.println(i);
			}
			scan.close();
		}else{
			System.out.println("100,000보다 작거나 같은 자연수를 입력하세요");
		}
	}
}