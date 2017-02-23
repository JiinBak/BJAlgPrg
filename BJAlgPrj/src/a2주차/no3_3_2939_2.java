package a2주차;

import java.util.Scanner;

public class no3_3_2939_2 {
	public static void main(String[] args) {
		System.out.println("몇단까지 출력하시겠습니까?");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		for(int i=1;i<10;i++){
			for(int dan=1;dan<num+1;dan++){
				System.out.print(dan+" * "+i+" = "+ dan*i);
				if(dan*i>=10){
					System.out.print(" | ");
				}else{
					System.out.print("  | ");
				}
			}
			System.out.println("\n");
			scan.close();
		}
	}
}
