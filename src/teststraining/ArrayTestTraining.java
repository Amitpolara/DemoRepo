package teststraining;

public class ArrayTestTraining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String tool = "selenium";
		System.out.println(tool);
		
		String tools[] = {"google","facebook", "instagram", "twitter", "orkut"};
		
		System.out.println(tools.length);
		
		System.out.println("----------");
		
		System.out.println(tools[0]);
		System.out.println(tools[1]);
		System.out.println(tools[2]);
		System.out.println(tools[3]);
		System.out.println(tools[4]);
		System.out.println("----------");
		
		for(int i=0; i<tools.length; i++)
			System.out.println(tools[i]);
		
	}

}
