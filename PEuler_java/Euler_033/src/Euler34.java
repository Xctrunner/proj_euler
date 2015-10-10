
public class Euler34 {
	public static void main(String args[]) {
		for(int a=1; a<10; a++) {
			for(int b=0; b<10; b++) {
				for(int c=0; c<10; c++) {
					for(int d=0; d<10; d++) {
						for(int e=0; e<10; e++) {
							if(factorial(a)+factorial(b)+factorial(c)+factorial(d)+factorial(e)==Integer.parseInt(""+a+b+c+d+e))
								System.out.println(Integer.parseInt(""+a+b+c+d+e));
						}
					}
				}
			}
		}
	}
	static int factorial(int i) {
		if(i==1)
			return 1;
		if(i==2)
			return 2;
		if(i==3)
			return 6;
		if(i==4)
			return 24;
		if(i==5)
			return 120;
		if(i==6)
			return 720;
		if(i==7)
			return 5040;
		if(i==8)
			return 40320;
		if(i==9)
			return 362880;
		return 1;
		
	}
}
