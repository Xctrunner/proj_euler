
public class Euler14 {
	public static void main(String args[]) {
		System.out.println(findLongCollatz(1000000));
	}
	
	public static int findLongCollatz(int limit) {
		int longest = 0;
		int termsInSeq = 0;
		for(int i = 3; i<limit; i++) {
			long temp = i;
			int counter = 1;
			while(temp>2) {
				if(temp%2==0) {
					counter++;
					temp/=2;
					//System.out.println(temp);
				}
				else {
					counter++;
					temp = temp*3 + 1;
					//System.out.println(temp);
				}
			}
			if(counter>termsInSeq) {
				termsInSeq=counter;
				longest=i;
			}
		}
		
		return longest;
	}
}
