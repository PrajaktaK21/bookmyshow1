package UtilsLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import BaseLayer.BaseClass;

public class ActionClass extends BaseClass {
	
	public static Actions act;
	
	public static void click(WebElement wb)
	{
		act = new Actions (driver);
		act.click(wb).build().perform();
	}
	
	public static void sendKeys(WebElement wb, String value)
	{
		act = new Actions(driver);
		act.click(wb).sendKeys(value).build().perform();
	}
	
	public static void movetoelement(WebElement wb)
	{
		act = new Actions(driver);
		act.moveToElement(wb).build().perform();
	}
	

}
