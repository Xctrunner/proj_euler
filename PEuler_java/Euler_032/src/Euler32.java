import java.util.*;
public class Euler32 {
	static String[] genAll() {
		int counter=0;
		String[] nums = new String[362880];
		for(int a=1; a<10; a++) {
			for(int b=1; b<10; b++) {
				for(int c=1; c<10; c++) {
					for(int d=1; d<10; d++) {
						for(int e=1; e<10; e++) {
							for(int f=1; f<10; f++) {
								for(int g=1; g<10; g++) {
									for(int h=1; h<10; h++) {
										for(int i=1; i<10; i++) {
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
																	if(temp.indexOf(""+h)==-1) {
																		temp+=h;
																		if(temp.indexOf(""+i)==-1) {
																			temp+=i;
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
					}
				}
			}
		}
		return nums;
	}
	static ArrayList<Integer> panProds() {
		String[] strAr = genAll();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(String i:strAr) {
			if(Integer.parseInt(i.substring(0,2)) * Integer.parseInt(i.substring(2,5)) == Integer.parseInt(i.substring(5)) && !list.contains(Integer.parseInt(i.substring(5))))
				list.add(Integer.parseInt(i.substring(5)));
			if(Integer.parseInt(i.substring(0,1)) * Integer.parseInt(i.substring(1,5)) == Integer.parseInt(i.substring(5)) && !list.contains(Integer.parseInt(i.substring(5))))
				list.add(Integer.parseInt(i.substring(5)));
		}
		return list;
	}
	public static void main(String args[]) {
		ArrayList<Integer> list = panProds();
		int sum = 0;
		for(int i:list)
			sum+=i;
		System.out.println(sum);
	}
}
