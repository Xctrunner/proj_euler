import java.util.ArrayList;


public class MoarStuff {
	public static void main(String args[]) {
		//System.out.println(findTris(20));
		System.out.println("ELIZABETH".compareTo("BARBARA"));
	}
	
	public static ArrayList<Integer> findTris(int limit) {
		ArrayList<Integer> triNums = new ArrayList<Integer>();
		int temp = 0;
		for(int i=1; i<limit; i++) {
			temp += i;
			triNums.add(temp);
		}
		return triNums;
	}
	
	public static int getTriWithXDivisors(ArrayList<Integer> thisArray, int x) {
		int counter = 0;
		int numDivisors = 0;
		while(numDivisors<x) {
			for(int i=0; i<thisArray.size(); i++) {
				for(int j=1; j<=thisArray.get(i); j++) {
					if(thisArray.get(i)%j==0) {
						numDivisors++;
					}
				}
				counter++;
			}
		}
		return thisArray.get(counter-1);
	}
	
	public static int numDivisors(int n) {
		int counter = 0;
		for(int i=1; i<=n; i++) {
			if(n%i==0)
				counter++;
		}
		return counter;
	}
	
	
}
