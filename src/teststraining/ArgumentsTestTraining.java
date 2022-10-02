package teststraining;

public class ArgumentsTestTraining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sum();
		sum(5 , 6);
		sum(5 , 6, 8);
	}
	
	public static void sum() {
		int a =2+3;
		System.out.println(a);
	}

	public static void sum(int a, int b) {
		int c = a+b;
		System.out.println(c);
	}
	
	public static void sum(int a, int b, int d) {
		int c = a+b+d;
		System.out.println(c);
	}
	
}
