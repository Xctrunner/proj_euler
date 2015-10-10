
public class Euler39 {

	public static void main(String[] args) {
		int[] allNums = new int[1000];
		for(int a=1; a<998; a++) {
			for(int b=1; b<a; b++) {
				for(int c=1; c<a; c++) {
					if(b*b+c*c==a*a && a+b+c<1000) {
						allNums[a+b+c]+=1;
					}
				}
			}
		}
		for(int i=0; i<allNums.length; i++) {
			if(allNums[i]>15)
				System.out.println(i);
		}

	}

}
