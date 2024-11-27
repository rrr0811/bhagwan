package ToReadFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingFromPropertyFile {
	public static void main(String[] args) throws IOException {
		File file=new File("./Resources/data.properties");
		FileInputStream fis=new FileInputStream(file);
		Properties properties=new Properties();
		properties.load(fis);
		System.out.println(properties.getProperty("name"));
	}
}
