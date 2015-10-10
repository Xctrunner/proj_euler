/*
public class Euler17 {
	public static void main(String args[]) {
		int sum = 0;
		for(int i=1; i<=1000; i++) {
			if(i==1000)
				sum+=11;
			if(i/100==9 || i/100==4 || i/100==5) {
				if(i%100==0)
					sum+=11;
				else
					sum+=14;
			}
			if(i/100==1 || i/100==2 || i/100==6) {
				if(i%100==0)
					sum+=10;
				else
					sum+=13;
			}
			if(i/100==3 || i/100==7 || i/100==8) {
				if(i%100==0)
					sum+=12;
				else
					sum+=15;
			}
			if(i%100/10==1) {
				if(i%100==10)
					sum+=3;
				if(i%100==11 || i%100==12)
					sum+=6;
				if(i%100==15 || i%100==16)
					sum+=7;
				if(i%100==13 || i%100==14 || i%100==18 || i%100==19)
					sum+=8;
				else
					sum+=9;
			}
			if(i%100/10==2 || i%100/10==3 || i%100/10==8 || i%100/10==9) {
				if(i%10==9 || i%10==4 || i%10==5)
					sum+=10;
				else if(i%10==1 || i%10==2 || i%10==6)
					sum+=9;
				else if(i%10==3 || i%10==7 || i%10==8)
					sum+=11;
				else
					sum+=6;
			}
			if(i%100/10==4 || i%100/10==5 || i%100/10==6) {
				if(i%10==9 || i%10==4 || i%10==5)
					sum+=9;
				else if(i%10==1 || i%10==2 || i%10==6)
					sum+=8;
				else if(i%10==3 || i%10==7 || i%10==8)
					sum+=10;
				else
					sum+=5;
			}
			if(i%100/10==7) {
				if(i%10==9 || i%10==4 || i%10==5)
					sum+=11;
				else if(i%10==1 || i%10==2 || i%10==6)
					sum+=10;
				else if(i%10==3 || i%10==7 || i%10==8)
					sum+=12;
				else
					sum+=7;
			}
			if(i%100/10==0) {
				if(i%10==9 || i%10==4 || i%10==5)
					sum+=4;
				else if(i%10==1 || i%10==2 || i%10==6)
					sum+=3;
				else if(i%10==3 || i%10==7 || i%10==8)
					sum+=5;
			}
		}
		System.out.println(sum);
	}
}
*/
