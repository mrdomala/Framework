package com.mindtree.reusablecomponents;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.mindtree.utilities.GetProperties;

public class Base extends GetProperties {
	public static WebDriver driver;
	public static Properties prop;

	public static WebDriver initialize() throws IOException {
		prop = setProp();
		String browser = prop.getProperty("browser");
		System.out.println(browser);
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Misbah\\eclipse-workspaceNew\\Elocal\\src\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\Misbah\\eclipse-workspaceNew\\Elocal\\src\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		return driver;
	}

}
