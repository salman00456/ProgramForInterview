package array;

public class MissingNumber {
	
	public static void main(String[] args) {
		
		//find the missing number in given array
		int a[] = {1,2,3,4,5,6,7,9,10};
		
		/*logic for finding
		 * 
		 * 1. First add the given number in array.// 12
		 * 2. Now add the number as per the correct sequence, consider the missing one.//15
		 * 3. Now substract the second number from first one. you will get the missing one //3
		
		*/
		
		int sum = 0;
		for(int i= 0; i<a.length; i++) {
			
			sum = sum+a[i];
		}
		System.out.println(sum);
		
		int sum1 =0;
		for(int j=1;j<=10;j++) {
			sum1 = sum1+ j;
			
		}
		
		System.out.println("the missing number is "+ (sum1-sum));
	}

}
