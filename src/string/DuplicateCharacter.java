package string;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacter {
	
	public static void getCharCount(String str, char val){
		
		int count=0;
		for(int i=0; i<str.length();i++) {
			if(str.charAt(i)==val) {
				count++;
			}
		}
		
		System.out.println(val+" : "+count);
		
		
	}
	
	public static void main(String[] args) {
		
		String str = "java programing";
		
		char arrch[] = str.toCharArray();
		
		Map<Character,Integer> store = new HashMap<Character,Integer>();
		
		for(char ch:arrch) {
			
			//line no 19 will remove the space count in program
			if(Character.isAlphabetic(ch)) {
			
			if(store.containsKey(ch)) {
				store.put(ch, store.get(ch)+1);
			}
			else {
				store.put(ch, 1);
			}
			}
		}
		
		store.entrySet().removeIf(i-> i.getValue()==1);
		
		System.out.println(store);
		
		getCharCount(str,'g');
	}

}
