package Supriya.Strings;
import java.util.Scanner;
public class PalinOrNot {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your string");
	String s=sc.next();
	System.out.println(Palindrome(s));
	}
	private static boolean Palindrome(String s) {	
		int i=0;
		int j=s.length()-1;
		while(i<=j)
		{
			if(s.charAt(i)!=s.charAt(j))
			{
				return false;
			}
			i++;
			j--;
		}
		// TODO Auto-generated method stub
		return true;	
	}
}
