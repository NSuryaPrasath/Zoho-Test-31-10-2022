package newclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SecondProgram 
{
	public static void main(String[] args) 
	{
		int arr[]= {-1,-1,2,1,-1,2};
		List<List<Integer>> result=new ArrayList<>();
		List<Integer> res;
		for(int i=0;i<arr.length-2;i++)
		{
			for(int j=i+1;j<arr.length-1;j++)
			{
				for(int k=j+1;k<arr.length;k++)
				{
					if(arr[i]+arr[j]+arr[k]==0)
					{
						res=new ArrayList<Integer>();
						res.add(arr[i]);
						res.add(arr[j]);
						res.add(arr[k]);
						Collections.sort(res);
						if(!result.contains(res))
						{
							result.add(res);
						}
					}
				}
			}
		}
		System.out.println(result);
	}

}
//input num=[-1,0,1,2,-1,-4]
//output num=[[-1,-1,2][-1,0,1]

//for(int i=arr.length-1;i>=0;i--)
//{
//	su=0;
//	
//	for(int j=i-1;j>0;j--)
//	{
//		su=0;
//		su+=arr[i];
//		su+=arr[j]+arr[j-1];
//		System.out.println(su);
//		if(su==0)
//		{
//			res.add(arr[i]);
//			res.add(arr[j]);
//			res.add(arr[j-1]);
//		}
//	}
//	result.add((ArrayList<Integer>) res);
//	o--;
//}
//System.out.println(result);
