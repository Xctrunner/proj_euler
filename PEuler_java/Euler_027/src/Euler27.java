import java.util.ArrayList;


public class Euler27 {
	public static void main(String args[]) {
		genPQuads();
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
		if(bound<0)
			return false;
		for(int i=5; i<Math.sqrt(bound)+1; i+=2) {
			if(bound%2==0)
				return false;
			if(bound%i==0)
				return false;
		}
		if(bound==4)
			return false;
		return true;
	}
	
	static boolean numsMakePrime(int a, int b) {
		for(int i=1; i<71; i++) {
			if(!isPrime((i*i)+(i*-a)+b))
				return false;
		}
		return true;
	}
	
	static void genPQuads() {
		ArrayList<Integer> primes = listPrimes(1000);
		for(int i:primes) {
			for(int j=1; j<1000; j++) {
				if(numsMakePrime(j, i))
					System.out.println(j+", "+i);
			}
		}
	}
}
