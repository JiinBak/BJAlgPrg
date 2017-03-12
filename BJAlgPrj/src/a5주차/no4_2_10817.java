package a5주차;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class no4_2_10817 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> numlist = new ArrayList<>();
		
		for(int i=0;i<3;i++){
			numlist.add(sc.nextInt());
		}
		//Collections.sort(numlist);//오름차순 정렬
		Collections.sort(numlist, new desc());
		System.out.println(numlist.get(1));
		sc.close();
	}
 
}
//return하는 값따라서 뭐가 달라지는지 모르겠음.
class desc implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        if(o1>o2){
        	return -1;
        }else if(o1==o2){
        	return 0;
        }else{
        	return 1;
        }
    	//return o2.compareTo(o1); 
    }
}

class asc implements Comparator<Integer> {	 
    @Override
    public int compare(Integer o1, Integer o2) {
        if(o1<o2){
        	return -1;
        }else if(o1==o2){
        	return 0;
        }else{
        	return 1;
        }
    	//return o1.compareTo(o2); 
    }
}


