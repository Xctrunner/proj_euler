
public class Euler52 extends PEuler {
	public static void main(String args[]) {
		for(int i=1; i<166666; i++) {
			if(hasDigits(i,2*i)&&hasDigits(i,3*i)&&hasDigits(i,4*i)&&hasDigits(i,5*i)&&hasDigits(i,6*i))
				System.out.println(i);
		}
	}
	
}
