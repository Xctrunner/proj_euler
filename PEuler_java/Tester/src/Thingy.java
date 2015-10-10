import java.util.ArrayList;

public class Thingy {
	public static void main(String args[]) {
		int x=3, y=5;
		fun(x, y);
		System.out.println(x + " " + y);
	}
	
	public static void fun(int a, int b) {
		a+=b;
		b+=a;
		System.out.println(a);
		System.out.println(b);
	}
	
	/* static ArrayList<Integer> listPrimes(int limit) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		primes.add(2);
		primes.add(3);
		for(int i=4; i<limit; i++) {
			if(isPrime(i))
				primes.add(i);
		}
		return primes;
	}
	
	public static boolean isPrime(long bound) {
		for(int i=3; i<Math.sqrt(bound)+1; i+=2) {
			if(bound%2==0)
				return false;
			if(bound%i==0)
				return false;
		}
	return true;
	} */
}
