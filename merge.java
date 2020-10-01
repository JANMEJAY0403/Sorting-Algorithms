
class Mergesort{
	
	
	void merge(int arr[],int l, int m, int r)
	{
		int n1=m-l+1;
		int n2=r-m;
		int L[]=new int[n1];
		int R[]=new int[n2];
		     for (int i=0; i<n1; i++) 
            L[i] = arr[l + i]; 
        for (int j=0; j<n2; j++) 
            R[j] = arr[m + 1+ j];
		
		int i=0,j=0;
		int k=l;
		 while (i < n1 && j < n2) 
        { 
            if (L[i] <= R[j]) 
            { 
                arr[k] = L[i]; 
                i++; 
            } 
            else
            { 
                arr[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
 
        while (i < n1) 
        { 
            arr[k] = L[i]; 
            i++; 
            k++; 
        } 
  
      
        while (j < n2) 
        { 
            arr[k] = R[j]; 
            j++; 
            k++; 
        } 
	}
	void sort(int arr[], int l, int r){
	 if (l<r)
	 {
		 int m=(l+r)/2;
		 sort(arr,l,m);
		 sort(arr,m+1,r);
		 merge(arr,l,m,r);
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
	 for (int i=0;i<1000;i++){
		 int z=(int)(Math.random()*(2000-1)+1);
	     arr[i]=z;
        }
	 printarray(arr);
     System.out.println("sorted array");
     System.out.println(" ");
	 long a=System.nanoTime();
     Mergesort ob =new Mergesort();
     
     ob.sort(arr, 0, arr.length-1);
	 long b=System.nanoTime();
	 
	 long c=b-a;
	 printarray(arr);
	 System.out.println(" ");
	 System.out.println(a);
	 System.out.println(b);
	 System.out.println(c);
}

}