package random;

import java.util.Scanner;

public class Testing2 {
	
	public static void main (String args[] ) {
	
	int a;
	int b;
	int c;
	int d;
	
	a=b=c=d=0;
	
	if("string2".compareTo("string") < 0) {
		a = 4; }
		else {
			b = 11;
		}
		if(a==4) {
			if(a==11)
				c = 7;
			else
				c=8;
		}
	if(a==4 && b==11)
		if(c==8)
			d = -5;
			a = 6;
	switch (a) {
	
	case 0:
	case 7:
	case 8:
		d = 11;
		break;
	case 6:
		b = 11;
		c+=3;
		a = a*2;
	case 12:
		a--;
		break;
	default:
		a=b=c=d=0;
		break;
	}
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);
	}
	}