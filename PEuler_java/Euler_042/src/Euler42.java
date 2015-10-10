import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;


public class Euler42 {
	public static void main(String[] args) throws IOException {
		BufferedReader wordsText = new BufferedReader(new FileReader("C:\\Users\\Walter\\Desktop\\words.txt"));
		String[] Ar = split(wordsText);
		ArrayList<Integer> tris = genTris(250);
		int count=0;
		for(String i:Ar) {
			if(tris.contains(value(i)))
				count++;
		}
		System.out.println(count);
	}
	
	public static ArrayList<Integer> genTris(int limit) {
		int n=1;
		ArrayList<Integer> tris = new ArrayList<Integer>();
		while(n<limit) {
			tris.add(n*(n+1)/2);
			n++;
		}
		return tris;
	}
	
	public static int value(String input) {
		int sum=0;
		String[] alph = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
		for(int i=0; i<input.length(); i++) {
			for(int j=0; j<alph.length; j++) {
				if(input.substring(i,i+1).equals(alph[j]))
					sum+=j+1;
			}
		}
		return sum;
			
	}
	
	public static String textToString(BufferedReader file) throws IOException {
		String result = "";
		while(file.ready()) {
			result += file.readLine();
		}
		return result;
	}
	
	public static String[] split(BufferedReader file) throws IOException {
		String str = textToString(file);
		str=str.substring(1,str.length()-1);
		String[] strAr = str.split("\",\"");
		return strAr;
	}
}
