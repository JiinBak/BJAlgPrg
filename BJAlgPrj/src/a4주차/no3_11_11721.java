package a4주차;

import java.util.Scanner;

public class no3_11_11721 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String line = scan.nextLine();
		int num = line.length()/10;
		//System.out.println(num); 
		//System.out.println(line.length()); //글자수
		
		for(int i=0;i<num+1;i++){
			if(10*i+10<line.length()){
				System.out.println(line.substring(10*i, 10*i+10));
			}else{
				System.out.println(line.substring(10*i, line.length()));
			}
		}
		
		//다른 방법
		for(int i=0;i<line.length();i++){
			if(i%10==0&& i!=0){
				System.out.println();
			}
			System.out.print(line.charAt(i));
			
		}
		
		scan.close();
	}

}
