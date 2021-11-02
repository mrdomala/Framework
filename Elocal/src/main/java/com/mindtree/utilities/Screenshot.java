package com.mindtree.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {
	 WebDriver driver;
	   public Screenshot(WebDriver driver) {
		
			this.driver = driver;
		}
	public  void getss() throws IOException {
		   File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		   FileUtils.copyFile(src,new File(System.getProperty("user.dir") +"\\screenshots\\" +System.currentTimeMillis() +".png"));
		    }

}
