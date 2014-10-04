package extra_1;

public class ex1_14_first1000primes {

	//prints the first 1000 prime numbers
	// uses isPrime method form function within package
	
	public static void main(String[] args) {
		
	int c = 0, i=1;
	
	while (c < 1000)
	{
		if (functions.isPrime(i))
		{
			System.out.println(i);
			c++;
		}
		i++;
	}
	}

}
