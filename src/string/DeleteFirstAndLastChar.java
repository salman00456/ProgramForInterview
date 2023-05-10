package string;

public class DeleteFirstAndLastChar {
	
	public static void main(String[] args) {
		
		String str = "salman";
		
		String newStr = str.substring(1, str.length()-1);
		
		System.out.println(newStr);
		
		// you have to reverse the remaining string
		
		String rev="";
		
		
		for(int i=newStr.length()-1;i>=0;i--) {
		
			rev=rev+newStr.charAt(i);
		}
		
		System.out.println(rev);
		
		
		
		
		
		
		
	}

}
