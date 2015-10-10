
public class Euler40 {
	public static void main(String[] args) {
		String str ="1";
		for(int i=2; i<100001; i++)
			str+=i;
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(9));
		System.out.println(str.charAt(99));
		System.out.println(str.charAt(999));
		System.out.println(str.charAt(9999));
		System.out.println(str.charAt(99999));
		System.out.println(str.charAt(999999));
	}
}
