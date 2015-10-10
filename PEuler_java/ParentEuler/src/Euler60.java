import java.util.ArrayList;


public class Euler60 extends PEuler {
	
	public static void main(String args[]) {
		int minSum=800000;
		int[] primes = generatePrimes(10000);
		for(int g=0; g<primes.length-4; g++) {
				//System.out.println(g);
				testers.add(primes[g]);
				for(int h=g+1; h<primes.length-3; h++) {
						if(works(primes[h])) {
							//System.out.println(h);
							testers.add(primes[h]);
							for(int i=h+1; i<primes.length-2; i++) {
								if(works(primes[i])) {
									//System.out.println(i);
									testers.add(primes[i]);
									for(int j=i+1; j<primes.length-1; j++) {
										if(works(primes[j])) {
											//System.out.println(j+" "+i+" "+h+" "+g);
											testers.add(primes[j]);
											for(int k=j+1; k <primes.length; k++) {
												if(works(primes[k])) {
													minSum=Math.min(minSum, primes[g]+primes[h]+primes[i]+primes[j]+primes[k]);
												}
											}
											testers.remove(3);
										}
										
									}
									testers.remove(2);
								}
								
							}
							testers.remove(1);
						}
						
					}
			testers.clear();
		}
		System.out.println(minSum);
	}
	
	static boolean works(int in) {
		//testers.add(3);
		for(int i=0; i<testers.size(); i++) {
			String temp1 = "" + testers.get(i) + in;
			String temp2 = "" + in + testers.get(i);
			if(!isPrime(Long.parseLong(temp1)) || !isPrime(Long.parseLong(temp2))) {
				return false;
			}
		}
		return true;
	}
	
	static ArrayList<Integer> testers = new ArrayList<Integer>();
}
