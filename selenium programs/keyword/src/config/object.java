package config;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class object {

	Properties p = new Properties();
	public Properties set() throws Exception{
	File f = new File("D:\\suniljar\\selenium programs\\keyworddriven\\src\\keyworddriven\\login.properties");
	FileInputStream fs = new FileInputStream(f);
	p.load(fs);
	return p;
}
}