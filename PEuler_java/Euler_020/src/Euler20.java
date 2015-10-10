

public class Euler20 {
	public static void main(String args[]) {
		String factorial = "933262154439441526816992388562667004907"
				+ "15968264381621468592963895217599993229915608941"
				+ "4639761565182862536979208272237582511852109168640"
				+ "00000000000000000000000";
		int sum =0;
		for(int i=0; i<factorial.length(); i++) {
			sum+= Integer.parseInt(factorial.substring(i,i+1));
		}
		System.out.println(sum);
	}
}
