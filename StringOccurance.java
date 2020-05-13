package Java;

import java.util.*;


public class StringOccurance {

	public static void main(String[] args) {

String input ="You have no choices other than following me";
char[] charArray = input.toCharArray();
int count=0;

String replaceAllstr = input.replaceAll("[^o]","");

System.out.println("Using Replace: No of O:" + replaceAllstr.length());

for (int i=0; i<input.length(); i++) 
{
	if (charArray[i]=='o')
	{
		count++;
	}
}
System.out.println("Occurance of O:"+ count);
	}
}


