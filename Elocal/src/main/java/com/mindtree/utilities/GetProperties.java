package com.mindtree.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class GetProperties {
	public static Properties prop;

	public static Properties setProp() throws IOException {
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\Misbah\\eclipse-workspaceNew\\Elocal\\src\\main\\resources\\Data.properties");
		prop = new Properties();
		prop.load(fis);
		return prop;
	}
}
