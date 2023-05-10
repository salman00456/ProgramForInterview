package string;

import java.util.HashMap;
import java.util.Map;

public class MaxCharacterCount1 {
	
	public static void main(String[] args) {
		
		String str = "salmanautomation";
		
		char ch[] = str.toCharArray();
		
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		
		for(char c:ch) {
			
			if(hm.containsKey(c)) {
				
				hm.put(c, hm.get(c)+1);
			}
			
			else {
				hm.put(c, 1);
			}
		}
		
		System.out.println(hm);
		
		char maxChar = ' ';
		int maxCount=0;
		
		for(Map.Entry<Character,Integer> e:hm.entrySet()) {
			
			if(maxCount<e.getValue()) {
				maxCount = e.getValue();
				maxChar = e.getKey();
			}
		}
		
		System.out.println("the maximum occourence character is :"+maxChar+" "+maxCount);
		
	}

}
