
public class Euler50 {
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
	
	public static void main(String args[]) {
		int[] primes = generatePrimes(3942);
		int sum=0;
		for(int a=1; a<primes.length; a++) {
			for(int i=a; i<primes.length; i++) {
				sum+=primes[i];
			}
			if(isPrime(sum)) {
				System.out.println(sum);
				System.out.println(a);
				break;
			}
			else
				sum=0;
		}
		
		/*int sum=2;
		int[] tempAr = {0,0};
		while(sum<1000000) {
			for(int i=1; i<10; i++) {
				sum+=primes[i];
				if(isPrime(sum)) {
					if(i>primes[1]) {
						tempAr[0]=sum;
						tempAr[1]=i;
					}
				}
			}
		}
		for(int i:tempAr)
			System.out.println(i); */
		
		/*boolean value=true;
		for(int i=primes.length-1; i>primes.length-1000; i--) {
			while(value) {
			int tempSum=0;
				for(int start=0; start<primes.length; start++) {
					int temp=0;
					for(int counter=0; counter<primes.length-start; counter++){
						
						if(tempSum<primes[i]) {
						//if(tempSum<41) {
							tempSum+=primes[start+counter];
							temp++;
						}
						if(tempSum==primes[i]) {
						//if(tempSum==41) {
							//if(temp>39200)
							System.out.println(primes[i]+" "+temp);
							temp=0;
							i--;
							break;
							//value=false;
						}
						if(tempSum>41) {
							start++;
							tempSum=0;
							break;
						}
					}

				}
			}
		}
		//System.out.println(primes[primes.length-1]); */
		
	}
}
