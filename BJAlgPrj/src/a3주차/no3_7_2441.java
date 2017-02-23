package a3주차;

import java.util.Scanner;

public class no3_7_2441 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int dan = scan.nextInt();
		for(int i=0;i<dan;i++){
			for(int j=0;j<i;j++){
				System.out.print(" ");
			}
			for(int k=0;k<dan-i;k++){
				System.out.print("*");
			}
			System.out.println();
		}
		scan.close();
	}

}
