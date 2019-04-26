import java.io.*;
import java.util.*;
import java.util.Random;
import java.util.concurrent.TimeUnit;

class Bubble_Sort
{
	void sort(int[] arr)
	{
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
		 for(int j=0;j<n-i-1;j++)
			{ 
			if(arr[j]>arr[j+1])
				{
				int t=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=t;
				}
			}
		}
	}

	static void printarray(int arr[])
	{
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+"  ");
		}
	}
	public static void main(String args[])
	{
		int[] arr=new int[1000];
		for (int i=0;i<1000;i++)
		{
			int z=(int)(Math.random()*(2000-1)+1);
			arr[i]=z;
		}
		System.out.println("UNSORTED ELEMENTS ");
		printarray(arr);
		System.out.println(" ");
		System.out.println(" ");
		Bubble_Sort ob =new Bubble_Sort();
		long a=System.nanoTime();
		ob.sort(arr);
		long b=System.nanoTime();
		long c=b-a;
		System.out.println("SORTED ELEMENTS ");
		printarray(arr);
		System.out.println(" ");
		System.out.println("time at starting of sorting "+a);
		System.out.println("time after completion of sorting"+b);
		System.out.println("time taken in sorting "+c+" nano seconds ");
	}
}