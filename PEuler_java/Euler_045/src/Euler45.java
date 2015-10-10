import java.util.*;
public class Euler45 {
	public static ArrayList<Long> genTris() {
		ArrayList<Long> tris = new ArrayList<Long>();
		for(long i=285; i<100000; i++) {
			tris.add((i*i + i)/2);
		}
		return tris;
	}
	public static ArrayList<Long> genPents() {
		ArrayList<Long> pents = new ArrayList<Long>();
		for(long i=165; i<75000; i++) {
			pents.add((3*i*i - i)/2);
		}
		return pents;
	}
	public static ArrayList<Long> genHexes() {
		ArrayList<Long> hexes = new ArrayList<Long>();
		for(long i=143; i<50000; i++) {
			hexes.add((2*i*i - i));
		}
		return hexes;
	}
	public static void main(String args[]) {
		ArrayList<Long> tris = genTris();
		ArrayList<Long> pents = genPents();
		ArrayList<Long> hexes = genHexes();
		/*for(int i=0; i<100; i++) {
			System.out.println(pents.get(i));
		} */
		for(long i:hexes) {
			if(pents.contains(i) && tris.contains(i)) {
				System.out.println(i);
			}
		}
	}
}
