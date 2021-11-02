package com.mindtree.pageObject;

import org.openqa.selenium.WebDriver;

import com.mindtree.uistore.CartCheckui;

public class CartCheck {
	WebDriver driver;

	public CartCheck(WebDriver driver) {

		this.driver = driver;
	}

	public void Cart() {
		driver.findElement(CartCheckui.cart).click();
	}

}
