import java.io.*;
import java.util.ArrayList;
public class Euler54 {
	public static void main(String args[]) throws IOException {
		BufferedReader file = new BufferedReader(new FileReader("C:\\Users\\Walter\\Desktop\\poker.txt"));
		System.out.println(isGreater("8C TS KC 9H 4S", "7D 2S 5D 3S AC"));
		System.out.println(sort("8C TS KC 9H 4S"));
		//1,0
		int sum = 0;
		String[] hands = makeHands(file);
		for(String i:hands) {
			if(isGreater((i.substring(0,14)), (i.substring(15,29))))
				sum++;
		}
		System.out.println(sum);
	}
	
	static String[] makeHands(BufferedReader file) throws IOException {
		String[] hands = new String[1000];
		while(file.ready()) {
			for(int i=0; i<1000; i++) {
				hands[i] = file.readLine();
			}
		}
		return hands;
	}
	
	static boolean isGreater(String one, String two) {
		String handOne = sort(one).trim();
		String handTwo = sort(two).trim();
		if(valueHand(handOne)>valueHand(handTwo)) {
			return true;
		}
		if(valueHand(handOne)==valueHand(handTwo)) {
			//System.out.println(handOne + handTwo);
			if(valueHand(handOne)==8) {
				return valCard(handOne.substring(12,14)) > valCard(handTwo.substring(12,14));
			}
			if(valueHand(handOne)==7) {
				return valCard(handOne.substring(6,8)) > valCard(handTwo.substring(6,8));
			}
			if(valueHand(handOne)==6) {
				return valCard(handOne.substring(6,8)) > valCard(handTwo.substring(6,8));
			}
			if(valueHand(handOne)==5) {
				return valCard(handOne.substring(12,14)) > valCard(handTwo.substring(12,14));
			}
			if(valueHand(handOne)==4) {
				return valCard(handOne.substring(12,14)) > valCard(handTwo.substring(12,14));
			}
			if(valueHand(handOne)==3) {
				return valCard(handOne.substring(6,8)) > valCard(handTwo.substring(6,8));
			}
			if(valueHand(handOne)==2) {
				if(valCard(handOne.substring(9,11))==valCard(handTwo.substring(9,11))) {
					if(valCard(handOne.substring(3,5))==valCard(handTwo.substring(3,5))) {
						System.out.println(handOne+" "+handTwo);
						return valCard(handOne.substring(0,2)) > valCard(handOne.substring(0,2));
					}
					return valCard(handOne.substring(6,8)) > valCard(handOne.substring(6,8));
				}
				return valCard(handOne.substring(9,11)) > valCard(handTwo.substring(9,11));
			}
			if(valueHand(handOne)==1) {
				if(valCard(handOne.substring(0,2))==valCard(handOne.substring(3,5))) {
					
					if(valCard(handTwo.substring(0,2))==valCard(handTwo.substring(3,5))) {
						if(valCard(handOne.substring(0,2))==valCard(handTwo.substring(0,2))) {
							//System.out.println(handOne+" "+handTwo);
							return valCard(handOne.substring(12,14)) > valCard(handTwo.substring(12,14));
						}
						return valCard(handOne.substring(0,2)) > valCard(handTwo.substring(0,2)); }
					
					if(valCard(handTwo.substring(3,5))==valCard(handTwo.substring(6,8))) {
						if(valCard(handOne.substring(0,2))==valCard(handTwo.substring(3,5))) {
							//System.out.println(handOne+" "+handTwo);
							return valCard(handOne.substring(12,14)) > valCard(handTwo.substring(12,14));
						}
						return valCard(handOne.substring(0,2)) > valCard(handTwo.substring(3,5)); }
					
					if(valCard(handTwo.substring(6,8))==valCard(handTwo.substring(9,11))) {
						if(valCard(handOne.substring(0,2))==valCard(handTwo.substring(6,8))) {
							//System.out.println(handOne+" "+handTwo);
							return valCard(handOne.substring(12,14)) > valCard(handTwo.substring(12,14));
						}
						return valCard(handOne.substring(0,2)) > valCard(handTwo.substring(6,8)); }
					
					if(valCard(handTwo.substring(9,11))==valCard(handTwo.substring(12,14))) {
						if(valCard(handOne.substring(0,2))==valCard(handTwo.substring(9,11))) {
							//System.out.println(handOne+" "+handTwo);
							return valCard(handOne.substring(12,14)) > valCard(handTwo.substring(6,8));
						}
						return valCard(handOne.substring(0,2)) > valCard(handTwo.substring(9,11)); }
				}
				if(valCard(handOne.substring(3,5))==valCard(handOne.substring(6,8))) {
					
					if(valCard(handTwo.substring(0,2))==valCard(handTwo.substring(3,5))) {
						if(valCard(handOne.substring(3,5))==valCard(handTwo.substring(0,2))) {
							//System.out.println(handOne+" "+handTwo);
							return valCard(handOne.substring(12,14)) > valCard(handTwo.substring(12,14));
						}
						return valCard(handOne.substring(3,5)) > valCard(handTwo.substring(0,2)); }
					
					if(valCard(handTwo.substring(3,5))==valCard(handTwo.substring(6,8))) {
						if(valCard(handOne.substring(3,5))==valCard(handTwo.substring(3,5))) {
							//System.out.println(handOne+" "+handTwo);
							return valCard(handOne.substring(12,14)) > valCard(handTwo.substring(12,14));
						}
						return valCard(handOne.substring(3,5)) > valCard(handTwo.substring(3,5)); }
					
					if(valCard(handTwo.substring(6,8))==valCard(handTwo.substring(9,11))) {
						if(valCard(handOne.substring(3,5))==valCard(handTwo.substring(6,8))) {
							//System.out.println(handOne+" "+handTwo);
							return valCard(handOne.substring(12,14)) > valCard(handTwo.substring(12,14));
						}
						return valCard(handOne.substring(3,5)) > valCard(handTwo.substring(6,8)); }
					
					if(valCard(handTwo.substring(9,11))==valCard(handTwo.substring(12,14))) {
						if(valCard(handOne.substring(3,5))==valCard(handTwo.substring(9,11))) {
							//System.out.println(handOne+" "+handTwo);
							return valCard(handOne.substring(12,14)) > valCard(handTwo.substring(6,8));
						}
						return valCard(handOne.substring(3,5)) > valCard(handTwo.substring(9,11)); }
				}
				if(valCard(handOne.substring(6,8))==valCard(handOne.substring(9,11))) {
					
					if(valCard(handTwo.substring(0,2))==valCard(handTwo.substring(3,5))) {
						if(valCard(handOne.substring(6,8))==valCard(handTwo.substring(0,2))) {
							//System.out.println(handOne+" "+handTwo);
							return valCard(handOne.substring(12,14)) > valCard(handTwo.substring(12,14));
						}
						return valCard(handOne.substring(6,8)) > valCard(handTwo.substring(0,2)); }
					
					if(valCard(handTwo.substring(3,5))==valCard(handTwo.substring(6,8))) {
						if(valCard(handOne.substring(6,8))==valCard(handTwo.substring(3,5))) {
							//System.out.println(handOne+" "+handTwo);
							return valCard(handOne.substring(12,14)) > valCard(handTwo.substring(12,14));
						}
						return valCard(handOne.substring(6,8)) > valCard(handTwo.substring(3,5)); }
					
					if(valCard(handTwo.substring(6,8))==valCard(handTwo.substring(9,11))) {
						if(valCard(handOne.substring(6,8))==valCard(handTwo.substring(6,8))) {
							//System.out.println(handOne+" "+handTwo);
							return valCard(handOne.substring(12,14)) > valCard(handTwo.substring(12,14));
						}
						return valCard(handOne.substring(6,8)) > valCard(handTwo.substring(6,8)); }
					
					if(valCard(handTwo.substring(9,11))==valCard(handTwo.substring(12,14))) {
						if(valCard(handOne.substring(6,8))==valCard(handTwo.substring(9,11))) {
							//System.out.println(handOne+" "+handTwo);
							return valCard(handOne.substring(12,14)) > valCard(handTwo.substring(6,8));
						}
						return valCard(handOne.substring(6,8)) > valCard(handTwo.substring(9,11)); }
				}
				if(valCard(handOne.substring(9,11))==valCard(handOne.substring(12,14))) {
					
					if(valCard(handTwo.substring(0,2))==valCard(handTwo.substring(3,5))) {
						if(valCard(handOne.substring(9,11))==valCard(handTwo.substring(0,2))) {
							//System.out.println(handOne+" "+handTwo);
							return valCard(handOne.substring(6,8)) > valCard(handTwo.substring(12,14));
						}
						return valCard(handOne.substring(9,11)) > valCard(handTwo.substring(0,2)); }
					
					if(valCard(handTwo.substring(3,5))==valCard(handTwo.substring(6,8))) {
						if(valCard(handOne.substring(9,11))==valCard(handTwo.substring(3,5))) {
							//System.out.println(handOne+" "+handTwo);
							return valCard(handOne.substring(6,8)) > valCard(handTwo.substring(12,14));
						}
						return valCard(handOne.substring(9,11)) > valCard(handTwo.substring(3,5)); }
					
					if(valCard(handTwo.substring(6,8))==valCard(handTwo.substring(9,11))) {
						if(valCard(handOne.substring(9,11))==valCard(handTwo.substring(6,8))) {
							//System.out.println(handOne+" "+handTwo);
							return valCard(handOne.substring(6,8)) > valCard(handTwo.substring(12,14));
						}
						return valCard(handOne.substring(9,11)) > valCard(handTwo.substring(6,8)); }
					
					if(valCard(handTwo.substring(9,11))==valCard(handTwo.substring(12,14))) {
						if(valCard(handOne.substring(9,11))==valCard(handTwo.substring(9,11))) {
							//System.out.println(handOne+" "+handTwo);
							return valCard(handOne.substring(6,8)) > valCard(handTwo.substring(6,8));
						}
						return valCard(handOne.substring(9,11)) > valCard(handTwo.substring(9,11)); }
				}
			}
			if(valueHand(handOne)==0) {
				for(int i=12; i>=0; i-=3) {
					if(valCard(handOne.substring(12,14))>valCard(handTwo.substring(12,14))) {
						return true;
					}
				}
			}
		}
		return false;
	}
	
	static int valueHand(String str) {
		String hand = sort(str);
		if(isFlush(str) && isStraight(str) && str.contains("A")) {
			return 9;
		}
		else if(isFlush(str) && isStraight(str)) {
			return 8;
		}
		else if(hand.charAt(0)==hand.charAt(3) && hand.charAt(0)==hand.charAt(6) && hand.charAt(0)==hand.charAt(9) || hand.charAt(3)==hand.charAt(6) && hand.charAt(3)==hand.charAt(9) && hand.charAt(3)==hand.charAt(12)) {
			return 7;
		}
		else if(hand.charAt(0)==hand.charAt(3) && hand.charAt(6)==hand.charAt(9) && hand.charAt(6)==hand.charAt(12) || hand.charAt(0)==hand.charAt(3) && hand.charAt(0)==hand.charAt(6) && hand.charAt(9)==hand.charAt(12)) {
			return 6;
		}
		else if(isFlush(str)) {
			return 5;
		}
		else if(isStraight(str)) {
			return 4;
		}
		else if(hand.charAt(0)==hand.charAt(3) && hand.charAt(0)==hand.charAt(6) || hand.charAt(3)==hand.charAt(6) && hand.charAt(3)==hand.charAt(9) || hand.charAt(6)==hand.charAt(9) && hand.charAt(6)==hand.charAt(12)) {
			return 3;
		}
		else if(hand.charAt(0)==hand.charAt(3) && hand.charAt(6)==hand.charAt(9) || hand.charAt(0)==hand.charAt(3) && hand.charAt(9)==hand.charAt(12) || hand.charAt(3)==hand.charAt(6) && hand.charAt(9)==hand.charAt(12)) {
			return 2;
		}
		else if(hand.charAt(0)==hand.charAt(3) || hand.charAt(3)==hand.charAt(6)  || hand.charAt(9)==hand.charAt(6) || hand.charAt(9)==hand.charAt(12)) {
			return 1;
		}
		return 0;
	}
	static boolean isFlush(String str) {
		for(int a=0; a<str.length(); a++) {
			if(str.charAt(1)==str.charAt(4) && str.charAt(1)==str.charAt(7) && str.charAt(1)==str.charAt(10) && str.charAt(1)==str.charAt(13)) {
				return true;
			}
		}
		return false;
	}
	
	static boolean isStraight(String str) {
		String hand = sort(str);
		int lowestVal = valCard(hand.substring(0,2));
		for(int a=0; a<str.length(); a+=3) {
			if(valCard(hand.substring(a,a+2))!=lowestVal+a/3) {
				return false;
			}
		}
		return true;
	}
	
	static String sort(String str) {
		String[] strAr = str.split(" ");
		ArrayList<String> hand = new ArrayList<String>();
		for(String c:strAr) {
			hand.add(c);
		}
		for(int i=1; i<5; i++) {
			for(int j=0; j<i; j++) {
				if(valCard(hand.get(i))<valCard(hand.get(j))) {
					String temp = hand.get(i);
					hand.remove(i);
					hand.add(j, temp);
				}
			}
		}
		String handRes = "";
		for(String card:hand) {
			handRes+=card+" ";
		}
		return handRes;
	}
	
	static int valCard(String card) {
		if(card.startsWith("T"))
			return 10;
		if(card.startsWith("J"))
			return 11;
		if(card.startsWith("Q"))
			return 12;
		if(card.startsWith("K"))
			return 13;
		if(card.startsWith("A"))
			return 14;
		return Integer.parseInt(card.substring(0,1));
	}
}