

public class Euler37 {
	public static void main(String args[]) {
		//System.out.println(isPrime(15));
		//System.out.println(isTruncPrime(3796));
		int sum=0;
		int[] primes = generatePrimes(1000000);
		for(int i=4; i<primes.length; i++) {
			if(isTruncPrime(primes[i])) {
				sum+=primes[i];
				//System.out.println(primes[i]);
			}
		} 
		System.out.println(isPrime(2L)); 
		System.out.println(isTruncPrime(23));
		//System.out.println(isPrime(739397));
		
	}
	static boolean isTruncPrime(long input) {
		String str1 = ""+input;
		String str2 = ""+input;
		int len = str1.length();
		int counter = 0;
		while(counter<len) {
			if(!isPrime(Long.parseLong(str1)))
				return false;
			else
				str1=str1.substring(1);
			counter++;
		}
		counter=0;
		while(counter<len) {
			if(!isPrime(Long.parseLong(str2)))
				return false;
			else
				str2=str2.substring(0,str2.length()-1);
			counter++;
		}
		
		return true;
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
	static boolean isPrime(Long a) {
		if(a==1)
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
