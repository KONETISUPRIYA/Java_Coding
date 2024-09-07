package com.practice;
import java.util.Scanner;
public class Strong {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your number");
		int n1=s.nextInt();
		isStrong(n1);
		System.out.println(isStrong(n1));
	}
		    static int isStrong(int N) {
	        int sum=0;
	        int M=N;
	        while(N>0){
	            int n=N%10;
	            int temp=1;
	      for(int i=1;i<=n;i++)
	      {
	          temp*=i;
	      }
	      sum+=temp;
	       N/=10;
	    }
	   if(sum==M) return 1;
	   else return 0;
	    }
}
