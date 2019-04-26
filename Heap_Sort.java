import java.io.*;
import java.util.*;
import java.util.Random;
import java.util.concurrent.TimeUnit;

class Heap_Sort
	{
		public void sort(int arr[])
		{
		 int n=arr.length;
		 for(int i=n/2-1;i>=0;i--)
		 heapify(arr,n,i);
		 for(int i=n-1;i>=0;i--)
			{
				int temp=arr[0];
				arr[0]=arr[i];
				arr[i]=temp;
				heapify(arr,i,0);
			}
		}
		void heapify(int arr[],int n, int i)
		{
			int largest=i;
			int l=2*i+1;
			int r=2*i+2;
			if(l<n && arr[l]>arr[largest])
				largest=l;
			if(r<n && arr[r]>arr[largest])
				largest=r;
			if(largest !=i)
			{
				int swap=arr[i];
				arr[i]=arr[largest];
				arr[largest]=swap;
				heapify(arr,n, largest);
			}
		}
		static void printarray(int arr[])
		{
			int n=arr.length;
			for(int i=0;i<n;i++)
			System.out.print(arr[i]+"  ");
		
		}
	
	public static void main(String args[])
	{
	
		int[] arr=new int[1000];
		for (int i=0;i<1000;i++)
		{
			int k=(int)(Math.random()*(2000-1)+1);
			arr[i]=k;
        }
		System.out.println("UNSORTED ELEMENTS ");
		printarray(arr);
		System.out.println(" ");
		System.out.println(" ");
		Heap_Sort ob =new Heap_Sort();
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