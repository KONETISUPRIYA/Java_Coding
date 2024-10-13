package Supriya.Strings;
import java.util.Scanner;
public class RemoveDuplicate {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your STring");
		String scn=s.nextLine();
		//String scn="Java is a progarmming";
		String s1="";
		char[] ch=scn.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='\u0000' || ch[i]==' ')
				continue;
			
			for(int j=i+1;j<ch.length;j++)
			{
				
				
				if(ch[i]==ch[j])
				{
					ch[j]='\u0000';	
				}					
			}
			if(ch[i]!='\u0000' || ch[i]==' ')
			{
				s1+=ch[i];
			}	
		}
		System.out.println(s1);
	}
}
