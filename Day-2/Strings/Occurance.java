package Supriya.Strings;
import java.util.Scanner;
public class OccuranceOfChar {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your string");
		String scn=s.nextLine();
		System.out.println("Enter your char");
		char ch=s.next().charAt(0);
		char ch1=(char) (ch+32);
		String s1=scn.toLowerCase();
		int count=0;		
		for(int i=0;i<scn.length();i++)
		{
			if(ch1==scn.charAt(i))
			{
				count++;
			}
		}
		System.out.println("The entered char is ' " + ch1 + " ' the occuarnce of the char is "+ count);
	}
}
