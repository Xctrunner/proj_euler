import java.util.ArrayList;


public class Euler26 {
	public static void main(String args[]) {
		System.out.println(listPrimes(1000));
		System.out.println(isPrime(4));
	}
	
	static ArrayList<Integer> listPrimes(int limit) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		primes.add(2);
		primes.add(3);
		for(int i=5; i<limit; i++) {
			if(isPrime(i))
				primes.add(i);
		}
		return primes;
	}
	
	public static boolean isPrime(long bound) {
		for(int i=3; i<Math.sqrt(bound)+1; i+=2) {
			if(bound%2==0)
				return false;
			else if(bound%i==0)
				return false;
		}
	if(bound==4)
		return false;
	return true;
	}
}
