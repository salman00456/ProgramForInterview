package array;

public class SmallestAndLargestNumber {
	
	public static void main(String[] args) {
		
		int numbers[] = {-10,20,30,-40,50,-60,768};
		
		int largest = numbers[0];
		int smallest = numbers[0];
		
		for(int i=1;i<numbers.length;i++) {
			if(numbers[i]>largest) {
				largest=numbers[i];
			}
			else if(numbers[i]<smallest) {
				smallest=numbers[i];
			}
		}
		
		System.out.println("The largest numbers is:: "+largest);
		System.out.println("The largest numbers is:: "+smallest);
		
	}

}
