package com.mindtree.pageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.mindtree.reusablecomponents.Base;
import com.mindtree.uistore.SearchBookui;

public class SearchBook extends Base {
	WebDriver driver;

	public SearchBook(WebDriver driver) {
		this.driver = driver;
	}

	public void search() {
//		Actions a =new Actions(driver);
//	   a.moveToElement(driver.findElement(SearchBookui.searchBar)).sendKeys("wings of fire").sendKeys(Keys.ENTER);
		driver.findElement(SearchBookui.searchBar).click();
		driver.findElement(SearchBookui.searchBar).sendKeys("Attitude is everything ");
		driver.findElement(SearchBookui.searchButton).click();
		driver.findElement(SearchBookui.book).click();
	}

	public void addCart() {
		driver.findElement(SearchBookui.addCart).click();
	}

}
