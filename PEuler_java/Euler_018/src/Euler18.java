import java.io.*;

public class Euler18 {
	private static BufferedReader myFile;
	
	public static void main(String args[]) throws IOException {
		System.out.println(makeArray(15));
	}
	
	public static int[][] makeArray(int numLines) throws IOException {
		int[][] result = new int[numLines][numLines];
		myFile = new BufferedReader(new FileReader("C:\\Users\\Walter\\EcliseWorkspaces\\P_Euler\\Euler_018\\src\\input18"));
		int counterVert = 0;
		while(myFile.ready()) {
			String temp = myFile.readLine();
			
			int counterHoriz = 0;
			for(int i=0; i<temp.length(); i+=3) {
				int tem = Integer.parseInt(temp.substring(i,i+2));
				result[counterVert][counterHoriz] = tem;
				counterHoriz++;
			}
			counterVert++;
		}
		return result;
	}
}
