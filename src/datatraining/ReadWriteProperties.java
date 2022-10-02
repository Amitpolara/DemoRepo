package datatraining;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadWriteProperties {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream f = new FileInputStream("/Users/amitkumarpolara/Desktop/SELENIUMWORKSPACE/SeleniumTrainingProject/src/datatraining/Proper.properties");
		Properties proper = new Properties();
		proper.load(f);
		
		System.out.println(proper.getProperty("correctEmail"));
		System.out.println((proper.getProperty("language")));
		
		FileOutputStream fo = new FileOutputStream("/Users/amitkumarpolara/Desktop/SELENIUMWORKSPACE/SeleniumTrainingProject/src/datatraining/Proper.properties");
		proper.setProperty("testdate", "Aug 14");
		System.out.println(proper.getProperty("testdate"));
		proper.store(fo, "sjnjnxjsnxjsnxjs");
		
				
				
	}

}
