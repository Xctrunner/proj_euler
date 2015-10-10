import java.math.*;
public class Euler56 {
	public static void main(String args[]) {
		int maxSum = 0;
		for(int i=100; i>50; i--) {
			for(int j=100; j>50; j--) {
				int sum = 0;
				String temp = new BigInteger(i+"").pow(j).toString();
				for(int a=0; a<temp.length(); a++) {
					sum+=Integer.parseInt(temp.substring(a,a+1));
					maxSum = Math.max(maxSum, sum);
				}
			}
		}
		System.out.println(maxSum);
	}
}
