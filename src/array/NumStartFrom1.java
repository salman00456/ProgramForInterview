package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumStartFrom1 {
	
	
	public static void main(String[] args) {
		
		
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4, 20, 15, 3, 5));

		for (int i = 0; i < list.size(); i++) {
		    int num = list.get(i);
		    if (num >= 10 && num <= 19) {
		        String str = Integer.toString(num);
		        if (str.charAt(0) == '1') {
		            System.out.println("The two-digit number " + num );
		            break;
		        }
		    }
		}
		






		
		}

		}
		
		
		

		
	


