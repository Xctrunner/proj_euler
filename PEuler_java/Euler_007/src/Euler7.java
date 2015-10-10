
public class Euler7 {
	public static void main(String args[]) {
		int prime = 2;
		int numPrimes = 1;
		int counter = 3;
		while(numPrimes<10001) {
			if(isPrime(counter)) {
				prime = counter;
				numPrimes++;
				counter++;
			}
			counter++;
		}
		System.out.println(prime);
		
	}
	public static boolean isPrime(long bound) {
		for(int i=2; i<Math.sqrt(bound)+1; i++) {
			if(bound%i==0)
				return false;
		}
	return true;
	}
}
