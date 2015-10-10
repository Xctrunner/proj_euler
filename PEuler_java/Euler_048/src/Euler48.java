import java.math.BigInteger;


public class Euler48 {
	public static void main(String args[]) {
		BigInteger sum = new BigInteger("0");
		for(int i=1; i<1000; i++) {
			BigInteger temp = new BigInteger(""+i);
			sum = sum.add(temp.pow(i));
		}
		System.out.println(sum);
	}
}
