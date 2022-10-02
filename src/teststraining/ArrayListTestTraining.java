package teststraining;

import java.util.ArrayList;

public class ArrayListTestTraining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> java = new ArrayList<String>();
		
		java.add("google");
		java.add("chrome");
		java.add("explore");
		java.add("pixel");
		java.add("firefox");
		
		System.out.println(java.size());
		
		System.out.println(java.get(0));
		System.out.println(java.get(1));
		System.out.println(java.get(2));
		
		java.add("opera");
		System.out.println(java.size());
		System.out.println(java.get(5));
		System.out.println(java.get(4));
		
		java.remove(3);
		System.out.println(java.size());
		System.out.println(java.get(2));
		
		System.out.println("-------------");
		
		for (int i=0; i<java.size(); i++) {
			System.out.println(java.get(i));
		}
	
		
		
		
		
	}

}
