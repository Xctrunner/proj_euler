
public class Euler6 {
	public static void main(String args[]) {
		int sum=0;
		int sumOfSquared = 0;
		for(int i=1; i<101; i++) {
			sum += i;
			sumOfSquared += (i*i);
		}
		System.out.println(sum*sum-sumOfSquared);
	}
	
}
