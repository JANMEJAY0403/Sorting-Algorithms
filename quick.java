class quick 
{ 
   
    int partition(int arr[], int low, int high) 
    { 
     int   pi=arr[high];
	   int i=low-1;
       for(int j=low;j<high;j++)
	   { 
	    if(arr[j]<=pi)
		{ 
		  i++;
		  int temp = arr[i];
		  arr[i]=arr[j];
		  arr[j]=temp;
		}
	   }
	   int swap=arr[i+1];
	    arr[i+1] =arr[high];
	    arr[high]=swap;
	   return i+1;
    } 
  
  
    void sort(int arr[], int low, int high) 
    { 
        if (low < high) 
        { 
         
            int pi = (int)  partition(arr,low,high);
  
          
            sort(arr, low, pi-1); 
            sort(arr , pi+1, high); 
  
       
        } 
    } 
  
  
    static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 
  
   
    public static void main(String args[]) 
    { 
        int[] arr=new int[1000];
	 for (int i=0;i<1000;i++){
		 int z=(int)(Math.random()*(2000-1)+1);
	     arr[i]=z;
        }
  
        System.out.println("Given Array"); 
        printArray(arr); 
		 long a=System.nanoTime();
  
        quick ob = new quick(); 
        ob.sort(arr, 0, arr.length-1); 
		 long b=System.nanoTime();
        System.out.println("\nSorted array"); 
        printArray(arr); 
		System.out.println(a);
	 System.out.println(b);
    } 
} 