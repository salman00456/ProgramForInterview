package Pactice;

import java.util.HashMap;
import java.util.Map;

public class MaxWordCount {
	
	public static void main(String[] args) {
		
		String str = "java is best langugage java is java";
		
		String arrStr[] = str.split(" ");
		
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		
		for(String st:arrStr) {
			
			if(hm.containsKey(st)) {
				hm.put(st, hm.get(st)+1);
			}
			
			else {
				hm.put(st, 1);
			}
		}
		
		System.out.println(hm);
		
		int maxCount=0;
		String maxWord = "";
		
		for(Map.Entry<String, Integer> me:hm.entrySet()){
			
			if(maxCount<me.getValue()) {
				maxCount=me.getValue();
				maxWord=me.getKey();
			}
			
		}
		
		System.out.println("the maximum occourence of character is "+maxWord+" : "+maxCount);
		

	}

}
