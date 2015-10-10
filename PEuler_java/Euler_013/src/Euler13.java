import java.io.*;
import java.util.ArrayList;

public class Euler13 {
	private static BufferedReader myFile;

	public static void main(String args[]) throws IOException {
		myFile = new BufferedReader(new FileReader("C:\\Users\\Walter\\EcliseWorkspaces\\P_Euler\\Euler_013\\src\\input13"));
		String nums = "";
		ArrayList<Long> shavedNums = new ArrayList<Long>();
		while(myFile.ready()) {
			String temp = myFile.readLine();
			nums = temp.substring(0,11);
			shavedNums.add(Long.parseLong(nums));
		}
		//System.out.println(shavedNums);
		Long sum = 0L;
		for(int i=0; i<shavedNums.size(); i++) {
			sum += shavedNums.get(i);
		}
		System.out.println(sum);
		
	}
	
}
