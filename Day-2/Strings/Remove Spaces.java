package Supriya.Strings;
import java.util.Scanner;
public class RemoveSpaces {
	public static void main(String[] args) {	
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your String");
		String scn=s.nextLine();
		int i=0;
		String temp="";
		while(i<scn.length())
		{
			if(scn.charAt(i)!=' ')
			{
				temp+=scn.charAt(i);
			}
			i++;
		}
		System.out.println(temp);
	}
}
