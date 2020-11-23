package Tandem20;

public class Application {
public static void main(String[] args) {
	long summary = 1l;
	int count = 0;
	while(count<55) {
		System.out.println(summary);
		summary+=2;
		count++;
	}
	System.out.println();
	int s = 90;
	while (s > 0) {
		System.out.println(s);
		s-=5;
	}
	System.out.println();

	int a = 6;
	int b = 5;
	int c = a / 2;
	int d = b / 2;
	while (c > 0 ) {
	System.out.println(c);
	System.out.println(d);
	c/=2;
	d/=2;
	
	}
	System.out.println();
	double m = 8.5;
	double n = 11.45;
	int r = 10;
	while (r-m < n- r);{
	System.out.println(n);
	
}
}
}
