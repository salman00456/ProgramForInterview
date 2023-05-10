package array;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateNumber {
	
	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,3,5,6,6,9,7,9,9};
		
		// we are using this for loop for iterating the value
		for(int i=0; i<a.length;i++) {
			for(int j= i+1; j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println("the duplicate number is "+ a[j]);
				}
			}
		}
		
		// there is second method also by using HashSet
		// it is the easiest way to do this program.
		
		
		Set<Integer> store = new HashSet<Integer>();
		for(int i=0; i<a.length;i++) {
			if(store.add(a[i])==false) {
				System.out.println("Duplicate number is "+a[i]);
			}
		}
	}

}
