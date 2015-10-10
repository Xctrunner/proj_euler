import java.math.BigDecimal;
import java.math.BigInteger;


public class Euler65 {
	public static void main(String args[]) {
		BigInteger big = new BigInteger("66");
		BigInteger num = new BigInteger("1");
		BigInteger den = new BigInteger("1");
		for(int i=2; i<100; i++) {
			if(i%3==2) {
				num = num.add(den.multiply(big));
				//big = big.subtract(new BigInteger("1"));
				//System.out.println(2);
			}
			else {
				num= num.add(den);
				//System.out.println(1);
			}
			BigInteger temp = new BigInteger(""+num);
			//System.out.println(temp);
			num = new BigInteger(""+den);
			//System.out.println(num);
			den = new BigInteger(""+temp);
			//System.out.println(den);
			if(i%3==2) {
				//num = num.add(den.multiply(big));
				big = big.subtract(new BigInteger("2"));
			}
			//System.out.println(num+"/"+den);
		}
		System.out.println(num+"/"+den);
		int sum = 0;
		String number = num.add(den.multiply(new BigInteger("2"))).toString();
		BigDecimal frac = new BigDecimal(number).divide(new BigDecimal(den.toString()),25,1);
		System.out.println(frac);
		System.out.println(number);
		for(int i=0; i<number.length(); i++) {
			sum+=Integer.parseInt(number.substring(i,i+1));
		}
		System.out.println(sum);
	}
}
