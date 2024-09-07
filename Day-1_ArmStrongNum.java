package com.practice;

import java.util.Scanner;
public class ArmStrong
{
	public static void main(String[] args) {
		System.out.println("hello");
		Scanner s=new Scanner(System.in);
		System.out.println("Enter");
		int n1=s.nextInt();
		armstrongNumber(n1);
		
		System.out.println(armstrongNumber(n1));
	}

 static String armstrongNumber(int n) {
   
     int m=n;
     int count=0;
     int sum=0;
     while(n>0)
     {
         count++;
         n/=10;
     }
     n=m;
     while(n>0)
     {
             int n1=n%10;
            sum+=(int)Math.pow(n1,count);
            n/=10;
             
     }
     if(sum==m)
     return "true";
     else
     return "false";
 }
}
