package a5주차;

import java.util.Scanner;

public class no4_3_10871 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int[] nlist = new int[n];
		for(int i=0;i<n;i++){
			int num = sc.nextInt();
			nlist[i] = num;
		}
		for(int i=0;i<n;i++){
			if(nlist[i]<x){
				System.out.print(nlist[i]+" ");
			}
		}
		
		sc.close();

	}

}
