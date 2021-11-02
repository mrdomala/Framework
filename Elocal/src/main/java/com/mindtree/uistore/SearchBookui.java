package com.mindtree.uistore;

import org.openqa.selenium.By;

public class SearchBookui {
	
	public static By searchBar =By.xpath("//input[@placeholder='What are you looking for?']");
	public static By searchButton=By.xpath("//button[@aria-label='Search']");
	public static By book=By.xpath("//a[contains(text(),'Attitude Is Everything')]");
	public static By addCart =By.xpath("(//button[@type='submit'])[2]");


	
}
