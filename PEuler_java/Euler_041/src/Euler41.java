
public class Euler41 {

	public static void main(String[] args) {
		System.out.println(isPrime(7652413));
		String nums[] = genAll();
		for(String i:nums) {
			if(i==null)
				break;
			if(isPrime(Integer.parseInt(i)))
				System.out.println(i);
		}
		
	}
	static String[] genAll() {
		int counter=0;
		String[] nums = new String[362880];
		for(int a=1; a<8; a++) {
			for(int b=1; b<8; b++) {
				for(int c=1; c<8; c++) {
					for(int d=1; d<8; d++) {
						for(int e=1; e<8; e++) {
							for(int f=1; f<8; f++) {
								for(int g=1; g<8; g++) {
											String temp = ""+a;
											if(temp.indexOf(""+b)==-1) {
												temp+=b;
												if(temp.indexOf(""+c)==-1) {
													temp+=c;
													if(temp.indexOf(""+d)==-1) {
														temp+=d;
														if(temp.indexOf(""+e)==-1) {
															temp+=e;
															if(temp.indexOf(""+f)==-1) {
																temp+=f;
																if(temp.indexOf(""+g)==-1) {
																	temp+=g;
																	nums[counter] = temp;
																	counter++;
																}
															}
														}
													}
												}
											}
								}
							}
						}
					}
				}
			}
		}
		return nums;
	}
	static boolean isPrime(int a) {
		if(a==1)
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

}
