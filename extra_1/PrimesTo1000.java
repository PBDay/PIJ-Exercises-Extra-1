package extra_1;


public class PrimesTo1000 {

	// Extra exercises number 1_13
	// Produces all the primes up to 1000
	// uses function to check if it is Prime within this package
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i <= 1000; i++)
		{
			if (functions.isPrime(i))
			{
				System.out.println(i);
			}
		}

	}

	
	
}
