
public class Euler10 {
	public static void main(String args[]) {
		long sum = 2;
		int i=3;
		while(i<2000000) {
			if(isPrime(i)) {
				sum+=i;
				
				i+=2;
			}
			else
				i+=2;
		}
		System.out.println(sum);
	}
	public static boolean isPrime(long bound) {
		for(int i=3; i<Math.sqrt(bound)+1; i+=2) {
			if(bound%2==0)
				return false;
			if(bound%i==0)
				return false;
		}
	return true;
	}

}
