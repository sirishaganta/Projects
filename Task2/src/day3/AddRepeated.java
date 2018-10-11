package day3;

public class AddRepeated {
	public static void main(String[] args) {
		int arr[]={2,2,4,0,8,2};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					arr[i]=arr[i]+arr[j];
					arr[j]=0;
				}
			
			if(arr[i]==0)
			{
				int temp=0;
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			}

			System.out.print(arr[i]+" ");
		}
		
	}
}


