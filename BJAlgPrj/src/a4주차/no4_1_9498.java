package a4주차;

import java.util.Scanner;

public class no4_1_9498 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int jumsu = scan.nextInt();
		if(jumsu>=90){
			System.out.println("A");
		}else if(jumsu>=80){
			System.out.println("B");
		}else if(jumsu>=70){
			System.out.println("C");
		}else if(jumsu>=60){
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		scan.close();
	}

}
