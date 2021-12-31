/*
Capgemini ADAPT Program
Tower of Hanoi
Link: https://onlinegdb.com/vGCXmCniS
*/

import java.util.*;

public class Main
{
    static int totalMoves = 0;
    static int towerOfHanoi(int disk, char source, char temp, char destination)
    {
        if(disk==1)
        {
            System.out.printf("move disk-%d from %c to %c\n", disk, source, destination);
            totalMoves++;
            return 0;
        }
        towerOfHanoi(disk-1, source, destination, temp);
        System.out.printf("move disk-%d from %c to %c\n", disk, source, destination);
        totalMoves++;
        towerOfHanoi(disk-1, temp, source, destination);
        return 0;
    }
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Enter the number of disks: ");
	    int disk = sc.nextInt();
	    towerOfHanoi(disk, 'A', 'B', 'C');
	    System.out.println("Total moves = " + totalMoves);
	}
}
