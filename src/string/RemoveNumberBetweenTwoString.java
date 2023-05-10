package string;

public class RemoveNumberBetweenTwoString {
	
	
	public static void main(String[] args) {
		
		String str = "salman8765automation";
		
		String str1 = str.replaceAll("\\d", "");
		
		System.out.println(str1);
		
		
		
		//2. in this we are using character.isdigit
		
		String rev="";
		
		for(int i =0; i<str.length();i++) {
			
			if(!Character.isDigit(str.charAt(i))) {
				
				rev=rev+str.charAt(i);
			}
		}
		
		System.out.println(rev);
		
	}

}
