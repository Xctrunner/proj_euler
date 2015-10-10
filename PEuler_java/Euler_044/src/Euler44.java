import java.util.*;
public class Euler44 {
	static ArrayList<Integer> genPents() {
		ArrayList<Integer> pents = new ArrayList<Integer>();
		//int[] pents = new int[1000];
		for(int i=1000; i<=10000; i++) {
			pents.add(i*(3*i-1)/2);
		}
		return pents;
	}
	
	/*static boolean sumDifPent(int a, int b) {
		ArrayList<Integer> pents2 = genPents();
		//int[] pents2 = genPents();
		return pents2.contains(a+b) && pents2.contains(Math.abs(a-b)); //&& pents2.contains(Math.abs(a-b));
	} */
	
	public static void main(String[] args) {
		ArrayList<Integer> pents = genPents();
		for(int a=0; a<pents.size()-1; a++) {
			for(int b=a+1; b>a && b<pents.size(); b++) {
				if(pents.contains(pents.get(a)+pents.get(b)) && pents.contains(pents.get(b)-pents.get(a))) {
					System.out.println(pents.get(a)+","+pents.get(b));
					System.out.println(Math.abs(pents.get(a)-pents.get(b)));
				}
			}
		} 
	}
}
