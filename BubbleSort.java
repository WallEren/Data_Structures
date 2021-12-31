/*
Capgemini ADAPT Program
Bubble Sort
Link: https://onlinegdb.com/NmqXaSgIY
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
	    
	    System.out.println("\nBubble sorting is on progress...");
	    for(int index1 = 1; index1 < arrSize; index1++)
	    {
	        for(int index2 = 0; index2 < arrSize-index1; index2++)
    	    {
    	        if(arr[index2]>arr[index2+1])
    	        {
    	            int temp = arr[index2];
    	            arr[index2] = arr[index2+1];
    	            arr[index2+1] = temp;
    	        }
    	    }
	    }
	    
	    System.out.println("Array after bubble sort:");
	    for(int index = 0; index < arrSize; index++)
	    {
	        System.out.print(arr[index]+" ");
	    }
	}
}
