package Day5;

import java.util.Scanner;

public class Pattern {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=scn.next();
		int n=s.length();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<i;j++)
			{
					System.out.print(s.charAt(j)+" ");	
			}
			System.out.println();
		}
		
		for(int i=n-1;i>=0;i--)
		{
			for(int j=0;j<=i;j++)
			{
			   System.out.print(s.charAt(j)+" ");	
			}
			System.out.println();
		}
	}

}
