package teststraining;

public class Test3Training {
	
	static Test3Training t3 = new Test3Training();
	static Test1Training t1 = new Test1Training();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circle();
		t3.square();
		Test1Training.printme();
		t1.testme();

	}
	
	public static void circle() {
		System.out.println("circle");
	}

	public void square() {
		System.out.println("square");
	}
	

}
