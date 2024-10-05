package Supriya.Strings;
import java.util.Scanner;
public class Reverse 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your String");
		String s=sc.nextLine();	
		int i=0;
		int j=0;
		String s1="";
		int len=s.length();
		while(i<len)
		{
			while(i<len && s.charAt(i)!=0)
				i++;
			int k=i-1;
			String temp="";
			while(k>=j)
			{
				temp+=s.charAt(k);
				k--;
			}
			s1+=temp;
			if(i<len)
			{
				s1+=" ";
				i++;
				j=i;
			}
			System.out.println(s1);				
		}	
	}	
}
