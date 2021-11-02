package com.mindtree.runner;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.mindtree.pageObject.CartCheck;
import com.mindtree.pageObject.Pouch;
import com.mindtree.pageObject.SearchBook;
import com.mindtree.pageObject.SearchMug;
import com.mindtree.pageObject.ValidateUrl;
import com.mindtree.reusablecomponents.Base;

import com.mindtree.utilities.Screenshot;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TestValues extends Base {
	public static Logger log = LogManager.getLogger(TestValues.class);
	static ExtentTest test;
	static ExtentReports report;

	@BeforeTest
	public void url() throws IOException {
		driver = initialize();
		prop.getProperty("url");
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		report = new ExtentReports(System.getProperty("user.dir") + "\\reports\\" + "ExtentReports-"
				+ System.currentTimeMillis() + ".html");
		test = report.startTest("testz");
		try {
			if (ValidateUrl.validate().equalsIgnoreCase(prop.getProperty("title"))) {
				log.info("successfully logged into url");
			} else {
				throw new Exception();
			}
		} catch (Exception e) {
			Screenshot s = new Screenshot(driver);
			s.getss();
			log.info("invalid url found");
		}
	}

	@Test(priority = 1, dataProvider = "quantity")
	public void buyMug(String quantity) {
		SearchMug obj = new SearchMug(driver);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		obj.tosearchMug();
		log.info("mug searched");
		obj.getMug(quantity);
		log.info(quantity + "  mugs added");
		test.log(LogStatus.PASS, "test passed");
	}

	@DataProvider
	public Object[] quantity() {
		Object[] val = new Object[1];
		val[0] = "3";
		return val;
	}

	@Test(priority = 2)
	public void searchPouch() {
		Pouch p = new Pouch(driver);
		p.searchPouch();
		log.info("mobile cover added to cart");
		test.log(LogStatus.PASS, "test passed");
	}

	@Test(priority = 3)
	public void searchBook() {
		SearchBook sb = new SearchBook(driver);
		sb.search();
		sb.addCart();
		test.log(LogStatus.PASS, "test passed");
	}

	@Test(priority = 4)
	public void cart() throws InterruptedException {
		CartCheck obj1 = new CartCheck(driver);
		obj1.Cart();
		log.info("cart shown");
		test.log(LogStatus.PASS, "test passed");
	}

	@AfterTest
	public void close() throws InterruptedException {
		Thread.sleep(5000);
		report.endTest(test);
		report.flush();
		driver.close();
	}

}
