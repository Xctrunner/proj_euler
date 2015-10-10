
public class Euler36 {
	static boolean isPal(String input) {
		if(input.length()%2==0) {
			StringBuilder str = new StringBuilder(input.substring(input.length()/2));
			if(input.substring(0,input.length()/2).equals(str.reverse().toString()))
				return true;
		}
		if(input.length()%2==1) {
			StringBuilder str = new StringBuilder(input.substring(input.length()/2+1));
			if(input.substring(0,input.length()/2).equals(str.reverse().toString()))
				return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		int sum=0;
		for(int i=1; i<1000000; i++) {
			String bin = Integer.toBinaryString(i);
			if(isPal(i+"") && isPal(bin))
				sum+=i;
		}
		System.out.println(sum);
	}
}
