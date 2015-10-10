
public class Euler35 {
	public static void main(String args[]) {
		int count = 13;
		
		int tempCount=0;
		for(int i=101; i<1000; i+=2) {
			if(isPrime(i)) {
				String first = i+"";
				String second = first.substring(1)+first.substring(0,1);
				if(isPrime(Integer.parseInt(second))) {
					String third = second.substring(1)+second.substring(0,1);
					if(isPrime(Integer.parseInt(third))) {
						tempCount++;
					}
				}
			}
		}
		count+=tempCount;
		System.out.println(count);
		
		tempCount=0;
		for(int i=1001; i<10000; i+=2) {
			if(isPrime(i)) {
				String first = i+"";
				String second = first.substring(1)+first.substring(0,1);
				if(isPrime(Integer.parseInt(second))) {
					String third = second.substring(1)+second.substring(0,1);
					if(isPrime(Integer.parseInt(third))) {
						String fourth = third.substring(1)+third.substring(0,1);
						if(isPrime(Integer.parseInt(fourth))) {	
							tempCount++;
						}
					}
				}
			}
		}
		count+=tempCount;
		System.out.println(count);
		
		tempCount=0;
		for(int i=10001; i<100000; i+=2) {
			if(isPrime(i)) {
				String first = i+"";
				String second = first.substring(1)+first.substring(0,1);
				if(isPrime(Integer.parseInt(second))) {
					String third = second.substring(1)+second.substring(0,1);
					if(isPrime(Integer.parseInt(third))) {
						String fourth = third.substring(1)+third.substring(0,1);
						if(isPrime(Integer.parseInt(fourth))) {
							String fifth = fourth.substring(1)+fourth.substring(0,1);
							if(isPrime(Integer.parseInt(fifth)))
								tempCount++;
						}
					}
				}
			}
		}
		count+=tempCount;
		System.out.println(count);
		
		tempCount=0;
		for(int i=100001; i<1000000; i+=2) {
			if(isPrime(i)) {
				String first = i+"";
				String second = first.substring(1)+first.substring(0,1);
				if(isPrime(Integer.parseInt(second))) {
					String third = second.substring(1)+second.substring(0,1);
					if(isPrime(Integer.parseInt(third))) {
						String fourth = third.substring(1)+third.substring(0,1);
						if(isPrime(Integer.parseInt(fourth))) {
							String fifth = fourth.substring(1)+fourth.substring(0,1);
							if(isPrime(Integer.parseInt(fifth))) {
								String sixth = fifth.substring(1)+fifth.substring(0,1);
								if(isPrime(Integer.parseInt(sixth)))
									tempCount++;
							}
								
						}
					}
				}
			}
		}
		count+=tempCount;
		System.out.println(count);
	}
	
	
	
	public static boolean isPrime(int bound) {
		if(bound<0)
			return false;
		for(int i=3; i<Math.sqrt(bound)+1; i+=2) {
			if(bound%2==0)
				return false;
			if(bound%i==0)
				return false;
		}
		if(bound==4)
			return false;
		return true;
	}
}
