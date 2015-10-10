import java.util.*;

public class Euler28 {
	public static void main(String args[]) {
		ArrayList<Integer> listSpirals = genSpiralNums();
		long sum=0;
		for(int i:listSpirals) {
			sum+=i;
		}
		System.out.println(sum);
	}
	
	static ArrayList<Integer> genSpiralNums() {
		ArrayList<Integer> spirals = new ArrayList<Integer>();
		spirals.add(1);
		
		int sideLength=2;
		int current=1;
		while(sideLength<1002) {
			for(int j=0; j<4; j++) {
				current+=sideLength;
				spirals.add(current);
			}
			sideLength+=2;
		}
		return spirals;
	}
}
