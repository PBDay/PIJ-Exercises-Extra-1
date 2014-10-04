package extra_1;

public class functions {
// contains functions being used by this package
	
	public static boolean isPrime(int checkInt)
	{
		boolean found = false;
		int i = checkInt -1;
		
		
		while (!found && i > 1)
		{
			if (checkInt % i == 0)
			{
				found = true;
			}	
			i--;
		}
		
		return !found;
	}
	
	public static void main(String[] args) {
		System.out.println(isPrime(2));
		System.out.println(isPrime(3));
		System.out.println(isPrime(4));
		System.out.println(isPrime(5));
		System.out.println(isPrime(6));
	}
}
