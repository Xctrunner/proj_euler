import java.util.ArrayList;


public class Euler58 extends PEuler {
	public static void main(String args[]) {
		ArrayList<Long> corners = genSpiralCorners();
		/*for(int i:corners) {
			System.out.println(i);
		} */
		int numPrimes = 0;
		int total=1;
		for(int i=0; i<corners.size(); i++) {
			if(isPrime(corners.get(i))) {
				numPrimes++;
			}
			total++;
			if(numPrimes!=0 && numPrimes*10<total) {
				System.out.println(((i*2)/4+2));
				break;
			}
		}
		//System.out.println(corners.get(52480)); 
		/*long primes = 0;
		long total = 1;
		long num = 1;
		for (int i = 2; i < 1000000; i += 2) {
			for (int j = 0; j < 4; j++) {
				num += i;
				if (isPrime(num))
					primes++;
			}
			total += 4;
			if (10 * primes < total) {
				System.out.println(i + 1);
				break;
			}
		} */
		
		
	}
	
	static ArrayList<Long> genSpiralCorners() {
		ArrayList<Long> corners = new ArrayList<Long>();
		corners.add(1L);
		long current = 1;
		for(long i=2; i<50000; i+=2) {
			for(int a=0; a<4; a++) {
				current+=i;
				corners.add(current);
			}
		}
		return corners;
	}
	
	static int sideLengthAt(int in) {
		for(int j=2; j<100000; j++) {
			for(int i=0; i<4; i++) {
				if(in<10) {
					return j;
				}
				in-=j;
			}
		}
		return 0;
	} 
}
