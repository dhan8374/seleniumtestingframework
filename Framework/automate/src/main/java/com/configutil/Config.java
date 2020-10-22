package com.configutil;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Config {
	
	public static String get(String keyname) {
		FileReader file = null;
		
		try {
			file= new FileReader("C:\\Users\\Dhanya\\Desktop\\Internship\\Framework\\automate\\src\\main\\java\\com\\configutil\\Cofig.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Properties p=new Properties();
		try {
			p.load(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String kvalue= (String) p.get(keyname);
		return kvalue;
		
	}

}
