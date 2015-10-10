import java.io.*;
import java.util.ArrayList;
public class Euler22 {
	public static void main(String args[]) throws IOException {
		BufferedReader namesText = new BufferedReader(new FileReader("C:\\Users\\Walter\\Desktop\\names.txt"));
		//ArrayList<String> names = sortArray(namesText);
		long total = calcTotal(namesText);
		System.out.println(total);
	}
	
	public static String textToString(BufferedReader file) throws IOException {
		String result = "";
		while(file.ready()) {
			result += file.readLine();
		}
		return result;
	}
	
	public static ArrayList<String> stringToArray(BufferedReader file) throws IOException {
		String str = textToString(file);
		boolean inName = true;
		ArrayList<String> strAr = new ArrayList<String>();
		int indexCounter = 0;
		String temp = "";
		for(int i=1; i<str.length(); i++) {
			if(i==str.length()-1) {
				strAr.add(temp);
				break;
			}
			if(str.charAt(i)=='"' && inName) {
				inName=false;
				strAr.add(temp);
				indexCounter++;
				i++;
				//System.out.println("j");
			}
			if(str.charAt(i)=='"' && !inName) {
				inName=true;
				temp = "";
				i++;
				//System.out.println("p");
			}
			if(inName) {
				//System.out.println(str.substring(i,i+1));
				temp+=str.substring(i,i+1);
			}
		}
		//System.out.println(indexCounter);
		return strAr;
	}
	
	public static ArrayList<String> sortArray(BufferedReader file) throws IOException {
		ArrayList<String> input = stringToArray(file);
		for(int i=1; i<input.size(); i++) {
			for(int j=0; j<i; j++) {
				if(input.get(i).compareTo(input.get(j))<0) {
					String temp = input.remove(i);
					input.add(j,temp);
				}
			}
		}
		return input;
	}
	
	public static int addNameUp(String name) {
		char[] alph = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		int result = 0;
		for(int i=0; i<name.length(); i++) {
			for(int j=0; j<26; j++) {
				if(name.charAt(i)==alph[j]) {
					result+=j+1;
				}
			}
		}
		return result;
	}
	
	public static long calcTotal(BufferedReader file) throws IOException {
		ArrayList<String> input = sortArray(file);
		long total = 0;
		for(int i=0; i<input.size(); i++) {
			total += addNameUp(input.get(i))*(i+1);
		}
		return total;
	}
}