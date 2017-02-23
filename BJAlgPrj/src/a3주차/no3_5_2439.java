package a3주차;

import java.util.Scanner;

public class no3_5_2439 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int dan = scan.nextInt();
		for(int i=0;i<dan;i++){
			for(int j=0;j<dan-i-1;j++){
				System.out.print(" ");
			}
			for(int k=0;k<i+1;k++){
				System.out.print("*");
			}
			System.out.println();
		}
		scan.close();
	}

}
