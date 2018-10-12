package Day5;

import java.util.Arrays;
import java.util.Scanner;

public class RemovePalindromeWords {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter String :");
		String s=scan.nextLine();
		String[] arr=s.split(" ");
		for(int i=0;i<arr.length;i++)
		{
			StringBuffer sb1=new StringBuffer(arr[i]);
			sb1.reverse();
			String s2=sb1.toString();
			String[] arr2=s2.split(" ");
		for(int j=0;j<arr2.length;j++)
		{
			if(arr[i].equals(arr2[j])){
				if(arr[i].length()==1){
					System.out.print(arr[i]+" ");
				}
				
			}
			else
			{
				System.out.print(arr[i]+" ");
			}
			}
		
		
	}

	}
}

