package com.mindtree.pageObject;

import org.openqa.selenium.WebDriver;

import com.mindtree.uistore.Pouchui;



public class Pouch {

	WebDriver driver;

	public Pouch(WebDriver driver) {

		this.driver = driver;
	}

	public void searchPouch() {
		driver.findElement(Pouchui.mobileCovers).click();
		driver.findElement(Pouchui.Apple).click();
		driver.findElement(Pouchui.iphone11).click();
		driver.findElement(Pouchui.cover).click();
		driver.findElement(Pouchui.add).click();

	}

}
