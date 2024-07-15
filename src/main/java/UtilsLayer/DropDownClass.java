package UtilsLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BaseLayer.BaseClass;

public class DropDownClass extends BaseClass{
	
	public static Select sel;
	
	public static void selectbyvisibletext(WebElement wb, String value)
	{
		if((wb.isDisplayed()) && (wb.isEnabled()))
		{
			sel = new Select(wb);
			sel.selectByVisibleText(value);
		}
	}
	
	public static void selectbyvalue(WebElement wb, String value)
	{
		if((wb.isDisplayed())&& (wb.isEnabled()))
		{
			sel = new Select(wb);
			sel.selectByValue(value);
		}
	}
	
	public static void selectbbyindex(WebElement wb, int index)
	{
		if((wb.isDisplayed())&& (wb.isEnabled()))
		{
			sel = new Select(wb);
			sel.selectByIndex(index);
		}
	}

}
