package newclass;

import java.util.Arrays;

public class LinkedList 
{
	Node head;
	class Node
	{
		int data;
		Node next;
		Node(){}
		Node(int data)
		{
			this.data=data;
			next=null;
		}
	}
	LinkedList()
	{
		head=null;
	}
	public Node insertNode(int val)
	{
		Node n=new Node(val);
		if(head==null)
		{
			head=n;
		}
		else
		{
			n.next=head;
			head=n;
		}
		return n;
	}
	public void greater(Node head)
	{
		int n=5,i=0;
		int[] arr=new int[n];
		while (i != n && head.next != null) 
		{
			int max = head.data;
			Node temp = head.next;
			if (temp.data > max) 
			{
				max = temp.data;
			}
			temp = temp.next;
			if (max == head.data)
				max = 0;
			arr[i++] = max;
			head = head.next;
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String args[])
	{
		Node head=null;
		FifthProgram fp=new FifthProgram();
		int[] arr= {5,3,4,7,2};
		for(int i=0;i<arr.length;i++)
		{
			head=fp.insertNode(arr[i]);
		}
		fp.greater(head);
	}
}
