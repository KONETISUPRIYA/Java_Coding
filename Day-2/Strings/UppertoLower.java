package Supriya.Strings;

import java.util.Scanner;

public class UpperToLower {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter your String");
		String s=scn.nextLine();
		char ch[]=s.toCharArray();
			for(int i=0;i<ch.length;i++)
			{
				char c=ch[i];
				if(c>='a' && c<='z')
				{
					ch[i]=(char)(c-32);
				}
				else if(c>='A' && c<='Z')
				{
					ch[i]=(char)(c+32);
				}	
			}
		System.out.println(ch);	
	}
}
