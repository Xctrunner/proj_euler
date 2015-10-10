import java.math.BigInteger;
public class Euler16 {
	public static void main(String args[]) {
		BigInteger two = new BigInteger("2");
		BigInteger large = two.pow(1000);
		String toTest = large.toString();
		int sum = 0;
		for(int i=0; i<toTest.length(); i++) {
			sum += Integer.parseInt(toTest.substring(i, i+1));
		}
		System.out.println(sum);
	}
}
