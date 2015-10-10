import java.util.ArrayList;


public class Euler51 extends PEuler {
	public static void main(String args[]) {
		int[] primes = primesOver10k();
		for(int i:primes) {
			if(lessFourFails(i)) {
				System.out.println(i);
			}
		}
	}
	static int[] primesOver10k() {
		int[] primesAll = generatePrimes(1000000);
		ArrayList<Integer> primeN = new ArrayList<Integer>();
		for(int i:primesAll) {
			if(i>100000)
				primeN.add(i);
		}
		int[] primes = new int[primeN.size()];
		for(int a=0; a<primeN.size(); a++) {
			primes[a]=primeN.get(a);
		}
		return primes;
	}
	static boolean lessFourFails(int input) {
		int numFails=1;
		String num = ""+input;
		if(num.indexOf("1")>-1) {
			for(int i=2; i<10; i++) {
				String temp=num.replace("1", ""+i);
				//System.out.println(temp);
				if(!isPrime(Integer.parseInt(temp))) {
					numFails++;
				}
			}
		}
		else{return false;}
		if(numFails<3)
			return true;
		return false;
	}
}
