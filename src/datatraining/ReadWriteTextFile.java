package datatraining;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteTextFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f = new File("/Users/amitkumarpolara/Desktop/TESTING//traing.txt");
		f.createNewFile();
		
		FileWriter wr = new FileWriter(f);
		BufferedWriter outer = new BufferedWriter(wr);
		
		outer.write("this is 1 number line");
		outer.newLine();
		outer.write("this is 2 number line");
		outer.newLine();
		outer.write("this is 3 number line");
		outer.newLine();
		outer.write("this is 4 number line");
		outer.newLine();
		outer.write("this is 5 number line");
		outer.flush();
		
		FileReader fr = new FileReader(f);
		BufferedReader rt = new BufferedReader(fr);
		
		/*System.out.println(rt.readLine());
		System.out.println(rt.readLine());
		System.out.println(rt.readLine());
		System.out.println(rt.readLine());
		System.out.println(rt.readLine());
		System.out.println(rt.readLine());
		System.out.println(rt.readLine());*/
		
		String y;
		//int i =0;
		while ((y = rt.readLine()) != null) {
			System.out.println(y);
		}
		

	}

}
