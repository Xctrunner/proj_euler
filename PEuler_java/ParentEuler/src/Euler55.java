import java.math.BigInteger;


public class Euler55 extends PEuler {

	public static void main(String[] args) {
		int sum = 0;
		for(int i=19; i<10000; i++) {
			BigInteger temp = new BigInteger(i+"");
			if(isLyrchel(temp)) {
				sum++;
			}
		}
		System.out.println(sum);

	}
	
	static boolean isLyrchel(BigInteger input) {
		for(int j=0; j<50; j++) {
			StringBuilder num = new StringBuilder(input.toString());
			StringBuilder re = num.reverse();
			String rev = re.toString();
			if(isPal(input.add(new BigInteger(rev)))) {
				return false;
			}
			else {
				input=input.add(new BigInteger(rev));
			}
		}
		return true;
	}

}
