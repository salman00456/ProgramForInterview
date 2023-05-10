package string;

import java.util.HashMap;
import java.util.Map;

public class DuplicateWords {
	
	public static void main(String[] args) {
		
		String str ="Hey java is java best language is java";
		
		String words[] = str.split(" ");
		
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		
		for(String word:words) {
			
			if(hm.containsKey(word)) {
				hm.put(word, hm.get(word)+1);
			}
			else {
				hm.put(word, 1);
			}
		}
		
		System.out.println(hm);
		
		int maxCount=0;
		String maxWord="";
		
		for(Map.Entry<String,Integer> me:hm.entrySet()) {
			
			if(maxCount<me.getValue()) {
				
				maxCount=me.getValue();
				maxWord=me.getKey();
			}
			
		}
		
		System.out.println("the maximum occourence word is :"+maxWord+" "+maxCount);
	}

}
