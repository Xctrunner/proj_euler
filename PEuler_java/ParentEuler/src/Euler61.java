import java.util.ArrayList;


public class Euler61 extends PEuler {
	public static void main(String args[]) {
		
		/*ArrayList<Integer> list = genSqs(10000);
		for(int i=0; i<list.size(); i++) {
			if(list.get(i)<1000) {
				list.remove(i);
				i--;
			}
		}
		for(int j:list) {
			System.out.println(j);
		} 
		System.out.println(list.size());*/
		ArrayList<Integer> octsAL = genOcts(10000);
		int[] octs = new int[40];
		int count =0;
		for(int i=0; i<octsAL.size(); i++) {
			if(octsAL.get(i)>=1000) {
				octs[count] = octsAL.get(i);
				count++;
			}
		}
		count = 0;
		
		ArrayList<Integer> hepsAL = genHeps(10000);
		int[] heps = new int[43];
		for(int i=0; i<hepsAL.size(); i++) {
			if(hepsAL.get(i)>=1000) {
				heps[count] = hepsAL.get(i);
				count++;
			}
		}
		count = 0;
		
		ArrayList<Integer> hexesAL = genHexes(10000);
		int[] hexes = new int[48];
		for(int i=0; i<hexesAL.size(); i++) {
			if(hexesAL.get(i)>=1000) {
				hexes[count] = hexesAL.get(i);
				count++;
			}
		}
		count = 0;
		
		ArrayList<Integer> pentsAL = genPents(10000);
		int[] pents = new int[56];
		for(int i=0; i<pentsAL.size(); i++) {
			if(pentsAL.get(i)>=1000) {
				pents[count] = pentsAL.get(i);
				count++;
			}
		}
		count=0;
		
		ArrayList<Integer> sqsAL = genSqs(10000);
		int[] sqs = new int[69];
		for(int i=0; i<sqsAL.size(); i++) {
			if(sqsAL.get(i)>=1000) {
				sqs[count] = sqsAL.get(i);
				count++;
			}
		}
		count=0;
		
		ArrayList<Integer> trisAL = genTris(10000);
		int[] tris = new int[96];
		for(int i=0; i<trisAL.size(); i++) {
			if(trisAL.get(i)>=1000) {
				tris[count] = trisAL.get(i);
				count++;
			}
		}
		
		for(int a:octs) {
			for(int f:heps) {
				for(int b:hexes) {
					for(int c:pents) {
						for(int e:sqs) {
							for(int d:tris) {
								if(a%100 == b/100 && b%100 == c/100 && c%100 == d/100 && d%100 == e/100 && e%100 == f/100 && f%100 == a/100) {
									System.out.println(a+","+b+","+c+","+d+","+e+","+f);
								}
							}
						}
					}
				}
			}
		}
		
	}	
}
