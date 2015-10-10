

public class Euler3 {
	public static void main(String args[]) {
		long num = 600851475143l;
		
		for(int i=2; i<num; i++) {
			if(isPrime(num)) {
				System.out.println(num);
				break;
			}
			if(isPrime(i) && num%i==0) {
				System.out.println(i);
				num/=i;
			}
		}
	}
	
	public static boolean isPrime(long bound) {
		for(int i=2; i<Math.sqrt(bound); i++) {
			if(bound%i==0)
				return false;
		}
	return true;
	}
}
