package a1주차;
import java.util.Scanner;

public class no1_1000 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		while(sc.hasNextInt()==true){
			int num = sc.nextInt();
			if(num>0 & num<10){
				sum += num;	
			}else{
				System.out.println("0과 10사이의 수를 입력하세요");
			}
		}
		
		System.out.println(sum);
		sc.close();
	}
}

