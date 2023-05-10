package array;

import java.util.HashSet;

public class RemoveDuplicateNumberInArray {
	
	public static void main(String[] args) {
		
		int arrNum []= {1,2,7,8,4,4,5,5,6};
		
		HashSet<Integer> hm = new HashSet<Integer>();
		
		for(int i =0; i<arrNum.length;i++) {
			hm.add(arrNum[i]);
		}
		
		for(Integer num:hm) {
			System.out.print(num);
		}
	}

}
