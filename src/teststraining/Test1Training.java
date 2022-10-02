package teststraining;

import SeleniumTraining.Test4Training;

public class Test1Training {
	
	static Test1Training t1 = new Test1Training();
	static Test2Training t2 = new Test2Training();
	static Test3Training t3 = new Test3Training();
	static Test4Training t4 = new Test4Training();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printme();
		scanme();
		t1.testme();
		t1.paintme();
		Test2Training.red();
		t2.blue();
		Test3Training.circle();
		t3.square();
		Test4Training.bmw();
		t4.audi();
		
	}
	
	public static void printme() {
		
		System.out.println("Print Me");
		
	}
	
	public static void scanme() {
		System.out.println("Scan Me");
		
	}
	
	public void testme() {
		System.out.println("testMe");
		
	}
	
	public void paintme() {
		System.out.println("printMe");
	}

}
