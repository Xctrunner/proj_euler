import java.math.*;
public class Euler57 {
	public static void main(String args[]) {
		BigInteger top = new BigInteger("1");
		BigInteger bot = new BigInteger("1");
		int sum=0;
		for(int i=0; i<1000; i++) {
			BigInteger tempTop = top.add(bot.multiply(new BigInteger("2")));
			BigInteger tempBot = bot.add(top);
			top=tempTop;
			bot=tempBot;
			if((top.toString()).length()>(bot.toString()).length()) {
				sum++;
			}
		}
		System.out.println(sum);
	}
}
