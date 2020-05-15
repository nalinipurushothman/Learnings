package Java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailAddressValidation {

	public static void main(String[] args) {
		String input = "mailtonln2.nalini@gmail.com" ;
		String pat = "[a-zA-Z.\\d]+@[a-zA-Z]+.[a-zA-Z]{2,3}";
		Pattern compile = Pattern.compile(pat);
		Matcher matcher = compile.matcher(input);
		boolean matches = matcher.matches();
		System.out.println("Pattern matches:" + matches);
		
		}

}
