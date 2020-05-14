package Java;

public class CountCharacter2 {

	public static void main(String[] args) {

		String input= "1. It is Work from Home  not Work for Home";
	
	int countofnum=0;
	int countuppercase=0;
	int countlowercase=0;
	int countofspace=0;
			
			for(int i=0; i<input.length();i++) {
				
				if(Character.isLowerCase(input.charAt(i))){
					countlowercase++;
			}
				else if(Character.isUpperCase(input.charAt(i))) {
					countuppercase++;
			}
				else if(Character.isDigit(input.charAt(i))) {
					countofnum++;
			}

				else if (Character.isSpace(input.charAt(i))) {
					countofspace++;
				}
				
					
				}
			System.out.println("No of Upercase:"+ countuppercase);
	
			System.out.println("No of Lowercase:" + countuppercase);
	
			System.out.println("No of Space:"+ countofspace);

			System.out.println("No of Numbers:" + countofnum);
	}

}
