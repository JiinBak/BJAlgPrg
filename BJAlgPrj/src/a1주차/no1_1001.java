package a1주차;
import java.util.Scanner;

public class no1_1001 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (a>0 & a<10& b>0 & b<10){
			System.out.println(a-b);
			sc.close();
		}
	}
}
