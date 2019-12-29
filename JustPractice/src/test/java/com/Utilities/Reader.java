package com.Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Reader {
	
	public Properties prop;
	
	public Reader()
	{
		prop=new Properties();
		try {
			FileInputStream fis=new FileInputStream("E:\\CoreJavaWorkspace\\JustPractice\\google.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public String setuser()
	{
		String use=prop.getProperty("username");
		return use;
	}
	
	public String setpass()
	{
		String pas=prop.getProperty("password");
		return pas;
	}
	
	
	public String seturl()
	{
		String urlname=prop.getProperty("url");
		return urlname;
	}

}
