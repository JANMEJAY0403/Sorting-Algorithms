import java.util.Random;
import java.util.concurrent.TimeUnit;
class insertion{
void sort(int arr[]){
    int n=arr.length;
for(int i=1;i<n;i++)
{
int key=arr[i];
int j=i-1;
while(j>=0&&arr[j]>key)
{arr[j+1]=arr[j];
j=j-1;

}
arr[j+1]=key;

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
insertion ob =new insertion();
long a=System.nanoTime();
ob.sort(arr);
long b=System.nanoTime();
printarray(arr);
System.out.println(a);
System.out.println(b);
}
}