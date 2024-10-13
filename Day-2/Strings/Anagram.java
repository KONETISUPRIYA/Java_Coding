package Supriya.Strings;
import java.util.Scanner;
public class Anagram {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter your String");
		String s=scn.next();
		System.out.println("Enter your Second String");
		String s1=scn.next();
		System.out.println(isAnanagram(s,s1));
	}
	private static boolean isAnanagram(String s, String s1) {
		s=s.toLowerCase();
		s1=s1.toLowerCase();
		while(true)
		{
		if(s.length()!=s1.length())
		return false;
		else if(s.length()==0 && s1.length()==0)
		{
			return true;
		}
		char ch=s.charAt(0);
		s=s.replace(ch+" "," ");
		s1=s1.replace(ch+" ", " ");
		return true;
		}
	}
}
