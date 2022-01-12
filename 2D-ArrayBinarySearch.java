/*
Capgemini ADAPT Program
Binary Search in a 2-dimensional array
Link: https://onlinegdb.com/Z8I3rxrYA
*/

import java.util.*;
public class Main
{
    static void binarySearch(int element, int matrix[][], int matrixSize)
    {
        int first;
        int middle;
        int last;
        
        for(first = 0, last = (matrixSize*matrixSize)-1; first<=last; )
        {
            middle = (first+last)/2;
            
            if(matrix[middle/matrixSize][middle%matrixSize] == element)
            {
                System.out.printf(element + " is found in the matrix at row = %d, column = %d", middle/matrixSize+1, middle%matrixSize+1);
                return;
            }
            else if(matrix[middle/matrixSize][middle%matrixSize] < element)
            {
                first = middle+1;
            }
            else
            {
                last = middle-1;
            }
        }
        System.out.println(element + " is not found in the matrix");
    }
    
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter matrix size: ");
	    int matrixSize = sc.nextInt();
	    System.out.println("Enter matrix elements: ");
	    int matrix[][] = new int[matrixSize][matrixSize];
	    for(int row = 0; row < matrixSize; row++)
	    {
	        System.out.printf("Enter row-%d elements: ", row+1);
	        for(int column = 0; column < matrixSize; column++)
    	    {
    	        matrix[row][column] = sc.nextInt();
    	    }
	    }
	    System.out.println("Enter the element to be searched for: ");
	    int searchElement = sc.nextInt();
	    binarySearch(searchElement, matrix, matrixSize);
	}
}
