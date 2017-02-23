package a3주차;

import java.util.Scanner;

public class no3_9_8393 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int sum = 0;
		for(int i=0;i<n+1;i++){
			sum += i;
		}
		System.out.println(sum);
		scan.close();
	}
}
