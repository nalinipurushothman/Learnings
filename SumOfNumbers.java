package ninetydaysworkout;

public class SumOfNumbers {

	public static void main(String[] args) {
		String input="asdf1qwer9as8d7";
		int len=input.length();
		int sum=0;
		//approach 1- using character class
		for(int i=0;i<len;i++)
		{
			if(Character.isDigit(input.charAt(i)))
			{
				String tmp=input.substring(i,i+1);
				sum=sum+Integer.parseInt(tmp);
			}
		}
		System.out.println("Sum of digits:"+""+sum);
		//approach 2 using regex
		String regex=input.replaceAll("[^0-9]","");
		//System.out.println(regex);
		int sum2=0;
		for(int i=0;i<regex.length();i++)
		{
			 sum2 = sum2 + Integer.parseInt(regex.charAt(i) + "");
		}
		System.out.println("Sum of digits using regex:"+" "+sum2);
	}

}
