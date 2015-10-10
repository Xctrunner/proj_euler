import java.util.ArrayList;


public class Euler46 {
	
	static ArrayList<Long> genDubSq() {
		ArrayList<Long> nums = new ArrayList<Long>();
		for(long i=1; i<1000; i++) {
			nums.add(2*i*i);
		}
		return nums;
	}
	
	static ArrayList<Long> genOddComps() {
		ArrayList<Long> oddComps = new ArrayList<Long>();
		for(long i=9; i<6000; i+=2) {
			if(!isPrime(i))
				oddComps.add(i);
		}
		return oddComps;
	}
	static boolean goldieFalse(long i){
		ArrayList<Long> dubSq = genDubSq();
		for(int j=0; j<dubSq.size(); j++) {
			if(isPrime(i-dubSq.get(j))) {
				return false;
			}
		}
		return true;
	}
	public static void main(String args[]) {
		ArrayList<Long> oddComps = genOddComps();
		for(long i:oddComps) {
			if(goldieFalse(i))
				System.out.println(i);
		}
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
