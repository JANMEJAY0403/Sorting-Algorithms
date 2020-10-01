import java.io.*;
import java.util.*;
import java.util.Random;
import java.util.concurrent.TimeUnit;

class selection
{
void sort(int[] arr){
int n=arr.length;

for(int i=0;i<n-1;i++)
{int m=i;
for(int j=i+1;j<n;j++)
{ if(arr[j]<arr[m])
{m=j;
}
int t=arr[i];
 arr[i]=arr[m];
 arr[m]=t;
}
}
}



static void printarray(int arr[]){
	int n=arr.length;
for(int i=0;i<n;i++)
{System.out.print(arr[i]+"  ");
}
	}
public static void main(String args[])
{
int[] arr=new int[1000];
for (int i=0;i<1000;i++)
{int z=(int)(Math.random()*(2000-1)+1);
arr[i]=z;
}
printarray(arr);
System.out.println(" ");
System.out.println(" ");
selection ob =new selection();
long a=System.nanoTime();
ob.sort(arr);
long b=System.nanoTime();
System.out.println(" sorted array");
printarray(arr);
System.out.println(a);
System.out.println(b);
System.out.println(b-a);
}
}