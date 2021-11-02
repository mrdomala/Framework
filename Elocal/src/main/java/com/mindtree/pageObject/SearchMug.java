package com.mindtree.pageObject;

import org.openqa.selenium.WebDriver;

import com.mindtree.uistore.SearchMugui;

public class SearchMug {
	WebDriver driver;

	public SearchMug(WebDriver driver) {
		this.driver = driver;
	}

	public void tosearchMug() {
		driver.findElement(SearchMugui.readerMug).click();
		driver.findElement(SearchMugui.mug).click();

	}

	public String getMug(String quantity) {
		driver.findElement(SearchMugui.quantity).sendKeys(quantity);
		driver.findElement(SearchMugui.toCart).click();

		return quantity;
	}

}
