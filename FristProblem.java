package newclass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FristProblem 
{
	public static void main(String args[])
	{
		int arr[]= {1,2,3,4};
		List<Integer> result=new ArrayList<Integer>();
		int sum;
		for(int i=0;i<arr.length;i++)
		{
			sum=1;
			for(int j=0;j<arr.length;j++)
			{
				if(i!=j)
				{
					sum*=arr[j];
				}
			}
			result.add(sum);
		}
		System.out.println(result);
	}
}

