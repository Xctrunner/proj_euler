import java.math.BigInteger;
import java.util.ArrayList;


public class Stuff {
	public static boolean isPrime(int bound) {
		if(bound<2)
			return false;
		for(int i=3; i<Math.sqrt(bound)+1; i+=2) {
			if(bound%2==0)
				return false;
			if(bound%i==0)
				return false;
		}
		if(bound==4)
			return false;
		return true;
	}
	public static void main(String args[]) {
		System.out.println(13%(int) Math.sqrt(13));
	}
	
	/*public static boolean isPrime(long bound) {
		for(int i=3; i<Math.sqrt(bound)+1; i+=2) {
			if(bound%2==0)
				return false;
			if(bound%i==0)
				return false;
		}
	return true;
	} */
	
	public static ArrayList<Integer> primeFactors(int input) {
		ArrayList<Integer> primeFacs = new ArrayList<Integer>();
		for(int i=2; i<Math.sqrt(input)+1; i++) {
			if(isPrime(i)) {
				if(input%i==0) {
					primeFacs.add(i);
				}
			}	
		}
		return primeFacs;
	}
}
