package Java;

public class Panindrome {

	public static void main(String[] args) {
		String str="malayalam";
		StringBuffer strbuffer = new StringBuffer(str);
		String rev = strbuffer.reverse().toString();
		System.out.println(str.equals(rev)? "Yes, Its a Palindrome" : "No, its not Palindrome");
		
		/*************/
		
		String reverse="";
		for (int i=str.length()-1; i>=0; i--)
		{
			reverse += str.charAt(i);
		}
		System.out.println(str.equals(reverse)? "Yes, Its a Palindromeusring For" : "No, its not Palindrome using For");

	}

}
