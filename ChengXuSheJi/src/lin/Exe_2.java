package lin;

public class Exe_2 {
	public static void main(String[]args) {
		int m,q;
		double n;
		m=add(3	, 4);
		q=add(3, 4, 5);
		
		n=add(7, 8);
		
		System.out.println(m);
		System.out.println(q);
		System.out.println(n);
		
	}
	
	
	
	
public static int add(int a,int b) {
	return a+b;
}
public static int add(int a,int b,int c) {
	return a+b+c;
}


public static double add(double a,double b) {
	return a+b;
}

}
