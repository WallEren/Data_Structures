/*
Capgemini ADAPT Program
Binary Search
Link: https://onlinegdb.com/HnDbgEr2N
*/

import java.util.*;
public class Main
{
    static int binarySearch(int element, int arr[], int arrSize)
    {
        int first;
        int middle;
        int last;
        
        for(first = 0, last = arrSize-1; first<=last; )
        {
            middle = (first+last)/2;
            
            if(arr[middle] == element)
            {
                return middle+1;
            }
            else if(arr[middle] < element)
            {
                first = middle+1;
            }
            else
            {
                last = middle-1;
            }
        }
        return -1;
    }
    
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
	    System.out.println("Enter the element to be searched for: ");
	    int searchElement = sc.nextInt();
	    
	    int position = binarySearch(searchElement, arr, arrSize);
	    if(position == -1)
	    {
	        System.out.println(searchElement + " is not found in the array");
	    }
	    else
	    {
	        System.out.println(searchElement + " is found in the position " + position);
	    }
	}
}
