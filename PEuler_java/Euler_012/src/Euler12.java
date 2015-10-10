import java.util.ArrayList;


public class Euler12 {
	public static void main(String args[]) {
		System.out.println(numWithXDivisors(findTris(),500));
	}
	
	public static ArrayList<Integer> findTris() {
		ArrayList<Integer> triNums = new ArrayList<Integer>();
		int temp = 0;
		for(int i=1; i<20000; i++) {
			temp += i;
			triNums.add(temp);
		}
		return triNums;
	}
	
	public static int numWithXDivisors(ArrayList<Integer> thisArray, int limit) {
		for(int i=0; i<thisArray.size(); i++) {
			if(numDivisors(thisArray.get(i))>limit)
				return thisArray.get(i);
		}
		return 0;
	}
	
	public static int numDivisors(int n) {
		int counter = 0;
		for(int i=1; i<=Math.sqrt(n); i++) {
			if(i==Math.sqrt(n))
				counter++;
			else if(n%i==0)
				counter+=2;
		}
		return counter;
	}
}
