import java.util.*;
public class Euler33 {
	static ArrayList<String> listFracs() {
		ArrayList<String> list = new ArrayList<String>();
		for(int b=12; b<100; b++) {
			for(int a=11; a<b; a++) {
				if((a%10!=0 || b%10!=0) && (a%11!=0 || b%11!=0)) {
					list.add(a+","+b);
				}
			}
		}
		return list;
	}
	static boolean fracCancels(String input) {
		if(input.charAt(0)==input.charAt(3))
			return Double.parseDouble(input.substring(0,2)) / Double.parseDouble(input.substring(3,5))==
					Double.parseDouble(input.substring(1,2)) / Double.parseDouble(input.substring(4,5));
		if(input.charAt(0)==input.charAt(4))
			return Double.parseDouble(input.substring(0,2)) / Double.parseDouble(input.substring(3,5))==
					Double.parseDouble(input.substring(1,2)) / Double.parseDouble(input.substring(3,4));
		if(input.charAt(1)==input.charAt(3)) {
			return Double.parseDouble(input.substring(0,2)) / Double.parseDouble(input.substring(3,5))==
					Double.parseDouble(input.substring(0,1)) / Double.parseDouble(input.substring(4,5));
		}
		if(input.charAt(1)==input.charAt(4))
			return Double.parseDouble(input.substring(0,2)) / Double.parseDouble(input.substring(3,5))==
					Double.parseDouble(input.substring(0,1)) / Double.parseDouble(input.substring(3,4));
		return false;
	}
	public static void main(String args[]) {
		ArrayList<String> list = listFracs();
		for(String i:list) {
			if(fracCancels(i))
				System.out.println(i);
		}
		//System.out.println(fracCancels("49,98"));
	}
}
