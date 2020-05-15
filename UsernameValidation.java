package Java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsernameValidation {

	public static void main(String[] args) {
		
		String input= "Testleaf$123" ;
//		Note:  1. It should contain minimum 8 characters.
//		2. It allows alpha numeric characters and spl characters like . _ @ $
		String pat="[a-zA-Z\\d._@$]{8,}";
		Pattern compile = Pattern.compile(pat);
		Matcher matcher = compile.matcher(input);
		boolean matches = matcher.matches();
		System.out.println("pattern Status:"+ matches); 
		
		
	}

}
