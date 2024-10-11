package Supriya.Strings;
import java.util.Scanner;
public class CountingVowelsAndConsonants {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your String");
		String s=sc.nextLine();
		int i=0;
		int count=0;
		int count1=0;
		String scn=s.toLowerCase();
		while(i<=scn.length()-1)
		{
		while(i<=scn.length()-1 && i!=' ')
		{
			if(scn.charAt(i)=='a'||scn.charAt(i)=='e'||scn.charAt(i)=='i'||scn.charAt(i)=='o'||scn.charAt(i)=='u')
			{
				count++;
			}
			else if(scn.charAt(i)>='a'&& scn.charAt(i)<='z')
			{
				count1++;
			}
			i++;
		}
		if(i<scn.length()-1)
		{
			System.out.println("----------");
			i++;
		}
	}
		System.out.println(count);
		System.out.println(count1);	
	}
}
