import java.math.BigInteger;
import java.util.ArrayList;


public class Euler66 extends PEuler {
	
	public static BigInteger minX(BigInteger d, ArrayList<BigInteger> sqs) {
		//sqs is an array of squares
		for(BigInteger i:sqs) {
			if(i.equals(new BigInteger("1"))) {
			}
			else if((i.subtract(new BigInteger("1"))).mod(d).equals(new BigInteger("0")))
				if(isSquare((i.subtract(BigInteger.ONE)).divide(d)))
					return i;
		}
		return new BigInteger("0");
	}
	
	/**public static int[] addUp(ArrayList<Integer> fronts) {
		if(fronts.size()==2) {
			int[] ar = {fronts.get(0)*fronts.get(1)+1, fronts.get(1)};
			return ar;
		}
		int[] ar = {fronts.get(fronts.size()-2)*fronts.get(fronts.size()-1)+1, fronts.get(fronts.size()-1)};
		for(int i=fronts.size()-3; i>=0; i--) {
			int temp = ar[0];
			ar[0] = ar[1];
			ar[1] = temp;
			//int temp0 = ar[0];
			//int temp1 = ar[1];
			ar[0] = fronts.get(i)*ar[1] + ar[0];
			
		}
		return ar;
	}*/
	
	public static BigInteger[] addUp(ArrayList<Integer> fronts) {
		if(fronts.size()==2) {
			BigInteger[] ar = {new BigInteger(""+fronts.get(0)*fronts.get(1)+1), new BigInteger(""+fronts.get(1))};
			return ar;
		}
		BigInteger[] ar = {new BigInteger(""+fronts.get(fronts.size()-2)*fronts.get(fronts.size()-1)+1), new BigInteger(""+fronts.get(fronts.size()-1))};
		for(int i=fronts.size()-3; i>=0; i--) {
			BigInteger temp = ar[0];
			ar[0] = ar[1];
			ar[1] = temp;
			ar[0] = (ar[1].multiply(new BigInteger(""+fronts.get(i)))).add(ar[0]);
			
		}
		return ar;
	}
	
	public static void main(String args[])	{
		
		BigInteger max = BigInteger.ZERO;
		BigInteger res = BigInteger.ZERO;
		for(int d=2; d<8; d++) {
			if(!isSquare(d)) {
				ArrayList<Integer> fronts = new ArrayList<Integer>();
				int[] in = {d, -((int) Math.sqrt(d)), 1};
				fronts.add((int) Math.sqrt(d));
				while(true) {
					in = doSet(in);
					fronts.add(in[3]);
					BigInteger ar[] = addUp(fronts);
					//System.out.println(ar[0] + " " + ar[1]);
					if( (ar[0].multiply(ar[0])).subtract((ar[1].multiply(ar[1]).multiply(new BigInteger(""+d)))).equals(BigInteger.ONE)) {
						if(ar[0].compareTo(max)==1) {
							max = ar[0];
							res = new BigInteger(""+d);
							System.out.println(max + " " + res);
						}
						break;
					}
				}
			}
		}
		
		/**int max = 0;
		int res = 0;
		for(int d=2; d<400; d++) {
			if(!isSquare(d)) {
				ArrayList<Integer> fronts = new ArrayList<Integer>();
				int[] in = {d, -((int) Math.sqrt(d)), 1};
				fronts.add((int) Math.sqrt(d));
				while(true) {
					in = doSet(in);
					fronts.add(in[3]);
					int ar[] = addUp(fronts);
					if(ar[0]*ar[0]-ar[1]*ar[1]*d==1) {
						if(ar[0]>max) {
							max = ar[0];
							res = d;
							System.out.println(max + " " + res);
						}
						break;
					}
				}
			}
		}*/
	}
}
