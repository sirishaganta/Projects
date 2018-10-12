package day3;
public class SmallestGreater {
	public static void main(String[] args) {
		int arr1[]={6,3,9,8,10,2,1,15,7};
	
	for(int i=0;i<arr1.length;i++)
	{
		int near=-1;
		int max=15;
		for(int j=0;j<arr1.length;j++)
		{
			
			if(arr1[j]>arr1[i]&&arr1[j]-arr1[i]<max)
			{
			max=arr1[j]-arr1[i];
            near=j;			
			}
		}
		if(near==-1)
		{
			System.out.print("_ ");
		}
		else
		{
			System.out.print(arr1[near]+" ");
		}
}
}
}



