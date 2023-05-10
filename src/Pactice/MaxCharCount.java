package Pactice;

import java.util.HashMap;
import java.util.Map;

public class MaxCharCount {
	
	public static void main(String[] args) {
		
		String str = "salmanautomation";
		
		char ch [] =str.toCharArray();
		
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
		
		char maxChar=' ';
		int maxCount=0;
		
		for(Map.Entry<Character,Integer> me:hm.entrySet()) {
			
			if(maxCount<me.getValue()) {
			maxCount=me.getValue();
			maxChar=me.getKey();
			
			}
		}
		
		System.out.println("the maximum occourence of character is "+maxChar+" : "+maxCount);
	}

}
