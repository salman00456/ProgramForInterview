package string;

import java.util.HashMap;
import java.util.Map;

public class MaxWordCount {
	
	public static void main(String[] args) {
		
		String str = "java is the best language java is java";
		
		String arrstr[] = str.split(" ");
		
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		
		for(String sr:arrstr) {
			
			if(hm.containsKey(sr)) {
				hm.put(sr, hm.get(sr)+1);
			}
			
			else {
				hm.put(sr, 1);
			}
		}
		 
		 System.out.println(hm);
		 
		 String maxWord="";
		 int maxCount= 0;
		 
		 for(Map.Entry<String, Integer> me:hm.entrySet()) {
			 if(maxCount<me.getValue()) {
				 maxCount=me.getValue();
				 maxWord=me.getKey();
			 }
		 }
		
		System.out.println("The maximum occourence of word is "+maxWord+" : "+maxCount);
	}

}
