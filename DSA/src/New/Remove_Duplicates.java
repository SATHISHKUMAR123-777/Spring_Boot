package New;

public class Remove_Duplicates {

		
		
		static int removeDuplicates(int arr[], int n)
	    {
	      
	        if (n == 0 || n == 1)
	            return n;
	 
	        int[] temp = new int[n];
	 
	         
	        int j = 0;
	        for (int i = 0; i < n - 1; i++)
	             
	         
	            if (arr[i] != arr[i + 1])
	                temp[j++] = arr[i];
	 
	 
	        temp[j++] = arr[n - 1];
	  
	        for (int i = 0; i < j; i++) {
	            arr[i] = temp[i];
	            System.out.println(arr[i]);
	        }
	     
	 
	        return j;
	    }
		
	
	
	public static void main(String[] args) {
		int Input[]= {1, 1, 2, 2, 3, 4, 4, 5};
		int n=Input.length;
	
		System.out.println("The Length Of the array is :"+	removeDuplicates(Input,n));
		
	}

}
