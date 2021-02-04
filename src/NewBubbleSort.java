// Bubble sort in descending Order


import java.util.Scanner;
public class NewBubbleSort {

	public static void main(String[] args) {
		int n, k, l;
		int flag;
	    Scanner x = new Scanner(System.in);
	    System.out.println("Size of the array:");
	    n = x.nextInt();
	    int elements[] = new int[n];
	    System.out.println("Enter "+ n +" numbers: ");
	    k = 0;
	    while(k<n)
	    {
	    	elements[k] = x.nextInt();
	    	k++;
	    }
	    for (k = 0; k < ( n - 1 ); k++)
	    {
	      for (l = 0; l < n - k - 1; l++) 
	      {
	        if (elements[l] < elements[l+1]) 
	        {
	          flag = elements[l];
	          elements[l] = elements[l+1];
	          elements[l+1] = flag;
	        }
	      }
	    }
	    System.out.println("Sorted in descending order using bubble sort:");
	    k = 0;
	    while(k<n)
	    {
	    	System.out.println(elements[k]);
	    	k++;
	    }
	}
}
