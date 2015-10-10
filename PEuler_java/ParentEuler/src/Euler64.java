
public class Euler64 extends PEuler {
	
	public static void main(String args[]) {
		int[] sqs = genSqs();
		int[] primes = generatePrimes(10000);
		int total = 99;
		//for(int j:primes) {
		for(int j=1; j<10001; j++) {
			int count = 0;
			int[] result = new int[2000];
			if(j%((int) Math.sqrt(j) * (int) Math.sqrt(j))!=1 && j%((int) Math.sqrt(j) * (int) Math.sqrt(j))!=0) {
				int[] input = {j, -1 * (int) Math.sqrt(j), 1};
				while(count<2000) {
					input = doSet(input);
					result[count] = input[3];
					count++;
				}
				int index1 = 0;
				int index2 = 0;
				int max = maxVal(result);
				for(int i=0; i<result.length; i++) {
					if(index1==0 && result[i] == max) {
						index1 = i;
					}
					else if(result[i] == max) {
						index2 = i;
						break;
					}
				}
				if((index2-index1)%2==1) {
					//System.out.println(j);
					total++;
				}
			}
			
		}
		System.out.println(total);
		/*int[] out = new int[50];
		int[] input = {13, -3, 1};
		int count=0;
		while(count < 50) {
			input = doSet(input);
			out[count] = input[3];
			System.out.print(input[3]);
			System.out.print(",");
			count++;
		}*/
		/*for(int i:out) {
			System.out.println(i);
		}*/
		//System.out.println("\n" + maxVal(out));
		
		
	}
	
	public static int[] doSet(int[] ar) {
		int sqr = ar[0]; //should never change
		int minusNum = ar[1]; //the number subtracted at the start of the problem
		int den = ar[2]; //starting denominator
		int[] out = new int[4];
		int conjMNum = minusNum * -1; //conjugate of minusNum
		int newDen = sqr - (minusNum * minusNum); //den of new fraction, from square and minusNum
		newDen/=den;
		int temp3 = conjMNum + (int) Math.sqrt(sqr);
		int temp1 = -1 * (int) Math.sqrt(sqr);
		/*while(conjMNum>=0) {
			temp3+=newDen*holdConjVal;
			conjMNum-=newDen*holdConjVal;
		} */
		while(temp3%newDen!=0) {
			temp1++;
			temp3--;
		}
		//System.out.println(temp3/newDen);
		out[0] = sqr;
		out[1] = temp1;
		out[2] = newDen;
		out[3] = temp3/newDen;
		return out;
		
		
		/*for(int i:out)
		System.out.println(i); */
		/**out[0] = sqr;
		out[2] = newDen/den;
		if(out[2] > conjMNum) {
			out[1] = conjMNum/den - out[2];
			out[3] = 1;
		}
		else {
			int temp3 = 0;
			while(out[2] < conjMNum && conjMNum >= 0) {
				conjMNum-=out[2];
				temp3+=out[2];
			}
			out[1] = conjMNum/den;
			out[3] = temp3/den;
		} */
		//System.out.println(out[3]);
	}
	
	public static int[] genSqs() {
		int[] sq = new int[100];
		for(int i=1; i<101; i++) {
			sq[i-1] = i*i;
		}
		return sq;
	}
	
	public static int maxVal(int[] in) {
		/**int count = 0;
		int perReps = 1;
		int subLen = 1;
		int iToCheck = subLen;
		int result = 0;
		for(int i=0; i<10; i++) {
			if(in.substring(0,subLen).equals(in.substring(iToCheck, iToCheck+subLen))) {
				iToCheck+=subLen;
				perReps++;
			}
			if(perReps==10) {
				result
			}
			else
				break; */
		int maxVal = 0;
		for(int i:in) {
			maxVal = Math.max(maxVal, i);
		}
		/*int count = 0;
		for(int j:in) {
			if(j==maxVal) {
				count++;
			}
		} */
		return maxVal;
	}
	
	/**static boolean isOddPer(int i, int[] in) {
		if
	} */
}
