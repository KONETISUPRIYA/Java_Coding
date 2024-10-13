package Supriya.Strings;
import java.util.Scanner;
public class LongestWord {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter your string");
		String s=scn.nextLine();
		int i=0;
		int Longword=0;
		String res="";
		while(i<s.length())
		{		
			String temp="";
			int count=0;
			while(i<s.length()&& s.charAt(i)!=' ')
			{
				 temp+=s.charAt(i);
				count++;
				i++;
			}
			if(Longword<count)
			{
				Longword=count;
				res=temp;	
			}
			if(i<s.length())
			{
				i++;
			}		
		}
		System.out.println(res);
	}
}
