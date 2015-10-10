
public class Euler49 {
	static boolean isPrime(int a) {
		if(a<2)
			return false;
		if(a==2)
			return true;
		if(a%2==0)
			return false;
		for(int i=3; i<(int)Math.sqrt(a)+1; i+=2) {
			if(a%i==0) {
				//System.out.println(i);
				return false;
			}
		}
		return true;
	}
	
	static boolean arePerms(int i, int j, int k) {
		String a=""+i;
		String b=""+j;
		String c=""+k;
		for(int z=0; z<4; z++) {
			if((!a.contains(b.substring(z,z+1)) || !a.contains(c.substring(z,z+1))) ||
					(!b.contains(a.substring(z,z+1)) || !b.contains(c.substring(z,z+1))))
				return false;
		}
		return true;
	}
	
	public static void main(String args[]) {
		for(int i=1001; i<9999; i++) {
			for(int j=i+1; j<10000; j++ ) {
				if(isPrime(i)&&isPrime(j)&&isPrime(j+j-i)&&(j+j-i)<10000) {
					if(arePerms(i, j, j+j-i))
						System.out.println(i+" "+j+" "+(j+j-i));
				}
			}
		}
	}
}
