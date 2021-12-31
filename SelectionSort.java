/*
Capgemini ADAPT Program
Selection Sort
Link: https://onlinegdb.com/IUmZH496w
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
	    
	    System.out.println("\nSelection sorting is on progress...");
	    for(int index1 = 0; index1 < arrSize-1; index1++)
	    {
	        int small = arr[index1];
	        int position = index1;
	        
	        for(int index2 = index1+1; index2 < arrSize; index2++)
    	    {
    	        if(small>arr[index2])
    	        {
    	            small = arr[index2];
    	            position = index2;
    	        }
    	    }
    	    int temp = arr[position];
    	    arr[position] = arr[index1];
    	    arr[index1] = temp;
	    }
	    
	    System.out.println("Array after selection sort:");
	    for(int index = 0; index < arrSize; index++)
	    {
	        System.out.print(arr[index]+" ");
	    }
	}
}
