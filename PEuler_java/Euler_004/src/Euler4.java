
public class Euler4 {
	
	public static void main(String args[]) {
		int maxPal = 0;
		for(int i=100; i<1000; i++) {
			for(int j=100; j<1000; j++) {
				int temp = i*j;
				if(isPal(toStr(temp)))
					maxPal = Math.max(maxPal, temp);
			}
		}
		System.out.println(maxPal);
	}
	
	public static boolean isPal(String pal) {
		if(pal.length()<=1)
			return true;
		if(pal.charAt(0)==pal.charAt(pal.length()-1)) {
			return isPal(pal.substring(1,pal.length()-1));	
		}
		return false;
	}
	
	public static String toStr(int num) {
		String result = num + "";
		return result;
	}

}
