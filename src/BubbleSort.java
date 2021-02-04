// Bubble sort in ascending Order


import java.util.Scanner;
public class BubbleSort 
{
	public static void main(String[] args) 
	{
		 int No, k, l;
		 int flag;
		    Scanner x = new Scanner(System.in);
		    System.out.println("Size of the array:");
		    No = x.nextInt();
		    int elements[] = new int[No];
		    System.out.println("Enter "+ No +" numbers: ");
		    k=0;
		    while(k<No)
		    {
		    	elements[k] = x.nextInt();
		    	k++;
		    }
		    for (k = 0; k < ( No - 1 ); k++)
		    {
		      for (l = 0; l < No - k - 1; l++) 
		      {
		        if (elements[l] > elements[l+1]) 
		        {
		           flag = elements[l];
		           elements[l] = elements[l+1];
		           elements[l+1] = flag;
		        }
		      }
		    }
		    System.out.println("Sorted in ascending order using bubble sort:");
		    k = 0;
		    while (k<No)
		    {
		    	System.out.println(elements[k]);
		    	k++;
		    }
	}
}

