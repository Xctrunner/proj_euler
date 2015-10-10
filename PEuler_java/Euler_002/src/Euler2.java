
public class Euler2 {
	public static void main(String args[]) {
		int n1=1;
		int n2=2;
		int fib=0;
		int evenFibSum = 2;
		for(int i=2; i<10000000; i++) {
			if(fib>=4000000)
				break;
			fib=n1+n2;
			if(fib%2==0)
				evenFibSum+=fib;
			n1=n2;
			n2=fib;
		}
		System.out.print(evenFibSum);
	}
}
