package string;

import java.util.HashMap;
import java.util.Map;

public class MaxCharacterCount {
	
	public static void main(String[] args) {
		
		String str = "my name is salman";
		
		str=str.replaceAll("\\s", "");
		char c[] = str.toCharArray();
		
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		
		for(char ch:c) {
			if(hm.containsKey(ch)) {
				hm.put(ch, hm.get(ch)+1);
			}
			else {
				hm.put(ch, 1);
			}
		}
		
		System.out.println(hm);
		int maxCount =0;
		char maxChar = ' ';
		
		for(Map.Entry<Character,Integer> me:hm.entrySet()) {
			if(maxCount<me.getValue()) {
				
				maxCount = me.getValue();
				maxChar = me.getKey();
			}
		}
		
		System.out.println("the maximum occourence character is :"+maxChar+" "+maxCount);
		
	}

}
