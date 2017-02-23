package a3주차;

import java.util.Scanner;

public class no3_6_2440 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int dan = scan.nextInt();
		for(int i=0;i<dan;i++){
			for(int j=0;j<dan-i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		scan.close();
	}

}
