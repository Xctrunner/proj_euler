import java.math.*;
import java.util.ArrayList;
public class Euler25 {
	public static void main(String args[]) {
		ArrayList<BigInteger> result = genFibs(10000);
		System.out.println(firstWT(result)+1);
	}
	
	static ArrayList<BigInteger> genFibs(int limit) {
		BigInteger one = new BigInteger("1");
		BigInteger two = new BigInteger("1");
		ArrayList<BigInteger> list = new ArrayList<BigInteger>();
		int counter = 0;
		while(list.size()<limit) {
			list.add(one);
			BigInteger temp = one.add(two);
			one = two;
			two = temp;
			counter++;
		}
		return list;
	}
	
	static int firstWT(ArrayList<BigInteger> list) {
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).toString().length()==1000)
				return i;
		}
		return 0;
	}
}
