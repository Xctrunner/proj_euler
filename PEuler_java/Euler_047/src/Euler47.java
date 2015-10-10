import java.util.*;
public class Euler47 {
	
	public static void main(String args[]) {
		for(int i=100; i<1000000; i++) {
			if(numDistFactors(i)==4) {
				if(numDistFactors(i+1)==4) {
					if(numDistFactors(i+2)==4) {
						if(numDistFactors(i+3)==4) {
							System.out.println(i);
							break;
						}
					}
				}
			}
		}
			
	}
	
	static int numDistFactors(int input) {
		ArrayList<Integer> factors = new ArrayList<Integer>();
		int[] primes = generatePrimes(1000);
		for(int i:primes) {
			if(input%i==0 && input!=i) {
				if(!factors.contains(i))
					factors.add(i);
			}
		}
		return factors.size();
		
	}
	
	private static int[] generatePrimes(int max) {
	    boolean[] isComposite = new boolean[max + 1];
	    for (int i = 2; i * i <= max; i++) {
	        if (!isComposite [i]) {
	            for (int j = i; i * j <= max; j++) {
	                isComposite [i*j] = true;
	            }
	        }
	    }
	    int numPrimes = 0;
	    for (int i = 2; i <= max; i++) {
	        if (!isComposite [i]) numPrimes++;
	    }
	    int [] primes = new int [numPrimes];
	    int index = 0;
	    for (int i = 2; i <= max; i++) {
	        if (!isComposite [i]) primes [index++] = i;
	    }
	    return primes;
	}
	
	static boolean isPrime(long a) {
		if(a<2)
			return false;
		if(a==2)
			return true;
		if(a%2==0)
			return false;
		for(int i=3; i<(int)Math.sqrt(a)+1; i+=2) {
			if(a%i==0) {
				//System.out.println(i);
				return false;
			}
		}
		return true;
	}
}
