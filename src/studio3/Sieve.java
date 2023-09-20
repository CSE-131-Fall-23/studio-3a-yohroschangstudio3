package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("What number do you want to find primes up to?");
		int max = in.nextInt();
		
		boolean[] array = new boolean[max];
		
		// Create an array of trues
		for (int i = 0; i < max; i++)
			array[i] = true;
		
		// Go through 2, 3, 4, 5...
		for (int i = 2; i < max; i++)
		{
			// If the number hasn't been crossed out yet (avoid repetition)
			if (array[i] == true)
			{
				// Go through 2 * 2, 2 * 3, 2 * 4, 2 * 5...
				for (int j = 2; i * j < max; j++)
					array[i * j] = false;
			}	
		}
		
		// Print out values
		for (int i = 2; i < max; i++)
		{
			if (array[i])
				System.out.print(i + " ");
		}
		
	}

}
