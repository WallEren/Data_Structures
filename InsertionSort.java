/*
Capgemini ADAPT Program
Insertion Sort
Link: https://onlinegdb.com/ZlzBndFrx
*/

import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Enter array size: ");
	    int arrSize = sc.nextInt();
	    
	    System.out.println("Enter array elements: ");
	    int arr[] = new int[arrSize];
	    for(int index = 0; index < arrSize; index++)
	    {
	        arr[index] = sc.nextInt();
	    }
	    
	    System.out.println("Array before sorting:");
	    for(int index = 0; index < arrSize; index++)
	    {
	        System.out.print(arr[index]+" ");
	    }
	    
	    System.out.println("\nInsertion sorting is on progress...");
	    for(int index1 = 0; index1 < arrSize; index1++)
	    {
	        int item = arr[index1];
	        int index2 = index1-1;
	        
	        while(index2>=0 && item<arr[index2])
	        {
	            arr[index2+1] = arr[index2];
	            index2--;
	        }
	        
	        arr[index2+1] = item;
	    }
	    
	    System.out.println("Array after insertion sort:");
	    for(int index = 0; index < arrSize; index++)
	    {
	        System.out.print(arr[index]+" ");
	    }
	}
}
