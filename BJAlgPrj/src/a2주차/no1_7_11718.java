package a2주차;
import java.util.Scanner;

public class no1_7_11718 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = "";
		int count = 0;
		while(scan.hasNextLine()){
			String a = scan.nextLine();
			if(!a.equals("")){
				str += a+"\n"; //마지막에 줄바꿈이 들어가는 문제 발생
				count++;
			}else if(count==100){
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
