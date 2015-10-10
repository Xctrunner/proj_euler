
public class Euler21 {
	
	public static void main(String args[]) {
		long bigSum = 0;
		for(long i=10; i<10000; i++) {
			long amic = sumDivisors(i);
			if(i==sumDivisors(amic) && i!=amic) {
				bigSum = bigSum+i+amic;
			}
		}
		System.out.println(bigSum/2);
		//System.out.println(sumDivisors(220));
	}
	
	public static long sumDivisors(long n) {
		long sum = 1;
		for(int i=2; i<n; i++) {
			if(n%i==0) {
				sum+=i;
			}
		}
		return sum;
	}
}
