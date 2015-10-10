import java.math.BigInteger;
import java.util.ArrayList;
//import java.util.*;
public class PEuler {
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
	static boolean isPrime(int a) {
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
	static int[] generatePrimes(int max) {
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
	
	static boolean hasDigits(int a, int b) {
		String x = ""+a;
		String y = ""+b;
		if(x.length()!=y.length())
			return false;
		for(int i=0; i<y.length(); i++) {
			if(x.indexOf(y.substring(i,i+1))==-1)
				return false;
		}
		return true;
	}
	
	static boolean isPal(String input) {
		if(input.length()%2==0) {
			StringBuilder str = new StringBuilder(input.substring(input.length()/2));
			if(input.substring(0,input.length()/2).equals(str.reverse().toString()))
				return true;
		}
		if(input.length()%2==1) {
			StringBuilder str = new StringBuilder(input.substring(input.length()/2+1));
			if(input.substring(0,input.length()/2).equals(str.reverse().toString()))
				return true;
		}
		return false;
	}
	
	static boolean isPal(int in) {
		String input= in + "";
		if(input.length()%2==0) {
			StringBuilder str = new StringBuilder(input.substring(input.length()/2));
			if(input.substring(0,input.length()/2).equals(str.reverse().toString()))
				return true;
		}
		if(input.length()%2==1) {
			StringBuilder str = new StringBuilder(input.substring(input.length()/2+1));
			if(input.substring(0,input.length()/2).equals(str.reverse().toString()))
				return true;
		}
		return false;
	}
	static boolean isPal(long in) {
		String input= in + "";
		if(input.length()%2==0) {
			StringBuilder str = new StringBuilder(input.substring(input.length()/2));
			if(input.substring(0,input.length()/2).equals(str.reverse().toString()))
				return true;
		}
		if(input.length()%2==1) {
			StringBuilder str = new StringBuilder(input.substring(input.length()/2+1));
			if(input.substring(0,input.length()/2).equals(str.reverse().toString()))
				return true;
		}
		return false;
	}
	static boolean isPal(BigInteger in) {
		String input= in.toString();
		if(input.length()%2==0) {
			StringBuilder str = new StringBuilder(input.substring(input.length()/2));
			if(input.substring(0,input.length()/2).equals(str.reverse().toString()))
				return true;
		}
		if(input.length()%2==1) {
			StringBuilder str = new StringBuilder(input.substring(input.length()/2+1));
			if(input.substring(0,input.length()/2).equals(str.reverse().toString()))
				return true;
		}
		return false;
	}
	
	static ArrayList<Integer> genTris(int max) {
		ArrayList<Integer> tris = new ArrayList<Integer>();
		int counter=1;
		while(true) {
			int temp = (counter * counter + counter)/2;
			if(temp>max) {
				break;
			}
			tris.add(temp);
			counter++;
		}
		return tris;
	}
	
	static ArrayList<Integer> genSqs(int max) {
		ArrayList<Integer> sqs = new ArrayList<Integer>();
		int counter=1;
		while(true) {
			int temp = (counter * counter);
			if(temp>max) {
				break;
			}
			sqs.add(temp);
			counter++;
		}
		return sqs;
	}
	
	static ArrayList<Integer> genPents(int max) {
		ArrayList<Integer> pents = new ArrayList<Integer>();
		int counter=1;
		while(true) {
			int temp = (3 * counter * counter - counter)/2;
			if(temp>max) {
				break;
			}
			pents.add(temp);
			counter++;
		}
		return pents;
	}
	
	static ArrayList<Integer> genHexes(int max) {
		ArrayList<Integer> hexes = new ArrayList<Integer>();
		int counter=1;
		while(true) {
			int temp = (2 * counter * counter - counter);
			if(temp>max) {
				break;
			}
			hexes.add(temp);
			counter++;
		}
		return hexes;
	}
	
	static ArrayList<Integer> genHeps(int max) {
		ArrayList<Integer> heps = new ArrayList<Integer>();
		int counter=1;
		while(true) {
			int temp = (5 * counter * counter - 3 * counter)/2;
			if(temp>max) {
				break;
			}
			heps.add(temp);
			counter++;
		}
		return heps;
	}
	
	static ArrayList<Integer> genOcts(int max) {
		ArrayList<Integer> octs = new ArrayList<Integer>();
		int counter=1;
		while(true) {
			int temp = (3 * counter * counter - 2 * counter);
			if(temp>max) {
				break;
			}
			octs.add(temp);
			counter++;
		}
		return octs;
	}
	
	static boolean isSquare(int num) {
		/*if(num==2 || num==3)
			return false; */
		if(num%((int) Math.sqrt(num))==0 && num/((int) Math.sqrt(num))==(int) Math.sqrt(num))
			return true;
		return false;
	}
	
	static boolean isSquare(long num) {
		/*if(num==2 || num==3)
			return false; */
		if(num%((int) Math.sqrt(num))==0 && num/((int) Math.sqrt(num))==(int) Math.sqrt(num))
			return true;
		return false;
	}
	
	private static final BigInteger TWO = BigInteger.valueOf(2);
	public static BigInteger sqrt(BigInteger n)
	{
	    if (n.signum() >= 0)
	    {
	        final int bitLength = n.bitLength();
	        BigInteger root = BigInteger.ONE.shiftLeft(bitLength / 2);

	        while (!isSqrt(n, root))
	        {
	            root = root.add(n.divide(root)).divide(TWO);
	        }
	        return root;
	    }
	    else
	    {
	        throw new ArithmeticException("square root of negative number");
	    }
	}
	private static boolean isSqrt(BigInteger n, BigInteger root)
	{
	    final BigInteger lowerBound = root.pow(2);
	    final BigInteger upperBound = root.add(BigInteger.ONE).pow(2);
	    return lowerBound.compareTo(n) <= 0
	        && n.compareTo(upperBound) < 0;
	}
	
	static boolean isSquare(BigInteger num) {
		if(num.mod(sqrt(num)).signum()==0 && num.divide(sqrt(num)).equals(sqrt(num)))
			return true;
		return false;
	}
	
	static ArrayList<BigInteger> genSqs(BigInteger max) {
		ArrayList<BigInteger> sqs = new ArrayList<BigInteger>();
		BigInteger counter=new BigInteger("1");
		while(true) {
			BigInteger temp = (counter.pow(2));
			if(temp.compareTo(max)==1) {
				break;
			}
			sqs.add(temp);
			counter=counter.add(new BigInteger("1"));
		}
		return sqs;
	}
	
	public static int[] doSet(int[] ar) {
		//This is useful in continued fraction problems
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
	}
}


