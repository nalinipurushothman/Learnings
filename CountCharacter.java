package Java;

public class CountCharacter {

	public static void main(String[] args) {

		String input= "1. It is Work from Home  not Work for Home";
	
	int countofnum=0;
	int countuppercase=0;
	int countlowercase=0;
	int countofspace=0;
			
			for(int i=0; i<input.length();i++) {
				char ch=input.charAt(i);
				if(ch>='a' && ch<='z') {
					countlowercase++;
			}
				else if(ch>='A' && ch<='Z') {
					countuppercase++;
			}
				else if(ch>='0' && ch<='9') {
					countofnum++;
			}

				else {
					countofspace++;
				}
				
					
				}
			System.out.println("No of Upercase:"+ countuppercase);
	
			System.out.println("No of Lowercase:" + countuppercase);
	
			System.out.println("No of Space:"+ countofspace);

			System.out.println("No of Numbers:" + countofnum);
	}

}
