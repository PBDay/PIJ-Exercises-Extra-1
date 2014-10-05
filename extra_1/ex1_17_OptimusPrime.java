package extra_1;

import java.util.Scanner;

public class ex1_17_OptimusPrime {

	// uses isPrime for determining a prime number from within the functions class
	
	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		System.out.println("Insert a number to find the nearest prime:");
		int num = kb.nextInt();
		kb.close();
		
		if (num <=2)
		{
			System.out.println("The nearest prime to " + num + " is 2.");
		}
		else if (functions.isPrime(num))
		{
			System.out.println("The number given, " + num + ", is prime.");
		}
		else
		{
			boolean primeFound = false;
			int distance = 1;
			
			while (!primeFound)
			{
				if (functions.isPrime(num + distance) || functions.isPrime(num - distance))
				{
					primeFound = true;
				}
				else
				{
					distance++;					
				}
			}
			
			if (functions.isPrime(num + distance) && functions.isPrime(num - distance))
			{
				System.out.println("There are two primes both " + distance + " from " + num + ": " + (num + distance) + " and " + (num - distance) + "." );
			}
			else if (functions.isPrime(num + distance))
			{
				System.out.println("The nearest prime to " + num + " is " + (num + distance));
			}
			else
			{
				System.out.println("The nearest prime to " + num + " is " + (num - distance));
			}
		}

	}

}
