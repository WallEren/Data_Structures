/*
Capgemini ADAPT Program
Linear Search
Link: https://onlinegdb.com/5mZzOlXUx
*/

import java.util.*;
public class Main
{
    static int linearSearch(int element, int arr[], int arrSize)
    {
        for(int index = 0; index < arrSize; index++)
        {
            if(element == arr[index])
            {
                return index+1;
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
	    
	    int position = linearSearch(searchElement, arr, arrSize);
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
