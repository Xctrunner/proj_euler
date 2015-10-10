import java.util.*;
public class Euler23 {
	public static void main(String args[]) {
		long total = 0;
		ArrayList<Integer> abuns = genAbun(28123);
		ArrayList<Integer> sums = genASums(28123, abuns);
		for(int i=1; i<28123; i++) {
			if(!sums.contains(i))
				total+=i;
		}
		System.out.println(total);
	}
	
	static boolean isAbundant(int num) {
		int sumFact = 1;
		for(int i=2; i<(int)Math.sqrt(num)+1; i++) {
			if(num%i==0) {
				if(num/i==i)
					sumFact+=i;
				else
					sumFact+=(i+(num/i));
			}
		}
		return sumFact>num;
	}
	
	static ArrayList<Integer> genAbun(int limit) {
		ArrayList<Integer> output = new ArrayList<Integer>();
		for(int i=12; i<limit; i++) {
			if(isAbundant(i))
				output.add(i);
		}
		return output;
	}
	
	static boolean isSum(int num, ArrayList<Integer> list) {
		for(int i:list) {
			for(int j:list) {
				if(i+j==num)
					return true;
			}
		}
		return false;
	}
	
	static ArrayList<Integer> genASums(int limit, ArrayList<Integer> myL) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(int i=24; i<limit; i++) {
			if(isSum(i,myL))
				result.add(i);
		}
		return result;
	}
}
