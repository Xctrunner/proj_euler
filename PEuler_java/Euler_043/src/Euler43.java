import java.util.ArrayList;


public class Euler43 {

	public static void main(String[] args) {
		ArrayList<String> nums=genAll();
		long sum =0;
		for(String i:nums) {
			sum+=(Long.parseLong(i));
		}
		System.out.println(sum);

	}
	
	static ArrayList<String> genAll() {
		int counter=0;
		ArrayList<String> nums = new ArrayList<String>();
		for(int a=0; a<10; a++) {
			for(int b=0; b<10; b++) {
				if(b!=a) {
				for(int c=0; c<10; c++) {
					if(c!=a&&c!=b) {
					for(int d=0; d<9; d+=2) {
						if(d!=a&&d!=b&&d!=c)
						for(int e=0; e<10; e++) {
							if((c+d+e)%3==0 && e!=a&&e!=b&&e!=c&&e!=d) {
								for(int f=0; f<6; f+=5) {
									if(f!=a&&f!=b&&f!=c&&f!=d&&f!=e)
									for(int g=0; g<10; g++) {
										if(Integer.parseInt(""+e+f+g)%7==0 && g!=a&&g!=b&&g!=c&&g!=d&&g!=e&&g!=f) {
											for(int h=0; h<10; h++) {
												if(Integer.parseInt(""+f+g+h)%11==0 && h!=a&&h!=b&&h!=c&&h!=d&&h!=e&&h!=f&&h!=g) {
													for(int i=0; i<10; i++) {
														if(Integer.parseInt(""+g+h+i)%13==0 && i!=a&&i!=b&&i!=c&&i!=d&&i!=e&&i!=f&&i!=g&&i!=h) {
															for(int j=0; j<10; j++) {
																if(Integer.parseInt(""+h+i+j)%17==0 && j!=a&&j!=b&&j!=c&&j!=d&&j!=e&&j!=f&&j!=g&&j!=h&&j!=i) {
																	String temp = ""+a+b+c+d+e+f+g+h+i+j;
																	nums.add(temp);
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
					}
				}
			}
		}
		//System.out.println(counter);
		return nums;
	}

}
