package Supriya.Strings;
import java.util.Scanner;
public class SubString1 {
	public static void main(String[] args) {	
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your string");
		String scn=s.next();
		for(int i=0;i<scn.length();i++)
		{
			for(int j=i;j<scn.length();j++)
			{
				String temp="";	
				for(int k=i;k<=j;k++)
				{
					temp+=scn.charAt(k);
				System.out.println(temp);
			    }	
		}
	}
}
}
