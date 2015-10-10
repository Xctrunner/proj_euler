
public class Euler9 {
	public static void main(String args[]) {
		
		for(int a=1; a<998; a++) {
			for(int b=1; b<a; b++) {
				for(int c=1; c<a; c++) {
					if(b*b+c*c==a*a) {
						if(a+b+c==1000)
							System.out.println(a*b*c);
					}
				}
			}
		}
	}
}
