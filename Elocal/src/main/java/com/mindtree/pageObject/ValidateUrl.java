package com.mindtree.pageObject;

import com.mindtree.reusablecomponents.Base;

public class ValidateUrl extends Base{
	
	public static String validate() {
		String title=driver.getTitle();
		return title;
	}

}
