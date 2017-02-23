package a1주차;
import java.util.Scanner;

public class no1_11719 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = "";
		int count = 0;
		while(scan.hasNextLine()){
			String a = scan.nextLine();
			str += a+"\n";
			count++;
			if(count==100){
				System.out.println("더이상 입력할 수 없습니다.");
				break;
			}else if (a.equals("")) {
				break;
			}
		}
		System.out.println(str);
		scan.close();
	}
}
